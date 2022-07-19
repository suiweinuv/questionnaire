//enter搜索
$('#xzl_input').on('keypress', function(event) {
	
    if (event.keyCode === 13) {
    	 event.stopPropagation();
      $('#search_1').trigger('click');
      return false;
      
  }
    

});

//layer弹出层
function alert_1(content_1){
	layer.open({
		  title: '智办互联',
		  shadeClose: false, //点击遮罩关闭
		  content: content_1,
		});     
}
//layer弹出层- 不可以关闭
function alert_2(){
	layer.open({
		 content: '请使用非ie浏览器'
		 ,skin: 'msg'
		  ,end: function () {
		location.href=window.location.href;
		}
		}); 
}
//阻止ie打开网页
function alert_3(content){
	if (!!window.ActiveXObject || "ActiveXObject" in window) {//IE浏览器
 		alert(content);
 		setTimeout("location.reload()",2000);
        //alert_2();
    }
}
//鼠标进入div，弹出悬浮窗
function show(obj,id) {    

    var objDiv = $("#"+id+"");

    $(objDiv).css("display","block");

    $(objDiv).css("left", event.clientX);

    $(objDiv).css("top", event.clientY + 10);  

}
//鼠标进入div，隐藏悬浮窗
function hide(obj,id) {

    var objDiv = $("#"+id+"");

    $(objDiv).css("display", "none");

} 

