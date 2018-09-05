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

import FenLei_Z from './FenLei_Z'
import {Navigator} from 'react-native-deprecated-custom-components';
const AnimatedFlatList = Animated.createAnimatedComponent(FlatList);
const REQUEST_URL = 'http://101.200.51.53:8080/SSLearningTeam/language/user/getlanguages/1';
const img_url='http://101.200.51.53:8080/SSLearningTeam//Languages//2fe400c5-94fe-48e7-b01c-4531a9228dbe_english.png'
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
                        key: i+1,
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
            <TouchableOpacity onPress={this.tiaozhuan.bind(this)}>  
            <View> 
               <View style={{borderWidth:1,height:80,width:360,backgroundColor:'#AEEEEE',marginLeft:20,marginTop:30,borderRadius:70}}>    
                    <Text style={styles.content}>{item.value.languageName}</Text>
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
    tiaozhuan(){
        const navigator = this.props.navigator;
        navigator.push({
            component:FenLei_Z
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
    content: {
        fontSize: 20,
        color: 'white',
        fontWeight:'bold',
        textAlign:'center',
        marginTop:20,
    },
});
module.exports = FlatListExample;
