/*
* @author:  yinyongqian
* @createTime:  2017-04-06, 21:36:35 GMT+0800
* @description:  root app
*/

import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View,
  TextInput
} from 'react-native';
import CountDownButton from 'react-native-smscode-count-down'

export default class Test extends Component {
  constructor(props){
    super(props)
    this.state = {
      phoneNum: '',
      state: '这里显示状态'
    }
    this._requestAPI = this._requestAPI.bind(this)
  }
  //2 秒后随机模拟获取验证码成功或失败的情况
  _requestAPI(shouldStartCounting){
    this.setState({
      state: '正在请求验证码'
    })
    setTimeout(()=>{
      const requestSucc = Math.random() + 0.5 > 1
      this.setState({
        state: `（随机）模拟验证码获取${requestSucc ? '成功' : '失败'}`
      })
      shouldStartCounting && shouldStartCounting(requestSucc)
    }, 2000);

  }
  render() {
    const {phoneNum} = this.state
    return (
      <View style={styles.container}>

        <View style={{flexDirection:'row'}}>

        <View style={styles.textInputView}>
          <TextInput style={styles.textInput} 
           underlineColorAndroid='transparent'
           keyboardType='numeric'
          placeholder={'请输入手机号码'} value={phoneNum} onChangeText={(value)=>{
            this.setState({
              phoneNum: value
            })
          }}/>
        </View>

        <View>
        <CountDownButton style={{backgroundColor:'#F9BD3A'}}
          timerTitle={'获取验证码'}
          enable={phoneNum.length > 10}
          onClick={(shouldStartCounting)=>{
            this._requestAPI(shouldStartCounting)
          }}
          timerEnd={()=>{
            this.setState({
              state: '倒计时结束'
            })
          }}/>
          </View>
          </View>

          <View>
        <Text style={styles.stateText}>{this.state.state}</Text>
        </View>
      
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    justifyContent: 'center',
    alignItems: 'center',
    width:410,
  },
  textInputView:{
    borderWidth: 1,
    borderColor: 'blue',
    padding: 2,
    marginRight:15,
  },
  textInput:{
    width: 200,
    height: 40,
  },
  stateText: {
    paddingTop: 15,
    color: 'gray'
  }
});

AppRegistry.registerComponent('Test', () => Test);
