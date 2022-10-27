<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 10/27/2022
  Time: 10:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="productsList" type="java.util.ArrayList<com.example.application.entities.Product>" scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<% for (int i=0; i<productsList.size();i++){%>

   <div>

       <p>Id : <%=productsList.get(i).getId() %> </p>
       <p>Name : <%=productsList.get(i).getName() %> </p>
       <p>Description : <%=productsList.get(i).getDescription() %> </p>
       <p>Price : <%=productsList.get(i).getPrice() %> </p>
       <p>Quantity : <%=productsList.get(i).getQuantity() %> </p>

   </div>

<%}%>

</body>
</html>
