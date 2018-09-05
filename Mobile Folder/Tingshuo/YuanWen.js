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
export default class YuanWen extends Component<Props> {
  render() {
    return (
    <View style={{margin:15}}>
    <ScrollView horizontal = {false}
     showsHorizontalScrollIndicator ={false}>
    <Text style={{fontSize:20,color:'#000000'}}>
    In this section, there is a passage with ten blanks. You are required to select one word for each blank from a list of choices given in a word bank following the passage. Read the passage through carefully before making your choices. Each choice in the bank is identified by a letter. Please mark the corresponding letter for each item on Answer Sheet 2 with a single line through the centre. You may not use any of the words in the bank more than once.
    </Text>
    <Text style={{fontSize:23,marginTop:20,color:'#272822'}}>
    An office tower on Miller Street in Manchester is completely covered in solar panels. They are used to create some of the energy used by the insurance company inside. When the tower was first ___ in 1962, it was covered with thin square stones. These small square stones became a problem for the building and continued to fall off the face for 40 years until a major renovation was ___ . During this renovation the building's owners, CIS, ___ the solar panel company, Solarcentury. They agreed to cover the entire building in solar panels. In 2004, the completed CIS tower became Europe's largest ___ of vertical solar panels. A vertical solar project on such a large ___ has never been repeated since.
    </Text>
    <Text style={{fontSize:23,marginTop:20,color:'#272822'}}>
    Covering a skyscraper with solar panels had never been done before, and the CIS tower was chosen as one of the "10 best green energy projects". For a long time after this renovation project, it was the tallest building in the United Kingdom, but it was ___ overtaken by the Millbank Tower.
    </Text>
    <Text style={{fontSize:23,marginTop:20,color:'#272822'}}>
    Green buildings like this aren't ___ cost-efficient for the investor, but it does produce much less pollution than that caused by energy ___ through fossil fuels. As solar panels get ___ , the world is likely to see more skyscrapers covered in solar panels, collecting energy much like trees do. Imagine a world where building the tallest skyscraper wasn't a race of ___ , but rather one to collect the most solar energy.
    </Text>
    <Text style={{fontSize:25,color:'#000000'}}>
    A. cleaner 
    C. collection 
    D. competed 
    E. constructed 
    F. consulted 
    G. dimension 
    H. discovered 
    I. eventually 
    J. height 
    K. necessarily 
    L. production 
    M. range 
    N. scale 
    O. undertaken
    </Text>
    </ScrollView>
     </View>
    );
  }

}
const styles = StyleSheet.create({

});
module.exports=YuanWen;