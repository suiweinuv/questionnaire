
var _data;
var jiedao;
//服务区域联动
$('#qu').on('change',function(){
	var value = $(this).val();
	$.ajax({
		url: 'questionnaire/jiedao',
		method: 'POST',
		type:'json',
		data: {
			qu: value
		},
		success: function (data) {

			_data=JSON.parse(data);
			jiedao='<option value="-1">--请选择--</option>';
			for (var i = 0; i < _data.length; i++) {
				jiedao+='<option value="'+ _data[i].id +'">'+ _data[i].name +'</option>'
			}
			$('#jiedao').html(jiedao)
		},
	})
})
//意向楼宇联动
$('#qu_1').on('change',function(){
	var value = $(this).val();
	$.ajax({
		url: 'questionnaire/jiedao',
		method: 'POST',
		type:'json',
		data: {
			qu: value
		},
		success: function (data) {

			_data=JSON.parse(data);
			jiedao='<option value="-1">--请选择--</option>';
			for (var i = 0; i < _data.length; i++) {
				jiedao+='<option value="'+ _data[i].id +'">'+ _data[i].name +'</option>'
			}
			$('#jiedao_1').html(jiedao)
		},
	})
})

//已选区域
		var num=0;
		var id_num_0=0;
		var id_num_1=1;
		var yxqy_arr = new Array();
 		//添加    
		$("#search").click(function(){
		    if(num>4){
		        alert_1('最多可选5个');
		        return false;
		        
		    }
		    
		    var val_value = $("#jiedao option:selected").val();
		    var val_text = $("#jiedao option:selected").text();
		    if(val_value==-1){
		    	alert_1("请选择区域");
		    	return false;
		    	
		    }
		  if($.inArray(val_text,yxqy_arr)!=-1){
			 
			  alert_1("请勿重复添加")
			  return false;
		  }  
		    $("#blank_1").before("<input type='button' id ='"+id_num_0+"' name='service_area'  class='yixuanquyu_1' value='"+val_text+"'>"
		    		+"<input id ='"+id_num_1+"' type='hidden' name='service_area'  class='yixuanquyu_1' value='"+val_value+"'>");
		    yxqy_arr.push(val_text);
		    
		    id_num_0=id_num_0+2;
		    id_num_1=id_num_1+2;
		    num=num+1;
		});
		 //已选区域单击删除
		 
		$('.yixuanquyu').on("click", ".yixuanquyu_1", function(){
			
			yxqy_arr.splice($.inArray($(this).val(),yxqy_arr),1);
			var id_0=$(this).attr('id');
			id_0=parseInt(id_0)+1;
			
			$("#"+id_0+"").remove();
		     $(this).remove();
		     num=num-1;
		})
		
		//搜索出来的楼盘点击添加
		var id_num_1000=1000;
		var id_num_1001=1001
		var yxlp_arr = new Array();
		
		
		
		$('.jieguo').on("click", ".jieguo_1", function(){
			if($.inArray($(this).text(),yxlp_arr)!=-1){
				 
				  alert_1("请勿重复添加")
				  return false;
			  }  
			 $("#blank_2").before("<input type='button' name='intention_xzl' id='"+id_num_1000+"' class='jieguo_1' value='"+$(this).text()+"'>"
					 +"<input type='hidden' name='intention_xzl' id='"+id_num_1001+"' class='jieguo_1 yixuandasha_1' value='"+$(this).val()+"'>");
			
			 yxlp_arr.push($(this).text());
			 id_num_1000=id_num_1000+2;
			 id_num_1001=id_num_1001+2;
			$(this).remove();
			 
			
			 
			
		})
		//已选楼盘单击删除
		$('.yixuandasha').on("click", ".jieguo_1", function(){
			
			yxlp_arr.splice($.inArray($(this).val(),yxlp_arr),1);
			var id_0=$(this).attr('id')
			id_0=parseInt(id_0)+1;
			$("#"+id_0+"").remove();
		     $(this).remove();
			
		})

//搜索楼盘
var ssjg;
$('#search_1').on('click',function(){
	var jiedao_value = $('#jiedao_1').val();
	var xzl_input = $('#xzl_input').val();
	if(jiedao_value==-1&&xzl_input.length==0){
		alert_1('请输入楼盘名称')
	}else {
		$.ajax({
			url: 'questionnaire/xzl',
			method: 'POST',
			type:'json',
			data: {
				jiedao_value: jiedao_value,xzl_input:xzl_input
				
			},
			success: function (data) {

				_data=JSON.parse(data);
				if(_data.length==0){
					alert_1('无搜索结果');
				}
				ssjg='<div style="text-align: center;"><h3>搜索结果</h3><span class="blank_2">点击可添加</span></div>';
				for (var i = 0; i < _data.length; i++) {
					ssjg+='<button class="jieguo_1" value="'+ _data[i].id +'">'+ _data[i].name +'</button>'
				}
				  var divshow = $("#jieguo");
	              divshow.text("");// 清空数据
	              divshow.append(ssjg); 
			},
		})
	}
})

