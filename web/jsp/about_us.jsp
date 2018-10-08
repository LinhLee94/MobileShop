<%-- 
    Document   : about_us
    Created on : Aug 14, 2018, 9:49:05 PM
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
<title>Inspire, premium HTML5 &amp; CSS3 template</title>

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
            <!-- bredcrumbs --!>
            <jsp:include page="NL/breadcrumbs_about_us.jsp"></jsp:include>
            <!-- container -->
            <jsp:include page="NL/Container_about_us.jsp"></jsp:include>
            <!-- footer -->
            <jsp:include page="NL/Footer.jsp"></jsp:include>
        </div>
            <jsp:include page="NL/social.jsp"></jsp:include>
    </body>
</html>
