import * as constants from './constants';
const defaultState = {
	focused:false,
}

export default (state=defaultState,action) => {
	if(action.type === constants.SEARCH_FOCUS){
		const newState = JSON.parse(JSON.stringify(state));
		newState.focused = true;
		return newState;
	}else if(action.type === constants.SEARCH_BLUR){
		const newState = JSON.parse(JSON.stringify(state));
		newState.focused = false;
		return newState;
	}
	return state;
}
