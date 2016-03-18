<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<!DOCTYPE html>
 <html lang = "ru">
<head>
    <!-- HEAD -->
    <title>Welcome</title>
    <c:import url="/resources/template/head.jsp"/>
</head>
<body>
  <%--menu--%>
  <c:import url="/resources/template/menu.jsp"/>

  <%--Carousel--%>
  <div class="container">
    <div class="jumbotron">
        <h1>Заголовок</h1>
        <p>
            <br>
            <br>
        </p>
        <p><a href="#" target="_blank" class="btn btn-success btn-lg">За покупками</a></p>
    </div>
</div>

  <%--search and category--%>
  <div class="container-fluid">
    <nav class="navbar navbar-inverse">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse-2">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Категории</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="navbar-collapse-2">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">Авто</a></li>
                    <li><a href="#">Телефоны</a></li>
                    <li><a href="#">Техника</a></li>
                    <li><a href="#">Дом и сад</a></li>
                    <li><a href="#">Мода</a></li>
                    <li><a href="#">Спорт</a></li>
                    <li><a href="#">Рыбалка</a></li>
                    <li><a href="#">Ноутбуки</a></li>
                    <li>
                        <a class="btn btn-default btn-outline btn-circle collapsed"  data-toggle="collapse"
                           href="#nav-collapse2" aria-expanded="false" aria-controls="nav-collapse3">Поиск</a>
                    </li>
                </ul>
                <!-- search -->
                <div class="collapse nav navbar-nav nav-collapse slide-down" id="nav-collapse2">
                    <form class="navbar-form navbar-left" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Search" />
                        </div>
                        <button type="submit" class="btn btn-danger"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                    </form>
                </div>

            </div>
        </div><!-- /.navbar-collapse -->
    </nav>
</div>

  <%--view--%>
  <div class="container">
      <div class="jumbotron">
          <div class="row">
              <div class="col-xs-4">
                  <h2>HTML</h2>
                  <p>
                      <br>
                      <br>
                  </p>
                  <p><a href="#" target="_blank" class="btn btn-success">Просмотр &raquo;</a></p>
              </div>
              <div class="col-xs-4">
                  <h2>CSS</h2>
                  <p>
                      <br>
                      <br>
                  </p>
                  <p><a href="#" target="_blank" class="btn btn-success">Просмотр &raquo;</a></p>
              </div>
              <div class="col-xs-4">
                  <h2>Bootstrap</h2>
                  <p>
                      <br>
                      <br>
                  </p>
                  <p><a href="#" target="_blank" class="btn btn-success">Просмотр &raquo;</a></p>
              </div>
          </div>
      </div>
  </div>

  <!-- FOOTER -->
  <c:import url="/resources/template/footer.jsp"/>
</body>
</html>