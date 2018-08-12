import React, { Component } from 'react';
import {
  Platform,
  StyleSheet,
  Text,
  View,
  Image,
  ScrollView,
  TouchableOpacity,
} from 'react-native';
import {Navigator} from 'react-native-deprecated-custom-components';
import TabNavigator from 'react-native-tab-navigator';
import Menu from "./Menu";
import Entry from "./Entry";
import Home from "../Home/Home.js";
const menu2=[{name:'英语', category: 0},
             {name:'日语', category: 1},
             {name:'法语', category: 2},
             {name:'德语', category: 3},
             {name:'俄语', category: 4},
             {name:'泰语', category: 5}];
            
const source = [
              [{img: require('../imgs/boy.png'),name:'四级'},
              {img: require('../imgs/boy.png'),name:'六级'},
              {img: require('../imgs/boy.png'),name:'雅思'},
              {img: require('../imgs/boy.png'),name:'托福'},
              {img: require('../imgs/boy.png'),name:'考研'}],

              [{img: require('../imgs/boy.png'),name:'N1'},
              {img: require('../imgs/boy.png'),name:'N2'},
              {img: require('../imgs/boy.png'),name:'N3'},
              {img: require('../imgs/boy.png'),name:'N4'},
              {img: require('../imgs/boy.png'),name:'N5'},
              {img: require('../imgs/boy.png'),name:'N6'}],

              [{img: require('../imgs/boy.png'),name:'法语'}],
              
              [{img: require('../imgs/boy.png'),name:'德语'}],

              [{img: require('../imgs/boy.png'),name:'俄语'}],

              [{img: require('../imgs/boy.png'),name:'泰语'}]
      ]; 
                    

export default class Sort extends Component<Props> {
  constructor(props){
    super(props);
    this.state = {
      category: 0,
      data: source[0]
    }
  }

  pressMenu(item){
      this.setState({category: item.category, data: source[item.category]});
  }
  render(){
    return (
      <ScrollView
        Vertical={true}
        showsVerticalScrollIndicator={false}>
        <View>
          <View style={{flexDirection:'row'}}>
            <Menu menu={menu2} switchMenu = {this.pressMenu.bind(this)}/>
            <Entry data={this.state.data}/>
          </View>
        </View>
    </ScrollView> 
    );
  }
}

const styles = StyleSheet.create({
   font: {
    fontSize:16,
    color:'black',
    fontWeight:'bold',
    marginTop:20,
    marginLeft:150,
  },
  font1: {
    fontSize:12,
    color:'#8E8E8E',
    fontWeight:'bold',
    marginTop:10,
    marginRight:10,
    textAlign:'right',
  },
});

module.exports = Sort;