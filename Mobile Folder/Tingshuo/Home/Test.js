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
         
            loaded: false,
            dataSource: new ListView.DataSource({
                rowHasChanged: (row1, row2) => row1 !== row2,
            })
        };
    }
    componentDidMount() {
        fetch('http://api.douban.com/v2/movie/top250')
            .then((response) => response.json())
            .then((responseJson) => {
                this.setState({
                    loaded: true,
                  /*  title : responseJson.movies[0].title,
                    year : responseJson.movies[0].releaseYear,*/
                    dataSource: this.state.dataSource.cloneWithRows(responseJson.movies)
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
           /* <View style={styles.container}>
                <Button
                   title={'获取数据'}
                    onPress={alert('hello')}
                />
                <Text>title：{this.state.title}</Text>
                <Text>releaseYear：{this.state.year}</Text>
                <ListView
                    dataSource={this.state.dataSource}
                    renderRow={this.renderMovie}
                    style={styles.listView}
                />
            </View>*/
            <View>
            <ListView 
                dataSource={this.state.dataSource}
                //initialListSize={2}
                renderRow={this._renderRow}
            />
            </View>
        );
    }
  
      _renderRow(movies){
    return(
      <View>
          <Text >{subjects.title}</Text>
          {/*<Text >{subjects.rating.starts}</Text>
          <Text >{subjects.rating.average}</Text>*/}
        </View>
     
      )
  }
    //  parseResponseJson(responseJson){
    //     var moviesArr = []
    //       for (var i = 0; i < responseJson.length; i++) {
    //         moviesArr.push(
    //             <Text>responseJson.movies[i].title</Text>)
    //       }
    //       return moviesArr;
    // }
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: '#e1b3ff',
    },

});