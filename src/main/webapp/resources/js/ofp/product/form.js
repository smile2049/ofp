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
        },cbm:{
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
        if (productId != undefined) {
            url = '/product/edit.html';
        } else {
            url = '/product/add.html';
        }
        webside.common.commit('productForm', url, '/product/listUI.html');
    }
});
}
