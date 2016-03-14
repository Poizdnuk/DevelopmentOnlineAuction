<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <title>Login page</title>
    <link href="<c:url value='/resources/css/bootstrap.css' />" rel="stylesheet">
    <link rel="stylesheet" type="text/css"
          href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css"/>
</head>
<body>
<div class="container">
    <div class="starter-template">
        <h1>Поиск пользователя</h1>
        <br>
        <div id="feedback"></div>
        <c:url var="loginUrl" value="/login"/>
        <form action="${loginUrl}" method="post" class="form-horizontal">
            <c:if test="${param.error != null}">
                <div class="alert alert-danger">
                    <p>Неверный пароль или логин</p>
                </div>
            </c:if>
            <c:if test="${param.logout != null}">
                <div class="alert alert-success">
                    <p>Вы вышли из системы успешно</p>
                </div>
            </c:if>

            <div class="input-group input-sm">
                <label class="input-group-addon" for="login"><i class="fa fa-user"></i></label>
                <input type="text" class="form-control" id="login" name="login" placeholder="Введите логин"
                       required>
            </div>

            <div class="input-group input-sm">
                <label class="input-group-addon" for="password"><i class="fa fa-lock"></i></label>
                <input type="password" class="form-control" id="password" name="password" placeholder="Введите пароль"
                       required>
            </div>

            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <br>

            <div class="form-actions">
                <input type="submit" class="btn btn-block btn-primary btn-default" value="Вход">
            </div>

            <br>
            <div class="form-actions">
                <input type="button" class="btn btn-block btn-primary btn-info" value="Регистрация"
                       onClick='location.href="/registration"'>
            </div>

        </form>
    </div>
</div>
</body>
</html>
