<%-- 
    Document   : index.jsp
    Created on : Sep 6, 2021, 4:18:56 PM
    Author     : Levitt
--%><%@page contentType="text/html" pageEncoding="UTF-8"%><!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><%=request.getAttribute("Title") %></title>
<meta name="keywords" content="<%=request.getAttribute("metaKey") %>">
<meta name="description" content="<%=request.getAttribute("metaDesc") %>">
<link rel="stylesheet" href="/static/style.css" />
<link rel="icon" type="image/png" href="static/favicon.png" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" 
      integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
</head>
<body>
<header>
<jsp:include page="header.jsp" />
</header>
<div class="container-fluid" id="mainwrapper">
<div class="row" id="main">
<section class="col-lg-6" id="content"><jsp:include page="main_content.jsp" /></section>
<aside class="col-lg-3" id="side1"><jsp:include page="sidebar_1.jsp" /></aside>
<aside class="col-lg-3" id="side2"><jsp:include page="sidebar_2.jsp" /></aside>
</div>
<div style="bottom: 0px; margin: 40px auto 0px auto; text-align: center; ">
    <img src="/static/HTML5_Logo_128.png" alt="HTML5" style="width: 150px; height: auto;" />
    <img src="/static/Apache_Tomcat_logo.svg.png" alt="Apache Tomcat" style="width: 150px; height: auto;" />
</div>
</div>
<footer class="container-fluid">
<jsp:include page="footer.jsp" />
</footer>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
</body>
</html>
