<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/29
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改图书</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/upBook" method="post">

        <div class="form-group">
            书籍名称:<input type="text" class="form-control" name="bookName" value="${book.bookName}">
        </div>

        <div class="form-group">
            书籍数量:<input type="text" class="form-control" name="bookCounts" value="${book.bookCounts}">
        </div>

        <div class="form-group">
            书籍描述<input type="text" class="form-control" name="detail" value="${book.detail}">
        </div>

        <div class="form-group">
            <input type="hidden" name="bookID" value="${book.bookID}">
            <input type="submit" class="form-control" value="修改">
        </div>

    </form>

</div>
</body>
</html>
