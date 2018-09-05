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
import Fenlei from '../ZuJian/Fenlei'
import SideMenu from 'react-native-side-menu'
import XiangQing from '../ZuJian/XiangQing'

export default class fenLeiPage extends Component<Props> {
  render() {
    return (
      <View style={{flex:1,flexDirection:'row'}}>
      
      <Fenlei navigator={this.props.navigator}/>

      </View>
    );
  }

}

const styles = StyleSheet.create({

});
