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
import {Navigator} from 'react-native-deprecated-custom-components';
import TabNavigator from 'react-native-tab-navigator';
import Course from './Course';
import CeShi from '../ZuJian/CeShi'
const instructions = Platform.select({
  ios: 'Press Cmd+R to reload,\n' +
    'Cmd+D or shake for dev menu',
  android: 'Double tap R on your keyboard to reload,\n' +
    'Shake or press menu button for dev menu',
});

type Props = {};
export default class Test extends Component<Props> {
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
      <Text style={{fontSize:25,marginTop:5}}>模拟</Text>
      <TouchableOpacity onPress={
        this.HomePress.bind(this)
      }>
      <Image style={styles.list3} source={require('../imgs/home.png')}></Image>
      </TouchableOpacity>
      </View>
    {/*模拟分类开始*/}
    <TouchableOpacity onPress={ this.CeShiPress.bind(this)}>
      <View style={styles.class}>
       <Image style={styles.list} source={require('../imgs/kclisten.jpg')}></Image>
       <View>
       <Text style={styles.list1}>考虫四级模拟</Text>
       <Text style={styles.list2}>课程  10</Text>
       </View>
       </View>
       </TouchableOpacity>
    <TouchableOpacity onPress={ this.CeShiPress.bind(this)}>
       <View style={styles.class}>
       <Image style={styles.list} source={require('../imgs/kcet6.jpg')}></Image>
       <View>
       <Text style={styles.list1}>考虫六级模拟</Text>
       <Text style={styles.list2}>课程  10</Text>
       </View>
       </View>
       </TouchableOpacity>
    <TouchableOpacity onPress={ this.CeShiPress.bind(this)}>
       <View style={styles.class}>
       <Image style={styles.list} source={require('../imgs/tuofu.jpg')}></Image>
       <View>
       <Text style={styles.list1}>托福模拟</Text>
       <Text style={styles.list2}>课程  10</Text>
       </View>
       </View>
       </TouchableOpacity>

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
    CeShiPress() {
    let navigator = this.props.navigator;
    if (navigator) {
      navigator.push({
        name:'CeShi',
        component:CeShi,
      });
    }
  }
}

const styles = StyleSheet.create({
  class1:{
    width:'100%',
    height:50,
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
      class:{
    width:'100%',
    height:130,
    borderWidth:2,
    borderBottomColor:'#F2F2F2',
    borderColor:'#F2F2F2',
    flexDirection:'row',
  },  
  list:{
    width:100,
    height:100,
    marginTop:15,
    marginLeft:15,
    borderRadius:8,
    shadowColor:'#272822',
  },
  list1:{
    fontSize:25,
    color:'#272822',
    marginTop:25,
    marginLeft:25,
    shadowColor:'#272822',
  },
    list2:{
    fontSize:18,
    color:'#A5A6A8',
    marginTop:10,
    marginLeft:70,
    shadowColor:'#272822',
  },
});
module.exports = Test;