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
import TitleBar from './TitleBar'
import FaXianPage from './faXianPage'
import Sort from '../Classify/Sort'
import Course from '../Course/Course'
import ShiTi from '../ZuJian/ShiTi'
import WoDe from '../ZuJian/WoDe'
import SideMenu from 'react-native-side-menu';
import {Navigator} from 'react-native-deprecated-custom-components';
const {width, heihgt} = Dimensions.get('window');
export default class DaoHang extends Component<Props> {
   constructor(props) {
        super(props);
        this.state = {
        tabIndex:0,
        isOpen:false,
        };
    }
  render() {
    const menu = <WoDe navigator={this.props.navigator}/>;
    return (
      <SideMenu 
                menu={menu}                    //抽屉内的组件
                isOpen={this.state.isOpen}     //抽屉打开/关闭
                openMenuOffset={width / 1.5}     //抽屉的宽度
                hiddenMenuOffset={0}          //抽屉关闭状态时,显示多少宽度 默认0 抽屉完全隐藏
                edgeHitWidth={60}           //距离屏幕多少距离可以滑出抽屉,默认60
                disableGestures={false}       //是否禁用手势滑动抽屉 默认false 允许手势滑动
                /*onStartShouldSetResponderCapture={
                    () => console.log('开始滑动')}*/
                onChange={                   //抽屉状态变化的监听函数
                    (isOpen) => {
                        isOpen ? console.log('抽屉当前状态为开着')
                            :
                            console.log('抽屉当前状态为关着')

                    }}

                onMove={                     //抽屉移动时的监听函数 , 参数为抽屉拉出来的距离 抽屉在左侧时参数为正,右侧则为负
                    (marginLeft) => {
                        console.log(marginLeft)
                    }}

                menuPosition={'left'}     //抽屉在左侧还是右侧
                autoClosing={true}         //默认为true 如果为true 一有事件发生抽屉就会关闭
            >
      <View style={{flex:1,backgroundColor:"white"}}> 
      <View style={{flexDirection:'row',flex:0.1}}>
      <TouchableOpacity onPress={
        ()=>{
          this.setState({
            isOpen:true,
          })
        }
      }>
      <Image style={styles.image} source={require('../imgs/list.png')}></Image>
      </TouchableOpacity>
      <Image style={styles.image} source={require('../imgs/search.png')}></Image>
      <TextInput style={{width:'80%'}}
      placeholder = {'搜索课程、教材、试题'}
      >
      </TextInput>
      </View>
      <TitleBar 
       onSelectItem = {this.onSelectItem.bind(this)}
       />
      <ViewPagerAndroid 
      style={{flex:1}}
      ref='ViewPager'
      onPageSelected={(e)=>{
        this.setState({
          tabIndex:e.nativeEvent.position,
        })
      }}
      >
     <View>
     <FaXianPage navigator={this.props.navigator}/>
     </View>
     <View>
     <Sort navigator={this.props.navigator}/>
     </View>
     <View>
     <Course navigator={this.props.navigator}/>
     </View>
     </ViewPagerAndroid>
     <View>
     </View>
     </View>
     </SideMenu>
    );
  }
    onSelectItem(position){
     switch(position){
      case 1:
      this.setState({tabIndex:0})
      this.refs.ViewPager.setPage(0)
      break;
      case 2:
      this.setState({tabIndex:1})
       this.refs.ViewPager.setPage(1)
      break;
      case 3:
      this.setState({tabIndex:2})
       this.refs.ViewPager.setPage(2)
      break;
    }
  }
}

const styles = StyleSheet.create({
image:{
  width:35,
  height:35,
  margin:10
}
});
