<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 10/27/2022
  Time: 10:39 AM
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="products" type="java.util.ArrayList<com.example.application.entities.Product>" scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<% for (int i=0; i<products.size();i++){%>

   <div>

       <p>Id : <%=products.get(i).getId() %> </p>
       <p>Name : <%=products.get(i).getName() %> </p>
       <p>Description : <%=products.get(i).getDescription() %> </p>
       <p>Price : <%=products.get(i).getPrice() %> </p>
       <p>Quantity : <%=products.get(i).getQuantity() %> </p>
       <a href="AddToCartServlet">Add To Cart</a>
   </div>

<%}%>

</body>
</html>
