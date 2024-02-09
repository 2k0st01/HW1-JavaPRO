<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="../css/istyles.css">
</head>
<body>
<% String login = (String)session.getAttribute("user_login"); %>

<% if (login == null || "".equals(login)) { %>
<div class="login-container">
    <form class="login-form" action="/login" method="post">
        <h2>Login</h2>
        <div class="form-group">
            <label for="login">Username:</label>
            <input type="text" id="login" name="login" required>
        </div>
        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
        </div>
        <button type="submit">Login</button>
    </form>
</div>
<% } else { %>
<fieldset>
    <h3>You are logged in as: <%= login %> </h3>
    <fieldset>
        <form action="/result" method="POST">
            <fieldset>
                <legend>Select your Gender</legend>
                <label for="id-male">
                    <input type="radio" id="id-male" name="gender" value="male" required> Male
                </label>
                <br>
                <label for="id-female">
                    <input type="radio" id="id-female" name="gender" value="female" required> Female
                </label>
            </fieldset>
            <br>
            <fieldset>
                <legend>Select your favorite animal</legend>
                <label for="id-cat">
                    <input type="radio" id="id-cat" name="animal" value="cat" required> Cat
                </label>
                <br>
                <label for="id-dog">
                    <input type="radio" id="id-dog" name="animal" value="gog" required> Dog
                </label>
            </fieldset>
            <button type="submit" name="button" value="send">Submit</button>
        </form>
    </fieldset>
    <fieldset>
        <h3>You can join for <a href="result">Check results</a> </h3>
    </fieldset>
    <br>Click this link to <a href="/login?a=exit">logout</a>
</fieldset>
<% } %>
</body>
</html>
