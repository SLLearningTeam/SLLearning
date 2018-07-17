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
  ScrollView,
  TouchableOpacity
} from 'react-native';
import Lunbo from '../ZuJian/Lunbo'
import ShiTi from '../ZuJian/ShiTi'
import TuiJian from '../ZuJian/TuiJian'
import SideMenu from 'react-native-side-menu';
import {Navigator} from 'react-native-deprecated-custom-components';
export default class faXianPage extends Component<Props> {
  render() {
    return (
     <ScrollView  horizontal = {false}
     showsHorizontalScrollIndicator ={false}>
      <View style={{padding:5}}>
      <Lunbo />
      </View>
      <TouchableOpacity onPress = {this.TPagePress.bind(this)}>
      <TuiJian />
      </TouchableOpacity>
       <TouchableOpacity onPress = {this.TPagePress.bind(this)}>
      <TuiJian />
      </TouchableOpacity>
       <TouchableOpacity onPress = {this.TPagePress.bind(this)}>
      <TuiJian />
      </TouchableOpacity>
       <TouchableOpacity onPress = {this.TPagePress.bind(this)}>
      <TuiJian />
      </TouchableOpacity>
     </ScrollView>
    );
  }
  TPagePress(){
    const navigator = this.props.navigator;
    navigator.push({
      component:ShiTi,
      name:'试题',
    })
  }
}

const styles = StyleSheet.create({

});
