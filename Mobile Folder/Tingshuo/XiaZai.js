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
import XiaZaiZhongXin from './XiaZaiZhongXin'
export default class ShiTi extends Component<Props> {
  render() {
    return (
    <View style={{flex:1}}>
    <View style={{flex:0.91}}>
    <ScrollView  horizontal = {false}
     showsHorizontalScrollIndicator ={false}>
     <View style={{flex:0.82}}> 
     {/*头部栏开始*/}
     
     <View style={{flex:0.09,backgroundColor:'white',borderBottomWidth:1,flexDirection:'row'}}>
     <TouchableOpacity onPress={this.fanhui.bind(this)}>
     <Image style={{marginRight:85}} source={require('../imgs/fanhui.png')}/>
     </TouchableOpacity>
     <Text style={{fontSize:25,fontWeight:'bold',textAlignVertical:'center'}}>下载中心</Text>
     </View>

     {/*头部栏结束*/}
     {/*试题部分开始*/}
     <XiaZaiZhongXin />
     <XiaZaiZhongXin />
     <XiaZaiZhongXin />
     {/*试题部分结束*/}
     </View>
     </ScrollView>
     </View>
    
     </View>
    );
  }
fanhui(){
  const navigator = this.props.navigator;
  navigator.pop()
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