import React, { useState, useEffect, useCallback } from 'react';
import { StyleSheet, Text, View, FlatList, ActivityIndicator } from 'react-native';
import { getCartDetailsApi, removeCartItemApi } from '../service/RestApiCalls';
import AsyncStorage from '@react-native-async-storage/async-storage';
import { useFocusEffect } from '@react-navigation/native';
import { TouchableOpacity } from 'react-native-gesture-handler';
import { Picker } from '@react-native-picker/picker';


export default function CartScreen() {
    const [cartDetails, setCartDetails] = useState([]);
    const [loading, setLoading] = useState(true);
    const [token, setToken] = useState("");
    const [selectedQty, setSelectedQty] = useState(null);

    const handleUpdateCart = async (cardId) => {
        try {
            const response = await removeCartItemApi(cardId, token);
            fetchCartDetails(token);
        } catch (error) {
            console.error('Error fetching cart details:', error);
        } finally {
            setLoading(false);
        }
    };


    const handleRemoveFromCart = (cartId) => {

        console.log("delete" + cartId);
        handleDelete(cartId, token);
    };

    const handleDelete = async (cardId) => {
        try {
            const response = await removeCartItemApi(cardId, token);
            fetchCartDetails(token);
        } catch (error) {
            console.error('Error fetching cart details:', error);
        } finally {
            setLoading(false);
        }
    };

    const fetchAuthData = async () => {
        try {
            const data = await AsyncStorage.getItem('authData');

            if (data) {
                const parsedData = JSON.parse(data);
                fetchCartDetails(parsedData.access_token);
                setToken(parsedData.access_token);
                setLoading(false);
            } else {
                console.log('No data found in AsyncStorage.');
                setLoading(false);
            }
        } catch (error) {
            console.error('Error retrieving data from AsyncStorage:', error);
        }
    };

    const fetchCartDetails = async (token) => {
        try {
            const response = await getCartDetailsApi(token);
            setCartDetails(response);
        } catch (error) {
            console.error('Error fetching cart details:', error);
        } finally {
            setLoading(false);
        }
    };

    useFocusEffect(
        useCallback(() => {
            setCartDetails(null);
            fetchAuthData();
        }, [])
    );

    const renderItem = ({ item, handleDelete }) => (
        <View style={styles.cartItem}>
            <Text>{item.productName}</Text>
            <Text>Quantity: {item.quantity}</Text>
            <Text>Price: ${item.extendedPrice}</Text>
            <TouchableOpacity onPress={() => handleRemoveFromCart(item.cartItemId)} style={{ backgroundColor: 'red' }}>
                <Text>Delete</Text>
            </TouchableOpacity>
            <Picker
                selectedValue={item.quantity}
                onValueChange={setSelectedQty}
                style={styles.picker}
            >
                {Array.from({ length: 10 }, (_, index) => (
                    <Picker.Item key={index} label={`${index + 1}`} value={index + 1} />
                ))}
            </Picker>
        </View>
    );

    if (loading) {
        return (
            <View style={styles.container}>
                <ActivityIndicator size="large" color="#0000ff" />
            </View>
        );
    }

    return (
        <View style={styles.container}>


            {cartDetails ? (
                <>
                    <FlatList
                        data={cartDetails.cartItems}
                        renderItem={renderItem}
                        keyExtractor={(item) => item.cartItemId}
                    />
                    <Text>Total Price: ${cartDetails.totalPrice}</Text>
                </>
            ) : (
                <Text>Loading data...</Text>
            )}
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        padding: 16,
    },
    cartItem: {
        padding: 8,
        borderBottomWidth: 1,
        borderBottomColor: '#ccc',
    },
    picker: {
        height: 40,
        width: '100%',
    },
});
