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
      <View style={{flexDirection:'column'}}>
      <View style={{flexDirection:'row'}}>
      <Text style={styles.text}>考虫带你过四级</Text>
      <Image style={{width:'9%',height:'70%',marginTop:"4%"}} source={require('../imgs/bofangliang.png')}></Image>
      <Text style={{marginTop:12,marginLeft:8}}>2.5万+</Text>
      </View>
      <View style={{flexDirection:'row'}}>
      <Image style={{width:40,height:40,marginTop:35}} source={require('../imgs/bofang.png')}></Image>
      <View style={{width:180,height:60,marginTop:30,marginLeft:10,}}>
      <Text style={{fontSize:18}}> 课程简介：哈哈哈哈哈哈啊哈哈哈</Text>
      </View>
      </View>
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
  marginTop:12,
  marginRight:20,
}
});

AppRegistry.registerComponent('FirstView', () => FirstView);
