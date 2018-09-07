import React, {Component} from "react";
import {
ActivityIndicator, 
Animated, 
FlatList, 
ScrollView, 
StyleSheet, 
Text, 
View,
Image,
TouchableOpacity,
SafeAreaView
} from "react-native";
import RadioModal from 'react-native-radio-master';
import {Navigator} from 'react-native-deprecated-custom-components';

const AnimatedFlatList = Animated.createAnimatedComponent(FlatList);
const REQUEST_URL = 'http://101.200.51.53:8080/SSLearningTeam/train/user/getAllSimulatedTestById?simulatedTestId=2';

class FlatListExample extends Component {
    static navigationOptions = {
        title: 'FlatListExample',
    }

    constructor(props) {
        super(props);
        this.state = {
            isLoading: true,
            //网络请求状态
            error: false,
            errorInfo: "",
            dataArray: [],
            initId:null,
            show_DaAn:false,
            show_JieXi:false,
            text_value:20,
            title : "",
          
        }
    }

    //网络请求
    fetchData() {
        //这个是js的访问网络的方法
        fetch(REQUEST_URL)
            .then((response) => response.json())
            .then((responseData) => {
                let data = responseData.info.questions;
                let dataBlob = [];
                let i = 0;
                data.map(function (item) {
                    dataBlob.push({
                        key: i,
                        value: item,
                    })
                    i++;
                });
                this.setState({
                    //复制数据源
                    dataArray: dataBlob,
                    isLoading: false,
                });
                data = null;
                dataBlob = null;
            })
            .catch((error) => {
                this.setState({
                    error: true,
                    errorInfo: error
                })
            })
            .done();
    }

    componentDidMount() {
        //请求数据
        this.fetchData();
        this.setState({
          a:this.state.a
        });
    }

    //加载等待的view
    renderLoadingView() {
        return (
            <View style={styles.container}>
                <ActivityIndicator
                    animating={true}
                    style={[styles.gray, {height: 80}]}
                    color='red'
                    size="large"
                />
            </View>
        );
    }

    //加载失败view
    renderErrorView(error) {
        return (
            <View style={styles.container}>
                <Text>
                    Fail: {error}
                </Text>
            </View>
        );
    }
    

    //返回itemView
    renderItemView=({item})=> { 

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
     <Text style={{fontSize:this.state.text_value,color:'black',marginLeft:20,marginBottom:10,fontWeight:'bold',}}>{item.value.questionContent}</Text>
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
                <Text value="0">A:{item.value.answerA}</Text>
                <Text value="1">B:{item.value.answerB}</Text>
                <Text value="2">C:{item.value.answerC}</Text>
                <Text value="3">D:{item.value.answerD}</Text>
               </RadioModal>  
         <View style={{flexDirection:'row',marginLeft:20}}>
         <View style={{width:230,height:40,backgroundColor:'green',flexDirection:'row'}}>
         <Text style={{fontSize:20,color:'white'}}>此题正确答案为：</Text>
         <Text style={{fontSize:20,color:'red',fontWeight:'bold'}}>第{item.value.answerReal}个</Text>
         </View>
         </View>
         <View style={{marginLeft:20}}>
         <Text style={{color:'red'}}>解析：{item.value.answerReason}</Text>
         </View>
         </View>
          {/*试题部分结束*/}
        
         </View>

     
     </ScrollView>
     </View>
    
      
     </View>
        );
      
    }

    renderData() {

        return (

            <ScrollView >
                <AnimatedFlatList              
                    data={this.state.dataArray}                
                    renderItem={this.renderItemView}
                />
              
            </ScrollView>
        );
    }

    render() {

        //第一次加载等待的view
        if (this.state.isLoading && !this.state.error) {
            return this.renderLoadingView();
        } else if (this.state.error) {
            //请求失败view
            return this.renderErrorView(this.state.errorInfo);
        }
        //加载数据
        return this.renderData();
    }
    tiaoZhuan(){
  const navigator = this.props.navigator;
  navigator.pop()
 }
 _onPressTest(){
        this.setState({
          text_value:35
        })
    }
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        flexDirection: 'row',
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: '#F5FCFF',
    },
    title: {
        fontSize: 20,
        color: 'blue',
    },
    content: {
        fontSize: 15,
        color: 'black',
    },
    number:{
        fontSize:20,
        color:'black',
    },
    logo:{
        width:80,
        height:80,
        borderRadius:20,
        margin:10
    },
    img:{
        width:30,
        height:30,

    },
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
module.exports = FlatListExample;
