import React, { Component } from 'react';
import {
    AppRegistry,
    StyleSheet,
    Text,
    View,Button,ListView,
    TouchableHighlight,
} from 'react-native';
export default class App extends Component {
    constructor(props){
        super(props)
        this.state={
            title : "",
           // year : "",
            loaded: false,
           
        };
    }
    componentDidMount() {
        fetch('http://101.200.51.53:8080/SSLearningTeam/course/user/courses_manage/1')
            .then((response) => response.json())
            .then((responseJson) => {
                this.setState({
                    loaded: true,
                    title : responseJson.info.courses.listeningCourses[0].courseName,
                  //  year : responseJson.info.releaseYear,
                    
                });
                
            })
            .catch((error) => {
                console.error(error);
            });
    };
    render() {
        if (!this.state.loaded) {
            return (
                <View style={{flex:1,
                    marginTop:25,
                    backgroundColor:"cyan",
                    justifyContent:"center",
                    alignItems:"center"}}>
                    <Text >Loading Movies......</Text>
                </View>
            );
        }
        return (
            <View style={styles.container}>
               
                <Text>title：{this.state.title}</Text>
               
            </View>
        );
    }
 
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: '#e1b3ff',
    },

});