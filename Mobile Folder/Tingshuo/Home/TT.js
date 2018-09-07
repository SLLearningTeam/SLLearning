import React, {Component} from 'react';
import {
    StyleSheet,
    Text,
    TextInput,
    TouchableOpacity,
    View,
    Alert,
    WebView,
} from 'react-native'

//javaScriptEnabled:是否启用JavaScript （android），ios无此属性，已经默认true
//domStorageEnabled:是否开启DOM本地存储(android)
//decelerationRate:指定一个浮点数,用于设置触摸停止后，多块速度停止滚动,也可传字符串，normal,fast
//onNavigationStateChange:当webview加载开始或者结束回调函数
//onShouldStartLoadWithRequest:允许为webview发起的请求运行一个自定义的处理函数。返回true或false表示是否要继续执行响应的请求(ios)
//startInLoadingState:强制WebView在第一次加载时先显示loading视图。默认为true
//scalesPageToFit:设置是否要把网页缩放到适应视图的大小，以及是否允许用户改变缩放比例。
//automaticallyAdjustContentInsets 控制是否调整放置在导航条、标签栏或工具栏后面的web视图的内容。默认值是true
//source={require('./helloworld.html')可以加载html
//postMessage RN发送消息给html
//onMessage:html发送消息给RN
//injectJavaScript注入脚本
import audio from './audio.html'
class WebViewExample extends Component {  
    render() {      
        return (    <View>
                    <View style={{width:60,height:60,marginTop:760,marginLeft:178}}>
                    <WebView
                      source={require('./audio.html')}
                      automaticallyAdjustContentInsets={false}
                    />   
                    </View> 
                    </View>            
        )
    }
   
}

const styles = StyleSheet.create({ 

})
module.exports=WebViewExample