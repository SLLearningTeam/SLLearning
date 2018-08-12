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
  Button,
  ScrollView,
} from 'react-native';

const instructions = Platform.select({
  ios: 'Press Cmd+R to reload,\n' +
    'Cmd+D or shake for dev menu',
  android: 'Double tap R on your keyboard to reload,\n' +
    'Shake or press menu button for dev menu',
});

type Props = {};
export default class SectionAQ extends Component<Props> {
  render() {
    return (
      <View style={{flex:1}}>
      <View style={{flexDirection:'row',borderWidth:2,borderBottomColor:'#F2F2F2',borderColor:'#F2F2F2'}}>
      <View>
      <Image style={{width:35,height:35,marginLeft:'3%'}}source={require('../imgs/back.png')}></Image>
      </View>
      <View style={{marginTop:'3%',flexDirection:'row',justifyContent:'space-between',marginLeft:'30%',width:'50%'}}>
      <Image source={require('../imgs/text.png')}></Image>
      <Image source={require('../imgs/dingyue1.png')}></Image>
      <Image source={require('../imgs/ziti.png')}></Image>
      <Image source={require('../imgs/xiazai.png')}></Image>
      </View>
      </View>
<ScrollView>
      <View style={{margin:'3%'}}>
      <Text style={{fontSize:25,color:'#272822',fontWeight:'bold'}}>Section A</Text>

      <View style={{borderWidth:2,borderBottomColor:'#C7CBD1',borderColor:'#FFFBFF',height:'32%',width:'94%'}}>
      <Text style={{color:'#272822',fontSize:20}}>(     )1. A. Go to the office </Text>
      <Text style={{color:'#272822',fontSize:20,marginLeft:'15%'}}> B. Keep calling  </Text>
      <Text style={{color:'#272822',fontSize:20,marginLeft:'15%'}}> C. Try online booking </Text>
      <Text style={{color:'#272822',fontSize:20,marginLeft:'15%'}}> D. See a doctor </Text>
      <View style={{width:'94%',height:'20%',flexDirection:'row',justifyContent:'space-between'}}>
      <Text style={{color:'#00AAA9',fontSize:15,marginLeft:'15%',marginTop:'4%'}}>正确答案：C</Text>
      <Button
        title="解析"
        color="#A6E22E"
      />
      </View>
      </View>
      <View style={{borderWidth:2,borderBottomColor:'#C7CBD1',borderColor:'#FFFBFF',height:'32%',width:'94%'}}>
      <Text style={{color:'#272822',fontSize:20}}>(     )2. A. A reporter </Text>
      <Text style={{color:'#272822',fontSize:20,marginLeft:'15%'}}> B. An athlete  </Text>
      <Text style={{color:'#272822',fontSize:20,marginLeft:'15%'}}> C. A fisherman </Text>
      <Text style={{color:'#272822',fontSize:20,marginLeft:'15%'}}> D. An organizer </Text>
      <View style={{width:'94%',height:'20%',flexDirection:'row',justifyContent:'space-between'}}>
      <Text style={{color:'#00AAA9',fontSize:15,marginLeft:'15%',marginTop:'4%'}}>正确答案：B</Text>
      <Button
        title="解析"
        color="#A6E22E"
      />
      </View>
      </View>
      <View style={{borderWidth:2,borderBottomColor:'#C7CBD1',borderColor:'#FFFBFF',height:'32%',width:'94%'}}>
      <Text style={{color:'#272822',fontSize:20}}>(     )3. A. At a post office. </Text>
      <Text style={{color:'#272822',fontSize:20,marginLeft:'15%'}}> B. At a fast-food restaurant.  </Text>
      <Text style={{color:'#272822',fontSize:20,marginLeft:'15%'}}> C. At a booking office.  </Text>
      <Text style={{color:'#272822',fontSize:20,marginLeft:'15%'}}> D. At a check-in desk. </Text>
      <View style={{width:'94%',height:'20%',flexDirection:'row',justifyContent:'space-between'}}>
      <Text style={{color:'#00AAA9',fontSize:15,marginLeft:'15%',marginTop:'4%'}}>正确答案：A</Text>
      <Button
        title="解析"
        color="#A6E22E"
      />
      </View>
      </View>

      </View>
</ScrollView>
      </View>
    );
  }
}

const styles = StyleSheet.create({

});
