<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" defer></script>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Thêm Phòng Ban</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/process-action-controller" method="post">
        Tên phòng ban: <input placeholder="tên phòng ban" name="inputDeptName" required>
        <input type="submit" name="action" value="Thêm Phòng Ban">
    </form>
</body>
</html>