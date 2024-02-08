<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Question Result</title>
</head>
<body>
<fieldset>
    <form action="vote" method="POST">
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
        <button type="submit" name="button" value="send">Submit</button>
    </form>
</fieldset>
</body>
</html>