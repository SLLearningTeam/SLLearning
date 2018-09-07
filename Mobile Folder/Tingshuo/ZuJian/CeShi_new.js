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
export default class CeShi extends Component<Props> {
  render() {
    return (
    <View style={{flex:1}}>
    <View style={{flex:0.91}}>
    <ScrollView  horizontal = {false}
     showsHorizontalScrollIndicator ={false}>
     <View style={{flex:0.82}}> 
     {/*头部栏开始*/}
     <View style={{flex:0.09,backgroundColor:'white',borderBottomWidth:1,flexDirection:'row'}}>
     <TouchableOpacity onPress={this.tiaoZhuan.bind(this)}>
     <Image style={{marginRight:135}} source={require('../imgs/fanhui.png')}/>
     </TouchableOpacity>
     <Image style={styles.headImg} source={require('../imgs/dingyue.png')}/>
     <Image style={styles.headImg} source={require('../imgs/ziti.png')}/>
     <Image style={styles.headImg} source={require('../imgs/xiazai.png')}/>
     </View>
     {/*头部栏结束*/}
     {/*试题部分开始*/}
     <View style={{alignItems:'baseline',flex:0.82,borderBottomWidth:1}}>
     <Text style={styles.biaoTi}>Secsion A</Text>
     <Text style={styles.xuhao}>1.</Text>
     <Text style={styles.xuhao}>A、It is attaables to the rising value of the CHI</Text>
     <Text style={styles.xuhao}>B、It is attaables to the rising value of the CHI goods merfifan</Text>
     <Text style={styles.xuhao}>C、It is attaables to the rising of the CHI</Text>
     <Text style={styles.xuhao}>D、It is attaables to the rising value of the CHI</Text>
     <View style={{flexDirection:'row',marginLeft:100}}>
     <Text style={styles.daan}>正确答案：A</Text>
     <Text style={styles.button}>答案</Text>
     <Text style={styles.button}>解析</Text>
     </View>
     </View>
     {/*试题部分结束*/}
     {/*试题部分开始*/}
     <View style={{alignItems:'baseline',flex:0.82,borderBottomWidth:1}}>
     <Text style={styles.biaoTi}>Secsion A</Text>
     <Text style={styles.xuhao}>1.</Text>
     <Text style={styles.xuhao}>A、It is attaables to the rising value of the CHI</Text>
     <Text style={styles.xuhao}>B、It is attaables to the rising value of the CHI goods merfifan</Text>
     <Text style={styles.xuhao}>C、It is attaables to the rising of the CHI</Text>
     <Text style={styles.xuhao}>D、It is attaables to the rising value of the CHI</Text>
     <View style={{flexDirection:'row',marginLeft:100}}>
     <Text style={styles.daan}>正确答案：A</Text>
     <Text style={styles.button}>答案</Text>
     <Text style={styles.button}>解析</Text>
     </View>
     </View>
     {/*试题部分结束*/}
     {/*试题部分开始*/}
     <View style={{alignItems:'baseline',flex:0.82,borderBottomWidth:1}}>
     <Text style={styles.biaoTi}>Secsion A</Text>
     <Text style={styles.xuhao}>1.</Text>
     <Text style={styles.xuhao}>A、It is attaables to the rising value of the CHI</Text>
     <Text style={styles.xuhao}>B、It is attaables to the rising value of the CHI goods merfifan</Text>
     <Text style={styles.xuhao}>C、It is attaables to the rising of the CHI</Text>
     <Text style={styles.xuhao}>D、It is attaables to the rising value of the CHI</Text>
     <View style={{flexDirection:'row',marginLeft:100}}>
     <Text style={styles.daan}>正确答案：A</Text>
     <Text style={styles.button}>答案</Text>
     <Text style={styles.button}>解析</Text>
     </View>
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
 tiaoZhuan(){
  const navigator = this.props.navigator;
  navigator.pop()
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
xuhao:{
  fontSize:15,
  color:'black',
  marginLeft:20,
  marginBottom:10
},
bottomImg:{
  width:35,
  height:35,
  marginTop:6,
  marginLeft:40,
},
button:{
  color:'white',
  borderWidth:1,
  fontSize:18,
  padding:5,
  backgroundColor:'green',
  fontWeight:'bold',
  marginLeft:50,
},
daan:{
  fontSize:18,
  color:'green',
  marginTop:12,
}
});