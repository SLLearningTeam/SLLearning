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

import TuiJian from './TuiJian'
export default class XiangQing extends Component<Props> {
  render() {
    return (
    <View style={{flex:1}}>
    <View style={{flex:1}}>
    <ScrollView  horizontal = {false}
     showsHorizontalScrollIndicator ={false}>
     <View style={{flex:0.82}}> 
     {/*头部栏开始*/}
     <View style={{flex:0.09,backgroundColor:'white',borderBottomWidth:1,flexDirection:'row'}}>
     <TouchableOpacity onPress={this.fanhui.bind(this)}>
     <Image style={{marginRight:85}} source={require('../imgs/fanhui.png')}/>
     </TouchableOpacity>
     <Text style={{marginLeft:45,fontSize:25,fontWeight:'bold',textAlignVertical:'center'}}>四级</Text>
     </View>
     {/*头部栏结束*/}
     {/*试题部分开始*/}
     {/*四个排序*/}
     <View style={{flexDirection:'row',borderBottomWidth:1}}>
     {/*第一个排序*/}
     <View style={{flexDirection:'row'}}>
     <Text style={styles.paixufont}>综合排序</Text>
     <Image style={styles.paixuimg} source={require('../imgs/xiajiantou.png')} />
     </View>
     {/*第一个排序*/}
     {/*第二个排序*/}
     <View style={{flexDirection:'row'}}>
     <Text style={styles.paixufont}>热度排序</Text>
     <Image style={styles.paixuimg} source={require('../imgs/xiajiantou.png')} />
     </View>
     {/*第二个排序*/}
     {/*第三个排序*/}
     <View style={{flexDirection:'row'}}>
     <Text style={styles.paixufont}>评分排序</Text>
     <Image style={styles.paixuimg} source={require('../imgs/xiajiantou.png')} />
     </View>
     {/*第三个排序*/}
     {/*第四个排序*/}
     <View style={{flexDirection:'row'}}>
     <Text style={styles.paixufont}>综合筛选</Text>
     <Image style={styles.paixuimg} source={require('../imgs/xiajiantou.png')} />
     </View>
     {/*第四个排序*/}
     </View>
     {/*四个排序*/}
     {/*试题部分结束*/}
     </View>
     {/*推荐部分*/}
     <View>
     <TouchableOpacity onPress={this.tiaozhuan.bind(this)}>
     <TuiJian />
     </TouchableOpacity>
     <TuiJian />
     <TuiJian />
     <TuiJian />
     </View>
     </ScrollView>
     </View>
    
     </View>
    );
  }
fanhui(){
  const navigator = this.props.navigator;
  navigator.pop()
}
tiaozhuan(){
  const navigator = this.props.navigator;
  navigator.push({
    component:ShiTi,
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
paixufont:{
  fontSize:18,
  margin:6

},
paixuimg:{
marginLeft:-12,
marginTop:3
},
});