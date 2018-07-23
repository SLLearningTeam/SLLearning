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
var max=20
var min=6
import ZhuCe from './ZhuCe'
import YanZhengMa from './YanZhengMa'
import RadioModal from 'react-native-radio-master';
export default class DengLu extends Component {
    constructor(props) {
    super(props);
    this.state = {
     inputText:'',
     initId:'0',
     show:false,
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
      <View style={{width:410,height:400,backgroundColor:'white',marginTop:100}}>
      <View style={{flexDirection:'row'}}>
     <View style={{padding:10,width:420}}>
    
    <TextInput  
    onChangeText={(text2) => this.setState({text2})}
      placeholder="请输入用户名:"
      selectionColor="black"
      style={{textAlign:'center'}}
    />
     {/*性别选择*/}
          <View style={{marginLeft:100,width:400,height:40,}}>
            <RadioModal
                selectedValue={this.state.initId}
                onValueChange={(id,item) => this.setState({initId: id})}
                style={{ flexDirection:'row',
                      flexWrap:'wrap',
                      alignItems:'flex-start',
                      flex:1,
                      backgroundColor:'#ffffff',padding:5,marginTop:10
                      }} 
                >
                <Text value="0">男</Text>
                <Text value="1">女</Text>
               </RadioModal>
           </View>
           {/*性别选择*/}
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
     <View style={{width:20,height:20,marginLeft:-50,marginTop:118}}>
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
      maxLength={max}
      minLength={min}
      style={{textAlign:'center'}}
    />
       <TextInput  
    onChangeText={(text3) => this.setState({text3})}
      placeholder="请确认密码:"
      secureTextEntry={true}
      selectionColor="black"
      maxLength={max}
      minLength={min}
      style={{textAlign:'center'}}
    />
    
    <View>
    <YanZhengMa />
    </View>

    </View>
    <TouchableOpacity onPress={postRequest.bind(this,"http://172.19.191.254:8080/SSLearningTeam/user/testlogin")}>
    <View style={styles.btn}>
    <Text style={styles.loginText}>登   陆</Text>
    </View>
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
    this.setState({inputText:''});
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

