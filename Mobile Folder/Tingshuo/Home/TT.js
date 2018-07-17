import React, { Component } from 'react';
import {
  Platform,
  StyleSheet,
  Text,
  View,
  Image,
  ScrollView,
  TouchableOpacity,
  TextInput
} from 'react-native';
 function getRequest(url){
    var opts={
        method:"GET"
    }
    fetch(url,opts)
    .then((response)=>{
        return response.text();
    })
    .then((responseText)=>{
        alert(responseText)
    })
    .catch((error)=>{
        alert(error);
    })
  }
  function postRequest(url){
  let formData = new FormData();
  formData.append("id",this.state.text,);
  formData.append("password",this.state.text1,);
  var opts={
    method:"POST",
    body:formData
  }
fetch(url,opts)
.then((response)=>{
    return response.text();
})
.then((responseText)=>{
    alert(responseText);
})
.catch((error)=>{
    alert(error);
})
}
export default class TT extends Component<Props> {
     constructor(props) {
    super(props);
    this.state = { text: '' };
    this.state = { text1: '' };
  }
  render() {
    return (
    <View style={styles.container}>  
    <TouchableOpacity onPress={getRequest.bind(this,"http://172.19.180.34:8080/SSLearningTeam/user/testlogin?id=315&password=123")}>
    <View style={styles.btn}>
    <Text>GET</Text>
    </View>
    </TouchableOpacity>
   
    <TouchableOpacity onPress={postRequest.bind(this,"http://172.19.180.34:8080/SSLearningTeam/user/testlogin")}>
    <View>

    <TextInput 
    onChangeText={(text) => this.setState({text})}
     value={this.state.text}
    />
   <TextInput 
    onChangeText={(text1) => this.setState({text1})}
     value={this.state.text1}
    />
    </View>
    <View style={styles.btn}>
    
    <Text>登陆</Text>
    </View>
    </TouchableOpacity>
     </View>
    );
  }
  
   
}
const styles = StyleSheet.create({
container:{
    flex:1,
    marginTop:30,
    backgroundColor:'cyan',
    flexDirection:'row',
    justifyContent:'space-around',
    alignItems:'center',
},
btn:{
    width:60,
    height:30,
    borderWidth:1,
    borderRadius:3,
    borderColor:'black',
    backgroundColor:'yellow',
    justifyContent:'center',
    alignItems:'center',
}
});