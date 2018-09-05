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
  ListView,
  TouchableOpacity
  }from 'react-native';
import {Navigator} from 'react-native-deprecated-custom-components';
import Home from './Home'
/*导入外部组件类*/
export default class App extends Component<Props> {
  render() {  
    return (
      <View>
        <Text>这是中文页</Text>
        <TouchableOpacity onPress={this.fanhui.bind(this)}>
        <Text>点击返回</Text>
        </TouchableOpacity>
      </View>
    );
  }
  fanhui(){
    const navigator=this.props.navigator;
    navigator.pop()
  }
}

const styles = StyleSheet.create({
 

});

