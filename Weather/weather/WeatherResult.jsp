<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Weather Data Result</title>
</head>
<body>
    <h2>{ Weather Recorded Successfully! }</h2>

    <p><strong>{ Location: }</strong> ${dto.location}</p>
    <p><strong>{ Captured By: }</strong> ${dto.capturedBy}</p>
    <p><strong>{ Temperature: }</strong> ${dto.temp} °C</p>
    <p><strong>{ Recorded Date: }</strong> ${dto.date}</p>

    <br><br>
    <a href="index.jsp">Go Back to Home</a>
</body>
</html>
