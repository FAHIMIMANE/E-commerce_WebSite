import { createDrawerNavigator } from '@react-navigation/drawer';
import { NavigationContainer } from '@react-navigation/native';
import Ionicons from 'react-native-vector-icons/Ionicons';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import CustomDrawer from './CustomDrawer';
import HomeScreen from '../screens/HomeScreen';
import LoginScreen from '../screens/LoginScreen';
import ProductScreen from '../screens/ProductScreen';
import ProfileScreen from '../screens/ProfileScreen';
import CartScreen from '../screens/CartScreen';

const Drawer = createDrawerNavigator();
const Stack = createNativeStackNavigator();


function DrawerNavigation() {
  return (

    <Drawer.Navigator
      drawerContent={props => <CustomDrawer {...props} />}
      screenOptions={{
        drawerActiveBackgroundColor: '#ffa500',
        drawerActiveTintColor: '#fff',
        drawerInactiveTintColor: '#333',
        drawerLabelStyle: {
          marginLeft: -25,
          fontWeight: 'bold',
          fontSize: 15,
        },
      }}>
      <Drawer.Screen
        name="HomeScreen"
        component={HomeScreen}
        options={{
          drawerIcon: ({ color }) => (
            <Ionicons name="home-outline" size={22} color={color} />
          ),
        }}
      />
      <Drawer.Screen
        name="ProfileScreen"
        component={ProfileScreen}
        options={{
          drawerIcon: ({ color }) => (
            <Ionicons name="person-outline" size={22} color={color} />
          ),
        }}
      />
      <Drawer.Screen
        name="LoginScreen"
        component={LoginScreen}
        options={{
          drawerIcon: ({ color }) => (
            <Ionicons name="chatbox-ellipses-outline" size={22} color={color} />
          ),
        }}
      />

      <Drawer.Screen
        name="CartScreen"
        component={CartScreen}
        options={{
          drawerIcon: ({ color }) => (
            <Ionicons name="chatbox-ellipses-outline" size={22} color={color} />
          ),
        }}
      />

    </Drawer.Navigator>

  );
}

function AppNavigation() {
  return (
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen
          name="DrawerNavigation"
          component={DrawerNavigation}
          options={{ headerShown: false }}
        />
        {
          /*
          <Stack.Screen
          name="ProductScreen"
          component={ProductScreen}
          options={({ route }) => ({ headerTitle: route.params.Ditem.title })}
          />
          */
        }

        <Stack.Screen name="ProductScreen" component={ProductScreen} />



      </Stack.Navigator>
    </NavigationContainer>
  );
}

export default AppNavigation;