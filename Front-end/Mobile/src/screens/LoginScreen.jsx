import React, { useState } from 'react';
import { StyleSheet, Text, View, TextInput, Button, Alert } from 'react-native';
import { StatusBar } from 'expo-status-bar';
import { postLoginApi } from '../service/RestApiCalls';
import AsyncStorage from '@react-native-async-storage/async-storage';

export default function LoginScreen() {
  // State variables for email and password
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  const handleLogin = async () => {
    console.log('Logging in with:', email, password);

    const loginRequestBody = {
      grant_type: 'password',
      username: email,
      password: password,
    };

    try {
      const response = await postLoginApi(loginRequestBody);

      console.log('Login successful:', response);

      Alert.alert('Success', 'Login successful!');

      try {
        // Save the response data in AsyncStorage
        await AsyncStorage.setItem('authData', JSON.stringify(response));

        // Data saved successfully
        console.log('Data saved successfully in AsyncStorage.');

        // You can take additional actions here if needed (e.g., navigate to another screen)
      } catch (error) {
        // Handle any errors that occurred during the save operation
        console.error('Error saving data in AsyncStorage:', error);
      }

    } catch (error) {
      console.error('Login failed:', error);
      Alert.alert('Error', 'Login failed. Please try again.');
    }
  };

  return (
    <View style={styles.container}>
      <Text>Login screen</Text>

      {/* Input field for email */}
      <TextInput
        style={styles.input}
        placeholder="Email"
        value={email}
        onChangeText={setEmail}
        keyboardType="email-address"
        autoCapitalize="none"
        autoCorrect={false}
      />

      {/* Input field for password */}
      <TextInput
        style={styles.input}
        placeholder="Password"
        value={password}
        onChangeText={setPassword}
        secureTextEntry={true}
      />

      {/* Login button */}
      <Button title="Login" onPress={handleLogin} />

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
  input: {
    width: '80%',
    padding: 10,
    margin: 10,
    borderWidth: 1,
    borderColor: '#ccc',
    borderRadius: 5,
  },
});
