<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/30
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册页面</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>用户注册</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/user/creat" method="post">
        <div class="form-group">
            用户:<input type="text" class="form-control" name="userName" required>
        </div>

        <div class="form-group">
            密码:<input type="text" class="form-control" name="password" required>
        </div>

        <div class="form-group">
            手机:<input type="text" class="form-control" name="userPhone" required>
        </div>

        <div class="form-group">
            <input type="submit" class="form-control" value="注册">
        </div>

    </form>

</div>
</body>
</html>
