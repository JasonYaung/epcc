$(document).ready(
    function () {
        $("#people").submit(function (event) {
            event.preventDefault();
            ajaxpost();
        });

        function ajaxpost() {
            var newDate = new Date();

            var people = {
                bankCardNumber: $("#bankCardNumber").val(),
                phoneNumber: $("#phoneNumber").val(),
                humanName: $("#humanName").val(),
                newDate: newDate.toLocaleString(),
            }
            $.ajax({
                type: "POST",
                contentType: "application/json",
                url: "setPeople",
                data: JSON.stringify(people),
                dataType: 'json',
                success: function (result) {
                    if (result==="true") {
                        alert("写入成功！")
                    }
                    console.log(result);
                },
                error: function (e) {
                    alert("写入失败!")
                    console.log("ERROR: ", e);
                }

            });
        }
    }
)