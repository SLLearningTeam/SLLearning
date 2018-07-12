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
     <Text style={styles.biaoTi}>Section A</Text>
     <Text style={styles.tiMuENG}>Directions:In the section,you will
     hear 8 long conversition and 2 short conversion.</Text>
     <Text style={styles.tiMuCHI}>考试说明：在这一部分你将会
     听到8段长对话和2段短对话。</Text>
     <Text style={styles.tiMuENG}>At the end of each conversion,
     one or more questions will be asked about waht was said.</Text>
     <Text style={styles.tiMuCHI}>每段对话结束后，请根据听到的内容
     回答一个或多个问题。</Text>
     <Text style={styles.tiMuENG}>Both the conversion and the questions 
     will be spoken only once.</Text>
     <Text style={styles.tiMuCHI}>同样的对话和问题只读一遍。</Text>
     <Text style={styles.tiMuENG}>Both the conversion and the questions 
     will be spoken only once.</Text>
     <Text style={styles.tiMuCHI}>同样的对话和问题只读一遍。</Text>
     <Text style={styles.tiMuENG}>Both the conversion and the questions 
     will be spoken only once.</Text>
     <Text style={styles.tiMuCHI}>同样的对话和问题只读一遍。</Text>
     </View>
     {/*试题部分结束*/}
     </View>
     </ScrollView>
     </View>
     {/*底部栏开始*/}
     <View style={{flex:0.09,backgroundColor:'white',borderTopWidth:1,flexDirection:'row'}}>
     <Image style={styles.bottomImg} source={require('../imgs/erji.png')}/>
     <Image style={styles.bottomImg} source={require('../imgs/kuaitui.png')}/>
     <Image style={styles.bottomImg} source={require('../imgs/bofang2.png')}/>
     <Image style={styles.bottomImg} source={require('../imgs/kuaijin.png')}/>
     <Image style={styles.bottomImg} source={require('../imgs/pingjia.png')}/>
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
tiMuENG:{
  color:'red',
  fontSize:20,
  margin:15,
},
tiMuCHI:{
  fontSize:20,
  margin:15,
},
bottomImg:{
  width:35,
  height:35,
  marginTop:6,
  marginLeft:40,
},
});