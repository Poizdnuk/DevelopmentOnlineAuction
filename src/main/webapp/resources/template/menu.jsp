<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<div class="container-fluid">
    <nav class="navbar navbar-inverse">
        <div class="container">

            <!-- Brand and mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                        data-target="#navbar-collapse-1">
                    <span class="sr-only">navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="/welcome">
                ${message}
                    <sec:authorize access="hasRole('USER') or hasRole('ADMIN')" >
                        ${user}
                    </sec:authorize>
                </a>
            </div>

            <!-- nav links and forms-->
            <div class="collapse navbar-collapse" id="navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="/welcome">Главная</a></li>
                    <li><a href="/auction">Аукцион</a></li>
                    <li><a href="/about">О нас</a></li>

                    <sec:authorize access="hasRole('ADMIN')">
                        <li><a href="/admin/message">Почта</a></li>
                        <li><a href="/admin">Админ</a></li>
                        <li><a href="/logout">Выйти</a></li>
                    </sec:authorize>
                    <sec:authorize access="hasRole('USER')">
                        <li><a href="/user/massage">Почта</a></li>
                        <li><a href="/user/home">Кабинет</a></li>
                        <li><a href="/logout">Выйти</a></li>
                    </sec:authorize>

                    <sec:authorize access="isAnonymous()">
                    <li>
                        <a class="btn btn-default btn-outline btn-circle collapsed"  data-toggle="collapse"
                           href="#nav-collapse3" aria-expanded="false" aria-controls="nav-collapse2">Войти</a>
                    </li>
                </ul>

                <!-- sing in -->
                <div class="collapse nav navbar-nav nav-collapse slide-down" id="nav-collapse3">
                    <c:url var="loginUrl" value="/login"/>
                    <form action="${loginUrl}" method="post" class="navbar-form navbar-left form-inline" role="form">
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
                        <div class="form-group">
                            <label class="sr-only" for="login"><i class="fa fa-user"></i></label>
                            <input type="text" class="form-control" id="login" name="login" placeholder="Введите логин" required>
                        </div>
                        <div class="form-group">
                            <label class="sr-only" for="Password">Пароль</label>
                            <input type="password" class="form-control" id="password" name="password" placeholder="Пароль" required/>
                        </div>
                        <input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />
                        <button type="submit" class="btn btn-success" >Ок</button>
                        <input type="button" class="btn btn-info" value="Регистрация" onClick='location.href="/registration"'>

                    </form>
                </div>
                </sec:authorize>

            </div>
        </div>
    </nav>
</div>

