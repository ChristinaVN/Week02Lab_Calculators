
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="POST">
            <label>First: </label>
            <input type="text" name="first" value="${first}">
            <br>
            <label>Second: </label>
            <input type="text" name="second" value="${second}">
            <br>
            <button type="submit" name="add" formaction="arithmetic">+</button>
            <button type="submit" name="sub" formaction="arithmetic">-</button>
            <button type="submit" name="multi" formaction="arithmetic">*</button>
            <button type="submit" name="div" formaction="arithmetic">%</button>
            <br>
            <br>
            <label>Result: ${result} </label>
        </form>
        <a href="age">Age Calculator</a>
    </body>
</html>
