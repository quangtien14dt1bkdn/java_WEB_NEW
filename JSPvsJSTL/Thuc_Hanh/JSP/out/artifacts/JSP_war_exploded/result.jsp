<%--
  Created by IntelliJ IDEA.
  User: Welcome
  Date: 4/5/2020
  Time: 10:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body><%
    String description = request.getParameter("description");
    float price = Float.parseFloat(request.getParameter("price"));
    int discount_percent = Integer.parseInt(request.getParameter("discount"));
    float discount = price*discount_percent;
    float total = price - discount;
%>
<h1>Product Description: <%=description%></h1>
<h1>Product price: <%=price%></h1>
<h1>Product discount_percent: <%=discount_percent%></h1>
<h1>Product Discount: <%=discount%></h1>
<h1>Product total: <%=total%></h1>
</body>
</html>
