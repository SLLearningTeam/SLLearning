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
export default class ZhongYing extends Component<Props> {
  render() {
    return (
    <View style={{margin:15}}>
    <ScrollView horizontal = {false}
     showsHorizontalScrollIndicator ={false}>
    <Text style={{fontSize:23,color:'#272822'}}>
    In this section, there is a passage with ten blanks. You are required to select one word for each blank from a list of choices given in a word bank following the passage. Read the passage through carefully before making your choices. Each choice in the bank is identified by a letter. Please mark the corresponding letter for each item on Answer Sheet 2 with a single line through the centre. You may not use any of the words in the bank more than once.
    </Text>
    <Text style={{fontSize:20,color:'#6F8E4F'}}>
    在本节中，有十个空需要填写。您需要从给出的单词中为空白处选上一个合适的单词。在做出选择之前，请仔细阅读该段落。每个选择都有一个字母标识。请在答题纸2上为每个项目标记相应的字母，并在中心单行每个词你只能使用一次。
    </Text>
    <Text style={{fontSize:23,marginTop:20,color:'#272822'}}>
    An office tower on Miller Street in Manchester is completely covered in solar panels. They are used to create some of the energy used by the insurance company inside. When the tower was first 26 in 1962, it was covered with thin square stones. These small square stones became a problem for the building and continued to fall off the face for 40 years until a major renovation was 27 . During this renovation the building's owners, CIS, 28 the solar panel company, Solarcentury. They agreed to cover the entire building in solar panels. In 2004, the completed CIS tower became Europe's largest 29 of vertical solar panels. A vertical solar project on such a large 30 has never been repeated since.
    </Text>
    <Text style={{fontSize:20,color:'#6F8E4F'}}>
    位于曼彻斯特米勒街的办公大楼完全被太阳能电池板覆盖。它们用于创造保险公司内部使用的一些能源。当塔在1962年第一次___时，它被薄方形石头覆盖。这些小方形石头成为建筑物的一个问题，并继续从脸上掉下40年，直到重大改造__。在这次翻修期间，该建筑的业主，CIS，__太阳能电池板公司，Solarcentury。他们同意用太阳能电池板覆盖整栋建筑。 2004年，完工的CIS塔成为欧洲最大的垂直太阳能电池板。从那时起，一个如此大的__的垂直太阳能项目从未重复过。
    </Text>
    <Text style={{fontSize:23,marginTop:20,color:'#272822'}}>
    Covering a skyscraper with solar panels had never been done before, and the CIS tower was chosen as one of the "10 best green energy projects". For a long time after this renovation project, it was the tallest building in the United Kingdom, but it was 31 overtaken by the Millbank Tower.
    </Text>
    <Text style={{fontSize:20,color:'#6F8E4F'}}>
    用太阳能电池板覆盖摩天大楼以前从未做过，CIS塔被选为“十大最佳绿色能源项目”之一。在这个改造项目之后的很长一段时间里，它是英国最高的建筑，但它被米尔班克大厦（Millbank Tower）所淹没。
    </Text>
    <Text style={{fontSize:23,marginTop:20,color:'#272822'}}>
    Green buildings like this aren't 32 cost-efficient for the investor, but it does produce much less pollution than that caused by energy 33 through fossil fuels. As solar panels get 34 , the world is likely to see more skyscrapers covered in solar panels, collecting energy much like trees do. Imagine a world where building the tallest skyscraper wasn't a race of 35 , but rather one to collect the most solar energy.
    </Text>
    <Text style={{fontSize:20,color:'#6F8E4F'}}>
    像这样的绿色建筑对投资者来说并不具有成本效益，但它产生的污染远远少于通过化石燃料产生的能源。随着太阳能电池板的出现，世界上可能会看到更多的摩天大楼被太阳能电池板覆盖，收集的能量就像树木一样。想象一下，建造最高的摩天大楼并不是__的种族，而是一个收集最多太阳能的世界。
    </Text>
    </ScrollView>
     </View>
    );
  }
}
const styles = StyleSheet.create({
});
module.exports=ZhongYing;