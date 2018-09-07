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
import Page4 from './Page4'

/*导入外部组件类*/
export default class App extends Component<Props> {


  render() {  
    return (
     <View>    
           <TouchableOpacity onPress={this.tiaoa.bind(this)}>
                <Text>{this.props.aa}</Text>
                </TouchableOpacity>
     </View>
    );
  }
  tiaoa(){
    const navigator = this.props.navigator;
    navigator.push({
      component:Page4,
      params:{
        k:this.props.aa
      }
    })
  }
}

const styles = StyleSheet.create({
 

});

