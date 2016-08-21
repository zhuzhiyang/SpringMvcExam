<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
      String path = request.getContextPath();
      String basePath = request.getScheme() + "://"
                  + request.getServerName() + ":" + request.getServerPort()
                  + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>后台管理系统</title>
	<meta charset="UTF-8">
   <link rel="stylesheet" type="text/css" href="<%=basePath%>css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/style.css" />
    <script type="text/javascript" src="<%=basePath%>js/jquery.js"></script>
<%--     <script type="text/javascript" src="<%=basePath%>js/jquery.sorted.js"></script> --%>
    <script type="text/javascript" src="<%=basePath%>js/bootstrap.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/ckform.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/common.js"></script>
    <style type="text/css">
        body {
            padding-top: 40px;
            padding-bottom: 40px;
            background-color: red;
        }

        .form-signin {
            max-width: 300px;
            padding: 19px 29px 29px;
            margin: 0 auto 20px;
            background-color: #fff;
            border: 1px solid #e5e5e5;
            -webkit-border-radius: 5px;
            -moz-border-radius: 5px;
            border-radius: 5px;
            -webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
            -moz-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
            box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
        }

        .form-signin .form-signin-heading,
        .form-signin .checkbox {
            margin-bottom: 10px;
        }

        .form-signin input[type="text"],
        .form-signin input[type="password"] {
            font-size: 16px;
            height: auto;
            margin-bottom: 15px;
            padding: 7px 9px;
        }

    </style>  
</head>
<body style="background:url(<%=basePath%>image/1.gif);background-repeat: no-repeat;background-size :100%">
<div class="backgrond" >
<P style="font-size:30px">10980--朱智阳</P>
<div class="container">

    <form class="form-signin" method="post" action="/customerController/login" style="background:#049ff1" >
        <h2 class="form-signin-heading" >电影租赁管理系统</h2>
        <input type="text" name="username" class="input-block-level" placeholder="账号">
        <input type="password" name="password" class="input-block-level" placeholder="密码">
     
        <p><button class="btn btn-large btn-primary" type="submit" style="margin-left:220px;">登录</button></p>
    </form>
</div>
</body>
</html>