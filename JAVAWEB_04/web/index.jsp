<%-- 
    Document   : index
    Created on : Aug 11, 2019, 4:25:41 PM
    Author     : DUC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </head>
    <body>
        <!-- As a link -->
        <nav class="navbar navbar-light bg-light">
            <a class="navbar-brand" href="#">Tin Nhanh</a>
        </nav>
        <div class="container">
            <form>
                <div class="form-group">
                    <label for="exampleInputEmail1">Search</label>
                    <input type="text" class="form-control" id="txtsearch"  placeholder="Search key ...">

                </div>


                <button type="submit" class="btn btn-primary">Search</button>
            </form>
            <br>
            <c:forEach var="item" items="${news}">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">${item.title}</h5>
                        <p class="card-text">${item.sumary}</p>
                        <p>Dang boi ${item.author_id}</p>
                    </div>
                </div>
            </c:forEach>

            <br/>
            <nav aria-label="Page navigation example">
                <ul class="pagination">

                    <c:if test="${curr==1}" >
                        <li class="page-item">
                            <a class="page-link" href="#" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                    </c:if>
                    <c:if test="${curr > 1}" >
                        <li class="page-item">
                            <a class="page-link" href="?page=${curr -1}" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                    </c:if>
                    <c:forEach var="i" begin="1" end="${total}" step="1">
                        <li class="page-item"><a class="page-link" href="?page=${i}">${i}</a></li>
                        </c:forEach>
                        <c:if test="${curr==total}">
                        <li class="page-item">
                            <a class="page-link" href="#" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>

                    </c:if>
                    <c:if test="${curr<total}">
                        <li class="page-item">
                            <a class="page-link" href="?page=${curr +1}" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                    </c:if>


                </ul>
            </nav>
        </div>

        <!-- As a heading -->

    </body>
</html>
