<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <style>
        <%@include file="favicon.ico"%>
    </style>


    <title>Signin Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <style>
        <%@include file="bootstrap.min.css"%>
    </style>
    <!-- Custom styles for this template -->
    <style>
        <%@include file="signin.css"%>
    </style>
    <style>
        <%@include file="favicon.ico"%>
    </style>
</head>

<body class="text-center">
<form class="form-signin">

    <%--<img class="mb-4" src="bootstrap-solid.svg" alt="" width="72" height="72">--%>
        <form class="form-signin">
            <img class="mb-4" src="bootstrap-solid.svg" alt="" width="72" height="72">

            <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>

            <label for="inputEmail" class="sr-only">Email address</label>
            <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>

            <label for="inputPassword" class="sr-only">Password</label>
            <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
            <div class="checkbox mb-3">
                <label>
                    <input type="checkbox" value="remember-me"> Remember me
                </label>
            </div>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
            <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
        </form>
</body>
</html>
