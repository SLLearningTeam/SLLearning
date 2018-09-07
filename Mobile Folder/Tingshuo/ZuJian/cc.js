/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Navigator,
  Text,
  View,
  TouchableOpacity,
  Image,
  TextInput,
  Button,
  Alert,
  ImageBackground,
} from 'react-native';
var max=20
var min=6
export default class DengLu extends Component {
    constructor(props) {
    super(props);
    this.state = {
     id:"11",
     password:"11",
    };  
  }
  test () {
    const url = `http://101.200.51.53:8080/SSLearningTeam/user/mobile/login?userPhoneNumber=${this.state.id}&userPassword=${this.state.password}`
    fetch(url)
      .then((response)=>{
          return response.text();
      })
      .then((responseText)=>{
          alert(responseText);
      })
      .catch((error)=>{
          alert(error);
      })
  }
  render() {
      return (
         <View>
         <Text>"http://101.200.51.53:8080/SSLearningTeam/user/mobile/login?userPhoneNumber={this.state.id}&userPassword={this.state.password}"</Text>
         <TextInput 
           onChangeText={(id) => this.setState({id})}       
         />     
          <TextInput 
           onChangeText={(password) => this.setState({password})}        
         />
        
          <TouchableOpacity onPress={() => this.test()}>
            <Text>提交</Text>
          </TouchableOpacity>
         </View>
        );
    } 
  }
const styles = StyleSheet.create({

});

