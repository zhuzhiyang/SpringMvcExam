<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%
      String path = request.getContextPath();
      String basePath = request.getScheme() + "://"
                  + request.getServerName() + ":" + request.getServerPort()
                  + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript" src="<%=basePath%>js/jquery.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/jquery.sorted.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/bootstrap.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/ckform.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/common.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script>
$(document).ready(function(){
	alert("您已经安全退出！返回登录页面");
		var url="<%=basePath%>login.jsp";
		window.location.href=url;
});

</script> 
<body>

</body>
</html>