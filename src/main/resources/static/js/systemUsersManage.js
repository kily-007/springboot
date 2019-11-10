// 添加用户的function
function addSystemUser() {
    window.location.href = "addsystemuser.jsp";
}

// 删除用户的function
function deleteSystemUser(id) {
    // alert(id);
    var userid = id;
    if(window.confirm("确定删除该用户么？")){
        $.ajax({
            cache : false,
            async : false,
            type : "POST",
            url : 'systemuser/deleteSystemUser.action',
            // 若请求的是json串，需要指定contentType="application/json"
            data : {
                "userid" : userid,
            },
            dataType : "json",
            success : function(result) {
                alert(result);
                // 更新成功后跳转至系统用户表界面
                window.location.href = "systemuser/selectSystemUserList.action";
            }
        })
    }
}