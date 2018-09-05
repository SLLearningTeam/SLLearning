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

import YanZhengMa from './YanZhengMa';

 function getRequest(url){
    var opts={
        method:"GET"
    }
    fetch(url,opts)
    .then((response)=>{
        return response.text();
    })
    .then((responseText)=>{
        alert(responseText)
    })
    .catch((error)=>{
        alert(error);
    })
  }
  function postRequest(url){
  let formData = new FormData();
  formData.append("id",this.state.inputText,);
  formData.append("password",this.state.text1,);
  var opts={
    method:"POST",
    body:formData
  }
fetch(url,opts)
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

import ZhuCe from './ZhuCe'
export default class DengLu extends Component {
    constructor(props) {
    super(props);
    this.state = {
     

    };  

  
  }
  render() {
      return (
        <ImageBackground style={{height:680,width:420}} source={require('../imgs/beijing.jpg')}>
      <View style={{flex:1}} >
    
      <View style={{flex:0.1,}}>
      <TouchableOpacity onPress={this.fanhui.bind(this)}>
      <Image source={require('../imgs/fanhui.png')} />
      </TouchableOpacity>
      </View>
      <View style={{flex:0.3,}}>
      <Image style={{width:100,height:100,marginLeft:150,borderRadius:100}} source={require('../imgs/logo.png')} />
      </View>
      <View>
      <View style={{flexDirection:'row'}}>
     <View style={{padding:10,width:420}}>
    <TextInput
    
    placeholder="请输入手机号:"
    keyboardType="numeric"
    selectionColor="white"
    style={{textAlign:'center'}}                      
    clearButtonMode={'always'}
    //清除输入
    onChangeText={(text) => {this.setState({inputText:text})}}
    value = {this.state.inputText}
    clearButtonMode="while-editing"
     //清除输入
    
    />
     </View> 
     <View style={{width:20,height:20,marginLeft:-50,marginTop:26}}>
     <TouchableOpacity onPress={this.qingchu.bind(this)}>
     <Image style={{width:20,height:20,}} source ={require('../imgs/qingchu.png')} />
     </TouchableOpacity>
     </View>
     </View>
     <View>
   <TextInput  
    onChangeText={(text1) => this.setState({text1})}
      placeholder="请输入密码:"
      secureTextEntry={true}
      selectionColor="black"
      style={{textAlign:'center'}}
    />
    </View>
    
    <View style={{width:410,}}>
    <YanZhengMa />
    </View>

    <TouchableOpacity onPress={postRequest.bind(this,"http://172.19.186.76:8080/SSLearningTeam/user/testlogin")}>
    <View style={styles.btn}>
    <Text style={styles.loginText}>登   陆</Text>
    </View>
    </TouchableOpacity>
      <View>
      </View>
      <Text style={{marginTop:10,fontSize:15,textAlign:'center',color:'#1d82fe'}}>忘记密码>>></Text>
      <TouchableOpacity onPress={this.zhuce.bind(this)}>
      <Text style={{marginTop:10,fontSize:15,textAlign:'center',color:'#1d82fe'}}>新用户注册>>></Text>
      </TouchableOpacity>
      </View>
      </View>
      </ImageBackground>
        );
    } 
    fanhui(){
      const navigator=this.props.navigator;
      navigator.pop()
    }
    zhuce(){
      const navigator=this.props.navigator;
      navigator.push({
        component:ZhuCe,
      })
    }
    qingchu(){
    this.setState({inputText:' '});
    }

  }



const styles = StyleSheet.create({
btn:{
  width:395,
  height:50,
  backgroundColor:'#00a3ff',
  borderRadius:5,
  margin:10,
},
loginText:{
  fontSize:20,
  fontWeight:'bold',
  color:'white',
  textAlign:'center',
  marginTop:10,
},
input:{

}
});

