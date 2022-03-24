<%@ page import="model.Product" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products</title>
</head>
<body>
<h1>Product list</h1>
<p>${product_servlet.id}</p>
<p>${product_servlet.title}</p>
<p>${product_servlet.cost}</p>
<hr>
<ul>
    <% if (((Product)request.getAttribute("products")).getProducts() != null) %>
    <% for (Product value : (List<Product>)((Product)request.getAttribute("products")).getProducts()) { %>
    <li> id: <%=value.getId()%>; title: <%=value.getTitle()%>; cost: <%=value.getCost()%> </li>
    <% } %>

</ul>
</hr>
</body>
</html>
