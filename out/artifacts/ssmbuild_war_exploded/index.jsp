<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/29
  Time: 13:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>

      <style>
          a{
              text-decoration: none;
              color: black;
              font-size: 18px;
          }
          h4{
              width: 180px;
              height: 38px;
              margin: 100px auto;
              text-align: center;
              line-height: 38px;
              background: beige;
              border-radius: 5px;
          }
      </style>
      <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
  </head>
  <body>

 <h4><a href="${pageContext.request.contextPath}/book/all">进入书籍展示页面</a> </h4>
<span>
    ${userName}
    <a href="${pageContext.request.contextPath}/user/outLogin">退出</a>
</span>
 <% if(request.getSession().getAttribute("userName") == null){ %>
 <form action="${pageContext.request.contextPath}/user/toLogin" method="post">
     <div class="form-group">
         用户：<input type="text" class="form-control" name="userName" required>
         <small class="form-text text-muted">请输入英文字母+数字.</small>
     </div>
     <div class="form-group">
         密码：<input type="password" class="form-control" id="exampleInputPassword1" required>
         <small class="form-text text-muted">密码不能带有特殊字符.</small>
     </div>
     <button type="submit" class="btn btn-primary">登录</button>
     <h5><a href="${pageContext.request.contextPath}/user/toCreat">注册</a> </h5>
 </form>
 <% } %>
  </body>
</html>
