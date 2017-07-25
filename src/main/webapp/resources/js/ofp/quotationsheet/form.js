var tree = [ {
	text : "杯子",
	id : 1,
	// state : {
	// checked: true,
	// disabled: true,
	// expanded: false,
	// selected: true
	// },
	nodes : [ {
		id : 11,
		text : "压杯",
		tags: ['3']
	}, {
		id : 12,
		text : "吹杯",
		tags: ['1']
	}, {
		id : 13,
		text : "啤酒杯",
		tags: ['3']
	}, {
		id : 14,
		text : "小把杯"
	} ]
}, {
	// state : {
	// checked: true,
	// disabled: true,
	// expanded: false,
	// selected: true
	// },
	text : "服装",
	id : 2,
	nodes : [ {
		id : 21,
		text : "压瓶"
	}, {
		id : 22,
		text : "吹瓶"
	}, {
		id : 23,
		text : "啤酒瓶"
	}, {
		id : 24,
		text : "小把瓶"
	} ]
} ];
$('#searchTree').treeview({
	data : tree,
	levels : 1,// 只展开1级
/*	onNodeSelected : function(event, data) {
		selectId = data['id'];// 获取选中node的id
	},*/
	showCheckbox:true,  
	onNodeChecked:nodeChecked ,  
    onNodeUnchecked:nodeUnchecked,
    showTags: true

});
var nodeCheckedSilent = false;
function nodeChecked (event, node){
	debugger;
    if(nodeCheckedSilent){
        return;
    }
    nodeCheckedSilent = true;
    checkAllParent(node);
    checkAllSon(node);
    nodeCheckedSilent = false;
}

var nodeUncheckedSilent = false;
function nodeUnchecked  (event, node){
	debugger;
    if(nodeUncheckedSilent)
        return;
    nodeUncheckedSilent = true;
    uncheckAllParent(node);
    uncheckAllSon(node);
    nodeUncheckedSilent = false;
}

//选中全部父节点
function checkAllParent(node){
    $('#searchTree').treeview('checkNode',node.nodeId,{silent:true});
    var parentNode = $('#searchTree').treeview('getParent',node.nodeId);
    if(!("nodeId" in parentNode)){
        return;
    }else{
        checkAllParent(parentNode);
    }
}
//取消全部父节点
function uncheckAllParent(node){
    $('#searchTree').treeview('uncheckNode',node.nodeId,{silent:true});
    var siblings = $('#searchTree').treeview('getSiblings', node.nodeId);
    var parentNode = $('#searchTree').treeview('getParent',node.nodeId);
    if(!("nodeId" in parentNode)) {
        return;
    }
    var isAllUnchecked = true;  //是否全部没选中
    for(var i in siblings){
        if(siblings[i].state.checked){
            isAllUnchecked=false;
            break;
        }
    }
    if(isAllUnchecked){
        uncheckAllParent(parentNode);
    }

}

//级联选中所有子节点
function checkAllSon(node){
    $('#searchTree').treeview('checkNode',node.nodeId,{silent:true});
    if(node.nodes!=null&&node.nodes.length>0){
        for(var i in node.nodes){
            checkAllSon(node.nodes[i]);
        }
    }
}
//级联取消所有子节点
function uncheckAllSon(node){
    $('#searchTree').treeview('uncheckNode',node.nodeId,{silent:true});
    if(node.nodes!=null&&node.nodes.length>0){
        for(var i in node.nodes){
            uncheckAllSon(node.nodes[i]);
        }
    }
}



var url= sys.rootPath+"/quotationsheet/getSubSheet.html";
		 oTable = $('#example').dataTable( {
			  	"sScrollY": "400px",
			    "sScrollX": "140%", //横向滚动条       
			    "bScrollCollapse": true,
			    "bProcessing": true, // 显示是否加载
			    "bStateSave": true,
			    "bSort": true,
			    "bServerSide": false,
			    "sAjaxSource": url , //后台地址
			    "bAutoWidth": true,
			    "bPaginate": true, //翻页功能  
			    "iDisplayLength":5,
			    "iDisplayStart":0,
			    "aLengthMenu": [5,20],
				"fnServerData": function (sSource, aoData, fnCallback, oSettings) {
			        oSettings.jqXHR = $.ajax({
			            "dataType": 'json',
			            "contentType": "application/json; charset=utf-8",
			            "url": sSource,
			            "success": function (modellist) {
			                fnCallback(modellist); //string to json
			            },
			            "error": function (resp) {
			                alert("错误代码：" + resp.status + "," + "错误信息：" + resp.readyState);
			            }
			        });
			    }, "aoColumnDefs" :[
				                         { "bVisible": false, "aTargets": [0] }/*第一列隐藏*/
			                               ],
		        "aoColumns": [
							{ "mDataProp": "productId" },
							{ "mDataProp": "buyPrice" },
							{ "mDataProp": "usdPrice" },
							{ "mDataProp": "unit" },
							{ "mDataProp": "top" },
							{ "mDataProp": "bottom" },
							{ "mDataProp": "height" },
							{ "mDataProp": "weight" },
							{ "mDataProp": "volume" },
							{ "mDataProp": "packing" },
							{ "mDataProp": "packingRate" },
							{ "mDataProp": "number" },
							{ "mDataProp": "packNum" },
							{ "mDataProp": "totalcbm" },
							{ "mDataProp": "totalGw" }
		                ]
		} ).makeEditable({
		    sUpdateURL: url,
		    fnOnEdited: function (status, sOldValue, sNewValue, sNewCellDisplayValue) {
		        oTable.fnReloadAjax(url + "&objectid=" + objectid);
		    },
		    "aoColumns": [null, {
                type: 'textarea',
                submit: '提交'
            	}, null, null,null,null]/*可编辑的列*/
			});
		  $.fn.dataTableExt.oApi.fnReloadAjax = function (oSettings, sNewSource, fnCallback, bStandingRedraw) {
		        if (typeof sNewSource != 'undefined' && sNewSource != null) {
		            oSettings.sAjaxSource = sNewSource;
		        }
		        this.oApi._fnProcessingDisplay(oSettings, true);
		        var that = this;
		        var iStart = oSettings._iDisplayStart;
		        var aData = [];

		        this.oApi._fnServerParams(oSettings, aData);

		        oSettings.fnServerData(oSettings.sAjaxSource, aData, function (json) {
		            /* Clear the old information from the table */
		            that.oApi._fnClearTable(oSettings);

		            /* Got the data - add it to the table */
		            var aData = (oSettings.sAjaxDataProp !== "") ? that.oApi._fnGetObjectDataFn(oSettings.sAjaxDataProp)(
								json) : json;

		            for (var i = 0; i < aData.length; i++) {
		                that.oApi._fnAddData(oSettings, aData[i]);
		            }

		            oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();
		            that.fnDraw();

		            if (typeof bStandingRedraw != 'undefined' && bStandingRedraw === true) {
		                oSettings._iDisplayStart = iStart;
		                that.fnDraw(false);
		            }

		            that.oApi._fnProcessingDisplay(oSettings, false);

		            /* Callback user function - for event handlers etc */
		            if (typeof fnCallback == 'function' && fnCallback != null) {
		                fnCallback(oSettings);
		            }
		        }, oSettings);
		    };		
		
		validateForm();
		$(".datepicker").datepicker({
			language : "zh-CN",
			autoclose : true,//选中之后自动隐藏日期选择框
			clearBtn : true,//清除按钮
			todayBtn : true,//今日按钮
			format : "yyyy-mm-dd"//日期格式，详见 http://bootstrap-datepicker.readthedocs.org/en/release/options.html#format
		});

//提交
function validateForm(){
$('#quotationsheetForm').validate({
    errorElement : 'div',
    errorClass : 'help-block',
    focusInvalid : false,
    ignore : "",
    rules : {
    	PRODUCT_CODE : {
            required : true
        },FACTORY_CODE:{
        	  required : true
        },UNIT:{
        	  required : true
        }
    },
    messages : {
    	PRODUCT_CODE : {
            required : "请填写商品编码",
        },FACTORY_CODE:{
        	 required : "请填写工厂编码",
        },UNIT:{
        	 required : "请填写单位",
        }
        
    },
    highlight : function(e) {
        $(e).closest('.form-group').removeClass('has-info').addClass('has-error');
    },
    success : function(e) {
        $(e).closest('.form-group').removeClass('has-error').addClass('has-success');
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
        var userId = $("#userId").val();
        var url = "";
        if (userId != undefined) {
            url = '/quotationsheet/edit.html';
        } else {
            url = '/quotationsheet/add.html';
        }
        webside.common.commit('quotationsheetForm', url, '/quotationsheet/listUI.html');
    }
});
}