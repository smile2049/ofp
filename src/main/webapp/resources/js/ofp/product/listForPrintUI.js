$(document).ready(function(){
	var url=sys.rootPath+"/product/getAllProducts.html";
	oTable = $('#example').dataTable( {
	    			  	"sScrollY": "200px",
	    			    "sScrollX": "100%", //横向滚动条       
	    			    "bScrollCollapse": true,
	    			    "bProcessing": true, // 显示是否加载
	    			    "bStateSave": true,
	    			    "bSort": false,
	    			    "bServerSide": false,
	    			    "sAjaxSource": url , //后台地址
	    			    "bAutoWidth": true,
	    			    "bPaginate": false, //翻页功能  
	    			    "iDisplayLength":5,
	    			    "iDisplayStart":0,
	    			    "aLengthMenu": [20,50,100],
	    				"fnServerData": function (sSource, aoData, fnCallback, oSettings) {
	    			        oSettings.jqXHR = $.ajax({
	    			            "dataType": 'json',
	    			            "contentType": "application/json; charset=utf-8",
	    			            "url": sSource,
	    			            "success": function (modellist) {
	    			                fnCallback(modellist); //string to json
	    			                $('#example tbody').on( 'click', 'tr', function () {
	    			                	//多选
	    			                	  if ( $(this).hasClass('selected') ) {
	      			                        $(this).removeClass('selected');
	      			                    }
	      			                    else {
	      			                    	  $(this).addClass('selected'); 
	      			                    }
	    			                	
	    			                } );
	    			            },
	    			            "error": function (resp) {
	    			                alert("错误代码：" + resp.status + "," + "错误信息：" + resp.readyState);
	    			            }
	    			        });
	    			    },
	    		        "aoColumns": [
	    							{ "mDataProp": "productId" },
	    							{ "mDataProp": "productCode" },
	    							{ "mDataProp": "cnName" },
	    							{ "mDataProp": "factoryCode" }
	    		                ]
	    		} );
})


$('#btnPrint').click(function(){
	var url = "/product/exportQrCodeBatch.html";
	var MliSelected = oTable.$('tr.selected');
	if(MliSelected.length == 0){
		alert("请先选择产品！");
		return;
	}
	var productIds="";
	$.each(MliSelected,function(i,v){
		//选中
		productIds += oTable.fnGetData(v).productId + ",";
		//var t=oTable.rows('.selected').data();
	});
	var path =sys.rootPath+url+'?productIds=' + productIds + '&baseUri=' + $.url().attr('path');  
	debugger;
    $('#productForm').attr("action", path).submit();
});

$('#btnPrintTag').click(function(){
	var url = "/product/printProductTag.html";
	var MliSelected = oTable.$('tr.selected');
	if(MliSelected.length == 0){
		alert("请先选择产品！");
		return;
	}
	var productIds="";
	$.each(MliSelected,function(i,v){
		//选中
		productIds += oTable.fnGetData(v).productId + ",";
		//var t=oTable.rows('.selected').data();
	});
//	var path =sys.rootPath+url+'?productIds=' + productIds + '&baseUri=' + $.url().attr('path');
	
	$.post(sys.rootPath+'/product/printProductTag.html',{productIds:productIds},function(resp){
		var result = JSON.parse(resp);
		if(result.success==false){
			layer.msg('打印失败', {icon : 0});
		}else{
			layer.msg('打印成功', {icon : 0});
		}
	});
	
//    $('#productForm').attr("action", path).submit();
});

$('#btnPrintTagJS').click(function(){
	var MliSelected = oTable.$('tr.selected');
	if(MliSelected.length == 0){
		alert("请先选择产品！");
		return;
	}
	var productIds="";
	$.each(MliSelected,function(i,v){
		//选中
		productIds += oTable.fnGetData(v).productId + ",";
		//var t=oTable.rows('.selected').data();
		
//		productId = oTable.fnGetData(v).productId;
	});
//	var path =sys.rootPath+url+'?productIds=' + productIds + '&baseUri=' + $.url().attr('path');
	
	webside.common.loadPage('/product/printProductTagJsUI.html?productIds=' + productIds);
});
