import React, { Component } from 'react';
import {
  Platform,
  StyleSheet,
  Text,
  View,
  Image,
  ScrollView
} from 'react-native';
var picArr =['https://edu-image.nosdn.127.net/2da18ff2-0d7f-4a14-8838-319682aba513.jpg?imageView&quality=100&crop=0_0_879_494&thumbnail=450y250',
'https://edu-image.nosdn.127.net/c74528d3-95d7-4960-b043-d6a2baa2c942.jpg?imageView&quality=100&crop=0_0_560_280&thumbnail=450y250',
'https://img-ph-mirror.nosdn.127.net/uVL0GMVglXRbDGJzXWDlIw==/975310794320613939.jpg?imageView&quality=100&thumbnail=450y250',
'https://img-ph-mirror.nosdn.127.net/R5-5RG1Y4sRawWJoRLPoEQ==/6597291868007299321.jpg?imageView&quality=100&thumbnail=450y250']
export default class Lunbo extends Component<Props> {
 
  //初始值
  constructor(props){
    super(props);
    //当前的页面
    this.state={currentPage:'0',
     };
  }
  // 不变的量初始化
     static defaultProps = {  
        duration: 1000,  
      }
      //复杂操作
      componentDidMount() {  
        //开启定时器
      this._startTimer();  
      }
       componentWillUnmount() {  
        // 如果存在this.timer，则使用clearTimeout清空。  
        // 如果你使用多个timer，那么用多个变量，或者用个数组来保存引用，然后逐个clear  
        this.timer && clearTimeout(this.timer);  
      }
      _startTimer()
    {  
        let scrollView = this.refs.scrollView;  
        this.timer = setInterval(  
          ()=>{   
           let imageCount = picArr.length;  
           //4.1 设置圆点  
           let activePage = 0;  
           //4.2判断  
           if(this.state.currentPage>=imageCount+1){  
             activePage = 0;  
           }else{  
             activePage = this.state.currentPage+1;  
           }  
           //4.3 更新状态机  
           this.setState({currentPage:activePage});  
           //4.4 让scrollview 滚动起来  
           let offsetX = activePage * 390; 
          this._scrollView.scrollTo({x:offsetX,y:0,animated:true});
          },  
           this.props.duration
         );  
        }
  render() {
    return (
     <View style={styles.container}>
     <ScrollView
      horizontal = {true}
      showsHorizontalScrollIndicator = {true}
      pagingEnabled = {true}
      onMomentumScrollEnd = {this.onAnimationEnd.bind(this)}
      ref={ (component) => {this._scrollView = component} }
      >
     {this.renderScrollItem()}
     </ScrollView>
     {/*返回指示器*/} 
        <View style={styles.pageViewStyle}>
        {/*返回圆点*/}
        {this.renderPageCicle() }
        </View>
      </View>
    );
  }
  renderScrollItem(){
   var itemArr = []// 定义空的组件数组，里面一会放图片
   //建立照片数组，和原生drawable下的文件夹里照片名对应 
   //对picArr数组遍历，将里面内容放到itemArr里
   for (var i = 0; i < picArr.length; i++) {
    itemArr.push(
      <Image key={i} source={{uri:picArr[i]}} style={{width:410,height:180}}/>
      )
   }
   return itemArr;
  }
  renderPageCicle(){
    var indicatorArr=[];
    //拿到图像数组     
    var style ;
    for(var i=0;i<picArr.length;i++){
      //判断
      style=(i==this.state.currentPage)? {color:'orange'}:{color:'#ffffff'};
      indicatorArr.push(
        <Text  key={i} style={[styles.fontSizeStyle,style]}>&bull;</Text>
        );
    }
    return indicatorArr;
  }
  //手动滑动分页实现
  onAnimationEnd(e){
    //求出水平方向的偏移量
    var offSetX=e.nativeEvent.contentOffset.x;
    //求出当前的页数
    var currentPage=Math.floor(offSetX/390);
    //更新状态机，重新绘制UI
    this.setState({
     currentPage:currentPage
    });
  }
}
const styles = StyleSheet.create({
  container:{
    marginTop:25,
  },
  pageViewStyle:{
    width:420,
    height:25,
    backgroundColor:'rgba(0,0,0,0.6)',
         //定位
    position:'absolute',
    bottom:0,
    flexDirection:'row',
    alignItems:'center',
  },
  fontSizeStyle:{
    fontSize:25,   
  }
});
module.exports = Lunbo;