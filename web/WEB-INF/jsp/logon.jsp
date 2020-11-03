<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/30
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<form action="${pageContext.request.contextPath}/user/toLogin" method="post">
    <div class="form-group">
        用户：<input type="text" class="form-control" name="userName" required>
        <small class="form-text text-muted">请输入英文字母+数字.</small>
    </div>
    <div class="form-group">
        密码：<input type="password" class="form-control" name="password" required>
        <small class="form-text text-muted">密码不能带有特殊字符.</small>
    </div>
    <button type="submit" class="btn btn-primary">登录</button>
    <h5><a href="${pageContext.request.contextPath}/user/toCreat">注册</a> </h5>
</form>
</body>
</html>
