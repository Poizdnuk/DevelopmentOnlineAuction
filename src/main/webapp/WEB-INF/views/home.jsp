<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

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

            <c:url var="itemUrl" value="/login"/>
            <form action="${itemUrl}" method="post" class="form-horizontal">
                <div class="input-group input-sm">
                    <label for="name">Название</label>
                    <input type="text" class="form-control" id="name" placeholder="Название">
                </div>
                <div class="input-group input-sm">
                    <label for="price">Цена</label>
                    <input type="text" class="form-control" id="price" placeholder="Цена">
                </div>
                <div class="input-group input-sm">
                    <label for="low_price">Минимальная цена</label>
                    <input type="text" class="form-control" id="low_price" placeholder="Минимальная цена">
                </div>
                <div class="input-group input-sm">
                    <label for="description">Описание</label>
                    <input type="text" class="form-control" id="description" placeholder="Описание">
                </div>
                <div class="input-group input-sm">
                    <label for="interval_end">Период торга</label>
                    <input type="text" class="form-control" id="interval_end" placeholder="Период торга">
                </div>

                <div class="input-group input-sm">
                    <label for="interval_end">Категория</label>
                    <select class="form-control">
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                    </select>
                </div>

                <div class="input-group input-sm">
                    <label for="photo">Добавить фото</label>
                    <input type="file" id="photo">
                    <p class="help-block">Example block-level help text here!</p>
                </div>

                <button type="submit" class="btn btn-default">Отправить</button>
            </form>
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
