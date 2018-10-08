<%-- 
    Document   : Login
    Created on : Aug 14, 2018, 9:03:32 PM
    Author     : Linhlee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><meta http-equiv="content-type" content="text/html;charset=UTF-8"><!-- /Added by HTTrack -->

<meta charset="utf-8">
<!--[if IE]>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<![endif]-->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<title>Mobile Shop &amp; Login</title>

<!-- Favicons Icon -->
<link rel="icon" href="http://demo.magikthemes.com/skin/frontend/base/default/favicon.ico" type="image/x-icon">
<link rel="shortcut icon" href="http://demo.magikthemes.com/skin/frontend/base/default/favicon.ico" type="image/x-icon">

<!-- Mobile Specific -->
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

<!-- CSS Style -->

<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" type="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/owl.carousel.css" type="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/owl.theme.css" type="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/font-awesome.css" type="text/css">


<!-- Google Fonts -->
<link href="https://fonts.googleapis.com/css?family=Roboto:400,500,700" rel="stylesheet" type="text/css">
</head>
    <body>
       <div class="page">
            <!-- header -->
            <jsp:include page="NL/Header.jsp"></jsp:include>
            <!-- navigator -->
            <jsp:include page="NL/Navigator.jsp"></jsp:include>
            <!-- container -->
            <jsp:include page="NL/Container_login.jsp"></jsp:include>
            <!-- footer -->
            <jsp:include page="NL/Footer.jsp"></jsp:include>
        </div>
            <jsp:include page="NL/social.jsp"></jsp:include>
        <!-- JavaScript --> 
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/${pageContext.request.contextPath}/resources/${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/${pageContext.request.contextPath}/resources/${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/${pageContext.request.contextPath}/resources/${pageContext.request.contextPath}/resources/js/common.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/${pageContext.request.contextPath}/resources/${pageContext.request.contextPath}/resources/js/owl.carousel.min.js"></script>
    </body>
</html>
