import styled from 'styled-components';

export const HomeWrapper = styled.div`
	overflow:hidden;//设置超出范围内容隐藏，不显示
	width:960px;
	margin:0 auto;//上下为0，左右居中
`

export const HomeLeft = styled.div`
	margin-left:15px;
	padding-top:30px;
	width:635px;
	float:left;
	.banner-img{
		width:100%;
		height:270px;
	}
`

export const HomeRight = styled.div`
	width:240px;
	float:right;
`

export const TopicWrapper = styled.div`
	overflow:hidden;//内部元素为float，父组件需要添加该属性
	padding:20px 0 10px 0;
	margin-left:-18px;
	border-bottom:1px solid #dcdcdc;
`

export const TopicItem = styled.div`
	float:left;
	height:32px;
	line-height:32px;
	margin-left:18px;
	padding-right:10px;
	background:#f7f7f7;
	font-size:14px;
	color:#000;
	border:1px solid #dcdcdc;
	border-radius:4px;
	margin-bottom:18px;
	.topic-pic{
		display:block;//块级元素才可以浮动
		float:left;//使图片不影响文字
		width:32px;
		height:32px;
		margin-right:10px;
	}
`

export const ListItem = styled.div`
	overflow:hidden;
	padding:20px 0;
	border-bottom:1px solid #dcdcdc;
	.pic{
		display:block;
		float:right;
		width:125px;
		height:100px;
		border-radius:10px;
	}
`

export const ListInfo = styled.div`
	width:500px;
	float:left;
	.title{
		line-height:27px;
		font-size:18px;
		font-weight:bold;
		color:#333;
	}
	.desc{
		line-height:24px;
		font-size:13px;
		color:#999;
	}
`