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

import {Navigator} from 'react-native-deprecated-custom-components';
const AnimatedFlatList = Animated.createAnimatedComponent(FlatList);
const REQUEST_URL = 'http://101.200.51.53:8080/SSLearningTeam/website/user/getCarouselMaps';

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
            <TouchableOpacity onPress={this.tiao.bind(this)}>
            <View>    
               <View style={{borderWidth:1,height:120,flexDirection:'row'}}>
                    
                  <View>
                     <Image source={require('../imgs/logo.png')} style={styles.logo}/>
                  </View>
                    
                  <View style={{marginTop:10}}>
                     <Text style={styles.title}>课程名: {item.value.carouselInstruction}
                     </Text>
                        <View style={{flexDirection:'row'}}>
                            <Image source={require('../imgs/bofangliang.png')} style={styles.img}/>
                            <Text style={styles.number}>:{item.value.carouselId}</Text>
                        </View>
                     <Text style={styles.content}>课程简介: {item.value.carouselId}</Text>
                  </View>
               </View>
              
            </View>
               </TouchableOpacity>
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
    tiao(){
        const navigator = this.props.navigator;
        navigator.push({
            component:ShiTi
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

    }

});
module.exports = FlatListExample;
