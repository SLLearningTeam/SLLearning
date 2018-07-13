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
  Image,
  TouchableOpacity,
} from 'react-native';

const instructions = Platform.select({
  ios: 'Press Cmd+R to reload,\n' +
    'Cmd+D or shake for dev menu',
  android: 'Double tap R on your keyboard to reload,\n' +
    'Shake or press menu button for dev menu',
});

type Props = {};
export default class Title extends Component<Props> {
  render() {
    return (
      <View>
       {/*头部栏开始*/}
     <View style={{backgroundColor:'white',borderBottomWidth:1,flexDirection:'row'}}>
          <TouchableOpacity onPress={
        this.fanhuiPress.bind(this)
      }>
     <Image style={{marginRight:135}} source={require('../imgs/fanhui.png')}/>
     </TouchableOpacity>
     <Image style={styles.headImg} source={require('../imgs/dingyue.png')}/>
     <Image style={styles.headImg} source={require('../imgs/ziti.png')}/>
     <Image style={styles.headImg} source={require('../imgs/xiazai.png')}/>
     </View>
     {/*头部栏结束*/}
      </View>
    );
  }
  fanhuiPress() {
      const navigator = this.props.navigator;
      if (navigator) {
        navigator.pop()
      }
     }
  }

const styles = StyleSheet.create({
  headImg:{
  width:35,
  height:35,
  marginTop:6,
  marginLeft:30,
},
});
module.exports = Title;
