<%--
  Created by IntelliJ IDEA.
  User: blf2
  Date: 17-1-3
  Time: 下午2:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="/User/userLogin" method="post">
  <label for="userId">用户名:</label>
  <input id="userId" name="userId" type="email" />
  <label for="userPswd">密码：</label>
  <input id="userPswd" type="password" name="userPswd" />
  <button type="submit">登录</button>
</form>
</body>
</html>
