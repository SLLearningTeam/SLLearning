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
import Course from '../Course/Course'
export default class keCheng extends Component<Props> {
  render() {
    return (
      <View>
      <Course />
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
