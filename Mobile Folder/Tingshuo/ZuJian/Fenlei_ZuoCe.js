import React, { Component } from 'react';
import {
  Platform,
  StyleSheet,
  Text,
  View,
  Image,
  ScrollView,
  TouchableOpacity,
} from 'react-native';
export default class Fenlei_ZuoCe extends Component<Props> {
  render() {
    return (
     <View style={{flexDirection:'column',marginBottom:2}}>
     <View style={{flexDirection:'row',borderWidth:1}}>
     <Image source={require('../imgs/xulie.png')}></Image>
     <Text style={{fontSize:22,marginTop:10}}>英语</Text>
     </View>
     </View>
    )
  }
  
}
const styles = StyleSheet.create({
  
});