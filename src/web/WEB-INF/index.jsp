<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
            integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
            integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
            crossorigin="anonymous"></script>
    <title>BookmarkService</title>
</head>
<body>
<div class="col-4">
    <form action="/add">
        <div class="form-group">
            <label for="group" class="col-form-label-sm">Create new group</label>
            <input type="ID" class="form-control col-form-label-sm" id="group" name="group"
                   placeholder="name group">
        </div>
        <input class=" btn btn-outline-primary btn-sm" type="submit" value="Add group">
    </form>

    <c:if test="${!empty listGroup}">
    Groups:
    <div class="col-4">
        <div class="table-responsive-sm">
            <table class="table table-sm table-bordered">
                <tbody>
                <c:forEach items="${listGroup}" var="group">
                    <tr align="center">
                        <td>${group.nameGroup}</td>
                        <td><a href="<c:url value='/remove/${group.id}'/>">del</a></td>
                        <td><a href="<c:url value='/addInGroup/${group.id}'/>">+</a></td>
                        <td><a href="<c:url value='/getBookmarksFromOneGroup/${group.id}'/>">show</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            </c:if>
        </div>
    </div>
    <c:if test="${!empty listBookmarks}">
    Print bookmarks group "${nameGroup}"
    <div class="row">
                <table class="table table-sm table-bordered">
                    <thead>
                    <tr align="center" class="table-active">
                        <th>Bookmark</th>
                        <th>Description</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${listBookmarks}" var="bookmark">
                        <tr align="center">
                            <td>${bookmark.bookmark}</td>
                            <td><a href="<c:url value='${bookmark.urlBookmark}'/>">${bookmark.bookmark}</a></td>
                            <td>${bookmark.description}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
        </c:if>
    </div>
</div>
</body>
</html>
