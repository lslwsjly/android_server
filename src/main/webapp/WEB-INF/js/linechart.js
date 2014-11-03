function init3(data, times,chartMax){
				
				var chart = new iChart.LineBasic2D({
					render : 'infovis3',
					data: data,
					align:'center',
					width : 1100,
					height : 600,
					background_color:'#FEFEFE',
					tip:{
						enable:true,
						shadow:true,
						move_duration:400,
						border:{
							 enable:true,
							 radius : 5,
							 width:2,
							 color:'#3f8695'
						},
						listeners:{
							 //tip:提示框对象、name:数据名称、value:数据值、text:当前文本、i:数据点的索引
							parseText:function(tip,name,value,text,i){
								return name+" "+times[i]+" :"+((value>10000)?(Math.floor(value/10000) + "万"):value);
							}
						}
					},
					
					legend : {
						enable : true,
						row:1,//设置在一行上显示，与column配合使用
						column : 'max',
						valign:'top',
						sign:'bar',
						background_color:null,//设置透明背景
						offsetx:0,//设置x轴偏移，满足位置需要
						border : true
					},
					crosshair:{
						enable:true,
						line_color:'#62bce9'//十字线的颜色
					},
					sub_option : {
						label:false,
						point_size:10
					},
					coordinate:{
						width:900,
						height:500,
						axis:{
							color:'#dcdcdc',
							width:1
						},
						scale:[{
							 position:'left',	
							 start_scale:0,
							 end_scale:chartMax,
							 scale_space:Math.floor(chartMax/ 20),
							 scale_size:2,
							 scale_color:'#9f9f9f'
						}]
					}
				});
			
			//开始画图
			chart.draw();
		}