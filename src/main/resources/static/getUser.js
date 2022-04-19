ET: $(document).ready(
    function (){
        //
        $('#getUser').click(function (event){
            event.preventDefault();
            ajaxGet();
        });
        function ajaxGet(){

            var bankCardNumber = {bankCardNumber: $("#bankCardNumber").val(),};
            $.ajax({
                type:"GET",
                url:"getUser",
                dataType:'json',
                contentType: 'application/json',
                data:bankCardNumber,
                success:function (result){
                    if (result==null){
                       console.log("获取失败",result)
                        $("#getPeople").html("<strong>Error</strong>");
                    }else {
                        var str = "";
                        str = "<tr><td>"+result.bankCardNumber
                            +"</td><td>"+result.phoneNumber
                            +"</td><td>"+result.humanName
                            +"</td><td>"+result.newDate
                        $('#getPeople').append(str);
                        console.log("获取成功",result);
                    }

                },
                error:function (e) {
                    $("#getPeople").html("<strong>Error</strong>");
                    console.log("函数执行失败！", e);
                }
            })

        }
    }
)