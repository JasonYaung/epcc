GET: $(document).ready(
    function (){
        //
        $('#getAllPeople').click(function (event){
            event.preventDefault();
            ajaxGet();
        });
        function ajaxGet(){
            $.ajax({
                type:"GET",
                url:"getAll",
                success:function (result){
                    if (result.length != 0){

                            var str = "";
                            for (var i = 0; i < result.length;i++){
                                str = "<tr><td>"+result[i].bankCardNumber
                                    +"</td><td>"+result[i].phoneNumber
                                    +"</td><td>"+result[i].humanName
                                    +"</td><td>"+result[i].newDate
                                $('#getPeople').append(str);


                        }
                        console.log("获取成功：",result);
                    }else {
                        $("#getPeople").html("<strong>Error</strong>");
                        console.log("获取失败！",result);
                    }
                },
                error:function (e){
                    $("#getPeople").html("<strong>Error</strong>");
                    console.log("函数执行失败！",e);
                }
                }

            );




        }
    }
)