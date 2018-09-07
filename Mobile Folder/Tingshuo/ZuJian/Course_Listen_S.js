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
export default class Course_Listen_S extends Component<Props> {
  render() {  
    return (
     
<View style={styles.class}>
       <Image style={styles.list} source={require('../imgs/kcet6.jpg')}></Image>
       <View>
       <Text style={styles.list1}>考虫六级听力</Text>
       <Text style={styles.list2}>课程  10</Text>
       </View>
       </View>
    );
  }

}
const styles = StyleSheet.create({
    class:{
    width:'100%',
    height:130,
    borderWidth:2,
    borderBottomColor:'#F2F2F2',
    borderColor:'#F2F2F2',
    flexDirection:'row',
  },  
  list:{
    width:100,
    height:100,
    marginTop:15,
    marginLeft:15,
    borderRadius:8,
    shadowColor:'#272822',
  },
  list1:{
    fontSize:25,
    color:'#272822',
    marginTop:25,
    marginLeft:25,
    shadowColor:'#272822',
  },
    list2:{
    fontSize:18,
    color:'#A5A6A8',
    marginTop:10,
    marginLeft:70,
    shadowColor:'#272822',
  },
});
module.exports = Course_Listen_S;