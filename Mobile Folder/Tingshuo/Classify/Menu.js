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

export default class Menu extends Component {
  constructor(props){
    super(props);
    this.state = {
      isActive: 0
    }
  }

  pressMenuItem(item) {
    this.props.switchMenu(item);
    this.setState({isActive: item.category});
  }

  render() {
    return (
          <View style={{backgroundColor:'#D9D9D9'}}>
            { this.props.menu.map((item, index)=> (
              <View style={{backgroundColor: this.state.isActive == item.category? "#FFF":"#D9D9D9",width:90,height:80,alignItems:'center',justifyContent:'space-between'}} key={`${item.name}-${index}`}>
                <TouchableOpacity onPress = {
                    this.pressMenuItem.bind(this,item)
                  }>
                  <Text style={styles.text}>{item.name}</Text>  
                </TouchableOpacity>      
              </View>
            ))}
          </View>
      );
  }
} 

const styles = StyleSheet.create({
  text:{
    marginLeft:10,
    marginTop:30,
    color:'#0A0A0A'
  },
});  
