<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <!-- HEAD -->
    <c:import url="/resources/template/head.jsp"/>
</head>
<body>

<%--menu--%>
<c:import url="/resources/template/menu.jsp"/>

<div class="container">
</div>
<!-- Nav tabs -->
<ul class="nav nav-tabs">
    <li class="active"><a href="#home" data-toggle="tab">Главная</a></li>
    <li><a href="#addItem" data-toggle="tab">Добавить лот</a></li>
    <li><a href="#editItem" data-toggle="tab">Редактировать лот</a></li>
    <li><a href="#profile" data-toggle="tab">Профиль</a></li>
</ul>

<!-- Tab panes -->
<div class="tab-content">
    <div class="tab-pane active" id="home">
        <%--view--%>
        <div class="container">
            <div class="jumbotron">
                <div class="row">
                    <div class="col-xs-12">
                        <h2>Список</h2>
                        <p> ! </p>
                        <p><a href="#" target="_blank" class="btn btn-success">Просмотр &raquo;</a></p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="tab-pane" id="addItem">
        <div class="container">
            <form:form method="POST" modelAttribute="item" class="form-signin" action="/user/home">
                <h2 class="form-signin-heading">Создание товара</h2>
                <spring:bind path="name">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <form:label path="name">Название </form:label>
                        <form:input type="text" path="name" class="form-control" placeholder="Введите имя"
                                    autofocus="true"/>
                        <form:errors path="name" cssClass="ERROR"/>
                    </div>
                </spring:bind>
                <spring:bind path="description">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <form:label path="name">Описание товара</form:label>
                        <form:textarea type="text" path="description" class="form-control" placeholder="Описание товара"
                                       autofocus="true"/>
                            <%--<form:errors path="description" cssClass="ERROR"></form:errors>--%>
                    </div>
                </spring:bind>
                <spring:bind path="price">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <form:label path="name">Цена</form:label>
                        <form:input type="text" path="price" class="form-control" placeholder="Цена"
                                    autofocus="true"/>
                            <%--<form:errors path="price" cssClass="ERROR"></form:errors>--%>
                    </div>
                </spring:bind>

                <spring:bind path="lowPrice">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <form:label path="name">Минимальная цена</form:label>
                        <form:input type="text" path="lowPrice" class="form-control" placeholder="Минимальная цена"
                                    autofocus="true"/>
                            <%--<form:errors path="lowPrice" cssClass="ERROR"></form:errors>--%>
                    </div>
                </spring:bind>
                <spring:bind path="intervalEnd">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <form:label path="intervalEnd">Период ставки</form:label>
                        <form:input type="text" path="intervalEnd" class="form-control" placeholder="Период ставки"
                                    autofocus="true"/>
                            <%--<form:errors path="lowPrice" cssClass="ERROR"></form:errors>--%>
                    </div>
                </spring:bind>
                <button type="submit" class="btn btn-default">Отправить</button>
            </form:form>
        </div>
    </div>
    <div class="tab-pane" id="editItem">

    </div>
    <div class="tab-pane" id="profile">

    </div>
</div>

<!-- FOOTER -->
<c:import url="/resources/template/footer.jsp"/>

</body>
</html>
