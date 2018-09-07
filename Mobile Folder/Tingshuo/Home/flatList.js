import React, { Component, PureComponent } from 'react';
import {
  View,
  TouchableOpacity,
  FlatList,
  Text,
  Alert,
} from 'react-native';
import styles from './style';
import commonStyle from '../../Common/Style';
 
const data = [
  {id: 'T&C', index: 0,},
  {id: 'Privacy', index: 1,},
  {id: 'FAQs', index: 2,},
  {id: 'Feedback', index: 3,},
  {id: 'Wooloomooloo', index:4},
];
class MyListItem extends React.PureComponent {
  _onPress = () => {
    // MyList的onPressItem
    this.props.onPressItem(this.props.id);
  };
 
  render() {
    return (
  <View>
                  <TouchableOpacity
      onPress={() => this._onPress()}> 
                  <Text> {this.props.title} </Text>
       </TouchableOpacity>
                  </View>
    )
  }
}
class MyList extends React.PureComponent {
  state = {selected: (new Map(): Map<string, boolean>)};
  _keyExtractor = (item, index) => item.id;
  _onPressItem = (id: string) => {
    // updater functions are preferred for transactional updates
    this.setState((state) => {
      // copy the map rather than modifying state.
      const selected = new Map(state.selected);
      selected.set(id, !selected.get(id)); // toggle
      return {selected};
    });
    //渲染时候的onPressItem
    this.props.onPressItem(id)
  };
 
  _renderItem = ({item}) => (
    <MyListItem
      id={item.id}
      onPressItem={this._onPressItem}
      selected={!!this.state.selected.get(item.id)}
      title={item.id}
    />
  );
  render() {
    return (
      <FlatList
        data={this.props.data}
        extraData={this.state}
        keyExtractor={this._keyExtractor}
        renderItem={this._renderItem}
        onPress = {this._onPressItem}
      />
    );
  }
}
export default class index extends Component<{}> {
  constructor(props) {
    super(props);
  
    this.state = {};
    this.onPressItem = this.onPressItem.bind(this)
  }
    static navigationOptions = {  
        //导航栏标题  
          title:'关于',  
         drawerLabel: '关于',  
    };  
  onPressItem(message) {
    Alert.alert("点击了" + message.toString())
  }
  render() {
    return (
        <View>
          <View>
              <MyList 
              data = {data}
              onPressItem = {this.onPressItem.bind(this)}
              />
          </View>
        </View>
      );
  }
}
