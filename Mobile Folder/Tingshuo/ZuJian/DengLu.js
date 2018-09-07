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
   
   Post () {
    const url = `http://101.200.51.53:8080/SSLearningTeam/user/mobile/login?userPhoneNumber=${this.state.id}&userPassword=${this.state.password}`
    fetch(url)
      .then((response)=>{return response.json();})
      .then((responseData)=>{
        var data = responseData.status;
        var name = responseData.info.userName;
        
        var touxiang = responseData.info.userAvatarUrl;
          alert("欢迎登陆"+name);
          const navigator =this.props.navigator;
          navigator.push({
            component:Home,
            params:{
              aa:name
             
            }
          })
      })
      .catch((error)=>{
          alert(error);
      })
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
    onChangeText={(id)=>this.setState({id})}
    placeholder="请输入手机号:"
    keyboardType="numeric"
    selectionColor="white"
    style={{textAlign:'center'}}                    
    
    />
     </View> 
     <View style={{width:20,height:20,marginLeft:-50,marginTop:26}}>
     <TouchableOpacity >
     <Image style={{width:20,height:20,}} source ={require('../imgs/qingchu.png')} />
     </TouchableOpacity>
     </View>
     </View>
     <View>
     <TextInput  
      onChangeText={(password)=>this.setState({password})}
      placeholder="请输入密码:"
      secureTextEntry={true}
      selectionColor="black"
      style={{textAlign:'center'}}
    />
    </View>
    
    

    <TouchableOpacity onPress={()=>this.Post()}>
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

