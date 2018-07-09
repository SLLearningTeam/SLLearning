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
export default class WoDe extends Component<Props> {
  render() {
    return (
    <View>  
    
    {/*头像和用户名*/}
    <View style={{flexDirection:'row',marginTop:30,marginLeft:30}}>
    <View>
    <Image style={{width:80,height:80,borderRadius:100}} source={require('../imgs/touxiang.png')} />
    </View>
    <View>
    <Text style={styles.Title}>听说用户001</Text>
    <Text style={styles.Info}>ID:25025202</Text>
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
    <Text style={styles.ziti}>我的下载</Text>
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
}
const styles = StyleSheet.create({
Title:{
  fontSize:20,
  fontWeight:'bold',
  color:'black',
  margin:10
},
Info:{
  margin:10
},
ziti:{
  fontSize:20,
  color:'black',
  marginLeft:20,
},
xiaologo:{
  marginLeft:20
}
});