import {fromJS} from 'immutable';//从immutable中引入fromJS
//将数据转换成immutable对象
const defaultState = fromJS({
	topicList:[
		{id:1,title:'社会热点',imgUrl:'https://upload.jianshu.io/collections/images/4/sy_20091020135145113016.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/64/h/64'},
		{id:2,title:'手绘',imgUrl:'https://upload.jianshu.io/collections/images/283250/%E6%BC%AB%E7%94%BB%E4%B8%93%E9%A2%98.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/64/h/64'},
	],
	articalList:[
		{id:1,title:'简书，我又来了O.O',desc:'很久没在简书发画了 也是因为自己的很多琐事缠身，导致不能经常画画 我不太善表达，不会用什么华丽的语言装饰 那就啥也不说了 直接放上一些照片和画吧',imgUrl:'https://upload-images.jianshu.io/upload_images/4194583-e204186ee39aa66b.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240'},
		{id:2,title:'除了奥运会、G20、上合峰会，二三线城市活动营销还有哪些新玩法？',desc:'6月9日，也就是明天，就是上合峰会的正日子了。 上合峰会，全称是上合组织峰会，前身是“上海五国”机制。上海五国”机制发源于上世纪80年代末开始的...',imgUrl:'https://upload-images.jianshu.io/upload_images/1239680-ecc3fa9b09b89a6e.jpeg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240'},
		{id:3,title:'有一种闺蜜，比男友更靠谱',desc:'01 五一期间，我的大学舍友小思飞到南方来找我。 我早早就守在机场出站口，见到她，快步上前就是一个大大的拥抱，两个25岁的熟龄少女激动到尖叫。 ...',imgUrl:'https://upload-images.jianshu.io/upload_images/2090254-98ffe93cdc746519.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240'},
	]
})
export default (state=defaultState,action) => {
	switch(action.type){
		
		default:
			return state;
	}
}
