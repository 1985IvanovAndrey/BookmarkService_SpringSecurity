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
    <title>Add Bookmark</title>
</head>
<body>
Add bookmark in group "${nameGroup1}"
<div class="col-4">
    <form action="/addBookmark">
        <div class="form-group">
            <label for="bookmark" class="col-form-label-sm"></label>
            <input type="ID" class="form-control col-form-label-sm" id="bookmark" name="bookmark"
                   placeholder="enter bookmark">
        </div>
        <div class="form-group">
            <label for="urlBookmark" class="col-form-label-sm"></label>
            <input type="ID" class="form-control col-form-label-sm" id="urlBookmark" name="urlBookmark"
                   placeholder="enter urlBookmark">
        </div>
        <div class="form-group">
            <label for="description" class="col-form-label-sm"></label>
            <input type="ID" class="form-control col-form-label-sm" id="description" name="description"
                   placeholder="enter description">
        </div>
        <input class=" btn btn-outline-primary btn-sm" type="submit" value="Add bookmark">
    </form>
</div>

</body>
</html>
