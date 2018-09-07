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
import Fenlei_S from '../ZuJian/FenLei_S'
import SideMenu from 'react-native-side-menu'
import XiangQing from '../ZuJian/XiangQing'
import FenLei from '../ZuJian/Fenlei'

export default class fenLeiPage extends Component<Props> {
  render() {
    return (
      <View style={{flex:1,flexDirection:'row'}}>
      
      <FenLei navigator={this.props.navigator}/>

      </View>
    );
  }

}

const styles = StyleSheet.create({

});
