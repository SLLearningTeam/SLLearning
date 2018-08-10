//帮助我们创建action
import * as constants from './constants';
export const searchFocus = () =>({
	type:constants.SEARCH_FOCUS
})

export const searchBlur = () => ({
	type:constants.SEARCH_BLUR
})