const menu = ["出版","男频","女频","漫画","杂志"];
import React, { Component } from 'react';
import {
  Platform,
  StyleSheet,
  Text,
  View,
  Image,
  ScrollView,
} from 'react-native';
export default class Entry extends Component {
  render() {
    return (
          <View style={{flexDirection:'row' ,flexWrap:'wrap', margin: 10}}>
              {
                this.props.data.map((item, index)=>(
                  <View style={{ width: 124, margin: 4, marginBottom: 4, justifyContent: 'center', alignItems: 'center'}} key={`${item.name}-${index}`}>
                    <View>
                      <Image source={item.img}
                      style={{height:60,width:64}}>
                      </Image>
                    </View>
                    <View style={{ marginLeft: 20, marginTop: 10, paddingLeft:10, alignSelf: "flex-start",}}>
                      <Text>{item.name}</Text>
                    </View>
                  </View>     
                ))
              }
            </View>
      );
  }
} 

const styles = StyleSheet.create({
  
});  