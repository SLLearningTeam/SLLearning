/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  Platform,
  StyleSheet,
  Text,
  View,
  TouchableOpacity,
  Image,
  Button,
} from 'react-native';
import Answer from './Answer'
import Title from '../ZuJian/Title'
const instructions = Platform.select({
  ios: 'Press Cmd+R to reload,\n' +
    'Cmd+D or shake for dev menu',
  android: 'Double tap R on your keyboard to reload,\n' +
    'Shake or press menu button for dev menu',
});

type Props = {};
export default class Yasi extends Component<Props> {
  render() {
    return (
      <View>
       {/*头部栏开始*/}
     <View style={{backgroundColor:'white',borderBottomWidth:1,flexDirection:'row'}}>
          <TouchableOpacity onPress={
        this.fanhuiPress.bind(this)
      }>
     <Image style={{marginRight:100}} source={require('../imgs/fanhui.png')}/>
     </TouchableOpacity>
     <Text style={{fontSize:25,marginTop:9,color:'#808080'}}>跟读</Text>
     <Image style={styles.headImg} source={require('../imgs/dingyue.png')}/>
     <Image style={styles.headImg} source={require('../imgs/ziti.png')}/>
     <Image style={styles.headImg} source={require('../imgs/xiazai.png')}/>
     </View>
     {/*头部栏结束*/}
      <View style={styles.question}>
      <View style={{flexDirection:'row',justifyContent:'space-between'}}>
      <Image source={require('../imgs/laba.png')}></Image>
       <Button
        title="查看问题"
        color="#19BA94"
        onPress={this.AnswerPress.bind(this)}
      />
      </View>
      <View style={styles.border}>
      <Image style={{width:200,height:200}} 
      source={require('../imgs/question.png')}></Image>
      <Text 
      style={{textAlign:'center',fontSize:20,color:'#808080',marginTop:30}}
      >
      想想怎么回答这个问题吧？</Text>
      </View>
      <View style={styles.play}>
      <Image style={{height:50,width:50}} source={require('../imgs/playing.png')}></Image>
      <Image style={{height:70,width:70}} source={require('../imgs/luying.png')}></Image>
      <Image style={{height:50,width:50}} source={require('../imgs/xiayige.png')}></Image>
      </View>
      </View>
      </View>
    );
  }
   AnswerPress(){
    let navigator = this.props.navigator;
    if (navigator) {
      navigator.push({
        name:'答案',
        component:Answer,
      });
    }
  }
  fanhuiPress() {
      const navigator = this.props.navigator;
      if (navigator) {
        navigator.pop()
      }
     }
}

const styles = StyleSheet.create({
  question:{
    marginTop:70,
    marginRight:30,
    marginLeft:30,
  },
  border:{
    borderWidth:3,
    borderColor:'#E6E6E6',
    marginTop:30,
    height:320,
    shadowColor:'red',
    shadowOffset:{width:20,height:20},
    elevation:24,
    alignItems:'center',
  },
  play:{
    flexDirection:'row',
    justifyContent:'space-between',
    margin:40,
  },
  headImg:{
  width:35,
  height:35,
  marginTop:6,
  marginLeft:30,
},
});
module.exports = Yasi;