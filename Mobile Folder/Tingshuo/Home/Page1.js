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

/*导入外部组件类*/
export default class App extends Component<Props> {
  
  render() {  
    return (
     <View>
     <TouchableOpacity onPress={this.tiao.bind(this)}>
     <Text style={{fontSize:30}}>跳转</Text>
     </TouchableOpacity>           
     </View>
    );
  }
  tiao(){
 
    const navigator=this.props.navigator
    navigator.push({
      component:Page2,
      params:{
        aa:45664,
      }
    })
  }
}

const styles = StyleSheet.create({
 

});

