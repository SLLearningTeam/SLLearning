import React, { Component } from 'react';
import {
  Platform,
  StyleSheet,
  Text,
  View,
  Image,
  ScrollView,
  TouchableOpacity,
  Button,
} from 'react-native';
import RadioModal from 'react-native-radio-master';

export default class CeShi extends Component<Props> {
  constructor(props) {
    super(props);
    this.state = {
     initId:null,
     show_DaAn:false,
     show_JieXi:false,
     text_value:20,
     title : "",
     loaded: false,
    };  
  }
componentDidMount() {
        fetch('http://101.200.51.53:8080/SSLearningTeam/course/user/getAllQuestion?courseId=1&courseType=listeningcourse')
            .then((response) => response.json())
            .then((responseJson) => {
                this.setState({
                    loaded: true,
                    title : responseJson.info[4].questionContent,
                    A : responseJson.info[4].answerA,
                    B : responseJson.info[4].answerB,
                    C : responseJson.info[4].answerC,
                    D : responseJson.info[4].answerD,
                    reason : responseJson.info[4].answerReason,
                    answerReal : responseJson.info[4].answerReal,
                });
                
            })
            .catch((error) => {
                console.error(error);
            });
    };

  render() {
    let v = this.state.show_DaAn ? <Text style={{fontSize:18,color:'green'}}>正确答案是第：{this.state.answerReal}个</Text> : null;
    let c = this.state.show_JieXi ? <Text style={{fontSize:18,color:'green'}}>{this.state.reason}</Text> : null;
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
     <TouchableOpacity onPress={this.tiaoZhuan.bind(this)}>
     <Image style={{marginRight:135}} source={require('../imgs/fanhui.png')}/>
     </TouchableOpacity>
     <Image style={styles.headImg} source={require('../imgs/dingyue.png')}/>
     
     <TouchableOpacity onPress={()=>this._onPressTest()}>
     <Image style={styles.headImg} source={require('../imgs/ziti.png')}/>
     </TouchableOpacity>    
    <Image style={styles.headImg} source={require('../imgs/xiazai.png')}/>
     </View>
     {/*头部栏结束*/}
    
     {/*试题部分开始*/}
      <View style={{alignItems:'baseline',flex:1,}}>
     <Text style={styles.biaoTi}>Secsion A</Text>
     <Text style={{fontSize:this.state.text_value,color:'black',marginLeft:20,marginBottom:10,fontWeight:'bold',}}>1.{this.state.title}</Text>
     </View>  

       <View>
            <RadioModal
                selectedValue={this.state.initId}
                onValueChange={(id,item) => this.setState({initId: id})}
                style={{ flexDirection:'column',
                      flexWrap:'wrap',
                      alignItems:'flex-start',
                      backgroundColor:'white',
                      width:370,
                      height:120,
                      marginLeft:20,
                      }} 
                > 
                <Text value="0">A:{this.state.A}</Text>
                <Text value="1">B:{this.state.B}</Text>
                <Text value="2">C:{this.state.C}</Text>
                <Text value="3">D:{this.state.D}</Text>
               </RadioModal>
           </View>
      <View style={{alignItems:'baseline',flex:1,borderBottomWidth:1}}>
     
      <View style={{flexDirection:'column',}}>
     <View style={{flexDirection:'row',}}>
        <TouchableOpacity onPress={() => this._onPressDaAn()}>
         <View style={{width:100,height:30,backgroundColor:'green'}}>
             <Text style={{fontSize:20,fontWeight:'bold',color:'white'}}>查看答案</Text>
         </View>
        </TouchableOpacity>
        <View>
        {v}
        </View>
    </View>
    <View style={{flexDirection:'row',}}>
         <TouchableOpacity onPress={() => this._onPressJieXi()}>
         <View style={{width:100,height:30,backgroundColor:'red'}}>
             <Text style={{fontSize:20,fontWeight:'bold',color:'white',textAlign:'center'}}>解析</Text>
         </View>
        </TouchableOpacity>
         <View>
        {c}
        </View>
    </View>
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
 _onPressDaAn() {
        this.setState((previousState) => {
            return ({
                show_DaAn: !previousState.show_DaAn,
            })
        });
    }
 _onPressJieXi() {
        this.setState((previousState) => {
            return ({
                show_JieXi: !previousState.show_JieXi,
            })
        });
    }
 _onPressTest(){
        this.setState({
          text_value:35
        })
    }
  TiJiao(){
      
       
    
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
  width:385,
  height:50,
  backgroundColor:'green',
  fontWeight:'bold',
  fontSize:25,
  margin:10,
  color:'white'
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
});