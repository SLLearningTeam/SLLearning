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
  TouchableOpacity,
  ScrollView,
} from 'react-native';
import Story from './Story'
import Yasi from './Yasi'
import Campus from './Campus'
const instructions = Platform.select({
  ios: 'Press Cmd+R to reload,\n' +
    'Cmd+D or shake for dev menu',
  android: 'Double tap R on your keyboard to reload,\n' +
    'Shake or press menu button for dev menu',
});

type Props = {};
export default class Speak extends Component<Props> {
  render() {
    return (
      <View style={{flex:1}}>

    {/*导航条开始*/}
      <View style={styles.class1}>
       <TouchableOpacity onPress={
        this.BackPress.bind(this)
      }>
      <Image style={styles.list3} source={require('../imgs/fanhui.png')}></Image>
      </TouchableOpacity>
      <Text style={{fontSize:25,marginTop:5}}>口语</Text>
      <TouchableOpacity onPress={
        this.HomePress.bind(this)
      }>
      <Image style={styles.list3} source={require('../imgs/home.png')}></Image>
      </TouchableOpacity>
      </View>
       {/*口语故事*/}   
      <View style={{flex:0.3}}>
      <TouchableOpacity onPress={
        this.storyPress.bind(this)
      }>
      <Image style={{width:'100%',height:'100%'}} source={require('../imgs/story.jpg')}></Image>
      </TouchableOpacity>
      </View>
      {/*雅思*/}
      <View style={{flex:0.31,margin:'3%',borderWidth:2,borderBottomColor:'#F2F2F2',borderColor:'#F2F2F2'}}>
      <View style={{justifyContent:'space-between',flexDirection:'row'}}>
      <Text style={{fontSize:20}}>雅思</Text>
      <View style={{justifyContent:'space-between',flexDirection:'row'}}>
      <Text style={{fontSize:15,marginTop:'4%'}}>更多</Text>
      <Image source={require('../imgs/more.png')}></Image>
      </View>
      </View>
    {/*雅思Part1*/}
      <View style={{justifyContent:'space-between',flexDirection:'row'}}>
      <View style={{width:'47%',height:'100%'}}>
      <TouchableOpacity onPress={
        this.yasiPress.bind(this)
      }>
      <Image style={{width:'100%',height:'79%',borderRadius:8}} source={require('../imgs/part1.png')}></Image>
      <Text style={{textAlign:'center',fontSize:15,color:'#272822'}}>雅思Part1：个人喜好</Text>
      </TouchableOpacity>
      </View>
      <View style={{width:'47%',height:'100%'}}>
      <Image style={{width:'100%',height:'79%',borderRadius:8}} source={require('../imgs/part2.png')}></Image>
      <Text style={{textAlign:'center',fontSize:15,color:'#272822'}}>雅思Part1：日常生活</Text>
      </View>
      </View>

      </View>
    {/*美语*/}
      <View style={{flex:0.31,margin:'3%',borderWidth:2,borderBottomColor:'#F2F2F2',borderColor:'#F2F2F2'}}>
      <View style={{justifyContent:'space-between',flexDirection:'row'}}>
      <Text style={{fontSize:20}}>美语</Text>
      <View style={{justifyContent:'space-between',flexDirection:'row'}}>
      <Text style={{fontSize:15,marginTop:'4%'}}>更多</Text>
      <Image source={require('../imgs/more.png')}></Image>
      </View>
      </View>
    {/*校园生活口语*/}
      <View style={{justifyContent:'space-between',flexDirection:'row'}}>
      <View style={{width:'47%',height:'100%'}}>
     <TouchableOpacity onPress={
        this.campusPress.bind(this)
      }>
      <Image style={{width:'100%',height:'79%',borderRadius:8}} source={require('../imgs/outclass.png')}></Image>
      <Text style={{textAlign:'center',fontSize:15,color:'#272822'}}>校园生活口语：课外</Text>
      </TouchableOpacity>
      </View>
      <View style={{width:'47%',height:'100%'}}>
      <Image style={{width:'100%',height:'79%',borderRadius:8}} source={require('../imgs/study.png')}></Image>
      <Text style={{textAlign:'center',fontSize:15,color:'#272822'}}>校园生活口语：学习</Text>
      </View>
      </View>

      </View>
      </View>
    );
  }
  BackPress() {
      const navigator = this.props.navigator;
      if (navigator) {
        navigator.pop()
      }
     }
    
    HomePress() {
    let navigator = this.props.navigator;
    if (navigator) {
      navigator.pop
    }
  }

   storyPress() {
    let navigator = this.props.navigator;
    if (navigator) {
      navigator.push({
        name:'口语故事',
        component:Story,
      });
    }
  }
  yasiPress() {
    let navigator = this.props.navigator;
    if (navigator) {
      navigator.push({
        name:'口语故事',
        component:Yasi,
      });
    }
  }
   campusPress() {
    let navigator = this.props.navigator;
    if (navigator) {
      navigator.push({
        name:'口语故事',
        component:Campus,
      });
    }
  }
}
const styles = StyleSheet.create({
  class1:{
    width:'100%',
    height:'8%',
    borderWidth:2,
    borderBottomColor:'#F2F2F2',
    borderColor:'#F2F2F2',
    flexDirection:'row',
    shadowColor:'#272822',
    justifyContent:'space-between',
    flex:0.08,
  },
    list3:{
    width:'50%',
    height:'80%',
    marginTop:'1%',
    marginLeft:'10%',
    marginRight:'10%',
  },
});
module.exports = Speak;