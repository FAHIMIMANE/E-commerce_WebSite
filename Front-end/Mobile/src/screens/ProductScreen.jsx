import React, { useState } from 'react';
import { View, Text, StyleSheet, Image, Button, Alert } from 'react-native';
import { Picker } from '@react-native-picker/picker';
import { StatusBar } from 'expo-status-bar';
import { BACKEND_API_GATEWAY_URL } from '../constants/appConstants';
import { addToCartApi } from '../service/RestApiCalls';


export default function ProductScreen({ route }) {
    const { product, token } = route.params;

    const [selectedQty, setSelectedQty] = useState(1);

    const imageURL = `${BACKEND_API_GATEWAY_URL}/api/catalog/image/${product.imageId}`;

    const handleAddToCart = async () => {

        const data = {
            productId: product.productId,
            quantity: selectedQty
        };

        try {
            const response = await addToCartApi(data, token);
            console.log(response);
        } catch (error) {
            console.error('Error fetching cart details:', error);
        } finally {
        }

        console.log(data)
    };

    if (!product) {
        return (
            <View style={styles.container}>
                <Text>Product not found</Text>
            </View>
        );
    }

    return (
        <View style={styles.container}>
            <Image source={{ uri: imageURL }} style={styles.image} />

            <Text style={styles.productName}>{product.productName}</Text>
            <Text style={styles.description}>{product.description}</Text>
            <Text style={styles.price}>Price: ${product.price.toFixed(2)}</Text>
            <Text style={styles.category}>Category: {product.productCategory}</Text>
            <Text style={styles.availableCount}>Available: {product.availableItemCount} items</Text>
            <Text style={styles.rating}>Rating: {product.averageRating} ({product.noOfRatings} reviews)</Text>

            <Text style={styles.label}>Quantity:</Text>
            <View style={styles.pickerContainer}>
                <Picker
                    selectedValue={selectedQty}
                    onValueChange={setSelectedQty}
                    style={styles.picker}
                >
                    {Array.from({ length: 10 }, (_, index) => (
                        <Picker.Item key={index} label={`${index + 1}`} value={index + 1} />
                    ))}
                </Picker>
            </View>

            <View style={styles.addToCartButton}>
                <Button title="Add to Cart" onPress={handleAddToCart} />
            </View>

            <StatusBar style="auto" />
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#fff',
        padding: 16,
    },
    image: {
        width: '100%',
        height: 200,
        borderRadius: 8,
        marginBottom: 16,
    },
    productName: {
        fontSize: 18,
        fontWeight: 'bold',
        marginBottom: 8,
    },
    description: {
        fontSize: 14,
        color: '#666',
        marginBottom: 8,
    },
    price: {
        fontSize: 16,
        color: '#333',
        marginBottom: 8,
    },
    category: {
        fontSize: 14,
        color: '#777',
        marginBottom: 8,
    },
    availableCount: {
        fontSize: 14,
        color: '#777',
        marginBottom: 8,
    },
    rating: {
        fontSize: 14,
        color: '#777',
        marginBottom: 8,
    },
    label: {
        fontSize: 16,
        marginBottom: 8,
    },
    pickerContainer: {
        borderWidth: 1,
        borderColor: '#ccc',
        borderRadius: 5,
        overflow: 'hidden',
        marginBottom: 16,
    },
    picker: {
        height: 40,
        width: '100%',
    },
    addToCartButton: {
        marginTop: 16,
    },
});
