<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 5/9/2024
  Time: 9:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <title>Title</title>
  </head>
  <body>
  <section id="table">
      <div class="container-fluid">
          <div class="row">
              <div class="col-md-12 mb-3">
                  <div class="card">

                      <div class="card-body">
                          <div class="table-responsive">
                              <table id="example" class="table table-striped data-table" style="width: 100%">
                                  <thead>
                                  <tr>
                                      <th>ID</th>
                                      <th>Name</th>
                                      <th>Author</th>
                                      <th>DESCRIPTION</th>
                                      <th>QUANTITY</th>
                                      <th>Action</th>
                                  </tr>
                                  </thead>
                                  <tbody>
                                  <c:forEach var="book" items="${listBook}">
                                      <tr>
                                          <td><c:out value="${book.id}"/></td>
                                          <td><c:out value="${book.name}"/></td>
                                          <td><c:out value="${book.author}"/></td>
                                          <td><c:out value="${book.description}"/></td>
                                          <td><c:out value="${book.quantity}"/></td>
                                          <td>
                                              <button type="button" class="btn btn-info" onclick="window.location.href='/books?action=edit&id=${student.getId()}'">Borrow</button>
                                          </td>
                                      </tr>
                                  </c:forEach>
                                  </tbody>
                                  <tfoot>
                                  <tr>
                                      <th>ID</th>
                                      <th>Name</th>
                                      <th>Author</th>
                                      <th>DESCRIPTION</th>
                                      <th>QUANTITY</th>
                                      <th>Action</th>
                                  </tr>
                                  </tfoot>
                              </table>
                          </div>
                      </div>
                  </div>
              </div>
          </div>
      </div>
  </section>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>
