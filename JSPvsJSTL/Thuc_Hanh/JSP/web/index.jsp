<%--
  Created by IntelliJ IDEA.
  User: Welcome
  Date: 4/3/2020
  Time: 12:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Product calculator</title>
  <style>
    #content {
      width: 450px;
      margin: 0 auto;
      padding: 0 20px 20px;
      background: white;
      border: solid navy 2px;
    }
    label {
      width: 10cm;
      padding-right: 1cm;
      float: left;
    }
    #data input {
      float: left;
      width: 10cm;
      margin-bottom: .5cm;

    }
  </style>
</head>
<body>
<div id="content">
  <h1>Product Discount Calculator</h1>
  <form action="/result.jsp" method="post">
    <div id="data">
      <label>Product Description</label>
      <input type="text" name="description">
      <br>
      <label>Price</label>
      <input type="text" name="price">
      <br>
      <label>Discount Percent</label>
      <input type="text" name="discount">
    </div>
    <div>
      <br>
      <input type="submit" value="Discount Product">
    </div>
  </form>
</div>
</body>
</html>
