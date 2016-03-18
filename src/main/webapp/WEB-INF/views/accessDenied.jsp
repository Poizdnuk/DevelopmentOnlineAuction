<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>AccessDenied page</title>
</head>
<body>
Дорогой <strong>${user}</strong>
	У Вас нет прав для просмотра даной страницы!
    <a href="<c:url value="/welcome" />">Вернутся назад</a>
	<a href="<c:url value="/logout" />">Выйти</a>
</body>
</html>