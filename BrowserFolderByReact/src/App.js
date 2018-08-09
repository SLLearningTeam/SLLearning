import React,{Component} from 'react';
import Header from './common/header';
import store from './store'
import {Provider} from 'react-redux';


class App extends Component{
	render(){
		return(
			<Provider store={store}>{/*Provider将store的数据提供给内部的Header组件*/}
				<Header />
			</Provider>
		)
	}
}
export default App;