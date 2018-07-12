/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  Platform,
  StyleSheet,
  Text,
  View,
  TouchableOpacity,
  Image,
} from 'react-native';

const instructions = Platform.select({
  ios: 'Press Cmd+R to reload,\n' +
    'Cmd+D or shake for dev menu',
  android: 'Double tap R on your keyboard to reload,\n' +
    'Shake or press menu button for dev menu',
});

type Props = {};
export default class Yasi extends Component<Props> {
  render() {
    return (
      <View>
          {/*导航条开始*/}
      <View style={styles.class1}>
       <TouchableOpacity onPress={
        this.BackPress.bind(this)
      }>
      <Image style={styles.list3} source={require('../imgs/back.png')}></Image>
      </TouchableOpacity>
      <TouchableOpacity onPress={
        this.HomePress.bind(this)
      }>
      <Image style={styles.list3} source={require('../imgs/home.png')}></Image>
      </TouchableOpacity>
      </View>
      </View>
    );
  }
    BackPress() {
      const navigator = this.props.navigator;
      if (navigator) {
        navigator.pop()
      }
     }
    
    HomePress() {
    let navigator = this.props.navigator;
    if (navigator) {
      navigator.pop
    }
  }
}

const styles = StyleSheet.create({
    class1:{
    width:'100%',
    height:'8%',
    borderWidth:2,
    borderBottomColor:'#F2F2F2',
    borderColor:'#F2F2F2',
    flexDirection:'row',
    shadowColor:'#272822',
    justifyContent:'space-between',
  },
    list3:{
    width:'50%',
    height:'80%',
    marginTop:'1%',
    marginLeft:'10%',
    marginRight:'10%',
  },
});
module.exports = Yasi;