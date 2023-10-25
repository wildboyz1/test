<%@ page import="dev.mn.test.services.impl.DepartmentService" %>
<%@ page import="dev.mn.test.controllers.ProcessAction" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 22-Oct-23
  Time: 9:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh Sách Phòng Ban</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" defer></script>
</head>
<body class="container-fluid text-center">
    <h1>Danh Sách Phòng Ban</h1>
    <table class="container-fluid table tale-hover">
        <thead>
            <tr>
                <th>ID</th>
                <th>Tên Phòng Ban</th>
                <th></th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            <%= new DepartmentService(ProcessAction.getEntityManager()).getDataRowsTable()%>
        </tbody>
    </table>
</body>
</html>
