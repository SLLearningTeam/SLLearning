import React, { Component } from 'react';
import {
    AppRegistry,
    StyleSheet,
    Text,
    View,Button,ListView,
    TouchableHighlight,
    WebView,
    ScrollView,
    TouchableOpacity,
    Image
} from 'react-native';
import CeShi_E from './CeShi_E'
import XiaZai from './XiaZai'
export default class App extends Component {
    constructor(props){
        super(props)
        this.state={
            title : "",
           // year : "",
            loaded: false,
           
        };
    }
    componentDidMount() {
        fetch('http://101.200.51.53:8080/SSLearningTeam/course/user/courses_manage/1')
            .then((response) => response.json())
            .then((responseJson) => {
                this.setState({
                    loaded: true,
                    title : responseJson.info.courses.listeningCourses[5].courseName,
                    jianjie : responseJson.info.courses.listeningCourses[5].courseChineseContent,
                    details : responseJson.info.courses.listeningCourses[5].courseEnglishContent,
                    Num : responseJson.info.courses.listeningCourses[5].downloadNum,
                });
                
            })
            .catch((error) => {
                console.error(error);
            });
    };
    render() {
        if (!this.state.loaded) {
            return (
                <View style={{flex:1,
                    marginTop:25,
                    backgroundColor:"cyan",
                    justifyContent:"center",
                    alignItems:"center"}}>
                    <Text >Loading......</Text>
                </View>
            );
        }
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
            <View style={{width:300,height:220,}}>
            <Image style={{width:300,height:220,marginLeft:50,}} source={{uri:'http://101.200.51.53:8080//SSLearningTeam//ListeningCourseResource//10520d9e-06c2-46bc-a218-2d42382ea384_listening1.png'}}/>
            </View>
            <View>
                <View style={{width:320,height:45,backgroundColor:'green',marginLeft:50}}>
                <Text style={{fontSize:25,fontWeight:'bold',color:'white'}}>课程名:{this.state.title}</Text>
                </View>
                <View style={{width:100,height:30,backgroundColor:'orange',borderRadius:50,marginLeft:300}}>
                <Text style={{fontSize:18,color:'white',marginLeft:3}}>下载量：{this.state.Num}</Text>
                </View>
                <View style={{width:150,height:45,backgroundColor:'red'}}>
                <Text style={{fontSize:25,fontWeight:'bold',color:'white'}}>课程详情：</Text>
                </View>
                <View style={{width:400,height:100,backgroundColor:'green'}}>
                <Text style={{color:'white',fontSize:15}}>{this.state.jianjie}</Text>
                </View>
                <View style={{width:150,height:45,backgroundColor:'red'}}>
                <Text style={{fontSize:25,fontWeight:'bold',color:'white'}}>Details：</Text>
                </View>
                <View style={{width:400,height:100,backgroundColor:'green'}}>
                <Text style={{color:'white',fontSize:15}}>{this.state.details}</Text>
                </View>

            </View>
     </View>
     {/*试题部分结束*/}
     </View>
     </ScrollView>
     </View>
     {/*底部栏开始*/}
     <View style={{flex:0.09,backgroundColor:'white',borderTopWidth:1,flexDirection:'row'}}>
     <View style={{width:100,height:100,backgroundColor:'red',marginLeft:175}}>
     <WebView
                      source={require('../Home/audio.html')}
                      automaticallyAdjustContentInsets={false}
                    />  
     </View> 

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
    component:CeShi_E,
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
   kouyu(){
     alert("start")
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
bottomImg:{
  width:35,
  height:35,
  marginTop:6,
  marginLeft:40,
},
});