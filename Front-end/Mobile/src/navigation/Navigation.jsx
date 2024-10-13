import React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import HomeScreen from '../screens/HomeScreen';
import LoginScreen from '../screens/LoginScreen';
import ProductScreen from '../screens/ProductScreen';
import ProfileScreen from '../screens/ProfileScreen';

const Stack = createNativeStackNavigator();

const Navigation = () => {


    return (
        <NavigationContainer>
            <Stack.Navigator screenOptions={{ headerShown: false }}>


                <Stack.Screen name="HomeScreen" component={HomeScreen} />
                <Stack.Screen name="LoginScreen" component={LoginScreen} />
                <Stack.Screen name="ProductScreen" component={ProductScreen} />
                <Stack.Screen name="ProfileScreen" component={ProfileScreen} />




            </Stack.Navigator>
        </NavigationContainer>
    )
}

export default Navigation;