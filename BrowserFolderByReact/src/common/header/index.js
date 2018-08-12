import React,{Component} from 'react';
import {connect} from 'react-redux';
import {CSSTransition} from 'react-transition-group';
import {actionCreators} from './store';
import {HeaderWrapper,Logo,Nav,NavItem,NavSearch,Addition,Button,SearchWrapper,SearchInfo,SearchInfoTitle,SearchInfoSwitch,SearchInfoList,SearchInfoItem} from './style';

class Header extends Component{
	render(){
		const { focused,list,handleInputFocus,handleInputBlur } = this.props;
		return (
		<HeaderWrapper>
			<Logo /> {/*可以写href属性*/}
			<Nav>
				<NavItem className="left active">首页</NavItem>
				<NavItem className="left">下载App</NavItem>
				<NavItem className="right">登录</NavItem>
				<NavItem className="right">
					<i className="iconfont">&#xe636;</i>
				</NavItem>
				<SearchWrapper>
					{/*注意是classNames*/}
					<CSSTransition
						in={focused}
						timeout={200}
						classNames="slide"
						>
					<NavSearch
						className={focused?'focused':''}
						onFocus={()=>{handleInputFocus(list)}}
						onBlur={handleInputBlur}></NavSearch>
					</CSSTransition>
					<i className={focused?'focused iconfont zoom':'iconfont zoom'}>&#xe617;</i>
					{this.getListArea()}
				</SearchWrapper>
			</Nav>
			<Addition>
				<Button className="writing"><i className="iconfont">&#xe615;</i>写文章</Button>
				<Button className="reg">注册</Button>
			</Addition>
		</HeaderWrapper>
		)
	}

	getListArea(){
		const { focused,list,page,totalPage,mouseIn,handleMouseEnter,handleMouseLeave,handleChangePage } = this.props;
		const newList = list.toJS();//将list从immutable对象转换成js对象
		const pageList = [];
		if(newList.length){//第一次渲染时因为没有发送ajax请求而导致newlist为空从而key值为空，项目提示没有key值，故加此判断
			for(let i=(page-1)*10;i<page*10;i++){
				pageList.push(
					<SearchInfoItem key={newList[i]}>{newList[i]}</SearchInfoItem>
				)
			}
		}
		if(focused||mouseIn){
			return(
				<SearchInfo onMouseEnter={handleMouseEnter} onMouseLeave={handleMouseLeave}>
					<SearchInfoTitle>
						热门搜索
						<SearchInfoSwitch onClick={()=>{handleChangePage(page,totalPage,this.spinIcon)}}>
							<i ref={(icon)=>{this.spinIcon=icon}} className='iconfont spin'>&#xe851;</i>
							换一批
						</SearchInfoSwitch>
					</SearchInfoTitle>
					<SearchInfoList>
						{ pageList }
					</SearchInfoList>
				</SearchInfo>
			);
		}else{
			return null;
		}
	}
}

const mapStateToProps = (state)=>{
	return{
		//由于定义时是header:子reducer，由于state是immutable对象，state.get('header')也是immutable对象，故使用get方法取
		//focused : state.get('header').get('focused')
		//利用immutable对象的getIn方法取值等同上述方法
		focused:state.getIn(['header','focused']),
		list:state.getIn(['header','list']),
		page:state.getIn(['header','page']),
		mouseIn:state.getIn(['header','mouseIn']),
		totalPage:state.getIn(['header','totalPage'])
	}
}

const mapDispatchToProps = (dispatch)=>{
	return{
		handleInputFocus(list){
			(list.size === 0 ) && dispatch(actionCreators.getList());//如果列表有值，则表示已经发送ajax请求，则不重新发；如果没值则重新发
			dispatch(actionCreators.searchFocus())
		},
		handleInputBlur(){
			dispatch(actionCreators.searchBlur())
		},
		handleMouseEnter(){
			dispatch(actionCreators.mouseEnter())
		},
		handleMouseLeave(){
			dispatch(actionCreators.mouseLeave())
		},
		handleChangePage(page,totalPage,spin){
			let originAngle = spin.style.transform.replace(/[^0-9]/ig,'');//将spin的style中的transform中除数字的其他元素替换成空,结果是字符串
			if(originAngle){
				originAngle = parseInt(originAngle,10);//将originAngle转换成10进制的数字
			}else{
				originAngle = 0;//第一次点击的时候originAngle没有值
			}
			spin.style.transform = 'rotate('+(originAngle+360)+'deg)';
			if(page<totalPage){
				dispatch(actionCreators.changePage(page+1))
			}else{
				dispatch(actionCreators.changePage(1))
			}
		}
	}
}
export default connect(mapStateToProps,mapDispatchToProps)(Header);