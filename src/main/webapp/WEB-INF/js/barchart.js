function init2(data,maxValue) {
	
			var chart = new iChart.Column2D({
				render : 'infovis2',
				data : data,
				width : 1100,
				height : 600,
				label : {
					fontsize:10,
					color : '#666666'
				},
				animation : true,//开启过渡动画
				animation_duration:800,//800ms完成动画
				shadow : true,
				shadow_blur : 2,
				shadow_color : '#aaaaaa',
				shadow_offsetx : 1,
				shadow_offsety : 0,
				column_width : 62,
				sub_option : {
					listeners : {
						parseText : function(r, t) {
							if(t >= 10000) {
								return Math.floor(t/10000) + "万"
							}
							return t ;
						}
					},
					label : {
						fontsize:11,
						fontweight:600,
						color : '#4572a7'
					},
					border : {
						width : 2,
						color : '#ffffff'
					}
				},
				coordinate : {
					background_color : null,
					grid_color : '#c0c0c0',
					width : 680,
					axis : {
						color : '#c0d0e0',
						width : [0, 0, 1, 0]
					},
					
					scale : [{
						position : 'left',
						start_scale : 0,
						end_scale : 60,
						scale_space : Math.floor(maxValue / 20),
						scale_enable : true,
						label : {
							fontsize:11,
							color : '#666666'
						}
						
					}]
				}
			});
			
			chart.draw();
		}