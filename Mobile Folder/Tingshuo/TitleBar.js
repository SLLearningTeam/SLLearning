
import React, { Component } from 'react';
import {
  StyleSheet,
  Text,
  View,
  Image,
  TouchableOpacity,
} from 'react-native';

export default class TitleBar extends Component{
  constructor(props) {
        super(props);
        this.state = {
        
        };
    }
  onPress(position){
    this.props.onSelectItem&&this.props.onSelectItem(position);
  }

  render(){
    return(
      <View>
      <View style = {{marginLeft:'12%',marginRight:'12%',marginTop:'3%',marginBottom:'3%',flexDirection:'row',justifyContent:'space-between'}}>
      <TouchableOpacity onPress={()=>this.onPress(1)}>
        <Text style={styles.text}>发现</Text>
      </TouchableOpacity>
      <TouchableOpacity onPress={()=>this.onPress(2)}>
        <Text style={styles.text}>分类</Text>
      </TouchableOpacity>
      <TouchableOpacity onPress={()=>this.onPress(3)}>
        <Text style={styles.text}>课程</Text>
      </TouchableOpacity>
      
      </View>
      <View style={{width:'100%',height:5,backgroundColor:'red',marginBottom:5}}></View>
      </View>
    );
  }
}

const styles=StyleSheet.create({
text:{
  fontSize:20,
  fontWeight:'bold',
}
});
