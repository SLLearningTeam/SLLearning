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
import CeShi from './CeShi'
import XiaZai from './XiaZai'
import TingLi_YY from './TingLi_YY'
import TingLi_YY_A from './TingLi_YY_A'
import TingLi_YY_B from './TingLi_YY_B'
import TingLi_YY_C from './TingLi_YY_C'
import TingLi_YY_D from './TingLi_YY_D'
import TingLi_YY_E from './TingLi_YY_E'
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
        fetch('http://101.200.51.53:8080/SSLearningTeam/course/user/listeningCourses_manage/1')
            .then((response) => response.json())
            .then((responseJson) => {
                this.setState({
                    loaded: true,
                    title : responseJson.info.courses.listeningCourses[0].courseName,
                    title1 : responseJson.info.courses.listeningCourses[1].courseName,
                    title2 : responseJson.info.courses.listeningCourses[2].courseName,
                    title3 : responseJson.info.courses.listeningCourses[3].courseName,
                    title4 : responseJson.info.courses.listeningCourses[4].courseName,
                    title5 : responseJson.info.courses.listeningCourses[5].courseName,
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
        <TouchableOpacity onPress={this.tiaozhuana.bind(this)}>
        <View style={{borderWidth:1,height:80,width:360,backgroundColor:'#AEEEEE',marginLeft:20,marginTop:30,borderRadius:70}}>
        <Text style={styles.content}>{this.state.title}</Text>
        </View>
        </TouchableOpacity>
        <TouchableOpacity onPress={this.tiaozhuanb.bind(this)}>
        <View style={{borderWidth:1,height:80,width:360,backgroundColor:'#AEEEEE',marginLeft:20,marginTop:30,borderRadius:70}}>
        <Text style={styles.content}>{this.state.title1}</Text>
        </View>
         </TouchableOpacity>
         <TouchableOpacity onPress={this.tiaozhuanc.bind(this)}>
        <View style={{borderWidth:1,height:80,width:360,backgroundColor:'#AEEEEE',marginLeft:20,marginTop:30,borderRadius:70}}>
        <Text style={styles.content}>{this.state.title2}</Text>
        </View>
         </TouchableOpacity>
         <TouchableOpacity onPress={this.tiaozhuand.bind(this)}>
        <View style={{borderWidth:1,height:80,width:360,backgroundColor:'#AEEEEE',marginLeft:20,marginTop:30,borderRadius:70}}>
        <Text style={styles.content}>{this.state.title3}</Text>
        </View>
        </TouchableOpacity>
         <TouchableOpacity onPress={this.tiaozhuane.bind(this)}>
        <View style={{borderWidth:1,height:80,width:360,backgroundColor:'#AEEEEE',marginLeft:20,marginTop:30,borderRadius:70}}>
        <Text style={styles.content}>{this.state.title4}</Text>
        </View>
         </TouchableOpacity>
           <TouchableOpacity onPress={this.tiaozhuanf.bind(this)}>
        <View style={{borderWidth:1,height:80,width:360,backgroundColor:'#AEEEEE',marginLeft:20,marginTop:30,borderRadius:70}}>
        <Text style={styles.content}>{this.state.title5}</Text>
        </View>
           </TouchableOpacity>
    </View> 
        


        );
    }
    tiaozhuana(){
        const navigator = this.props.navigator;
        navigator.push({
            component:TingLi_YY
        })
    }
    tiaozhuanb(){
        const navigator = this.props.navigator;
        navigator.push({
            component:TingLi_YY_A
        })
    }
     tiaozhuanc(){
        const navigator = this.props.navigator;
        navigator.push({
            component:TingLi_YY_B
        })
    }
     tiaozhuand(){
        const navigator = this.props.navigator;
        navigator.push({
            component:TingLi_YY_C
        })
    }
     tiaozhuane(){
        const navigator = this.props.navigator;
        navigator.push({
            component:TingLi_YY_D
        })
    }
     tiaozhuanf(){
        const navigator = this.props.navigator;
        navigator.push({
            component:TingLi_YY_E
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
content: {
        fontSize: 20,
        color: 'white',
        fontWeight:'bold',
        textAlign:'center',
        marginTop:20,
    },
});