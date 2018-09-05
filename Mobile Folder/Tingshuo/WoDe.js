import React, { Component } from 'react';
import {
  Platform,
  StyleSheet,
  Text,
  View,
  Image,
  ScrollView,
  TouchableOpacity,
} from 'react-native';
import XiaZai from '../ZuJian/XiaZai'
import DengLu from './DengLu'
import ZhuCe from './ZhuCe'
export default class WoDe extends Component<Props> {
  render() {
    return (
    <View>  
    
    {/*头像和用户名*/}
    <View style={{flexDirection:'row',marginTop:30,marginLeft:30}}>
    <View>
    <Image style={{width:80,height:80,borderRadius:100}} source={require('../imgs/touxiang2.png')} />
    </View>
    <View style={{flexDirection:'row',marginTop:25}}>
    <TouchableOpacity onPress={this.denglu.bind(this)}>
    <View style={styles.button2}>
    <Text style={styles.button}>登陆</Text>
    </View>
    </TouchableOpacity>
    <View style={styles.button2}>
    <TouchableOpacity onPress={this.zhuce.bind(this)}>
    <Text style={styles.button}>注册</Text>
    </TouchableOpacity>
    </View>
    </View>
    </View>
    {/*头像和用户名*/}
    {/*资源、下载、设置*/}
    {/*1*/}
    <View>

    <View style={{flexDirection:'row',marginTop:20,marginBottom:20,height:50,borderBottomWidth:1}}>
    <Image style={styles.xiaologo} source={require('../imgs/ziyuan.png')}/>
    <Text style={styles.ziti}>网络资源</Text>
    </View>

    <View style={{flexDirection:'row'}}>
    <Image style={styles.xiaologo} source={require('../imgs/lishi.png')}/>
    <Text style={styles.ziti}>历史记录</Text>
    </View>
    
    </View>
     {/*2*/}
    <View>
    <View style={{flexDirection:'row',marginBottom:20,height:100,borderBottomWidth:1}}>
    <Image style={styles.xiaologo} source={require('../imgs/wodexiazai.png')}/>
    <TouchableOpacity onPress={this.tiaozhuan.bind(this)}>
    <Text style={styles.ziti}>我的下载</Text>
    </TouchableOpacity>
    </View>
     <View style={{flexDirection:'row'}}>
    <Image style={styles.xiaologo} source={require('../imgs/yijian.png')}/>
    <Text style={styles.ziti}>意见反馈</Text>
    </View>
    </View>
     {/*3*/}
    <View style={{flexDirection:'row',height:200,}}>
    <Image style={styles.xiaologo} source={require('../imgs/wodeshezhi.png')}/>
    <Text style={styles.ziti}>设置</Text>
    </View>
    </View>
    );
  }
  tiaozhuan(){
    const navigator=this.props.navigator;
    navigator.push({
      component:XiaZai,
      name:'下载页'
    })
  }
  denglu(){
    const navigator =this.props.navigator;
    navigator.push({
      component:DengLu,
      name:"登陆",
    })
  }
  zhuce(){
    const navigator=this.props.navigator;
    navigator.push({
      component:ZhuCe
    })
  }
}
const styles = StyleSheet.create({
ziti:{
  fontSize:20,
  color:'black',
  marginLeft:20,
},
xiaologo:{
  marginLeft:20
},
button:{
  fontSize:20,
  color:'white',
  textAlign:'center',
  marginTop:3
},
button2:{
width:55,
height:35,
borderTopLeftRadius:35,
borderTopRightRadius:35,
borderBottomLeftRadius:35,
borderBottomRightRadius:35,
backgroundColor:'#00bdda',
marginLeft:15,
}
});