import React, { PureComponent } from 'react';
require('../css/reset.css');
require('../css/main.css');
require('../css/bootstrap.min.css');

class Header extends PureComponent {
    render() {
        return (
                <div className="headerBar">
        <div className="header-shadow">
            <div className="leftArea">
                <div className="logo">
                    <a href="index.html">
                        <img src={require("../img/weblogo.png")} alt="听说网"/>
                    </a>
                </div>
                <div className="topNav fl">
                    <ul>
                        <li className="fl">
                            <a href="">首页</a>
                        </li>
                        <li className="fl">
                            <a href="">分类</a>
                        </li>
                        <li className="fl">
                            <a href="">我的天啊</a>
                        </li>
                        <li className="fl">
                            <a href="">这是啥呀</a>
                        </li>
                        <li className="fl">
                            <a href="">真是</a>
                        </li>
                        <li className="fl">
                            <a href="">干啥呀</a>
                        </li>
                    </ul>
                </div>
            </div>

            <div className="rightArea">
                <div className="user_box fl">
                    <ul>
                        <li className="fl dropdown">
                            <a href="" data-toggle="collapse" role="button" aria-expanded="false" aria-controls="collapseExample">下载APP</a>
                            <div className="dropdown-menu">
                                <img className="download" src={require("../img/logo.png")} alt="下载APP"/>
                                <span>扫一扫</span>
                            </div>
                        </li>
                        <li className="fl">
                            <a href="">登录</a>
                            /
                            <a href="">注册</a>
                        </li>
                    </ul>
                </div>
            </div>
            <div className="search-box">
                <form className="form-inline search-form" action="" id="search-form">
                    <input type="text" className="search-content" name="fd" id="search-content"/>
                    <button className="search-submit" type="submit" value=""></button>
                </form>
            </div>
        </div>
    </div>
        );
    }
}
export default Header;