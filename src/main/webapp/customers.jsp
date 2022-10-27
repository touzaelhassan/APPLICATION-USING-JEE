<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 10/27/2022
  Time: 12:30 PM
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="customers" type="java.util.ArrayList<com.example.application.entities.Customer>" scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<% for (int i = 0; i< customers.size(); i++){%>

<div>

    <p>Id : <%=customers.get(i).getId() %> </p>
    <p>Name : <%=customers.get(i).getName() %> </p>
    <p>Email : <%=customers.get(i).getEmail() %> </p>
    <p>Phone : <%=customers.get(i).getPhone() %> </p>
    <p>Address : <%=customers.get(i).getAddress() %> </p>

</div>

<%}%>

</body>
</html>
