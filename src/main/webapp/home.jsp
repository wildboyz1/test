<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 22-Oct-23
  Time: 9:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" defer></script>
    <title>Trang Chủ - Quản Lý Nhân Viên</title>
    <style>
        * {
            margin: 0px;
            padding: 0px;
        }

        div {
            width: 100%;
            display: flex;
            justify-content: space-around;
        }
    </style>
</head>
<body>
    <div>
        <a href="list_department.jsp">Danh sách phòng ban</a>
        <a href="list_employee.jsp">Danh Sách Nhân Viên</a>
        <a href="add_department.jsp">Thêm Phòng Ban</a>
        <a href="add_employee.jsp">Thêm Nhân Viên</a>
    </div>
</body>
</html>
