<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="jdk.nashorn.internal.runtime.linker.Bootstrap" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/29
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>
    <%--Bootstrap美化页面,首先导入在线bootstrap-CDN --%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
 <div class="container">

     <div class="row clearfix">
         <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表 ----- 显示所有数据</small>
                </h1>
            </div>
         </div>

         <div class="row">
             <div class="col-md-4 column">
                 <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toAddBook">新增书籍</a>
             </div>
             <div class="col-md-8 column">
                 <!--搜索书籍-->
                 <form class="form-inline" action="${pageContext.request.contextPath}/book/queryBookByName" method="post" style="float: right">
                     <span style="color: red;font-weight: bold;">${error}</span>
                     <input type="text" class="form-control" name="bookName" placeholder="请输入要查询书籍名字">
                     <input type="submit" class="btn btn-primary" value="搜索">

                 </form>
             </div>
         </div>

     </div>


     <div class="row clearfix">
         <div class="col-md-12 column">
             <table class="table table-hover table-striped">
                 <thead>
                    <tr>
                        <th>书籍编号</th>
                        <th>书籍名称</th>
                        <th>书籍数量</th>
                        <th>书籍详情</th>
                        <th>操作</th>
                    </tr>
                 </thead>
                 <%--从回传的list中遍历书籍数据：foreach--%>
                 <tbody>
                    <c:forEach var="book" items="${allbooks}">
                        <tr>
                            <td>${book.bookID}</td>
                            <td>${book.bookName}</td>
                            <td>${book.bookCounts}</td>
                            <td>${book.detail}</td>
                            <td><a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toUpdateBook/${book.bookID}">修改书籍</a></td>
                            <td><a class="btn btn-primary" href="${pageContext.request.contextPath}/book/del/${book.bookID}">删除书籍</a></td>
                        </tr>
                    </c:forEach>
                 </tbody>
             </table>
         </div>
     </div>

 </div>
</body>
</html>
