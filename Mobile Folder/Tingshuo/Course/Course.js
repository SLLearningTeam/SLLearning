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
import Listen from "./Listen";
import Speak from "./Speak";
import Read from "./Read";
import Test from "./Test";
import {Navigator} from 'react-native-deprecated-custom-components';
import TabNavigator from 'react-native-tab-navigator';
export default class keCheng extends Component<Props> {
  render() {
    return (
      <View style={{flex:1}}>
      {/*打卡*/}
      <View style={styles.border1}>
      <View style={{flexDirection:'row'}}>
      <Text style={styles.data}>1323</Text>
      <Image style={styles.daka} source={require('../imgs/daka.png')}></Image>
       </View>
       <Text style={styles.day}>打卡天数</Text>
       </View>
       {/*听力口语*/}
       <View style={{flexDirection:'row',justifyContent:'space-between',marginTop:'2%',flex:0.3}}>
       <View style={styles.border}>
       <TouchableOpacity onPress={
        this.listeningPress.bind(this)
      }>
       <Image style={styles.list} source={require('../imgs/listen.png')}></Image>
       <Text style={styles.list2}>听力</Text>
       </TouchableOpacity> 
       </View>
       <View style={styles.border}>
        <TouchableOpacity onPress={
        this.speakPress.bind(this)
      }>
       <Image style={styles.list} source={require('../imgs/speak.png')}></Image>
       <Text style={styles.list2}>口语</Text>
       </TouchableOpacity>
       </View>
       </View>
     {/*阅读测试*/}
       <View style={{flexDirection:'row',justifyContent:'space-between',marginTop:'2%',flex:0.3}}>
       <View style={styles.border}>
       <TouchableOpacity onPress={
        this.readPress.bind(this)
      }>
       <Image style={styles.list} source={require('../imgs/read.png')}></Image>
       <Text style={styles.list2}>阅读</Text>
       </TouchableOpacity> 
       </View>
       <View style={styles.border}>
        <TouchableOpacity onPress={
        this.testPress.bind(this)
      }>
       <Image style={styles.list} source={require('../imgs/exam.png')}></Image>
       <Text style={styles.list2}>测试</Text>
       </TouchableOpacity>
       </View>
       </View>
      <View style={{flex:0.15}}>
       <Image style={{width:'100%',height:'100%'}} source={require('../imgs/ad.png')}></Image>
       </View>
      </View>
    );
  }
  listeningPress() {
    let navigator = this.props.navigator;
    if (navigator) {
      navigator.push({
        name:'听力',
        component:Listen,
      });
    }
  }
  speakPress() {
    let navigator = this.props.navigator;
    if (navigator) {
      navigator.push({
        name:'口语',
        component:Speak,
      });
    }
  }
  readPress() {
    let navigator = this.props.navigator;
    if (navigator) {
      navigator.push({
        name:'阅读',
        component:Read,
      });
    }
  }
  testPress() {
    let navigator = this.props.navigator;
    if (navigator) {
      navigator.push({
        name:'测试',
        component:Test,
      });
    }
  }

}

const styles = StyleSheet.create({
    border1:{
    borderColor:'#F2F2F2',
    borderWidth:2,
    borderBottomColor:'#F2F2F2',
    flex:0.25,
  },
   data:{
    color:'#1AD5B9',
    fontSize:50,
    fontWeight:'bold',
    marginLeft:'36%',
  },
    daka:{
    width:20,
    height:20,
    marginLeft:'3%',
    marginTop:'6%',
  },
    day:{
    color:'#8D8D8D',
    fontSize:15,
    textAlign:'center',
    marginBottom:'3%',
  },
    border:{
    borderColor:'#F2F2F2',
    borderWidth:2,
    borderBottomColor:'#F2F2F2',
    marginRight:'3%',
    width:'44%',
    height:'100%',
    marginLeft:'3%',
  },
    list:{
    width:'60%',
    height:'75%',
    marginLeft:'22%',
  },
    list2:{
    fontSize:20,
    color:'#A5A6A8',
    marginTop:'3%',
    textAlign:'center',
  },
});