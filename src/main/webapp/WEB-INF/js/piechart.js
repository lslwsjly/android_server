function init1(data){
	var chart = new iChart.Pie3D({
		render : 'infovis1',
		data: data,
		sub_option : {
			mini_label_threshold_angle : 40,//迷你label的阀值,单位:角度
			mini_label:{//迷你label配置项
				fontsize:20,
				fontweight:600,
				color : '#ffffff'
			},
			label : {
				background_color:null,
				sign:false,//设置禁用label的小图标
				padding:'0 4',
				border:{
					enable:false,
					color:'#666666'
				},
				fontsize:11,
				fontweight:600,
				color : '#4572a7'
			},
			border : {
				width : 2,
				color : '#ffffff'
			},
			listeners:{
				parseText:function(d, t){
					return d.get('name')+" "+d.get('value');//自定义label文本
				}
			} 
		},
		legend:{
			enable:false,
			padding:0,
			offsetx:20,
			offsety:5,
			color:'#3e576f',
			fontsize:10,//文本大小
			sign_size:10,//小图标大小
			line_height:18,//设置行高
			sign_space:10,//小图标与文本间距
			border:false,
			align:'left',
			background_color : null//透明背景
		},
		animation : true,//开启过渡动画
		animation_duration:800,//800ms完成动画 
		shadow : true,
		shadow_blur : 6,
		shadow_color : '#aaaaaa',
		shadow_offsetx : 0,
		shadow_offsety : 0,
		background_color:'#f1f1f1',
		showpercent:true,
		align:'right',//右对齐
		offsetx:-100,//设置向x轴负方向偏移位置60px
		offsety:80,//设置向x轴负方向偏移位置60px
		offset_angle:-90,//逆时针偏移120度
		width : 650,
		height : 400,
		radius:150
	});
	chart.draw();
}
