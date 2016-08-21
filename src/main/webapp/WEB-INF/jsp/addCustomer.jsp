<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
      <%@ page isELIgnored="false" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <%
      String path = request.getContextPath();
      String basePath = request.getScheme() + "://"
                  + request.getServerName() + ":" + request.getServerPort()
                  + path + "/";
%>

<!DOCTYPE html>
<html>
<head>
    <title></title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/style.css" />
    <script type="text/javascript" src="<%=basePath%>js/jquery.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/jquery.sorted.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/bootstrap.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/ckform.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/common.js"></script>
    <style type="text/css">
        body {
            padding-bottom: 40px;
        }
        .sidebar-nav {
            padding: 9px 0;
        }

        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        }


    </style>
</head>
<form action="/customerController/addCustomer" method="post">
<table class="table table-bordered table-hover definewidth m10">
    <tr>
        <td width="10%" class="tableleft">First_name</td>
        <td><input type="text" name="firstname"/></td>
    </tr>
    <tr>
        <td class="tableleft">Last_name</td>
        <td><input type="text" name="lastname"/></td>
    </tr>   
    <tr>
        <td class="tableleft">Email</td>
            <td><input type="text" name="email"/></td>
    </tr>
    <tr>
    <td class="tableleft">Address</td>
   <td>
   <select name="addressid">
   <c:forEach var="address" items="${addresss}" varStatus ="status">
   <option value="${address.addressId}">${address.address}</option>
   </c:forEach>
   </select>
  </td>
    </tr>
    <tr>
        <td class="tableleft"></td>
        <td>
            <button type="submit" class="btn btn-primary" type="button">保存</button>&nbsp;&nbsp;<button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button>
        </td>
    </tr>
</table>
</form>
</body>
</html>
<script>
    $(function () {       
		$('#backid').click(function(){
				window.location.href="/customerController/TogetCustomerList?pageNow=1";
		 });

    });
</script>