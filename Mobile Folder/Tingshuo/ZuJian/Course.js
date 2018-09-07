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
  TextInput,
  TouchableOpacity,
} from 'react-native';
import KaoShiDengLu from './KaoShiDengLu'
import {Navigator} from 'react-native-deprecated-custom-components';
import TabNavigator from 'react-native-tab-navigator';
import XiaZai from './XiaZai'
export default class keCheng extends Component<Props> {
  render() {
    return (
      <View>
      {/*打卡*/}
      <View style={styles.border1}>
      <View style={{flexDirection:'row'}}>
      <Text style={styles.data}>1323</Text>
      <Image style={styles.daka} source={require('../imgs/daka.png')}></Image>
       </View>
       <Text style={styles.day}>打卡天数</Text>
       </View>
       {/*听力口语*/}
       <View style={{flexDirection:'row',justifyContent:'space-between',marginTop:5,height:180}}>
       <View style={styles.border}>
      
       <Image style={styles.list} source={require('../imgs/listen.png')}></Image>
       <Text style={styles.list2}>听力</Text>
     
       </View>
       <View style={styles.border2}>
        
       <Image style={styles.list} source={require('../imgs/speak.png')}></Image>
       <Text style={styles.list2}>口语</Text>
       
       </View>
       </View>
     {/*阅读测试*/}
       <View style={{flexDirection:'row',justifyContent:'space-between',marginTop:5,height:180}}>
       <View style={styles.border}>
        <TouchableOpacity onPress={this.tiao.bind(this)}>
       <Image style={styles.list} source={require('../imgs/read.png')}></Image>
       <Text style={styles.list2}>下载</Text>
       </TouchableOpacity>
       </View>
       <TouchableOpacity onPress={this.tiaozhuan.bind(this)}>
       <View style={styles.border2}>
       
       <Image style={styles.list} source={require('../imgs/exam.png')}></Image>
       <Text style={styles.list2}>测试</Text>
      
       </View>
       </TouchableOpacity>
       </View>
      <View style={{width:400,height:80}}>
       <Image style={{width:400,height:80}} source={require('../imgs/ad.png')}></Image>
       </View>
      </View>
    );
  }
tiaozhuan(){
 
  const navigator=this.props.navigator;
  navigator.push({
    component:KaoShiDengLu,
  })
}
tiao(){
  const navigator=this.props.navigator;
  navigator.push({
    component:XiaZai
  })
}

}

const styles = StyleSheet.create({
    border1:{
    borderColor:'#F2F2F2',
    borderWidth:2,
    borderBottomColor:'#F2F2F2',
    height:100,
  },
   data:{
    color:'#1AD5B9',
    fontSize:50,
    fontWeight:'bold',
    marginLeft:150,
  },
    daka:{
    width:20,
    height:20,
    marginLeft:5,
    marginTop:30,
  },
    day:{
    color:'#8D8D8D',
    fontSize:15,
    textAlign:'center',
    marginBottom:10,
  },
    border:{
    borderColor:'#F2F2F2',
    borderWidth:2,
    borderBottomColor:'#F2F2F2',
    width:170,
    height:170,
    marginLeft:25,
  },
    border2:{
    borderColor:'#F2F2F2',
    borderWidth:2,
    borderBottomColor:'#F2F2F2',
    width:170,
    height:170,
    marginRight:25,
  },
    list:{
    width:130,
    height:130,
    marginLeft:20
  },
    list2:{
    fontSize:20,
    color:'#A5A6A8',
    marginTop:10,
    textAlign:'center',
  },
});