//提交
function validateForm(){
$('#productTypeForm').validate({
    errorElement : 'div',
    errorClass : 'help-block',
    rules : {
    	cnName : {
            required : true
        }
    },
    messages : {
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
    	debugger;
        var productTypeId = $("#hdfproductTypeId").val();
        var url = "";
        if (productTypeId != undefined) {
            url = '/producttype/edit.html';
        } else {
            url = '/producttype/add.html';
        }
        webside.common.commit('productTypeForm', url, '/producttype/index.html');
    }
});
}
