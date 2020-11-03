
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>

    <title>增加书籍页面</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/addbook" method="post">
        <div class="form-group">
            书籍名称:<input type="text" class="form-control" name="bookName" required>
        </div>

        <div class="form-group">
            书籍数量:<input type="text" class="form-control" name="bookCounts" required>
        </div>

        <div class="form-group">
            书籍描述:<input type="text" class="form-control" name="detail" required>
        </div>

        <div class="form-group">
            <input type="submit" class="form-control" value="添加">
        </div>

    </form>

</div>
</body>
</html>
