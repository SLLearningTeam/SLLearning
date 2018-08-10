import * as constants from './constants';
import {fromJS} from 'immutable';//从immutable中引入fromJS
//将数据转换成immutable对象
const defaultState = fromJS({
	focused:false,
	mouseIn:false,//鼠标是否移入热门显示框中
	list:[],//fromJS会把list变成immutable对象
	page:1,
	totalPage:1
})
export default (state=defaultState,action) => {
	switch(action.type){
		case constants.SEARCH_FOCUS:
			//state是immutable对象，set方法会结合之前immutable对象的值和设置的值返回一个全新的对象
			return state.set('focused',true);
		case constants.SEARCH_BLUR:
			return state.set('focused',false);
		case constants.CHANGE_LIST:
			//return state.set('list',action.data).set('totalPage',action.totalPage);//如果改变state中多个值则循环调用即可
			return state.merge({//可以利用merge同时改变多个state数据内容
				list:action.data,
				totalPage:action.totalPage
			})
		case constants.MOUSE_ENTER:
			return state.set('mouseIn',true);
		case constants.MOUSE_LEAVE:
			return state.set('mouseIn',false);
		case constants.CHANGE_PAGE:
			return state.set('page',action.page);
		default:
			return state;
	}
}
