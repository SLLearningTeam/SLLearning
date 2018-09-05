import React, { Component } from 'react';
import {
  Platform,
  StyleSheet,
  Text,
  View,
  Image,
  ScrollView,
  TouchableOpacity,
  WebView,

} from 'react-native';
import CeShi from './CeShi'
import Home from '../Home/Home'
import faXianPage from '../Home/faXianPage'
import XiangQing from './XiangQing'
import XiaZai from './XiaZai'
export default class ShiTi extends Component<Props> {
  render() {
    return (
    <View style={{flex:1}}>
    <View style={{flex:0.91}}>
    <ScrollView  horizontal = {false}
     showsHorizontalScrollIndicator ={false}>
     <View style={{flex:0.82}}> 
     {/*头部栏开始*/}
     <View style={{flex:0.09,backgroundColor:'white',borderBottomWidth:1,flexDirection:'row'}}>
     <TouchableOpacity onPress={(this.tiao.bind(this))}>
     <Image style={{marginRight:85}} source={require('../imgs/fanhui.png')}/>
     </TouchableOpacity>  
     <TouchableOpacity onPress={this.change.bind(this)}>
     <Image style={styles.headImg} source={require('../imgs/lianxi.png')} />
     </TouchableOpacity>
     <Image style={styles.headImg} source={require('../imgs/dingyue.png')}/>
     <Image style={styles.headImg} source={require('../imgs/ziti.png')}/>
     <TouchableOpacity onPress={this.xiazai.bind(this)}>
     <Image style={styles.headImg} source={require('../imgs/xiazai.png')}/>
     </TouchableOpacity>
     </View>
     {/*头部栏结束*/}
     {/*试题部分开始*/}
     <View style={{alignItems:'baseline',flex:0.82}}>
     <Text style={styles.biaoTi}>待显示简介听力内容</Text>
       
           <View style={{width:420,height:400,backgroundColor:'green'}}>
                <Text>english</Text>
           </View>
           <View style={{width:420,height:20,backgroundColor:'white'}}></View>
           <View style={{width:420,height:400,backgroundColor:'green'}}>
               <Text>english</Text>
           </View>
      
     </View>
     {/*试题部分结束*/}
     </View>
     </ScrollView>
     </View>
     {/*底部栏开始*/}
     <View style={{flex:0.09,backgroundColor:'white',borderTopWidth:1,flexDirection:'row'}}>
     <View style={{width:100,height:100,backgroundColor:'red',marginLeft:175}}>
     <WebView
                      source={require('../Home/audio.html')}
                      automaticallyAdjustContentInsets={false}
                    />  
     </View> 

     </View>
     {/*底部栏结束*/}
     
     </View>
    );
  }
  tiao(){
  const navigator =this.props.navigator;
  navigator.pop()
 }
 change(){
  const navigator=this.props.navigator;
  navigator.push({
    component:CeShi,
    name:'测试页',
  })
 }
 xiazai(){
  const navigator=this.props.navigator;
  navigator.push({
    component:XiaZai,
    name:'下载页'
  })
  }
   kouyu(){
     alert("start")
 }
 
 
 

}
const styles = StyleSheet.create({
headImg:{
  width:35,
  height:35,
  marginTop:6,
  marginLeft:30,
},
biaoTi:{
  fontWeight:'bold',
  fontSize:25,
  margin:10,
  color:'black'
},
bottomImg:{
  width:35,
  height:35,
  marginTop:6,
  marginLeft:40,
},
});