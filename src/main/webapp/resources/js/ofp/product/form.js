//编辑
function editProductLink(nav,id){
	 //当前页码
	 var nowPage = grid.pager.nowPage;
	// 获取每页显示的记录数(即: select框中的10,20,30)
	var pageSize = grid.pager.pageSize;
	// 获取排序字段
	var columnId = grid.sortParameter.columnId;
	// 获取排序方式 [0-不排序，1-正序，2-倒序]
	var sortType = grid.sortParameter.sortType;
	webside.common.loadPage(nav + '?id=' +id + "&page="
				+ nowPage + "&rows=" + pageSize + "&sidx=" + columnId
				+ "&sord=" + sortType);
}
//复制商品
$('#btnCopy').click(function(){
	 layer.confirm('确认复制该条商品信息吗？', {
         icon : 3,
         title : '复制提示'
     }, function(index, layero) {
    	 jQuery.ajax({  
    	        type:"post",  
    	        url:sys.rootPath + '/product/copyProduct.html',  
    	        dataType:"json",  
    	        data:{id:$('#productId').val()},
    	        success: function (result) {  
    	    		if(result.success==true){
    	    			layer.close(index);
    	    			editProductLink('/product/editUI.html',result.data);
    	    		}else{
    	    			layer.msg('复制数据失败', {icon : 0});
    	    		}
    	        }
    		});
     })
});
	
//商品大类一级选中后重新绑定二级目录
$('#productTypefather').change(function(){
	jQuery.ajax({  
        type:"post",  
        url:sys.rootPath + '/product/getProductTypeChildrenList.html',  
        dataType:"json",  
        data:{productTypeId:$(this).children('option:selected').val()},
        success: function (result) {  
        	 $("#productType").empty();//清空
        	for(var i=0; i<result.data.length; i++){  //重新绑定
                $("#productType").append($("<option value=\""+result.data[i].productTypeId+"\">"+result.data[i].cnName+"</option>"));  
            }  
        }
	});
	
});
if ($('#hdMapUrl').val() != undefined) {//没有上传图片不显示
	$('#downloadfile').attr("href",sys.rootPath+"/product/downloadfile.html?productId="+$('#productId').val()+ '&baseUri='
			+ $.url().attr('path'));
}


//反现二级目录
if($('#productTypeId').val()!=undefined){
	$('#productType').val($('#productTypeId').val());
}
//提交
function validateForm(){
$('#productForm').validate({
    errorElement : 'div',
    errorClass : 'help-block',
 /*   focusInvalid : false,
    ignore : "",*/
    rules : {
    	productCode : {
            required : true
        },factoryCode:{
        	  required : true
        },unit:{
        	  required : true
        },usdPrice:{
        	 required : true,
        	 number:true
        },cnName:{
        	required : true,
        	maxlength:100
        },vatRate:{
        	required : true,
        	number:true
        },buyPrice:{
        	required : true,
        	number:true
        },weight:{
        	required : true,
        	number:true
        },volume:{
        	required : true,
        	number:true
        },top:{
        	required : true,
        	number:true
        },bottom:{
        	required : true,
        	number:true
        },height:{
        	required : true,
        	number:true
        },length:{
        	required : true,
        	number:true
        },width:{
        	required : true,
        	number:true
        },packHeight:{
        	required : true,
        	number:true
        },gw:{
        	required : true,
        	number:true
        },packingRate:{
        	required : true,
        	number:true
        },taxRebateRate:{
        	required : true,
        	number:true
        },hdMapUrl:{
        	required : true
        }
    },
    messages : {
    		hdMapUrl : {
    			required : "请上传附件",
    		}
    	/*productCode : {
            required : "请填写商品编码",
        },factoryCode:{
        	 required : "请填写工厂编码",
        },unit:{
        	 required : "请填写单位",
        },usdPrice:{
        	 required : "请填写美金单价",
        },cnName:{
        	 required : "请填写中文名称",
        },vatRate:{
        	 required : "请填写增值税率",
        },buyPrice:{
        	 required : "请填写收购单价",
        },weight:{
        	 required : "请填写重量",
        },volume:{
        	 required : "请填写容量",
        }*/
        
    },
    highlight : function(e) {
        $(e).removeClass('has-info').addClass('has-error');
    },
    success : function(e) {
        $(e).removeClass('has-error').addClass('has-success');
        $(e).remove();
    },
    errorPlacement : function(error, element) {
        if (element.is('input[type=checkbox]') || element.is('input[type=radio]')) {
            var controls = element.closest('div[class*="col-"]');
            if (controls.find(':checkbox,:radio').length > 1)
                controls.append(error);
            else
                error.insertAfter(element.nextAll('.lbl:eq(0)').eq(0));
        } else if (element.is('.select2')) {
            error.insertAfter(element.siblings('[class*="select2-container"]:eq(0)'));
        } else if (element.is('.chosen-select')) {
            error.insertAfter(element.siblings('[class*="chosen-container"]:eq(0)'));
        } else
            error.insertAfter(element.parent());
    },
    submitHandler : function(form) {
        var productId = $("#productId").val();
        var url = "";
        debugger;
        var fileNames=$('#attachmentNames').val().split(',');  
        var fileIds="";
       
        if(fileNames!=undefined&&fileNames.length>0){
        	 for(var i=0;i<fileNames.length;i++){
        		 fileIds+=fileNames[i]+",";
             }
        }
        if (productId != undefined) {
            url = '/product/edit.html?fileNames='+encodeURI(fileIds);
        } else {
            url = '/product/add.html?fileNames='+encodeURI(fileIds);
        }
        webside.common.commit('productForm', url, '/product/listUI.html');
    }
});
}
