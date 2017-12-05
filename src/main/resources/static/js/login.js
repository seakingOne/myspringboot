$(function() {
	// 用户登录
	$("#submitBtn").click(
			function() {
				var username = $("#username").val();
				var userpwd = $("#userpwd").val();
				if (username != "" && username != null && username != undefined
						&& userpwd != "" && userpwd != null
						&& userpwd != undefined) {
					$.post("/boke/login", {
						"username" : username,
						"userpwd" : userpwd
					}, function(data, status) {
						if (data.state == "0") {
							// 登录成功，1s之后跳转
							alert("登录成功，正在为您跳转！");
							window.location.href = "/boke/main";
						} else {
							alert("用户名或密码错误！");
							return;
						}
					}, "json");
				} else {
					alert("请输入用户名和密码！");
				}
			});
});