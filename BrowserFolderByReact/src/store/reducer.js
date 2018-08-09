import { combineReducers } from 'redux'; //redux的combineReducers函数可以帮我们把小的reducer合并成大的reducer
import {reducer as headerReducer} from '../common/header/store';//自动找文件夹下的index.js
//合并方式
const reducer = combineReducers({
	header: headerReducer/*取时应是state.header.对应数据*/
});

export default reducer;
