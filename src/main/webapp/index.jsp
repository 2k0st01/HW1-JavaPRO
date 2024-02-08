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
</body>
</html>