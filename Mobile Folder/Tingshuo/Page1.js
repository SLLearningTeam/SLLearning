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
import Page2 from './Page2'
import Page3 from './Page3'
import Page4 from './Page4'
/*导入外部组件类*/
export default class App extends Component<Props> {
  render() {  
    return (
      <View>
        <Text style={{fontSize:36,textAlign:'center'}}>主页</Text>
        <TouchableOpacity onPress={this.tiaozhuan.bind(this)}>
        <Text>中文页</Text>
        </TouchableOpacity>
        <TouchableOpacity onPress={this.tiaozhuan2.bind(this)}>
        <Text>英文页</Text>
        </TouchableOpacity>
        <TouchableOpacity onPress={this.tiaozhuan3.bind(this)}>
        <Text>测试页</Text>
        </TouchableOpacity>
      </View>
    );
  }
  tiaozhuan(){
    const navigator=this.props.navigator;
    navigator.push({
      component:Page2
    })
  }
  tiaozhuan2(){
    const navigator=this.props.navigator;
    navigator.push({
      component:Page3
    })
  }
  tiaozhuan3(){
    const navigator=this.props.navigator;
    navigator.push({
      component:Page4
    })
  }
}

const styles = StyleSheet.create({
 

});

