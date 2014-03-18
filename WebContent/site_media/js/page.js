$(document).ready(function(){
	
	var stat;
	
	//初始化自来水公司信息
	com();


//行政区信息
$("#region").click(area); 
//自来水公司信息
$("#company").click(com);

//左右箭头滑动切换 
$("#w_con").click(function(){
	
	
	if($("#w_con").hasClass("w_con1")){
		$("#w_con").removeClass("w_con1");
		$("#w_con").addClass("w_con2");
		$(".w_content").stop(true,false).animate({"left":-500},500);
	}else{
		$("#w_con").removeClass("w_con2");
		$("#w_con").addClass("w_con1");
		$(".w_content").stop(true,false).animate({"left":0},500);
	}
});


//地图图标鼠标移出事件
$("#mapicon img").live("mouseout",function(){
	//鼠标移出时删除div
	$(".mapdiv").remove();
});

//地图图标鼠标放上去事件
$("#mapicon img").live("mouseover",function(){
	var id=$(this).attr("id");
	
	var left=$(this).offset().left;
	var top=$(this).offset().top;
	
	$.ajax({
		url:"http://www.wetouching.com:8000/hardsocket/getOneSpotInfo?spot_id="+id+"",
		type:"GET",
		dataType:"jsonp",
		jsonp:"jsonpcallback",
		success:function(data){
			var json=eval(data);
			var mapdiv=" <div class='mapdiv' style='top:"+(top-65)+"px;left:"+left+"px;' id='mapdiv'><table border='1' cellpadding='0' cellspacing='0'>"
			+"<tr class='a'><td>PH</td><td>电导率</td><td>溶解氧</td><td>余氯</td><td>浊度</td><td>水温</td></tr>"
			+"<tr class='b'><td>"+json["spot_ph"]+"</td><td>"+json["spot_conductivity"]+"</td><td>"+json["spot_DO"]+"</td><td>"+json["spot_rc"]+"</td><td>"+json["spot_turbidity"]+"</td><td>"+json["spot_temp"]+"</td></tr>"
			+"</table></div>";
			$("body").append(mapdiv);
			//判断检测值不合格标识出来
			if(json["ph_status"]==0){
				$(".a td:eq(0)").attr("style", "border:1px solid red;color:red");
				$(".b td:eq(0)").attr("style", "border:1px solid red;color:red");
			}else if(json["spot_conductivity"]==0){
				$(".a td:eq(1)").attr("style", "border:1px solid red;color:red");
				$(".b td:eq(1)").attr("style", "border:1px solid red;color:red");
			}else if(json["spot_DO"]==0){
				$(".a td:eq(2)").attr("style", "border:1px solid red;color:red");
				$(".b td:eq(2)").attr("style", "border:1px solid red;color:red");
			}else if(json["spot_rc"]==0){
				$(".a td:eq(3)").attr("style", "border:1px solid red;color:red");
				$(".b td:eq(3)").attr("style", "border:1px solid red;color:red");
			}else if(json["spot_turbidity"]==0){
				$(".a td:eq(4)").attr("style", "border:1px solid red;color:red");
				$(".b td:eq(4)").attr("style", "border:1px solid red;color:red");
			}else if(json["spot_temp"]==0){
				$(".a td:eq(5)").attr("style", "border:1px solid red;color:red");
				$(".b td:eq(5)").attr("style", "border:1px solid red;color:red");
			}
		}
	});
});

//地图图标鼠标点击事件
$("#mapicon img").live("click",function(){
	var id=$(this).attr("id");

	
	
	location.href="report.html?id="+id+"";
	
});

//点击公司获取公司分公司的信息

$("#Map area").live("click",function(){
	
	var id=$(this).attr("id");
	if(stat==1){
		//1说明是公司
		$.ajax({
			url:"http://www.wetouching.com:8000/hardsocket/getOneCorpInfo/?corp_id="+id+"",
			type:"GET",
//	 		 async: false, 
			 contentType:"application/x-www-form-urlencoded;charset=UTF-8", 
//	 		data:{city_id:"310000"},
			dataType:"jsonp",
			jsonp:"jsonpcallback",
			
			success:function(data){
				var json=eval(data);

				$(".w_conTab").empty();
				var con="<table cellpadding='0' cellspacing='0' id='conTab'><caption>"+json['corp_info'][0]['corp_name']+"</caption><thead><tr><td></td><td>PH值</td><td>电导率</td><td>溶解氧</td><td>余氯</td><td>浊度</td><td>水温</td></tr></thead>";
				for ( var y = 0; y < json['corp_info'].length; y++) {
					con+="<tr><td>"+json['corp_info'][y]['corpChild_name']+"</td><td>"+json['corp_info'][y]['corp_ph']+"</td><td>"+json['corp_info'][y]['corp_conductivity']+"</td><td>"+json['corp_info'][y]['corp_DO']+"</td><td>"+json['corp_info'][y]['corp_rc']+"</td><td>"+json['corp_info'][y]['corp_turbidity']+"</td><td>"+json['corp_info'][y]['corp_temp']+"</td></tr>";
				}
				con+="</table>";
				$(".w_conTab").append(con);
				
				/*设置表格样式(偶数奇数切换颜色)*/
				$("#conTab").find("tr").css("background-color", "#f5f7ea");
				$("#conTab").find("tr:odd").css("background-color", "#eee0a7");
				
				
				//检测点
				$("#mapicon").empty();
				for (var x = 0;  x< json['spot_info'].length; x++) {
					var st=json['spot_info'][x]['spot_status'];
					if(st==1){
						var img="<img src='../../site_media/img/icongreen.png' id='2"+json['spot_info'][x]['spot_id']+"' style='width:40px;height:45px;'/>";
						$("#mapicon").append(img);
						$("#2"+json['spot_info'][x]['spot_id']).css("top",""+json['spot_info'][x]['y_pos']+"px"); 
					 	$("#2"+json['spot_info'][x]['spot_id']).css("left",""+json['spot_info'][x]['x_pos']+"px");
					}else if(st==0){
						var img="<img src='../../site_media/img/iconred.png' id='2"+json['spot_info'][x]['spot_id']+"'/>";
						$("#mapicon").append(img);
						$("#2"+json['spot_info'][x]['spot_id']).css("top",""+json['spot_info'][x]['y_pos']+"px"); 
					 	$("#2"+json['spot_info'][x]['spot_id']).css("left",""+json['spot_info'][x]['x_pos']+"px");
					}
				}
			},
			error:function(XMLHttpRequest, textStatus, errorThrown){
	            alert(XMLHttpRequest.status);
	            alert(XMLHttpRequest.readyState);
	            alert(textStatus);
			}
		
		});
		
		
	}else if(stat==2){
		
	var id=$(this).attr("id");
		//2说明是行政区
			$.ajax({
			url:"http://www.wetouching.com:8000/hardsocket/getOneAreaInfo/?area_id="+id+"",
			type:"GET",
//	 		 async: false, 
			 contentType:"application/x-www-form-urlencoded;charset=UTF-8", 
//	 		data:{city_id:"310000"},
			dataType:"jsonp",
			jsonp:"jsonpcallback",
			
			success:function(data){
				var json=eval(data);

				$(".w_conTab").empty();
				var con="<table cellpadding='0' cellspacing='0' id='conTab'><caption>"+json['area_info'][0]['area_anme']+"</caption><thead><tr><td></td><td>PH值</td><td>电导率</td><td>溶解氧</td><td>余氯</td><td>浊度</td><td>水温</td></tr></thead>";
				for ( var y = 0; y < json['area_info'].length; y++) {
					con+="<tr><td>"+json['area_info'][y]['areaChild_name']+"</td><td>"+json['area_info'][y]['area_ph']+"</td><td>"+json['area_info'][y]['area_conductivity']+"</td><td>"+json['area_info'][y]['area_DO']+"</td><td>"+json['area_info'][y]['area_rc']+"</td><td>"+json['area_info'][y]['area_turbidity']+"</td><td>"+json['area_info'][y]['area_temp']+"</td></tr>";
				}
				con+="</table>";
				$(".w_conTab").append(con);
				
				/*设置表格样式(偶数奇数切换颜色)*/
				$("#conTab").find("tr").css("background-color", "#f5f7ea");
				$("#conTab").find("tr:odd").css("background-color", "#eee0a7");
				
				
				//检测点
				$("#mapicon").empty();
				for ( var x = 0;  x< json['spot_info'].length; x++) {
					var st=json['spot_info'][x]['spot_status'];
					if(st==1){
						var img="<img src='../../site_media/img/icongreen.png' id='"+json['spot_info'][x]['spot_id']+"' style='width:40px;height:45px;'/>";
						$("#mapicon").append(img);
						$("#"+json['spot_info'][x]['spot_id']).css("top",""+json['spot_info'][x]['y_pos']+"px"); 
					 	$("#"+json['spot_info'][x]['spot_id']).css("left",""+json['spot_info'][x]['x_pos']+"px");
					}else if(st==0){
						var img="<img src='../../site_media/img/iconred.png' id='"+json['spot_info'][x]['spot_id']+"'/>";
						$("#mapicon").append(img);
						$("#"+json['spot_info'][x]['spot_id']).css("top",""+json['spot_info'][x]['y_pos']+"px"); 
					 	$("#"+json['spot_info'][x]['spot_id']).css("left",""+json['spot_info'][x]['x_pos']+"px");
					}
				}
			},
			error:function(XMLHttpRequest, textStatus, errorThrown){
	            alert(XMLHttpRequest.status);
	            alert(XMLHttpRequest.readyState);
	            alert(textStatus);
			}
		
		
			});
		
		
	}
	
		
	
});


function com(){
	//公司信息(首页)
	stat=1;
	
	$(".w_conTop").empty();
	$(".w_conTop").append("<img src='../../site_media/img/map1.jpg' width='950' height='800' border='0' usemap='#Map' style='z-index: 0;'/>"
		+"<map name='Map' id='Map'><area shape='poly' coords='239,508,430,507,431,279,236,279' href='#' id='1' /> "
		+"<area shape='poly' coords='455,542,700,545,701,749,456,749' href='#' id='2' /><area shape='poly' coords='508,426,739,427,738,219,504,213' href='#' id='3' /> </map> "
		+"<div class='mapicon' id='mapicon'> </div>");
	
	
	
	$.ajax({
		url:"http://www.wetouching.com:8000/hardsocket/getAllCorpAvgInfo/?city_id=310000",
		type:"GET",
// 		 async: false, 
		 contentType:"application/x-www-form-urlencoded;charset=UTF-8", 
// 		data:{city_id:"310000"},
		dataType:"jsonp",
		jsonp:"jsonpcallback",
		
		success:function(data){
			var json=eval(data);

			$(".w_conTab").empty();
			var con="<table cellpadding='0' cellspacing='0' id='conTab'><caption>自来水公司检测总览</caption><thead><tr><td></td><td>PH值</td><td>电导率</td><td>溶解氧</td><td>余氯</td><td>浊度</td><td>水温</td></tr></thead>";
			for ( var y = 0; y < json['corp_info'].length; y++) {
				//style='"+(json['corp_info'][y]['corp_ph']>=5&&json['corp_info'][y]['corp_ph']<=9?'color:red':'color:black')+"'
				
				if((json['corp_info'][y]['corp_ph'])>=5&&(json['corp_info'][y]['corp_ph'])<=9){
					con+="<tr><td>"+json['corp_info'][y]['corp_name']+"</td><td>"+json['corp_info'][y]['corp_ph']+"</td><td>"+json['corp_info'][y]['corp_conductivity']+"</td><td>"+json['corp_info'][y]['corp_DO']+"</td><td>"+json['corp_info'][y]['corp_rc']+"</td><td>"+json['corp_info'][y]['corp_turbidity']+"</td><td>"+json['corp_info'][y]['corp_temp']+"</td></tr>";
				}else{
					con+="<tr><td>"+json['corp_info'][y]['corp_name']+"</td><td style='color:red'>"+json['corp_info'][y]['corp_ph']+"</td><td>"+json['corp_info'][y]['corp_conductivity']+"</td><td>"+json['corp_info'][y]['corp_DO']+"</td><td>"+json['corp_info'][y]['corp_rc']+"</td><td>"+json['corp_info'][y]['corp_turbidity']+"</td><td>"+json['corp_info'][y]['corp_temp']+"</td></tr>";
				}
			}
			con+="</table>";
			$(".w_conTab").append(con);
			
			/*设置表格样式(偶数奇数切换颜色)*/
			$("#conTab").find("tr").css("background-color", "#f5f7ea");
			$("#conTab").find("tr:odd").css("background-color", "#eee0a7");
			
			
			//检测点
			$("#mapicon").empty();
			for ( var x = 0;  x< json['spot_info'].length; x++) {
				var st=json['spot_info'][x]['spot_status'];
				if(st==1){
					var img="<img src='../../site_media/img/icongreen.png' id='0"+json['spot_info'][x]['spot_id']+"'/>";
					$("#mapicon").append(img);
					$("#0"+json['spot_info'][x]['spot_id']).css("top",""+json['spot_info'][x]['y_pos']+"px"); 
				 	$("#0"+json['spot_info'][x]['spot_id']).css("left",""+json['spot_info'][x]['x_pos']+"px");
				}else if(st==0){
					var img="<img src='../../site_media/img/iconred.png' id='0"+json['spot_info'][x]['spot_id']+"'/>";
					$("#mapicon").append(img);
					$("#0"+json['spot_info'][x]['spot_id']).css("top",""+json['spot_info'][x]['y_pos']+"px"); 
				 	$("#0"+json['spot_info'][x]['spot_id']).css("left",""+json['spot_info'][x]['x_pos']+"px");
				}
			}
		},
		error:function(XMLHttpRequest, textStatus, errorThrown){
            alert(XMLHttpRequest.status);
            alert(XMLHttpRequest.readyState);
            alert(textStatus);
		}
	});
	
};

function area(){
	//行政区信息(首页)
stat=2;
	
	$(".w_conTop").empty();
	$(".w_conTop").append("<img src='../../site_media/img/map2.jpg' width='950' height='800' border='0' usemap='#Map' style='z-index: 0;'/>"
		+"<map name='Map' id='Map'><area shape='poly' coords='271,311,261,281,273,251,291,235,312,222,347,210,395,205,437,211,473,226,498,247,512,279,510,303,490,326,453,344,420,353,370,354,324,344' href='#' />"
	   +"<area shape='poly' coords='334,434,314,404,333,380,365,365,405,357,444,357,486,365,514,375,535,398,530,419,507,437,469,452,425,454,371,449' href='#' />" 
	   +" <area shape='poly' coords='590,405,612,427,636,437,661,445,691,446,724,436,751,426,769,408,786,387,786,355,770,331,753,314,722,302,701,296,669,298,644,300,613,312,592,330,580,348,575,371' href='#' /> "
		+"</map> <div class='mapicon' id='mapicon'> </div>");
	
	
	$.ajax({
		url:"http://www.wetouching.com:8000/hardsocket/getAreaAvgInfo?city_id=310000",
		type:"GET",
// 		 async: false, 
// 		 contenttype :"application/x-www-form-urlencoded;charset=utf-8", 
// 		data:{city_id:"310000"},
		dataType:"jsonp",
		jsonp:"jsonpcallback",
		
		success:function(data){
			var json=eval(data);

			$(".w_conTab").empty();
			var con="<table cellpadding='0' cellspacing='0' id='conTab'><caption>行政区检测总览</caption><thead><tr><td></td><td>PH值</td><td>电导率</td><td>溶解氧</td><td>余氯</td><td>浊度</td><td>水温</td></tr></thead>";
			for ( var y = 0; y < json['area_info'].length; y++) {
				con+="<tr><td>"+json['area_info'][y]['areaName']+"</td><td>"+json['area_info'][y]['area_ph']+"</td><td>"+json['area_info'][y]['area_conductivity']+"</td><td>"+json['area_info'][y]['area_DO']+"</td><td>"+json['area_info'][y]['area_rc']+"</td><td>"+json['area_info'][y]['area_turbidity']+"</td><td>"+json['area_info'][y]['area_temp']+"</td></tr>";
			}
			con+="</table>";
			$(".w_conTab").append(con);
			
			/*设置表格样式(偶数奇数切换颜色)*/
			$("#conTab").find("tr").css("background-color", "#f5f7ea");
			$("#conTab").find("tr:odd").css("background-color", "#eee0a7");
			
			
			//检测点
			$("#mapicon").empty();
			for ( var x = 0;  x< json['spot_info'].length; x++) {
				var st=json['spot_info'][x]['spot_status'];
				if(st==1){
					var img="<img src='../../site_media/img/icongreen.png' id='"+json['spot_info'][x]['spot_id']+"'/>";
					$("#mapicon").append(img);
					
					$("#"+json['spot_info'][x]['spot_id']).css("top",""+json['spot_info'][x]['y_pos']+"px"); 
				 	$("#"+json['spot_info'][x]['spot_id']).css("left",""+json['spot_info'][x]['x_pos']+"px");
				}else if(st==0){
					var img="<img src='../../site_media/img/iconred.png' id='"+json['spot_info'][x]['spot_id']+"'/>";
					$("#mapicon").append(img);
					$("#"+json['spot_info'][x]['spot_id']).css("top",""+json['spot_info'][x]['y_pos']+"px"); 
				 	$("#"+json['spot_info'][x]['spot_id']).css("left",""+json['spot_info'][x]['x_pos']+"px");
				}
			}
		},
		error:function(XMLHttpRequest, textStatus, errorThrown){
            alert(XMLHttpRequest.status);
            alert(XMLHttpRequest.readyState);
            alert(textStatus);
		}
	});
}


});