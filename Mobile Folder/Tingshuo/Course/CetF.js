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
  ScrollView,
} from 'react-native';

const instructions = Platform.select({
  ios: 'Press Cmd+R to reload,\n' +
    'Cmd+D or shake for dev menu',
  android: 'Double tap R on your keyboard to reload,\n' +
    'Shake or press menu button for dev menu',
});

type Props = {};
export default class CetF extends Component<Props> {
  render() {
    return (
      <View>
      <View style={styles.class1}>
      <Image style={styles.list3} source={require('../imgs/back.png')}></Image>
      <Image style={styles.list3} source={require('../imgs/home.png')}></Image>
      </View>
      <ScrollView>
      <View style={styles.head}>
      <View style={{flexDirection:'row',flex:1}}>
      <View style={{flexDirection:'row',flex:1}}>
        <Image style={{width:'65%',height:'100%',borderRadius:10,marginTop:'5%',marginLeft:'10%'}} 
        source={require('../imgs/kclisten.jpg')}></Image>
      </View>

      <View>
        <View style={{flexDirection:'row',flex:1}}>
        <Text style={{marginTop:'10%',marginLeft:'5%',fontSize:22,color:'#272822'}}>考虫四级听力</Text>
        <Image style={{width:'10%',height:'35%',marginTop:'15%',marginLeft:'15%'}} 
        source={require('../imgs/collect.png')}></Image>
        </View>
        <View>
        <Text style={{marginTop:'5%',marginLeft:'8%'}}>订阅数  2372        课程数 10</Text>
        </View>
        </View>
        </View>
        <Text style={{fontSize:15,margin:'5%'}}>课程简介：考虫团队根据2015年-2017年四级听力真题改编。</Text>
      </View>

       <View style={styles.class2}>
        <View style={{alignItems:'center'}}>
        <Image style={{width:'90%',height:'55%'}} 
        source={require('../imgs/dingyue.png')}></Image>
        <Text style={{textAlign:'center'}}>订阅</Text>
        </View>
        <View style={{alignItems:'center'}}>
        <Image style={{width:'58%',height:'55%'}} 
        source={require('../imgs/download.png')}></Image>
        <Text style={{textAlign:'center'}}>下载全部</Text>
        </View>
        <View style={{alignItems:'center'}}>
        <Image style={{width:'58%',height:'55%'}} 
        source={require('../imgs/sequence.png')}></Image>
        <Text style={{textAlign:'center'}}>名称排序</Text>
        </View>
      </View>

      <View style={styles.class}>
       <Image style={styles.list} source={require('../imgs/yasi.jpg')}></Image>
       <View style={{justifyContent:'space-between',flexDirection:'row'}}>
       <Text style={styles.list1}>考虫四级听力1</Text>
       <Image style={{height:'20%',width:'10%',marginRight:'10%',marginTop:'15%'}} source={require('../imgs/ok.png')}></Image>
       </View>
       </View>
       <View style={styles.class}>
       <Image style={styles.list} source={require('../imgs/yasi.jpg')}></Image>
       <View style={{justifyContent:'space-between',flexDirection:'row'}}>
       <Text style={styles.list1}>考虫四级听力2</Text>
       <Image style={{height:'20%',width:'10%',marginRight:'10%',marginTop:'15%'}} source={require('../imgs/ok.png')}></Image>
       </View>
       </View>
       <View style={styles.class}>
       <Image style={styles.list} source={require('../imgs/yasi.jpg')}></Image>
       <View style={{justifyContent:'space-between',flexDirection:'row'}}>
       <Text style={styles.list1}>考虫四级听力3</Text>
       <Image style={{height:'20%',width:'10%',marginRight:'10%',marginTop:'15%'}} source={require('../imgs/ok.png')}></Image>
       </View>
       </View>
       <View style={styles.class}>
       <Image style={styles.list} source={require('../imgs/yasi.jpg')}></Image>
       <View style={{justifyContent:'space-between',flexDirection:'row'}}>
       <Text style={styles.list1}>考虫四级听力4</Text>
       <Image style={{height:'20%',width:'10%',marginRight:'10%',marginTop:'15%'}} source={require('../imgs/ok.png')}></Image>
       </View>
       </View>

       <View style={styles.class}>
       <Image style={styles.list} source={require('../imgs/yasi.jpg')}></Image>
       <View style={{justifyContent:'space-between',flexDirection:'row'}}>
       <Text style={styles.list1}>考虫四级听力5</Text>
       <Image style={{height:'30%',width:'10%',marginRight:'10%',marginTop:'15%'}} source={require('../imgs/download.png')}></Image>
       </View>
       </View>
       <View style={styles.class}>
       <Image style={styles.list} source={require('../imgs/yasi.jpg')}></Image>
       <View style={{justifyContent:'space-between',flexDirection:'row'}}>
       <Text style={styles.list1}>考虫四级听力6</Text>
       <Image style={{height:'30%',width:'10%',marginRight:'10%',marginTop:'15%'}} source={require('../imgs/download.png')}></Image>
       </View>
       </View>
       <View style={styles.class}>
       <Image style={styles.list} source={require('../imgs/yasi.jpg')}></Image>
       <View style={{justifyContent:'space-between',flexDirection:'row'}}>
       <Text style={styles.list1}>考虫四级听力7</Text>
       <Image style={{height:'30%',width:'10%',marginRight:'10%',marginTop:'15%'}} source={require('../imgs/download.png')}></Image>
       </View>
       </View>
       <View style={styles.class}>
       <Image style={styles.list} source={require('../imgs/yasi.jpg')}></Image>
       <View style={{justifyContent:'space-between',flexDirection:'row'}}>
       <Text style={styles.list1}>考虫四级听力8</Text>
       <Image style={{height:'30%',width:'10%',marginRight:'10%',marginTop:'15%'}} source={require('../imgs/download.png')}></Image>
       </View>
       </View>
       <View style={styles.class}>
       <Image style={styles.list} source={require('../imgs/yasi.jpg')}></Image>
       <View style={{justifyContent:'space-between',flexDirection:'row'}}>
       <Text style={styles.list1}>考虫四级听力9</Text>
       <Image style={{height:'30%',width:'10%',marginRight:'10%',marginTop:'15%'}} source={require('../imgs/download.png')}></Image>
       </View>
       </View>
       <View style={styles.class}>
       <Image style={styles.list} source={require('../imgs/yasi.jpg')}></Image>
       <View style={{justifyContent:'space-between',flexDirection:'row'}}>
       <Text style={styles.list1}>考虫四级听力10</Text>
       <Image style={{height:'30%',width:'10%',marginRight:'10%',marginTop:'15%'}} source={require('../imgs/download.png')}></Image>
       </View>
       </View>
        </ScrollView>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  head:{
    width:'100%',
    height:'60%',
    borderWidth:2,
    borderBottomColor:'#F2F2F2',
    borderColor:'#F2F2F2',
    flex:1,
  },
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
  list:{
    width:'20%',
    height:'85%',
    marginTop:'2%',
    marginLeft:'7%',
    borderRadius:8,
    shadowColor:'#272822',
  },
  list1:{
    fontSize:20,
    color:'#272822',
    marginTop:'12%',
    marginLeft:'15%',
    shadowColor:'#272822',
  },
  list3:{
    width:'10%',
    height:'80%',
    marginTop:'1%',
    marginLeft:'3%',
    marginRight:'3%',
  },
  class:{
    width:'100%',
    height:'11%',
    borderWidth:2,
    borderBottomColor:'#F2F2F2',
    borderColor:'#F2F2F2',
    flexDirection:'row',
  },
  class2:{
    justifyContent:'space-between',
    flexDirection:'row',
    marginLeft:'10%',
    marginRight:'10%',
    marginTop:'5%',
    height:'10%',
    width:'80%',
  },
});
