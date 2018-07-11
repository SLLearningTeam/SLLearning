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
  View
} from 'react-native';

const instructions = Platform.select({
  ios: 'Press Cmd+R to reload,\n' +
    'Cmd+D or shake for dev menu',
  android: 'Double tap R on your keyboard to reload,\n' +
    'Shake or press menu button for dev menu',
});

type Props = {};
export default class App extends Component<Props> {
  render() {
    return (
      <View>
      <Image source={require('../imgs/dingyue1.png')}></Image>
      <View>
      <Image source={require('../imgs/dingyue1.png')}></Image>
      <Image source={require('../imgs/dingyue1.png')}></Image>
      <Image source={require('../imgs/dingyue1.png')}></Image>
      </View>
      <Image source={require('../imgs/dingyue1.png')}></Image>
      </View>
    );
  }
}

const styles = StyleSheet.create({
});
