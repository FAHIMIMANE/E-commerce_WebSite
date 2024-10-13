import React from 'react';
import { View, Text, Image, StyleSheet } from 'react-native';
import { BACKEND_API_GATEWAY_URL } from '../constants/appConstants';
import { TouchableOpacity } from 'react-native-gesture-handler';


const ProductCard = ({ product , onPress}) => {
  const {
    productId,
    productName,
    description,
    price,
    productCategory,
    availableItemCount,
    averageRating,
    noOfRatings,
    imageId,
  } = product;

  // Construct the image URL using the imageId
  const imageURL = `${BACKEND_API_GATEWAY_URL}/api/catalog/image/${imageId}`;

  return (
    <TouchableOpacity style={styles.card} onPress={() => onPress(productId)}>
      <Image source={{ uri: imageURL }} style={styles.image} />

      <Text style={styles.productName}>{productName}</Text>
      <Text style={styles.description}>{description}</Text>
      <Text style={styles.price}>Price: ${price.toFixed(2)}</Text>
      <Text style={styles.category}>Category: {productCategory}</Text>
      <Text style={styles.availableCount}>Available: {availableItemCount} items</Text>
      <Text style={styles.rating}>Rating: {averageRating} ({noOfRatings} reviews)</Text>
    </TouchableOpacity>
  );
};

const styles = StyleSheet.create({
  card: {
    padding: 16,
    borderWidth: 1,
    borderColor: '#ccc',
    borderRadius: 8,
    margin: 8,
  },
  image: {
    width: '100%',
    height: 200,
    borderRadius: 8,
  },
  productName: {
    fontSize: 18,
    fontWeight: 'bold',
    marginVertical: 8,
  },
  description: {
    fontSize: 14,
    color: '#666',
  },
  price: {
    fontSize: 16,
    color: '#333',
    marginVertical: 4,
  },
  category: {
    fontSize: 14,
    color: '#777',
  },
  availableCount: {
    fontSize: 14,
    color: '#777',
  },
  rating: {
    fontSize: 14,
    color: '#777',
    marginTop: 4,
  },
});

export default ProductCard;
