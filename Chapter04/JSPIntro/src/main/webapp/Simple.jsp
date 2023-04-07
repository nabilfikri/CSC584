<!DOCTYPE html>
<html>
<head>
    <title>Simple Example</title>
</head>
<body>

    <%! int num1 = 5, num2 = 7, sum; %>

    <% sum = num1 + num2; %>

    <h1>Results</h1>
    <p>
        <%=num1 %> + <%=num2 %> = <%= sum %>
    </p>

</body>
</html>