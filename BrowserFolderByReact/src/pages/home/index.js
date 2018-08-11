import React,{Component} from 'react';
import { HomeWrapper,HomeLeft,HomeRight } from './style';
import Topic from './components/Topic'
import List from './components/List'
import Recommend from './components/Recommend'
import Writer from './components/Writer'
class Home extends Component{
	render(){
		return(
			<HomeWrapper>
				<HomeLeft>
					<img className="banner-img" src="https://upload.jianshu.io/admin_banners/web_images/4381/3cdf43257e95766122959099cd4b41b495e6adfc.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/1250/h/540" alt=''/>
					<Topic/>
					<List/>
				</HomeLeft>
				<HomeRight>
					<Recommend/>
					<Writer/>
				</HomeRight>
			</HomeWrapper>
		)
	}
}
export default Home;