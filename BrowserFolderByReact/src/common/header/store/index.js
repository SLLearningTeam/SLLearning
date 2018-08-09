//作为store的出口文件，引入时可以减少路径的书写。
import reducer from './reducer';
import * as actionCreators from './actionCreators';
import * as constants from './constants';
export { reducer,actionCreators,constants }