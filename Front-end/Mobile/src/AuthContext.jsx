import React, { createContext, useState, useEffect } from 'react';
import AsyncStorage from '@react-native-async-storage/async-storage';

export const AuthContext = createContext();

export function AuthProvider({ children }) {
    const [authData, setAuthData] = useState(null);

    const fetchAuthData = async () => {
        try {
            const data = await AsyncStorage.getItem('authData');

            if (data) {
                const parsedData = JSON.parse(data);
                setAuthData(parsedData);
                console.log('Retrieved data from AsyncStorage:', parsedData);
            } else {
                console.log('No data found in AsyncStorage.');
            }
        } catch (error) {
            console.error('Error retrieving data from AsyncStorage:', error);
        }
    };

    useEffect(() => {
        fetchAuthData();
    }, []);

    return (
        <AuthContext.Provider value={{ authData }}>
            {children}
        </AuthContext.Provider>
    );
}
