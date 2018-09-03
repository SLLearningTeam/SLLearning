<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	  <meta charset="utf-8">
	  <meta http-equiv="X-UA-Compatible" content="IE=edge">
	  <title>听说在线学习平台 | 用户分布表</title>
	  <!-- Tell the browser to be responsive to screen width -->
	  <meta name="viewport" content="width=device-width, initial-scale=1">
      <jsp:include page="../leftNavigation.jsp"></jsp:include>
	</head>
	<script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/echarts-all-3.js"></script>
	<body class="hold-transition sidebar-mini">
		<div class="content-wrapper">
			 <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
		    <div id="main1" style="height:400px"></div>
		     <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
		    <div id="main2" style="height:400px"></div>
		     <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
		    <div id="main3" style="height:400px"></div>
		     <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
		    <div id="main4" style="height:400px"></div>
		</div>
	</body>
	<script type="text/javascript">
		$(function(){
			//下载量
			var downloadRecordingTimes = [];
			var downloadRecordingTimeCounts = [];
			//签到天数变化
			var recentMarkTimes = [];
			var recentMarkTimesCounts = [];
			//签到人
			var userNames = [];
			var totalTimesForUser = [];
			$.ajax({
                type:'get',
                url:'${pageContext.request.contextPath}/user/admin/getUserChart',
                success:function(result){
                   	if(result.status === true){
                   		for(var i=0;i<result.info.downloadRate.length;i++){
                   			downloadRecordingTimes[i] =result.info.downloadRate[i].downloadRecordingTime; 
                   			downloadRecordingTimeCounts[i] = result.info.downloadRate[i].count; 
                   		}
                   		for(var i=0;i<result.info.signInTimeRate.length;i++){
                   			recentMarkTimes[i] =result.info.signInTimeRate[i].recentMarkTime; 
                   			recentMarkTimesCounts[i] = result.info.signInTimeRate[i].count; 
                   		}
                   		for(var i=0;i<result.info.signInTotal.length;i++){
                   			userNames[i] =result.info.signInTotal[i].userName; 
                   			totalTimesForUser[i] = result.info.signInTotal[i].totalTimes; 
                   		}
                   	// 基于准备好的dom，初始化echarts实例
                		var main1 = echarts.init(document.getElementById('main1'));
                		// 指定图表的配置项和数据
                		var option = {
                       title: {
                           text: '用户男女比例分布',
                           x: 'center',
                           y: 'top'
                       },
                       tooltip: {
                           show: true,
                           formatter: "{a}:{b}"
                       },
                       legend: {
                           orient: 'vertical',
                           x: 'right',
                           y: 'center',
                           data: [{value:6,name:"男"},{value:1,name:"女"}]
                       },
                       toolbox: {
                           show: true,
                           feature: {
                               mark: true,
                               dataView: { readOnly: false },
                               restore: true,
                               saveAsImage: true
                           }
                       },
                       calculable: true,
                       series: [
                           {
                               name: '性别',
                               type: 'pie',
                               data:  [{value:6,name:"男"},{value:1,name:"女"}]
                           }
                       ]
                   };
                		// 使用刚指定的配置项和数据显示图表。
                		main1.setOption(option);
                   		
	                   	// 基于准备好的dom，初始化echarts实例
	                		var main2 = echarts.init(document.getElementById('main2'));
	                		// 指定图表的配置项和数据
	                		var option = {
	                		    title: {
	                		        text: '下载量比例对比图',
	                		        x: 'center',
	                            y: 'top'
	                		    },
	                		    tooltip: {},
	                		    legend: {
	                		    		orient: 'vertical',
	                             x: 'right',
	                             y: 'center',
	                		        data:['下载量']
	                		    },
	                		    xAxis: {
	                		        data: downloadRecordingTimes
	                		    },
	                		    yAxis: {},
	                		    toolbox: {
	                                show: true,
	                                feature: {
	                                    mark: true,
	                                    dataView: { readOnly: false },
	                                    restore: true,
	                                    saveAsImage: true
	                                }
	                            },
	                         calculable: true,
	                		    series: [{
	                		        name: '下载量',
	                		        type: 'bar',
	                		        data: downloadRecordingTimeCounts,
	                		        itemStyle:{
	                                    normal:{
	                                        color:'#b9d5d5'
	                                    }
	                                },
	                		    }]
	                		};
	                		// 使用刚指定的配置项和数据显示图表。
	                		main2.setOption(option);
	                		
	                		// 基于准备好的dom，初始化echarts实例
	                		var main3 = echarts.init(document.getElementById('main3'));
	                		// 指定图表的配置项和数据
	                		var option = {
	                		    title: {
	                		        text: '每日签到对比图',
	                		        x: 'center',
	                            y: 'top'
	                		    },
	                		    tooltip: {},
	                		    legend: {
	                		    		orient: 'vertical',
	                                x: 'right',
	                                y: 'center',
	                		        data:['签到总数量']
	                		    },
	                		    xAxis: {
	                		        data: recentMarkTimes
	                		    },
	                		    yAxis: {},
	                		    toolbox: {
	                                show: true,
	                                feature: {
	                                    mark: true,
	                                    dataView: { readOnly: false },
	                                    restore: true,
	                                    saveAsImage: true
	                                }
	                            },
	                            calculable: true,
	                		    series: [{
	                		        name: '签到总数量',
	                		        type: 'line',
	                		        data: recentMarkTimesCounts,
	                		        itemStyle:{
	                                    normal:{
	                                        color:'#fbebd0'
	                                    }
	                                },
	                		    }]
	                		};
	                		// 使用刚指定的配置项和数据显示图表。
	                		main3.setOption(option);
	                		
	                		// 基于准备好的dom，初始化echarts实例
	                		var main4 = echarts.init(document.getElementById('main4'));
	                		// 指定图表的配置项和数据
	                		var option = {
	                		    title: {
	                		        text: '签到总次数比例对比图',
	                		        x: 'center',
	                                y: 'top'
	                		    },
	                		    tooltip: {},
	                		    legend: {
	                		    		orient: 'vertical',
	                                x: 'right',
	                                y: 'center',
	                		        data:['签到次数']
	                		    },
	                		    xAxis: {
	                		        data: userNames
	                		    },
	                		    yAxis: {},
	                		    toolbox: {
	                                show: true,
	                                feature: {
	                                    mark: true,
	                                    dataView: { readOnly: false },
	                                    restore: true,
	                                    saveAsImage: true
	                                }
	                            },
	                            calculable: true,
	                		    series: [{
	                		        name: '签到次数',
	                		        type: 'bar',
	                		        data: totalTimesForUser,
	                		        itemStyle:{
	                                    normal:{
	                                        color:'#d7bfa4'
	                                    }
	                                },
	                		    }]
	                		};
	                		// 使用刚指定的配置项和数据显示图表。
	                		main4.setOption(option);
                   	}
                   	else{
                   		alert("发现未知错误!");
                   	}
                }
            })

		})
    </script>
</html>