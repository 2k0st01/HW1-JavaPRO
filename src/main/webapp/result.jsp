<%@ page import="academy.prog.users.DataSave" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/istyles.css">
</head>
<body>
<%
    DataSave dataSave = (DataSave) session.getAttribute("dataSave");
%>
<fieldset>
    <form action="/result" method="post">
        <h2>Result:</h2>
        <p>Male: <%= dataSave.getMale().get() %></p>
        <p>Female: <%= dataSave.getFemale().get() %></p>
        <p>Cat: <%= dataSave.getCat().get() %></p>
        <p>Dog: <%= dataSave.getDog().get() %></p>
        <br>Click this link to <a href="/result?a=reset"> -Reset- </a>
        <h3>Join in home <a href="WEB-INF/index.jsp"> -Page- </a></h3>
    </form>
</fieldset>
</body>
</html>
