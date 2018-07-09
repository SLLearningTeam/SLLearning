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
      <Navigator
      //初始化路由
      initialRoute = {{component:Home,
        name:'首页'
      }}
      
      renderScene = {
        (route,navigator)=>{
          let Component = route.component;
          if(route.component){
            return <Component{...route.params}
            navigator = {navigator} />
          }
        }
      }
      />   
    );
  }
}

const styles = StyleSheet.create({
 

});

