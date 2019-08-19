<%--
  Created by IntelliJ IDEA.
  User: octopus
  Date: 02/08/2019
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="header.jsp" %>

<html>
<head>
    <title>Tracker</title>
</head>
<body>
<div>
    <form action="track" method="post">
        <div class="form-group">
            <label for="login">Enter the login of someone to retrieve it on your list !</label>
            <input id="login" name="login" aria-describedby="loginHelp" placeholder="Enter login">
            <small id="loginHelp" class="form-text text-muted">You can do it !</small>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>

</body>
</html>
