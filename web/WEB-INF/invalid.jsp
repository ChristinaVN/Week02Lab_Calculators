
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>invalid</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="POST">
            <label>Enter your age: </label>
            <input type="text" name="age">
            <br>
            <input type="submit" value="Age next birthday">
        </form>
        <p>You must enter a number! </p>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
