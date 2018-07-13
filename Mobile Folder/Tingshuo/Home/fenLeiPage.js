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
import Fenlei_ZuoCe from '../ZuJian/Fenlei_ZuoCe'
import Fenlei_YouCe from '../ZuJian/Fenlei_YouCe'
import SideMenu from 'react-native-side-menu';
import XiangQing from '../ZuJian/XiangQing'
export default class fenLeiPage extends Component<Props> {
  render() {
    return (
      <View style={{flex:1,flexDirection:'row'}}>
      <View style={{flex:0.35,padding:5}}>  
      <Fenlei_ZuoCe />
      <Fenlei_ZuoCe />
      <Fenlei_ZuoCe />
      </View>
      <View style={{flex:0.65,padding:5,flexWrap:'wrap',flexDirection:'row',}}>
      <TouchableOpacity onPress={this.tiaoZhuan.bind(this)}>
      <Fenlei_YouCe />
      </TouchableOpacity>
      <Fenlei_YouCe />
      <Fenlei_YouCe />
      </View>
      </View>
    );
  }
  tiaoZhuan(){
    const navigator=this.props.navigator;
    navigator.push({
      component:XiangQing,
      name:'试题详情',
    })
  }
}

const styles = StyleSheet.create({

});
