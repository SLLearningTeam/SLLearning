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
  Image,
  Button,
  TouchableOpacity,
} from 'react-native';
import Title from '../ZuJian/Title'
const instructions = Platform.select({
  ios: 'Press Cmd+R to reload,\n' +
    'Cmd+D or shake for dev menu',
  android: 'Double tap R on your keyboard to reload,\n' +
    'Shake or press menu button for dev menu',
});

type Props = {};
export default class Answer extends Component<Props> {
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
      <View 
      style={{width:180,height:40,marginLeft:85,backgroundColor:'#18BA94',borderRadius:20}}>
      <Text style={{fontSize:25,color:'white',textAlign:'center'}}>100 Perfact!!!</Text>
      </View>
      <View style={{flexDirection:'row',marginTop:30}}>
      <Image style={{marginTop:7}} source={require('../imgs/laba.png')}></Image>
      <Text style={{fontSize:20,fontWeight:'bold',marginLeft:15}}>Are you interested in fashion or clothes fashion?</Text>
      </View>
      <View style={styles.border}>
      <Text style={{fontSize:20,fontWeight:'bold',marginTop:30,marginLeft:30,marginRight:30}}>...but I don't want to look old-fashioned either.</Text>
      
      <View style={styles.tra}>
      <Text style={styles.tran}>翻译</Text>
      </View>
      <View style={styles.play}>
      <Image style={{height:50,width:50,marginRight:40,marginLeft:48}} source={require('../imgs/playing.png')}></Image>
      <Image style={{height:70,width:70}} source={require('../imgs/luying.png')}></Image>
      <Image style={{height:50,width:50,marginLeft:40}} source={require('../imgs/xiayige.png')}></Image>
      </View>
      </View>
      </View>
      <View 
      style={{width:130,height:40,marginLeft:140,marginTop:30,backgroundColor:'#18BA94'}}>
      <Text style={{fontSize:22,color:'white',textAlign:'center',marginTop:3}}>下一句</Text>
      </View>
      </View>
    );
  }
     translatePress(){
    let navigator = this.props.navigator;
    if (navigator) {
      navigator.push({
        name:'翻译',
        component:translate,
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
    marginTop:40,
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
  },
  play:{
    flexDirection:'row',
    marginTop:80,
  },
  tra:{
    marginTop:10,width:60,
    height:30,
    marginLeft:30,
    borderRadius:3,
    borderWidth:2,
    borderColor:'#808080'
  },
  tran:{
    fontSize:15,
    backgroundColor:'#FFFFFF',
    color:'#808080',
    textAlign:'center',
    marginTop:1,
  },
  headImg:{
  width:35,
  height:35,
  marginTop:6,
  marginLeft:30,
},
});
module.modules=Answer;