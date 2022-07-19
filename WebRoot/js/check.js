
//手机号检查
function check_phone(){
	
	var phone = $(".phone").val();
    var flag = false;
    var message = "";
    var myreg = /^(((13[0-9]{1})|(14[0-9]{1})|(17[0-9]{1})|(15[0-4]{1})|(15[5-9]{1})|(18[0-9]{1}))+\d{8})$/;             
    if(phone == ''){
        message = "手机号码不能为空！";
    }else if(phone.length !=11){
        message = "请输入有效的手机号码！";
        $(".phone").val('');
    }else if(!myreg.test(phone)){
        message = "请输入有效的手机号码！";
        $(".phone").val('');
    }else{
            flag = true;
    }
    if(!flag){
   alert_1(message);
    }
}
$('.phone').blur(check_phone);

//判断input是否为空
function required_1(a){
	alert(a);
	if(a.value==null||a.value==""){
		a.attr("placeholder","请填写此字段");
		a.attr("placeholder.color","red");
	}
}


//提交检查

function check_form(){
	
	if($('#company_name').val()==null||$('#company_name').val()==""){
		alert_1("请输入公司名称");
		return false;
	}
	if($('#contact_name').val()==null||$('#contact_name').val()==""){
		alert_1("请输入联系人");
		return false;
	}
	if($('#contact_phone').val()==null||$('#contact_phone').val()==""){
		alert_1("请输入手机号");
		return false;
	}
	var flag_yxqy=$('.yixuanquyu_1').length==0;
	var flag_yxly=$('.yixuandasha_1').length<5;
	if(flag_yxqy){
		
		alert_1("请选择服务区域");
		return false;
	}
	if(flag_yxly){
		alert_1("请选择至少5座意向管理楼宇");
		return false;
	}
	
	var lock = true
	layer.confirm('确认提交？', 
			
			{
			  btn: ['确定','取消'] //按钮
	
			}, 
			
			function(index){
				if(lock){
					lock=false;
					layer.load();
				 $.ajax({
					 url: 'questionnaire/save',
					 data:$('#form_1').serialize(),
					 type:'POST',
					 complete:function(){
						 layer.msg('感谢您参与平台调研，稍后会有工作人员联系您！', {icon: 1});
						 layer.load();
					 }
                    
                   });}else{
                	   alert_1("请勿重复提交");
                   }
				 setTimeout(function(){
					 location.reload();
					 document.body.scrollTop!==0?document.body.scrollTop=0:null;
				 },3000);
				
			},
			function(index){
				
				layer.msg('已取消！', {icon: 1});
				
			}
		);
	return false;
}

