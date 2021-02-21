main = {
    init : function () {
    	console.log("init activated");
        var _this = this;
        $('#btn-save').on('click', function () {
            _this.save();
        });
    },
    save : function () {
    	console.log("save activated");
        var data = {
            title: $('#title').val(),
            author: $('#author').val(),
            content: $('#content').val()
        };

        $.ajax({
            type: 'POST',
            url: '/posts',
            dataType: "text",
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data),
        })
        .done(function() {
        	console.log("done");
            alert('update success');
            location.reload();
        })
        .fail(function (error) {
        	console.log("fail");
        	console.log(JSON.stringify(error));
            alert(JSON.stringify(error));
        });
    }

};
main.init();