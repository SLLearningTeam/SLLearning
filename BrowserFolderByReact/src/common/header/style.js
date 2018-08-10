import styled from 'styled-components';
import logoPic from '../../statics/logo.png';//webpack打包时会将图片打包成logopic

//创建HeaderWrapper组件（其实就是div），内部写div相关样式
export const HeaderWrapper = styled.div`
	position:relative;
	height:56px;
	border-bottom:1px solid #f0f0f0;
`

export const Logo = styled.a.attrs({
	href:'/'
})`
	position:absolute;
	top:0;
	left:0;
	display:block;
	width:100px;
	height:56px;
	background:url(${logoPic});//多行文本嵌变量
	background-size:contain;//使背景图片完全覆盖
`

export const Nav = styled.div`
	width:960px;
	padding-right:70px;
	box-sizing:border-box;
	margin:0 auto;
	height:100%; 
`

export const NavItem=styled.div`
	line-height:56px;
	padding:0 15px;
	font-size:17px;
	color:#333;
	//&.left表示组件的className是left则具备下述css
	&.left{
		float:left;
	}
	&.right{
		float:right;
		color:#969696;
	}
	&.active{
		color:#ea6f5a;	
	}
`

export const SearchWrapper = styled.div`
	position:relative;
	float:left;
	.zoom{
		position:absolute;
		right:5px;
		bottom:5px;
		width:30px;
		line-height:30px;
		border-radius:15px;
		text-align:center;
		&.focused{
			background:#777;
			color:#fff;
		}
	}
`

export const NavSearch=styled.input.attrs({
	placeholder:'搜索'
})`
	width:160px;
	height:38px;
	padding:0 35px 0 20px;
	margin-top:9px;
	margin-left:20px;
	box-sizing:border-box;
	border:none；
	outline:none;
	border-radius:19px;
	background:#eee;
	font-size:14px;
	color:#666;
	&::placeholder{//表示组件下的placeholder进行css设置
		color:#999;
	}
	&.focused{
		width:240px;
	}
	&.slide-enter {
		transition:all .5s ease-out;
	}
	&.slide-enter-active {
		width:240px;
	}
	&.slide-exit {
		transition:all .5s ease-out;
	}
	&.slide-exit-active {
		width:160px;
	}
`

export const SearchInfo=styled.div`
	position:absolute;
	left:0;
	top:56px;
	width:240px;
	padding:0 20px;
	box-shadow:0 0 8px rgba(0,0,0,.2);
`

export const SearchInfoTitle=styled.div`
	margin-top:20px;
	margin-botton:15px;
	line-height:20px;
	font-size:14px;
	color:#969696;
`

export const SearchInfoSwitch=styled.span`
	float:right;
	font-size:13px;
	cursor:pointer;
	.spin{
		display:block;
		float:left;
		font-size:12px;
		margin-right:2px;
		transition:all .2s ease-in;
		transform-origin:center center;//以自己的中心为旋转中心
	}
`

export const SearchInfoList=styled.div`
	overflow:hidden;
	padding-top:10px;
`

export const SearchInfoItem=styled.a`
	display:block;
	float:left;
	margin-right:10px;
	margin-bottom:10px;
	font-size:12px;
	padding:0 5px;
	line-height:20px;
	border:1px solid #ddd;
	color:#787878;
	border-radius:3px;
`

export const Addition=styled.div`
	position:absolute;
	right:0;
	top:0;
	height:56px;
`

export const Button=styled.button`
	float:right;
	line-height:38px;
	border-radius:19px;
	margin-top:9px;
	border:1px solid #ec6149;
	margin-right:20px;
	padding:0 20px;
	font-size:14px;
	&.reg{
		color:#ec6149;
	}
	&.writing{
		color:#fff;
		background:#ec6149;
	}
`
