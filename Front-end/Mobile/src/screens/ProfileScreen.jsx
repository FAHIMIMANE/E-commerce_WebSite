import React, { useState, useCallback } from 'react';
import { StyleSheet, Text, View } from 'react-native';
import { StatusBar } from 'expo-status-bar';
import AsyncStorage from '@react-native-async-storage/async-storage';
import { useFocusEffect } from '@react-navigation/native';

export default function ProfileScreen() {
  const [authData, setAuthData] = useState(null);

  const fetchAuthData = async () => {
    try {
      const data = await AsyncStorage.getItem('authData');

      if (data) {
        const parsedData = JSON.parse(data);
        setAuthData(parsedData);
        //console.log('Retrieved data from AsyncStorage:', parsedData.access_token);
      } else {
        console.log('No data found in AsyncStorage.');
        setAuthData(null);
      }
    } catch (error) {
      console.error('Error retrieving data from AsyncStorage:', error);
    }
  };

  useFocusEffect(
    useCallback(() => {
      fetchAuthData();
    }, [])
  );



  return (
    <View style={styles.container}>
      <Text>Profile Screen</Text>

      {authData ? (
        <>
          <Text>Access Token: {authData.access_token}</Text>
          <Text>Refresh Token: {authData.refresh_token}</Text>
          <Text>Expires In: {authData.expires_in} seconds</Text>
          <Text>Scope: {authData.scope}</Text>
        </>
      ) : (
        <Text>Loading data...</Text>
      )}

      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
