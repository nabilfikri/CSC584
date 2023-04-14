<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Simple Example Pre-defined JSP Variables</title>
</head>
<body>
    
    <%
        out.println("Printing this message using pre-defined instance of PrintWriter <br><br>");
    %>

    Session ID: <%= session.getId() %> <br> <br>

    Query String (request): <%= request.getQueryString() %>


</body>
</html>