import React, { useState, useEffect } from 'react';
import { StyleSheet, View, FlatList, ActivityIndicator } from 'react-native';
import { getAllProductsDetailApi } from '../service/RestApiCalls';
import ProductCard from '../components/ProductCard';
import { useNavigation } from '@react-navigation/native';
import AsyncStorage from '@react-native-async-storage/async-storage';


export default function HomeScreen() {
    const [products, setProducts] = useState([]);
    const [loading, setLoading] = useState(true);
    const [token, setToken] = useState("");


    const navigation = useNavigation();

    const handleProductPress = (product, token) => {
        navigation.navigate('ProductScreen', { product, token });
    };

    const fetchAuthData = async () => {
        try {
            const data = await AsyncStorage.getItem('authData');

            if (data) {
                const parsedData = JSON.parse(data);
                setToken(parsedData.access_token);
            } else {
                console.log('No data found in AsyncStorage.');
            }
        } catch (error) {
            console.error('Error retrieving data from AsyncStorage:', error);
        }
    };

    const fetchProducts = async () => {
        try {
            setLoading(true);
            const response = await getAllProductsDetailApi(0);
            const productData = response.page.content;
            setProducts(productData);
        } catch (error) {
            console.error('Error fetching products:', error);
        } finally {
            setLoading(false);
        }
    };


    useEffect(() => {
        fetchProducts();
        fetchAuthData();
    }, []);

    return (
        <View style={styles.container}>
            {loading && <ActivityIndicator size="large" color="#0000ff" />}

            {!loading && (
                <FlatList
                    data={products}
                    renderItem={({ item }) => <ProductCard product={item} onPress={() => handleProductPress(item, token)} />}
                    keyExtractor={(item) => item.productId.toString()}

                />
            )}
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#fff',
        padding: 16, // Adding padding to separate the list items from the edges of the screen
    },
});
