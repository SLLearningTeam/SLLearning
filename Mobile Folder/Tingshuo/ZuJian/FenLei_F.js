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
} from "react-native";

import KouYu from './KouYu'
import FenLei_S from './FenLei_S'
import {Navigator} from 'react-native-deprecated-custom-components';
const AnimatedFlatList = Animated.createAnimatedComponent(FlatList);
const REQUEST_URL = 'http://101.200.51.53:8080/SSLearningTeam/ratetype/user/getratetypebylanguagetypeid?languageTypeId=3';

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
        }
    }

    //网络请求
    fetchData() {
        //这个是js的访问网络的方法
        fetch(REQUEST_URL)
            .then((response) => response.json())
            .then((responseData) => {
                let data = responseData.info;
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
            <View> 
                 <TouchableOpacity onPress={this.tiaozhuan.bind(this)}>  
               <View style={{borderWidth:1,height:80,width:360,backgroundColor:'#AEEEEE',marginLeft:20,marginTop:30,borderRadius:70}}>    
                    <Text style={styles.content}>{item.value.rateName}</Text>
               </View>
                 </TouchableOpacity>        
            </View>
          
        );      
    }
    renderData() {
        return (
    <ScrollView >
     {/*头部栏开始*/}
     <View style={{backgroundColor:'white',borderBottomWidth:1,flexDirection:'row'}}>
     <TouchableOpacity onPress={this.fanhui.bind(this)}>
     <Image style={{marginRight:85}} source={require('../imgs/fanhui.png')}/>
     </TouchableOpacity>

     </View>
     {/*头部栏结束*/}
     <View style={{flexDirection:'row',borderBottomWidth:1,}}>
     <View style={{flexDirection:'row'}}>
     <Text style={styles.paixufont}>综合排序</Text>
     <Image style={styles.paixuimg} source={require('../imgs/xiajiantou.png')} />
     </View>
     <View style={{flexDirection:'row'}}>
     <Text style={styles.paixufont}>热度排序</Text>
     <Image style={styles.paixuimg} source={require('../imgs/xiajiantou.png')} />
     </View>
     <View style={{flexDirection:'row'}}>
     <Text style={styles.paixufont}>评分排序</Text>
     <Image style={styles.paixuimg} source={require('../imgs/xiajiantou.png')} />
     </View>
      <View style={{flexDirection:'row'}}>
     <Text style={styles.paixufont}>综合筛选</Text>
     <Image style={styles.paixuimg} source={require('../imgs/xiajiantou.png')} />
     </View>
     </View>

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
    tiaozhuan(){
       
    }
    fanhui(){
        const navigator = this.props.navigator;
        navigator.pop()
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
    content: {
        fontSize: 20,
        color: 'white',
        fontWeight:'bold',
        textAlign:'center',
        marginTop:20,
    },
    headImg:{
  width:35,
  height:35,
  marginTop:6,
  marginLeft:30,
},
paixufont:{
  fontSize:18,
  margin:6

},
paixuimg:{
marginLeft:-12,
marginTop:3
},
});
module.exports = FlatListExample;
