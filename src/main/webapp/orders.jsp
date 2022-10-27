<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 10/27/2022
  Time: 10:16 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="orders" type="java.util.ArrayList<com.example.application.entities.Order>" scope="request"/>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Orders : </h1>

<% for (int i=0; i<orders.size();i++){%>

<div>

    <p>Id : <%=orders.get(i).getId() %> </p>
    <p>CustomerId : <%=orders.get(i).getCustomer_id() %> </p>
    <p>ProductId : <%=orders.get(i).getProduct_id() %> </p>
    <p>Quantity : <%=orders.get(i).getQuantity() %> </p>

</div>

<%}%>

</body>
</html>
