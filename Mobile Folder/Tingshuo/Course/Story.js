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
  ScrollView,
} from 'react-native';
const instructions = Platform.select({
  ios: 'Press Cmd+R to reload,\n' +
    'Cmd+D or shake for dev menu',
  android: 'Double tap R on your keyboard to reload,\n' +
    'Shake or press menu button for dev menu',
});

type Props = {};
export default class Story extends Component<Props> {
  render() {
    return (
      <ScrollView >
      <View style={{flex:1}}>
    {/*导航条开始*/}
      <View style={styles.title}>
       <TouchableOpacity onPress ={this.backPress.bind(this)}>
      <Image 
      style={{width:40,height:40,marginTop:5,marginLeft:5}} 
     
      source={require('../imgs/back.png')}></Image>
      </TouchableOpacity>
      <Text style={{fontSize:20,marginLeft:15,marginTop:8}}>口语故事</Text>
      </View>
          {/*口语故事*/}
      <View style={{flex:0.3}}>
       <Image 
       style={{width:405,height:155}}
       source={require('../imgs/story2.jpg')}></Image>
      </View>
      {/*Liz小姐游美国*/}
      <View style={{flex:0.5}}>
      <Image 
      style={{width:405,height:340}}
      source={require('../imgs/liz.png')}></Image>
      </View> 
      </View>
       </ScrollView>
    );
  }
  backPress() {
      const navigator = this.props.navigator;
      if (navigator) {
        navigator.pop()
      }
     }
}

const styles = StyleSheet.create({
    title:{
      borderColor:'#F2F2F2',
      borderWidth:2,
      borderBottomColor:'#F2F2F2',
      flexDirection:'row',
      flex:0.08,
    },
});
module.exports = Story;
