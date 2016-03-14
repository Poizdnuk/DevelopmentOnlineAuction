<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<html>
<head>
	<title>Admin page</title>
	<!-- HEAD -->
	<c:import url="/resources/template/head.jsp"/>
</head>
<body>
<%--menu--%>
<c:import url="/resources/template/menu.jsp"/>

<!-- Nav tabs -->
<ul class="nav nav-tabs">
	<li class="active"><a href="#home" data-toggle="tab">Главная</a></li>
	<li><a href="#profile" data-toggle="tab">Профиль</a></li>
	<li><a href="#editUser" data-toggle="tab">Редактирование пользователя</a></li>
	<li><a href="#editItem" data-toggle="tab">Редактирование лотов</a></li>
	<li><a href="#messages" data-toggle="tab">Сообщения</a></li>
</ul>

<!-- Tab panes -->
<div class="tab-content">
	<div class="tab-pane active" id="home">...</div>
	<div class="tab-pane" id="profile">...</div>
	<div class="tab-pane" id="editUser">
		<div align="center">
			<h1>Contact List</h1>
			<table border="1" class="table table-hover">
				<th>No</th>
				<th>Логин</th>
				<th>Почта</th>
				<th>Удалить</th>
				<c:forEach var="user" items="${listUser}" varStatus="status">
					<tr>
						<td>${status.index + 1}</td>
						<td>${user.login}</td>
						<td>${user.email}</td>
						<td>
							<input type="button" id="${user.id}" class="btn btn-block btn-primary btn-info" value="Удалить"
								   onClick='location.href="/edit"'>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	<div class="tab-pane" id="editItem">
		<div align="center">
			<h1>Список клиентов</h1>
			<table border="1" class="table table-hover">
				<th>No</th>
				<th>Название</th>
				<th>Цена</th>
				<th>Описание</th>
				<th>Удалить</th>
				<c:forEach var="item" items="${listItem}" varStatus="status">
					<tr>
						<td>${status.index + 1}</td>
						<td>${item.name}</td>
						<td>${item.price}</td>
						<td>${item.description}</td>
						<td>
							<input type="button" id="${item.id}" class="btn btn-block btn-primary btn-info" value="Удалить"
								   onClick='location.href="/edit"'>
						</td>

					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	<div class="tab-pane" id="messages">...</div>
</div>

<!-- FOOTER -->
<c:import url="/resources/template/footer.jsp"/>
</body>
</html>