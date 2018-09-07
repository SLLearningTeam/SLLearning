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

/*导入外部组件类*/
export default class App extends Component<Props> {


  render() {  
    return (
     <View>
                <Text>{this.props.k}</Text>
     </View>
    );
  }
}

const styles = StyleSheet.create({
 

});

