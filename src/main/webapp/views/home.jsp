<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 22.08.2018
  Time: 7:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>

<h3>Home page</h3>

<form action="/save" method="post">
    <input type="" name="nameOfCommonCategory" placeholder="nameOfCommonCategory">
    <input type="submit" value="go!">
</form>


<%--<c:forEach--%>
        <%--items="${commonCategoryList}" var = "commonCategory">--%>
    <%--<p>${commonCategory.idOfCommonCategory} ${commonCategory.nameOfCommonCategory}</p>--%>
<%--</c:forEach>--%>

</body>
</html>
