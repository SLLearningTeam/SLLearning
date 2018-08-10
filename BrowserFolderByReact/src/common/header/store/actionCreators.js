//帮助我们创建action
import * as constants from './constants';
import axios from 'axios';
import {fromJS} from 'immutable';

const changeList = (data)=>({
	type:constants.CHANGE_LIST,
	data:fromJS(data),//将data变成immutable对象，因为初始的state中的data就是immutable对象
	totalPage:Math.ceil(data.length / 10)//每页显示10个

})

export const searchFocus = () =>({
	type:constants.SEARCH_FOCUS
})

export const searchBlur = () => ({
	type:constants.SEARCH_BLUR
})

export const mouseEnter=()=>({
	type:constants.MOUSE_ENTER
});

export const mouseLeave=()=>({
	type:constants.MOUSE_LEAVE
})

export const changePage=(page)=>({
	type:constants.CHANGE_PAGE,
	page
})

export const getList = ()=>{
	return (dispatch)=>{
		axios.get('/api/headerList.json')
			.then((res)=>{
				const data = res.data;
				dispatch(changeList(data.data));
			})
			.catch(()=>{console.log('error')})
	}
}