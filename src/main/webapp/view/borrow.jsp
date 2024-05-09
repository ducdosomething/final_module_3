<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 5/9/2024
  Time: 10:36 AM
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

<div class="container">
    <form class="mx-auto" method="post">
        <div class="text-center"><h1>Book information</h1></div>
        <div>
            <label for="id" class="form-label">ID</label>
            <input type="text" class="form-control" id="id" name="id" value="">
        </div>
        <div>
            <label for="book_name" class="form-label">Book Name</label>
            <input type="text" class="form-control" id="book_name" name="book_name" value="">
        </div>
        <div>
            <label for="student_name" class="form-label">Student Name</label>
            <select class="form-control" id="student_name" name="student_name">
                <c:forEach items="" var="cl">
                    <option value=""
                            <c:if test="">
                                selected
                            </c:if>
                    >${cl.className}</option>
                </c:forEach>
            </select>
        </div>
        <div>
            <label for="borrowing_day" class="form-label">Borrowing day</label>
            <input type="date" class="form-control" id="borrowing_day" name="borrowing_day" value="">
        </div>
        <div>
            <label for="returning_day" class="form-label">Returning day</label>
            <input type="date" class="form-control" id="returning_day" name="returning_day" value="">
        </div>

        <div class="button">
            <button type="submit" class="btn btn-primary mt-4" value="Update student">Update student</button>
            <button type="button" class="btn btn-dark mt-4" onclick="goToStudentList()">Back to student list</button>
        </div>

        <div class="show-message">
            <p>
                <c:if test='${requestScope["message"] != null}'>
                    <span class="message">${requestScope["message"]}</span>
                </c:if>
            </p>
        </div>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
