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
import Home from '../Home/Home'
import ZhuCe from './ZhuCe'
import Course from './Course'
export default class DengLu extends Component {
    constructor(props) {
    super(props);
    this.state = {
          id:"11",
          password:"11",
         
    };   
  }
   
   chaxun () {
    const url = `http://101.200.51.53:8080/SSLearningTeam/train/user/getAvgTestQuestionResultOfUser?userId=2`
    fetch(url)
      .then((response)=>{return response.json();})
      .then((responseData)=>{
        this.setState({
          fenshu : responseData.info,
          stu:responseData.status,
        })
        if(this.state.stu==true){
          alert("您的分数:"+this.state.fenshu)
        }else{
          alert("系统中无您的分数记录")
        }
      })
      .catch((error)=>{
          alert(error);
      })
  }

  render() {
      return (
          <View>
          <TouchableOpacity onPress={this.chaxun.bind(this)}>
          <Text>查询历史分数</Text>
          </TouchableOpacity>
          </View>
        );
    } 
  }



const styles = StyleSheet.create({

});

