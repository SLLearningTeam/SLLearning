/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Navigator,
  Text,
  View,
  TouchableOpacity,
  Image
} from 'react-native';


export default class FirstView extends Component {
  render() {
      return (
      <View style={{padding:5}}>
      <View style={{flexDirection:'row',borderWidth:1,borderColor:'#C7CBD1'}}>
      <View>
      <Image source={require('../imgs/logo.png')} style={{borderRadius:25,width:100,height:100,margin:20}}></Image>
      </View>
      <View style={{flexDirection:'row'}}>
      <Text style={styles.text}>考虫带你过四级</Text>
      </View>
      </View>
      </View>
        );
    } 
  }


const styles = StyleSheet.create({
  text:{
  fontSize:20,
  fontWeight:'bold',
  textAlignVertical:'center'
}
});

AppRegistry.registerComponent('FirstView', () => FirstView);
