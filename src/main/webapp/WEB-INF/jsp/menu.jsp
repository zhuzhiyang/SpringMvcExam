<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%
      String path = request.getContextPath();
      String basePath = request.getScheme() + "://"
                  + request.getServerName() + ":" + request.getServerPort()
                  + path + "/";
%>
<%
String username=request.getParameter("username");
%>
<!DOCTYPE HTML>
<html>
<head>
    <title>后台管理系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="<%=basePath%>assets/css/dpl-min.css" rel="stylesheet" type="text/css" />
    <link href="<%=basePath%>assets/css/bui-min.css" rel="stylesheet" type="text/css" />
    <link href="<%=basePath%>assets/css/main-min.css" rel="stylesheet" type="text/css" />
</head>
<body>

<div class="header">

    <div class="dl-title">
        <!--<img src="/chinapost/Public/assets/img/top.png">-->
    </div>

    <div class="dl-log">欢迎您，<span class="dl-log-user"><%=username%></span><a href="/customerController/loginout" title="退出系统" class="dl-log-quit">[退出]</a>
    </div>
</div>
<div class="content">
    <div class="dl-main-nav">
        <div class="dl-inform"><div class="dl-inform-title"><s class="dl-inform-icon dl-up"></s></div></div>
        <ul id="J_Nav"  class="nav-list ks-clear">
            <li class="nav-item dl-selected"><div class="nav-item-inner nav-home">系统管理</div></li>

        </ul>
    </div>
    <ul id="J_NavContent" class="dl-tab-conten">

    </ul>
</div>
<script type="text/javascript" src="<%=basePath%>assets/js/jquery-1.8.1.min.js"></script>
<script type="text/javascript" src="<%=basePath%>assets/js/bui-min.js"></script>
<script type="text/javascript" src="<%=basePath%>assets/js/common/main-min.js"></script>
<script type="text/javascript" src="<%=basePath%>assets/js/config-min.js"></script>
<script>
    BUI.use('common/main',function(){
        var config = [{id:'1',menu:[{text:'系统管理',items:[{id:'12',text:'Customer管理',href:'/customerController/TogetCustomerList?pageNow=1'},{id:'3',text:'Film管理',href:'Role/index.html'}]}]}];
        new PageUtil.MainPage({
            modulesConfig : config
        });
    });
</script>
<div style="text-align:center;">

</div>
</body>
</html>