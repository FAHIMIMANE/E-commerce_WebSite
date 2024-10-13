import React from 'react';
import {
    View,
    Text,
    ImageBackground,
    Image,
    TouchableOpacity,
} from 'react-native';
import {
    DrawerContentScrollView,
    DrawerItemList,
} from '@react-navigation/drawer';

import Ionicons from 'react-native-vector-icons/Ionicons';
//import FontAwesome5 from 'react-native-vector-icons/FontAwesome5';
import AsyncStorage from '@react-native-async-storage/async-storage';


const CustomDrawer = props => {

    const signOut = async () => {
        console.log("onSignOutClicked");
        console.log("onSignOutClicked");

        try {
            // Delete the 'authData' key-value pair from AsyncStorage
            await AsyncStorage.removeItem('authData');

            // Data deletion successful
            console.log('Data successfully deleted from AsyncStorage.');

            // Optionally, you can handle other sign-out logic here,
            // such as navigating the user to the login screen.
            // For example:
            // navigation.navigate('LoginScreen');
        } catch (error) {
            // Handle any errors during the data deletion process
            console.error('Error deleting data from AsyncStorage:', error);
        }
    };

    return (
        <View style={{ flex: 1 }}>
            <DrawerContentScrollView
                {...props}
                contentContainerStyle={{ backgroundColor: '#232b2b' }}>
                <ImageBackground
                    //source={require('../../../assets/s2c.png')}
                    style={{ padding: 20 }}>
                    <Image
                        source={require('../../assets/icon.png')}
                        style={{ height: 80, width: 80, marginBottom: 10 }}
                    />
                    <Text
                        style={{
                            color: '#fff',
                            fontSize: 18,
                            fontWeight: 'bold',
                            marginBottom: 5,
                        }}>
                        E-commerce
                    </Text>
                    {
                        /*
                            <FontAwesome5 name="home" size={16} color="#fff" />
                        */
                    }
                </ImageBackground>
                <View style={{ flex: 1, backgroundColor: '#fff', paddingTop: 10 }}>
                    <DrawerItemList {...props} />
                </View>
            </DrawerContentScrollView>
            <View style={{ padding: 20, borderTopWidth: 1, borderTopColor: '#ccc' }}>
                <TouchableOpacity onPress={() => console.log("onShareClicked")} style={{ paddingVertical: 15 }}>
                    <View style={{ flexDirection: 'row', alignItems: 'center' }}>
                        <Ionicons name="share-social-outline" size={22} />
                        <Text
                            style={{
                                fontSize: 15,
                                fontWeight: 'bold',
                                marginLeft: 5,
                            }}>
                            Share
                        </Text>
                    </View>
                </TouchableOpacity>
                <TouchableOpacity onPress={signOut} style={{ paddingVertical: 15 }}>
                    <View style={{ flexDirection: 'row', alignItems: 'center' }}>
                        <Ionicons name="exit-outline" size={22} />
                        <Text
                            style={{
                                fontSize: 15,
                                fontWeight: 'bold',
                                marginLeft: 5,
                            }}>
                            Sign Out
                        </Text>
                    </View>
                </TouchableOpacity>
            </View>
        </View>
    );
};

export default CustomDrawer;


