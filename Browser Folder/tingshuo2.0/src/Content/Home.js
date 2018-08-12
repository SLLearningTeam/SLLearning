import React, { PureComponent } from 'react';

class Home extends PureComponent {
    render() {
        return (
            <div className="index">
        <div className="lunboBar-w">
            <div className="lunboBar">
                <div className="lunboMenu">
                    <div className="menuContent">
                        <a href="">
                            <span className="menuGroup">
                                英语听力 / 能力考 / 新闻
                            </span>
                            <img src={require("../icon/kuozhan.png")} alt="更多"/>
                        </a>
                    </div>
                    <div className="menuContent">
                        <a href="">
                            <span className="menuGroup">
                                英语口语 / 雅思 / 托福

                            </span>
                            <img src={require("../icon/kuozhan.png")} alt="更多"/>
                        </a>
                    </div>
                    <div className="menuContent">
                        <a href="">
                            <span className="menuGroup">
                                英语阅读 / 新闻 / 能力考
                            </span>
                            <img src={require("../icon/kuozhan.png")} alt="更多"/>
                        </a>
                    </div>
                    <div className="menuContent">
                        <a href="">
                            <span className="menuGroup">
                                日语听力 / 入门 / 能力考
                            </span>
                            <img src={require("../icon/kuozhan.png")} alt="更多"/>
                        </a>
                    </div>
                    <div className="menuContent">
                        <a href="">
                            <span className="menuGroup">
                                日语口语 / 能力考 / 标日
                            </span>
                            <img src={require("../icon/kuozhan.png")} alt="更多"/>
                        </a>
                    </div>
                    <div className="menuContent">
                        <a href="">
                            <span className="menuGroup">
                                日语阅读 / 能力考 / 新闻
                            </span>
                            <img src={require("../icon/kuozhan.png")} alt="更多"/>
                        </a>
                    </div>
                    <div className="menuContent">
                        <a href="">
                            <span className="menuGroup">
                                多语种 / 韩语 / 法语
                            </span>
                            <img src={require("../icon/kuozhan.png")} alt="更多"/>
                        </a>
                    </div>
                </div>
                <div className="lunboImg">
                    <div id="lunbo" className="carousel slide" data-ride="carousel">
                        {/* <!-- 指示符 --> */}
                        <ul className="carousel-indicators">
                            <li data-target="#lunbo" data-slide-to="0" className="active"></li>
                            <li data-target="#lunbo" data-slide-to="1"></li>
                            <li data-target="#lunbo" data-slide-to="2"></li>
                            <li data-target="#lunbo" data-slide-to="3"></li>
                        </ul>
                        {/* <!-- 轮播图片 --> */}
                        <div className="carousel-inner">
                            <div className="carousel-item active">
                                <img src={require("../img/lunbo3.png")} alt="轮播"/>
                                <div className="carousel-caption">
                                    <h5>第一张图片描述标题</h5>
                                </div>
                            </div>
                            <div className="carousel-item">
                                <img src={require("../img/lunbo2.png")} alt="轮播"/>
                                <div className="carousel-caption">
                                    <h5>第二张图片描述标题</h5>
                                </div>
                            </div>
                            <div className="carousel-item">
                                <img src={require("../img/lunbo1.png")} alt="轮播"/>
                                <div className="carousel-caption">
                                    <h5>第三张图片描述标题</h5>
                                </div>
                            </div>
                            <div className="carousel-item">
                                <img src={require("../img/lunbo2.png")} alt="轮播"/>
                                <div className="carousel-caption">
                                    <h5>第四张图片描述标题</h5>
                                </div>
                            </div>
                        </div>
                        {/* 左右切换按钮 */}
                        <a className="carousel-control-prev" href="#lunbo" data-slide="prev">
                            <span className="carousel-control-prev-icon"></span>
                        </a>
                        <a className="carousel-control-next" href="#lunbo" data-slide="next">
                            <span className="carousel-control-next-icon"></span>
                        </a>
                    </div>
                </div>
            </div>

        </div>
        <div className="tuijian">
            <h5 className="tuijianTitle">
                <span>
                    <img className="imgH30" src={require("../img/zuoyezi.png")} alt=""/>
                </span>
                <span>
                    <img className="imgH40" src={require("../img/hua.png")} alt=""/>
                </span>
                <span className="hao">好</span>
                /
                <span>课</span>
                /
                <span>推</span>
                /
                <span className="jian">荐</span>
                <span>
                    <img className="imgH40" src={require("../img/hua.png")} alt=""/>
                </span>
                <span>
                    <img className="imgH30" src={require("../img/youyezi.png")} alt=""/>
                </span>

            </h5>
            {/* <!-- 课程推荐 --> */}
            <div className="tuijianContent">
                <div className="course-box">
                    <div className="course-img">
                        
                    </div>
                    <div className="course-content">

                    </div>
                </div>
            </div>
        </div>
    </div>
        );
    }
}

export default Home;