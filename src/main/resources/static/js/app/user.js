var main = {
    init : function () {
        var _this = this;
        $('#btn-user-save').on('click', function () {
            _this.save();
        });
        $('#btn-user-signin').on('click', function () {
            _this.signin();
        });
    },
    save : function () {
        var data = {
            name: $('#name').val(),
            email: $('#email').val(),
            passwd: $('#passwd').val(),
            picture: $('#picture').val(),
            role: $('#role').val(),
        };


        $.ajax({
            type: 'POST',
            url: '/users/join',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('가입성공 우왕!.');
            window.location.href = '/signin';
        }).fail(function (error) {
            console.log(error);
        });
    },
    signin : function () {
        var data = {
            email: $('#email').val(),
            passwd: $('#passwd').val(),
        };


        $.ajax({
            type: 'GET',
            url: '/users/signin',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('로그인 성공 우왕!.');
            window.location.href = '/signin';
        }).fail(function (error) {
            console.log(error);
        });
    }
};

main.init();