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
    Image,
    ImageBackground
} from 'react-native';
import CeShi from './CeShi'
import XiaZai from './XiaZai'
import TuiJian_A from './TuiJian_A'
import TuiJian_B from './TuiJian_B'
import TuiJian_C from './TuiJian_C'
import TuiJian_D from './TuiJian_D'
export default class App extends Component {
    constructor(props){
        super(props)
        this.state={
            title : "",
            loaded: false,  
        };
    }
    componentDidMount() {
        fetch('http://101.200.51.53:8080/SSLearningTeam/course/user/courses_manage/1')
            .then((response) => response.json())
            .then((responseJson) => {
                this.setState({
                    loaded: true,
                    title : responseJson.info.courses.oralCourses[0].courseName,
                    num : responseJson.info.courses.oralCourses[0].downloadNum,
                    jianjie : responseJson.info.courses.oralCourses[0].courseChineseContent,

                    title1 : responseJson.info.courses.oralCourses[1].courseName,
                    num1 : responseJson.info.courses.oralCourses[1].downloadNum,
                    jianjie1 : responseJson.info.courses.oralCourses[1].courseChineseContent,

                    title2 : responseJson.info.courses.oralCourses[2].courseName,
                    num2 : responseJson.info.courses.oralCourses[2].downloadNum,
                    jianjie2 : responseJson.info.courses.oralCourses[2].courseChineseContent,

                    title3 : responseJson.info.courses.oralCourses[3].courseName,
                    num3 : responseJson.info.courses.oralCourses[3].downloadNum,
                    jianjie3 : responseJson.info.courses.oralCourses[3].courseChineseContent,

                    title4 : responseJson.info.courses.listeningCourses[0].courseName,
                    num4 : responseJson.info.courses.listeningCourses[0].downloadNum,
                    jianjie4 : responseJson.info.courses.listeningCourses[0].courseChineseContent,

                    title5 : responseJson.info.courses.listeningCourses[1].courseName,
                    num5 : responseJson.info.courses.listeningCourses[1].downloadNum,
                    jianjie5 : responseJson.info.courses.listeningCourses[1].courseChineseContent,

                    title6 : responseJson.info.courses.listeningCourses[2].courseName,
                    num6 : responseJson.info.courses.listeningCourses[2].downloadNum,
                    jianjie6 : responseJson.info.courses.listeningCourses[2].courseChineseContent,

                    title7 : responseJson.info.courses.listeningCourses[3].courseName,
                    num7 : responseJson.info.courses.listeningCourses[3].downloadNum,
                    jianjie7 : responseJson.info.courses.listeningCourses[3].courseChineseContent,

                    title8 : responseJson.info.courses.listeningCourses[4].courseName,
                    num8 : responseJson.info.courses.listeningCourses[4].downloadNum,
                    jianjie8 : responseJson.info.courses.listeningCourses[4].courseChineseContent,

                    title9 : responseJson.info.courses.listeningCourses[5].courseName,
                    num9 : responseJson.info.courses.listeningCourses[5].downloadNum,
                    jianjie9 : responseJson.info.courses.listeningCourses[5].courseChineseContent,
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
            <View>
                 <TouchableOpacity onPress={this.tiaozhuan.bind(this)}>
                 <View style={{borderWidth:1,height:120,flexDirection:'row',}}>
                 
                  <View style={{width:100,height:100,}}>
                  <Image style={{height:80,width:80,borderRadius:100,marginTop:20,marginLeft:10}} source={{uri:'http://101.200.51.53:8080//SSLearningTeam//ListeningCourseResource//10520d9e-06c2-46bc-a218-2d42382ea384_listening1.png'}}/>
                  </View> 
                   <ImageBackground style={{height:120,width:400}} source={require('../imgs/beijinga.png')}>
                  <View>
                  <Text style={{fontWeight:'bold',fontSize:20,color:'green'}}>课程名：{this.state.title}</Text>
                  <Text style={{fontSize:12,color:'green'}}>播放量:{this.state.num}</Text>
                  <Text numberOfLines={3} style={{fontSize:15,color:'orange'}}>课程简介:{this.state.jianjie}</Text>
                  </View>
                  </ImageBackground>
               </View> 
               </TouchableOpacity>
                <TouchableOpacity onPress={this.tiaozhuana.bind(this)}>
               <View style={{borderWidth:1,height:120,flexDirection:'row',}}>
                 
                  <View style={{width:100,height:100,}}>
                  <Image style={{height:80,width:80,borderRadius:100,marginTop:20,marginLeft:10}} source={{uri:'http://101.200.51.53:8080//SSLearningTeam//OralCourseResource//e428d718-73cb-411a-9fe9-2e7a3b3f5013_oralcourse_2.png'}}/>
                  </View> 
                   <ImageBackground style={{height:120,width:400}} source={require('../imgs/beijinga.png')}>
                  <View>
                  <Text style={{fontWeight:'bold',fontSize:20,color:'green'}}>课程名：{this.state.title1}</Text>
                  <Text style={{fontSize:12,color:'green'}}>播放量:{this.state.num1}</Text>
                  <Text numberOfLines={3} style={{fontSize:15,color:'orange'}}>课程简介:{this.state.jianjie1}</Text>
                  </View>
                  </ImageBackground>
               </View> 
               </TouchableOpacity>
                <TouchableOpacity onPress={this.tiaozhuanb.bind(this)}>
                <View style={{borderWidth:1,height:120,flexDirection:'row',}}>
                 
                  <View style={{width:100,height:100,}}>
                  <Image style={{height:80,width:80,borderRadius:100,marginTop:20,marginLeft:10}} source={{uri:'http://101.200.51.53:8080//SSLearningTeam//OralCourseResource//e428d718-73cb-411a-9fe9-2e7a3b3f5013_oralcourse_3.png'}}/>
                  </View> 
                   <ImageBackground style={{height:120,width:400}} source={require('../imgs/beijinga.png')}>
                  <View>
                  <Text style={{fontWeight:'bold',fontSize:20,color:'green'}}>课程名：{this.state.title2}</Text>
                  <Text style={{fontSize:12,color:'green'}}>播放量:{this.state.num2}</Text>
                  <Text numberOfLines={3} style={{fontSize:15,color:'orange'}}>课程简介:{this.state.jianjie2}</Text>
                  </View>
                  </ImageBackground>
               </View> 
                </TouchableOpacity>
                 <TouchableOpacity onPress={this.tiaozhuanc.bind(this)}>
                <View style={{borderWidth:1,height:120,flexDirection:'row',}}>
                 
                  <View style={{width:100,height:100,}}>
                  <Image style={{height:80,width:80,borderRadius:100,marginTop:20,marginLeft:10}} source={{uri:'http://101.200.51.53:8080//SSLearningTeam//OralCourseResource//e428d718-73cb-411a-9fe9-2e7a3b3f5013_oralcourse_4.png'}}/>
                  </View> 
                   <ImageBackground style={{height:120,width:400}} source={require('../imgs/beijinga.png')}>
                  <View>
                  <Text style={{fontWeight:'bold',fontSize:20,color:'green'}}>课程名：{this.state.title3}</Text>
                  <Text style={{fontSize:12,color:'green'}}>播放量:{this.state.num3}</Text>
                  <Text numberOfLines={3} style={{fontSize:15,color:'orange'}}>课程简介:{this.state.jianjie3}</Text>
                  </View>
                  </ImageBackground>
               </View> 
                </TouchableOpacity>
                 <TouchableOpacity onPress={this.tiaozhuana.bind(this)}>
               <View style={{borderWidth:1,height:120,flexDirection:'row',}}>
                 
                  <View style={{width:100,height:100,}}>
                  <Image style={{height:80,width:80,borderRadius:100,marginTop:20,marginLeft:10}} source={{uri:'http://101.200.51.53:8080//SSLearningTeam//ListeningCourseResource//10520d9e-06c2-46bc-a218-2d42382ea384_listening1.png'}}/>
                  </View> 
                   <ImageBackground style={{height:120,width:400}} source={require('../imgs/beijinga.png')}>
                  <View>
                  <Text style={{fontWeight:'bold',fontSize:20,color:'green'}}>课程名：{this.state.title4}</Text>
                  <Text style={{fontSize:12,color:'green'}}>播放量:{this.state.num4}</Text>
                  <Text numberOfLines={3} style={{fontSize:15,color:'orange'}}>课程简介:{this.state.jianjie4}</Text>
                  </View>
                  </ImageBackground>
               </View> 
               </TouchableOpacity>
                <TouchableOpacity onPress={this.tiaozhuanb.bind(this)}>
               <View style={{borderWidth:1,height:120,flexDirection:'row',}}>
                 
                  <View style={{width:100,height:100,}}>
                  <Image style={{height:80,width:80,borderRadius:100,marginTop:20,marginLeft:10}} source={{uri:'http://101.200.51.53:8080//SSLearningTeam//ListeningCourseResource//10520d9e-06c2-46bc-a218-2d42382ea384_listening2.png'}}/>
                  </View> 
                   <ImageBackground style={{height:120,width:400}} source={require('../imgs/beijinga.png')}>
                  <View>
                  <Text style={{fontWeight:'bold',fontSize:20,color:'green'}}>课程名：{this.state.title5}</Text>
                  <Text style={{fontSize:12,color:'green'}}>播放量:{this.state.num5}</Text>
                  <Text numberOfLines={3} style={{fontSize:15,color:'orange'}}>课程简介:{this.state.jianjie5}</Text>
                  </View>
                  </ImageBackground>
               </View> 
                 </TouchableOpacity>
                 <TouchableOpacity onPress={this.tiaozhuanc.bind(this)}>
               <View style={{borderWidth:1,height:120,flexDirection:'row',}}>
                 
                  <View style={{width:100,height:100,}}>
                  <Image style={{height:80,width:80,borderRadius:100,marginTop:20,marginLeft:10}} source={{uri:'http://101.200.51.53:8080//SSLearningTeam//ListeningCourseResource//10520d9e-06c2-46bc-a218-2d42382ea384_listening3.png'}}/>
                  </View> 
                   <ImageBackground style={{height:120,width:400}} source={require('../imgs/beijinga.png')}>
                  <View>
                  <Text style={{fontWeight:'bold',fontSize:20,color:'green'}}>课程名：{this.state.title6}</Text>
                  <Text style={{fontSize:12,color:'green'}}>播放量:{this.state.num6}</Text>
                  <Text numberOfLines={3} style={{fontSize:15,color:'orange'}}>课程简介:{this.state.jianjie6}</Text>
                  </View>
                  </ImageBackground>
               </View> 
               </TouchableOpacity>
                 <TouchableOpacity onPress={this.tiaozhuanc.bind(this)}>
               <View style={{borderWidth:1,height:120,flexDirection:'row',}}>
                 
                  <View style={{width:100,height:100,}}>
                  <Image style={{height:80,width:80,borderRadius:100,marginTop:20,marginLeft:10}} source={{uri:'http://101.200.51.53:8080//SSLearningTeam//ListeningCourseResource//10520d9e-06c2-46bc-a218-2d42382ea384_listening4.png'}}/>
                  </View> 
                   <ImageBackground style={{height:120,width:400}} source={require('../imgs/beijinga.png')}>
                  <View>
                  <Text style={{fontWeight:'bold',fontSize:20,color:'green'}}>课程名：{this.state.title7}</Text>
                  <Text style={{fontSize:12,color:'green'}}>播放量:{this.state.num7}</Text>
                  <Text numberOfLines={3} style={{fontSize:15,color:'orange'}}>课程简介:{this.state.jianjie7}</Text>
                  </View>
                  </ImageBackground>
               </View> 
                </TouchableOpacity>
                 <TouchableOpacity onPress={this.tiaozhuanb.bind(this)}>
               <View style={{borderWidth:1,height:120,flexDirection:'row',}}>
                 
                  <View style={{width:100,height:100,}}>
                  <Image style={{height:80,width:80,borderRadius:100,marginTop:20,marginLeft:10}} source={{uri:'http://101.200.51.53:8080//SSLearningTeam//ListeningCourseResource//10520d9e-06c2-46bc-a218-2d42382ea384_listening5.png'}}/>
                  </View> 
                   <ImageBackground style={{height:120,width:400}} source={require('../imgs/beijinga.png')}>
                  <View>
                  <Text style={{fontWeight:'bold',fontSize:20,color:'green'}}>课程名：{this.state.title8}</Text>
                  <Text style={{fontSize:12,color:'green'}}>播放量:{this.state.num8}</Text>
                  <Text numberOfLines={3} style={{fontSize:15,color:'orange'}}>课程简介:{this.state.jianjie8}</Text>
                  </View>
                  </ImageBackground>
               </View> 
                 </TouchableOpacity>
                  <TouchableOpacity onPress={this.tiaozhuanc.bind(this)}>
               <View style={{borderWidth:1,height:120,flexDirection:'row',}}>
                 
                  <View style={{width:100,height:100,}}>
                  <Image style={{height:80,width:80,borderRadius:100,marginTop:20,marginLeft:10}} source={{uri:'http://101.200.51.53:8080//SSLearningTeam//ListeningCourseResource//10520d9e-06c2-46bc-a218-2d42382ea384_listening6.png'}}/>
                  </View> 
                   <ImageBackground style={{height:120,width:400}} source={require('../imgs/beijinga.png')}>
                  <View>
                  <Text style={{fontWeight:'bold',fontSize:20,color:'green'}}>课程名：{this.state.title9}</Text>
                  <Text style={{fontSize:12,color:'green'}}>播放量:{this.state.num9}</Text>
                  <Text numberOfLines={3} style={{fontSize:15,color:'orange'}}>课程简介:{this.state.jianjie9}</Text>
                  </View>
                  </ImageBackground>
                  </View> 
                  </TouchableOpacity>
            </View>
      


        );
    }
    tiaozhuan(){
        const navigator =this.props.navigator;
        navigator.push({
            component:TuiJian_A
        })
    }
     tiaozhuana(){
        const navigator =this.props.navigator;
        navigator.push({
            component:TuiJian_B
        })
    }
    tiaozhuanb(){
        const navigator =this.props.navigator;
        navigator.push({
            component:TuiJian_C
        })
    }
     tiaozhuanc(){
        const navigator =this.props.navigator;
        navigator.push({
            component:TuiJian_D
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
bottomImg:{
  width:35,
  height:35,
  marginTop:6,
  marginLeft:40,
},
});