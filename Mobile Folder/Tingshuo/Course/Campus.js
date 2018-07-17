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

const instructions = Platform.select({
  ios: 'Press Cmd+R to reload,\n' +
    'Cmd+D or shake for dev menu',
  android: 'Double tap R on your keyboard to reload,\n' +
    'Shake or press menu button for dev menu',
});

type Props = {};
export default class Campus extends Component<Props> {
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
     <ScrollView>
   {/*对话开始*/}
   <View>
     <View style={styles.chat1}>
     <Image style={{width:60,height:60,marginLeft:15,borderRadius:50,marginTop:30}} 
     source={require('../imgs/girl.png')}/>
     <View style={styles.border}>
     <Text style={styles.chat}>hey Calvin! What are you doing here?</Text>
     <View style={{flexDirection:'row',marginTop:10,marginBottom:10,marginRight:35,marginLeft:35,justifyContent:'space-between'}}>
     <Image style={{height:40,width:40}} source={require('../imgs/playing.png')}></Image>
      <Image style={{height:40,width:40}} source={require('../imgs/luying.png')}></Image>
      <Image style={{height:40,width:40}} source={require('../imgs/xiayige.png')}></Image>
     </View>
     </View>
     </View>

      <View style={styles.chat1}>
     <Image style={{width:60,height:60,marginLeft:15,borderRadius:50,marginTop:30}} 
     source={require('../imgs/girl.png')}/>
     <View style={styles.border}>
     <Text style={styles.chat}>Should not you be having your British Literature classright now?</Text>
     </View>
     </View>

     <View style={styles.chat2}>
     <View style={styles.border}>
     <Text style={styles.chat}>Um...actually,I'm lost here.</Text>
     </View>
     <Image style={{width:60,height:60,marginLeft:10,borderRadius:50,marginTop:30}} 
     source={require('../imgs/boy.png')}/>
     </View>

      <View style={styles.chat1}>
     <Image style={{width:60,height:60,marginLeft:15,borderRadius:50,marginTop:30}} 
     source={require('../imgs/girl.png')}/>
     <View style={styles.border}>
     <Text style={styles.chat}>How come?</Text>
     </View>
     </View>

      <View style={styles.chat2}>
     <View style={styles.border}>
     <Text style={styles.chat}>I was told we'd have the class in a building the pond.</Text>
     </View>
     <Image style={{width:60,height:60,marginLeft:10,borderRadius:50,marginTop:30}} 
     source={require('../imgs/boy.png')}/>
     </View>

      <View style={styles.chat2}>
     <View style={styles.border}>
     <Text style={styles.chat}>But I didn't pay attention to which building it was.</Text>
     </View>
     <Image style={{width:60,height:60,marginLeft:10,borderRadius:50,marginTop:30}} 
     source={require('../imgs/boy.png')}/>
     </View>

      <View style={styles.chat2}>
     <View style={styles.border}>
     <Text style={styles.chat}>And the 'pond' is do big!</Text>
     </View>
     <Image style={{width:60,height:60,marginLeft:10,borderRadius:50,marginTop:30}} 
     source={require('../imgs/boy.png')}/>
     </View>

      <View style={styles.chat2}>
     <View style={styles.border}>
     <Text style={styles.chat}>There are at least four building around it.</Text>
     </View>
     <Image style={{width:60,height:60,marginLeft:10,borderRadius:50,marginTop:30}} 
     source={require('../imgs/boy.png')}/>
     </View>

     <View style={styles.chat1}>
     <Image style={{width:60,height:60,marginLeft:15,borderRadius:50,marginTop:30}} 
     source={require('../imgs/girl.png')}/>
     <View style={styles.border}>
     <Text style={styles.chat}>Right, our campus is huge.</Text>
     </View>
     </View>
          <View style={styles.chat1}>
     <Image style={{width:60,height:60,marginLeft:15,borderRadius:50,marginTop:30}} 
     source={require('../imgs/girl.png')}/>
     <View style={styles.border}>
     <Text style={styles.chat}>Right, our campus is huge.</Text>
     </View>
     </View>
   </View>
   {/*对话结束*/}
   </ScrollView>
      </View>
    );
  }
  fanhuiPress() {
      const navigator = this.props.navigator;
      if (navigator) {
        navigator.pop()
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
  },
    list3:{
    width:'50%',
    height:'80%',
    marginTop:'1%',
    marginLeft:'10%',
    marginRight:'10%',
  },
    headImg:{
    width:35,
    height:35,
    marginTop:6,
    marginLeft:30,
  },
  chat:{
    fontSize:20,
    color:'#1C1F17',
    marginLeft:10,
  },
    border:{
    flex:1,
    marginLeft:10,
    borderRadius:10,
    marginTop:30,
    borderColor:'#E6E6E6',
    borderWidth:1,
    backgroundColor:'#E6E6E6'
  },
  chat1:{
    flexDirection:'row',
    marginRight:80,
  },
  chat2:{
    flexDirection:'row',
    marginLeft:80,
    marginRight:15,
  }
});
module.exports = Campus;