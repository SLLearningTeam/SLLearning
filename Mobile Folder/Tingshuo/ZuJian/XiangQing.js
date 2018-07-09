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
import CeShi from './CeShi'
export default class ShiTi extends Component<Props> {
  render() {
    return (
    <View style={{flex:1}}>
    <View style={{flex:0.91}}>
    <ScrollView  horizontal = {false}
     showsHorizontalScrollIndicator ={false}>
     <View style={{flex:0.82}}> 
     {/*头部栏开始*/}
     <TouchableOpacity onPress={this.tiaoZhuan.bind(this)}>
     <View style={{flex:0.09,backgroundColor:'white',borderBottomWidth:1,flexDirection:'row'}}>
     <Image style={{marginRight:85}} source={require('../imgs/fanhui.png')}/>
     </View>
     </TouchableOpacity>
     {/*头部栏结束*/}
     {/*试题部分开始*/}
     
     {/*试题部分结束*/}
     </View>
     </ScrollView>
     </View>
    
     </View>
    );
  }

}
const styles = StyleSheet.create({
headImg:{
  width:35,
  height:35,
  marginTop:6,
  marginLeft:30,
},
biaoTi:{
  fontWeight:'bold',
  fontSize:25,
  margin:10,
  color:'black'
},
tiMuENG:{
  color:'red',
  fontSize:20,
  margin:15,
},
tiMuCHI:{
  fontSize:20,
  margin:15,
},
bottomImg:{
  width:35,
  height:35,
  marginTop:6,
  marginLeft:40,
},
});