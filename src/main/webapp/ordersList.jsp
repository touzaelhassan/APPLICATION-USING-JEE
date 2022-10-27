<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 10/27/2022
  Time: 10:16 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="ordersList" type="java.util.ArrayList<com.example.application.entities.Order>" scope="request"/>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Orders : </h1>
<% for (int i=0; i<ordersList.size();i++){%>

Quantity : <%=ordersList.get(1).getQuantity()%>

<%}%>

</body>
</html>
