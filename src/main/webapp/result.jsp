
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fieldset>
    <form action="vote" method="get">
      <h2>Result:</h2>
      <p>Male: <%= request.getAttribute("male") %></p>
      <p>Female: <%= request.getAttribute("female") %></p>
        <br>Click this link to <a href="vote?a=reset"> -Reset- </a>
      <h3>Vote again <a href="index.jsp"> -Click- </a></h3>
    </form>
</fieldset>
</body>
</html>
