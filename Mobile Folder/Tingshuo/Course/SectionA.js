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
} from 'react-native';

const instructions = Platform.select({
  ios: 'Press Cmd+R to reload,\n' +
    'Cmd+D or shake for dev menu',
  android: 'Double tap R on your keyboard to reload,\n' +
    'Shake or press menu button for dev menu',
});

type Props = {};
export default class SectionA extends Component<Props> {
  render() {
    return (
      <View>
      <View style={{flexDirection:'row',borderWidth:2,borderBottomColor:'#F2F2F2',borderColor:'#F2F2F2'}}>
      <View>
      <Image style={{width:35,height:35,marginLeft:'3%'}}source={require('../imgs/back.png')}></Image>
      </View>
      <View style={{marginTop:'3%',flexDirection:'row',justifyContent:'space-between',marginLeft:'30%',width:'50%'}}>
      <Image source={require('../imgs/text.png')}></Image>
      <Image source={require('../imgs/dingyue1.png')}></Image>
      <Image source={require('../imgs/ziti.png')}></Image>
      <Image source={require('../imgs/xiazai.png')}></Image>
      </View>
      </View>
      <ScrollView>
      <View style={{margin:'3%'}}>
      <Text style={{fontSize:25,color:'#272822',fontWeight:'bold'}}>Section A</Text>
      <Text style={{color:'#AAAEB4',fontSize:20}}>A部分</Text>
      <Text style={{fontSize:20,color:'#00AAA9'}}>Direction:In this section , you will hear ten short conversations between two speakers. At the end of each conversation, a question will be asked about what was said.</Text>
      <Text style={{color:'#AAAEB4',fontSize:15,marginTop:'3%'}}>考试说明：在这一节中，你将听到两个发言者之间的十个简短对话。在每一个对话结束后，会问一个问题。</Text>
      <Text style={{fontSize:20,color:'#00AAA9',marginTop:'3%'}}>The conversations and the questions will be spoken only once. </Text>
      <Text style={{color:'#AAAEB4',fontSize:15,marginTop:'3%'}}>每段对话只说一遍。</Text>
      <Text style={{fontSize:20,color:'#00AAA9',marginTop:'3%'}}>After you hear a conversation and the questions about it, read the four possible answers on your paper, and decide which one is the best answer to the question you have heard. </Text>
      <Text style={{color:'#AAAEB4',fontSize:15,marginTop:'3%'}}>听完对话和问题后，从试卷上的四个选项中选出你认为正确的选项。</Text>
      </View>
      </ScrollView>
      </View>
    );
  }
}

const styles = StyleSheet.create({

});
