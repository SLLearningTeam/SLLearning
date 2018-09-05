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
  TextInput,
  ToolbarAndroid,
  ViewPagerAndroid,
  TouchableOpacity,
 Dimensions,
} from 'react-native';
var REQUEST_URL = 'https://raw.githubusercontent.com/facebook/react-native/master/docs/MoviesExample'
export default class TitleBar extends Component{
var MovieList = React.createClass({
  //设置初始状态值
  getInitialState:function(){

    var ds = new ListView.DataSource({
      rowHasChanged:(oldRow,newRow)=>oldRow!==newRow
    });
    return{
      loaded:false, //数据是否下载成功的标志
      dataSource:ds
    };
  },
  //下载数据
  getData:function(){
    fetch(REQUEST_URL)
    .then((response)=>{
    return response.json();
    })
    .then((responseData)=>{
      //刷新组件，重新渲染组件,展示list view
      //得到新的数据，dataSourse
      this.setState({
        loaded:true,
        dataSource:this.state.dataSource.cloneWithRows(responseData.movies)
      });
    })
    .catch((error)=>{
      alert(error);
    });
  },
  render:function(){
    //如果未请求到数据，提示“等待加载”界面
    if(!this.state.loaded){
      return this.renderLoadingView();
    }
    //电影列表
    return(
    <ListView 
      style={styles.ListView}
      dataSource={this.state.dataSource}
      initialListSize={10}
      renderHeader={this._renderHeader}
      renderRow={this._renderRow}
      renderSeparator={this._renderSeparator  }
    />
      );
  },
  //组件挂载完成
  componentDidMount:function(){
    //组件挂载后，开始下载数据
    this.getData();
  },
  //等待加载界面
  renderLoadingView:function(){
    return(
      <View style={styles.loadingContainer}>
      <Text style={styeles.loadingText}>loading movies.......</Text>
      </View>
      );
  },
  //渲染行
  _renderRow:function(movie){
    return(
      <View style={styles.rowContainer}>
        <Image
          style={styles.thumbbail}
          source={{uri:movie.posters.thumbbail}}/>
        <View style={styles.textContainer}>
          <Text style={styles.title}>{movie.title}</Text>
          <Text style={styles.year}>{movie.year}></Text>
        </View>
      </View>
      )
  },
  //渲染头部
  _renderHeader:function(){
    return(
        <View style={styles.header}>
         <Text style={styles.headerText}>Movie List</Text>
         <View style={styles.headerSeparator}></View>

        </View>
    );
  },
  //渲染分割线
  _renderSeparator:function(sectionID:number,rowID:number){
    var style={
      height:1,
      backgroundColor:"red"
    };
    return(
      <View style={style} key={sectionID+rowID}></View>
      );
  }
});

}
var styles=StyleSheet.create({
loadingContainer:{
  flex:1,
  marginTop:25,
  backgroundColor:"red",
  justifyContent:"center",
  alignItems:"center",
},
loadingText:{
  fontSize:30,
  fontWeight:"bold",
  textAlign:"center",
  marginLeft:10,
  marginRight:10
},
//listView行
rowContainer:{
  flexDirection:"row",
  padding:5,
  alignItems:"center",
  backgroundColor:"black",
},
//图像
thumbbail:{
  width:53,
  weight:81,
  backgroundColor:"gray",
},
textContainer:{
  flex:1,
  marginLeft:10
},
title:{
  marginTop:3,
  fontSize:18,
  textAlign:"center",
},
year:{
  marginTop:3,
  marginBottom:3,
  textAlign:"center",
},
header:{
  height:44,
  backgroundColor:"gray"
},
headerText:{
  flex:1,
  fontSize:20,
  fontWeight:"bold",
  textAlign:"center"
},
headerSeparator:{
  height:1,
  backgroundColor:"blue",
},
ListView:{
  marginTop:25,
  backgroundColor:"red"
}
});

module.exports=MovieList;