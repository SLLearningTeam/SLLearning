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
  Alert
} from 'react-native';

const onButtonPress = () => {
  Alert.alert('Button has been pressed!');
};
import ZhuCe from './ZhuCe'
export default class Zhuce extends Component {
  render() {
      return (
      <View style={{flex:1}}>
      <View style={{flex:0.1,}}>
      <TouchableOpacity onPress={this.fanhui.bind(this)}>
      <Image source={require('../imgs/fanhui.png')} />
      </TouchableOpacity>
      </View>
      <View style={{flex:0.3,}}>
      <Image style={{width:100,height:100,marginLeft:150,}} source={require('../imgs/touxiang2.png')} />
      </View>
      <View>
      <TextInput
      placeholder ={'请输入用户名'}>
      </TextInput>
      <TextInput
      placeholder ={'请输入密码'}>
      </TextInput>
      {/*验证码*/}
      <View style={{flexDirection:'row'}}> 
      <View style={{marginLeft:3,marginBottom:8,width:150,height:40,borderWidth:1}}>
      <TextInput
      placeholder ={'请输入验证码'}>
      </TextInput>
      </View>
      <View style={{marginLeft:40,width:200,height:42,backgroundColor:'#3E5968'}}>
      <Text style={{color:'white',fontSize:18,textAlign:'center'}}>这里是验证码</Text>
      </View>
      </View>
       {/*验证码*/}
      <View>
      </View>
      <Button 
      onPress={onButtonPress}
      title="注册"
      />
      </View>
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

