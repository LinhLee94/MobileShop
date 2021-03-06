<%-- 
    Document   : Index
    Created on : Aug 13, 2018, 11:49:54 PM
    Author     : Linhlee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="content-type" content="text/html;charset=UTF-8"><!-- /Added by HTTrack -->
        <meta charset="utf-8">
        <!--[if IE]>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <![endif]-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Mobile Shop &amp; Index</title>
        <!-- Favicons Icon -->
        <link rel="icon" href="http://demo.magikthemes.com/skin/frontend/base/default/favicon.ico" type="image/x-icon">
        <link rel="shortcut icon" href="http://demo.magikthemes.com/skin/frontend/base/default/favicon.ico" type="image/x-icon">
        <!-- Mobile Specific -->
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <!-- CSS Style -->

        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" type="text/css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/revslider.css" type="text/css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/owl.carousel.css" type="text/css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/owl.theme.css" type="text/css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/font-awesome.css" type="text/css">
        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Roboto:400,500,700" rel="stylesheet" type="text/css">
    </head>
    <body class="cms-index-index">
        <div class="page">
            <!-- header -->
            <jsp:include page="NL/Header.jsp"></jsp:include>
            <!-- navigator -->
            <jsp:include page="NL/Navigator.jsp"></jsp:include>
            <!-- container -->
            <jsp:include page="NL/Container_index.jsp"></jsp:include>
            <!-- footer -->
            <jsp:include page="NL/Footer.jsp"></jsp:include>
        </div>
            <jsp:include page="NL/social.jsp"></jsp:include>
        <!-- JavaScript --> 
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script> 
 
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/common.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/revslider.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/owl.carousel.min.js"></script> 
<script type='text/javascript'>
jQuery(document).ready(function(){
jQuery('#rev_slider_4').show().revolution({
dottedOverlay: 'none',
delay: 5000,
startwidth: 1170,
startheight: 580,

hideThumbs: 200,
thumbWidth: 200,
thumbHeight: 50,
thumbAmount: 2,

navigationType: 'thumb',
navigationArrows: 'solo',
navigationStyle: 'round',

touchenabled: 'on',
onHoverStop: 'on',

swipe_velocity: 0.7,
swipe_min_touches: 1,
swipe_max_touches: 1,
drag_block_vertical: false,

spinner: 'spinner0',
keyboardNavigation: 'off',

navigationHAlign: 'center',
navigationVAlign: 'bottom',
navigationHOffset: 0,
navigationVOffset: 20,

soloArrowLeftHalign: 'left',
soloArrowLeftValign: 'center',
soloArrowLeftHOffset: 20,
soloArrowLeftVOffset: 0,

soloArrowRightHalign: 'right',
soloArrowRightValign: 'center',
soloArrowRightHOffset: 20,
soloArrowRightVOffset: 0,

shadow: 0,
fullWidth: 'on',
fullScreen: 'off',

stopLoop: 'off',
stopAfterLoops: -1,
stopAtSlide: -1,

shuffle: 'off',

autoHeight: 'off',
forceFullWidth: 'on',
fullScreenAlignForce: 'off',
minFullScreenHeight: 0,
hideNavDelayOnMobile: 1500,

hideThumbsOnMobile: 'off',
hideBulletsOnMobile: 'off',
hideArrowsOnMobile: 'off',
hideThumbsUnderResolution: 0,

hideSliderAtLimit: 0,
hideCaptionAtLimit: 0,
hideAllCaptionAtLilmit: 0,
startWithSlide: 0,
fullScreenOffsetContainer: ''
});
});
</script>
    </body>
</html>
