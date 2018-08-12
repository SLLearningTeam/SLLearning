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
import ShiTi from '../ZuJian/ShiTi'
import Course_Listen_F from '../ZuJian/Course_Listen_F'
import Course_Listen_S from '../ZuJian/Course_Listen_S'
import Course_Listen_YaSi from '../ZuJian/Course_Listen_YaSi'
const instructions = Platform.select({
  ios: 'Press Cmd+R to reload,\n' +
    'Cmd+D or shake for dev menu',
  android: 'Double tap R on your keyboard to reload,\n' +
    'Shake or press menu button for dev menu',
});

type Props = {};
export default class Listen extends Component<Props> {
  render() {
    return (
      <View>

    {/*导航条开始*/}
      <View style={styles.class1}>
       <TouchableOpacity onPress={
        this.BackPress.bind(this)
      }>
      <Image style={styles.list3} source={require('../imgs/fanhui.png')}></Image>
      </TouchableOpacity>
      <Text style={{fontSize:25,marginTop:5}}>听力</Text>
      <TouchableOpacity onPress={
        this.HomePress.bind(this)
      }>
      <Image style={styles.list3} source={require('../imgs/home.png')}></Image>
      </TouchableOpacity>
      </View>
      <TouchableOpacity onPress={this.ListenFPress.bind(this)}>
      <Course_Listen_F />
      </TouchableOpacity>

      <TouchableOpacity onPress={this.ListenFPress.bind(this)}>
      <Course_Listen_S />
      </TouchableOpacity>

      <TouchableOpacity onPress={this.ListenFPress.bind(this)}>
      <Course_Listen_YaSi />
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
    ListenFPress() {
    let navigator = this.props.navigator;
    if (navigator) {
      navigator.push({
        name:'考虫四级听力',
        component:ShiTi,
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
});
module.exports = Listen;