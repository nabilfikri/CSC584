<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
        import="java.util.*, example.Example" %>

<html>
<body>

    <h3>Page Directives Example</h3>

    <%! Example ex = new Example(); %>

    <%@ include file="footer.jsp" %>
</body>
</html>
