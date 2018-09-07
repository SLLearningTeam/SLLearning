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
  TouchableOpacity
} from 'react-native';
import SideMenu from 'react-native-side-menu';
import Course from '../ZuJian/Course'
import {Navigator} from 'react-native-deprecated-custom-components';
export default class keCheng extends Component<Props> {
  render() {
    return (
      <View>
      <Course navigator={this.props.navigator}/>
      </View>
     
    );
  }
  tiao(){
    const navigator = this.props.navigator;
    navigator.push({
      component:Test,
    })
}
}
const styles = StyleSheet.create({

});
