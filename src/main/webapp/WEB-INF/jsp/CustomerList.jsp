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
<body>
 <input type="hidden" value="${pageNow}" name="pageNow" id="pageNow">
  <button type="button" class="btn btn-success" id="addnew" style="margin-left:1000px;">新增Customer</button>
<table class="table table-bordered table-hover definewidth m10" id="tb" >
    <thead>
    <tr>
        <th>Customer编号</th>
        <th>First_name</th>
        <th>Last_name</th>
        <th>Address</th>
        <th>Email</th>
        <th>Last_update</th>
        <th>管理操作</th>
    </tr>
    </thead>
	     </table>
	    
<div class="inline pull-right page" id="page">
         ${Count}条记录     ${pageNow}/${pageCount}页  <a href='/customerController/TogetCustomerList?pageNow=${pageNow-1}'>上一页</a>  <a href='/customerController/TogetCustomerList?pageNow=${pageNow+1}'>下一页</a><a href='/customerController/TogetCustomerList?pageNow=${pageCount}' >最后一页</a>    </div>
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" 
   aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <input type="hidden" id="customerId" name="customerId">
            <h4 class="modal-title" id="myModalLabel">
              修改Customer
            </h4>
         </div>
         <div class="modal-body">
           
           <table class="table table-bordered table-hover definewidth m10">
            <tr>
          <td width="10%" class="tableleft">First_name</td>
           <td><input type="text" name="firstname" id="firstname"/></td>
           </tr>
           <tr>
          <td class="tableleft">Last_name</td>
          <td><input type="text" name="lastname" id="lastname"/></td>
      </tr>   
       <tr id="tr1">
        <td class="tableleft">Email</td>
            <td><input type="text" name="email" id="email"/></td>
    </tr>
<!--     <tr> -->
<!--     <td class="tableleft">Address</td> -->
<!--    <td><select name="addressid"> -->
<!--     <option value="0"></option> -->
<!--    </select> -->
<!--   </td> -->
<!--     </tr> -->
    <tr>
        <td class="tableleft"></td>
        
    </tr>
</table>

         </div>
         <div class="modal-footer">
            <button type="button" class="btn btn-default" 
               data-dismiss="modal">返回
            </button>
            <button type="button" class="btn btn-primary" onclick="update()">
                                  提交
            </button>
         </div>
      </div><!-- /.modal-content -->
</div><!-- /.modal -->
</div>
</body>
</html>
<script>
$(document).ready(function(){
	 var pageNow=$("#pageNow").val();
	
	$.ajax({
		type:"get",
		dataType:"json",
		data:'pageNow='+pageNow,
		url:"/customerController/getCustomerList",//请求的后台地址
		success:function(msg) {//msg:返回值
			var json=msg;
		 for(var i=0;i<json[0].list1.length;i++)
			{
			 var lastupdate=json[0].list1[i].lastUpdate;
			  var time=timeStamp2String(lastupdate.time);
			  var str=
				    '<tr>'
					+'<td>'+json[0].list1[i].customerId+'</td>'
					+'<td>'+json[0].list1[i].firstName+'</td>'
					+'<td>'+json[0].list1[i].lastName+'</td>'
					+'<td>'+json[0].list1[i].addressId+'</td>'
					+'<td>'+json[0].list1[i].email+'</td>'
					+'<td>'+time+'</td>'
					+'<td><button class="btn btn-primary btn-lg" data-toggle="modal"  data-target="#myModa" id="'+(i+1)+'" onclick="editInfo('+json[0].list1[i].customerId+')" >'
					+'编辑</button>  <button class="btn btn-primary btn-lg" onclick="del('+json[0].list1[i].customerId+')">删除</button></td>'
				    +'</tr>';
		
				$("#tb").append(str);
				
			}
		}
	});
	
		function timeStamp2String(time){
		    var datetime = new Date();
		    datetime.setTime(time);
		    var year = datetime.getFullYear();
		    var month = datetime.getMonth() + 1 < 10 ? "0" + (datetime.getMonth() + 1) : datetime.getMonth() + 1;
		    var date = datetime.getDate() < 10 ? "0" + datetime.getDate() : datetime.getDate();
		    var hour = datetime.getHours()< 10 ? "0" + datetime.getHours() : datetime.getHours();
		    var minute = datetime.getMinutes()< 10 ? "0" + datetime.getMinutes() : datetime.getMinutes();
		    var second = datetime.getSeconds()< 10 ? "0" + datetime.getSeconds() : datetime.getSeconds();
		    return year + "-" + month + "-" + date+" "+hour+":"+minute+":"+second;
		
	}
});
     $(function () {
 		$('#addnew').click(function(){
 				window.location.href="/customerController/ToaddCustomer";
 		 });
     });
 	function del(id)
 	{
 		if(confirm("确定要删除吗？"))
	{

 	 	    $.ajax({  
 	 	        type: "get",  
 	 	        url: "/customerController/deleteCustomer",  
 	 	        data: "&customerid="+id, 
 	 	        dataType:"json", 
 	 	
 	 	        success: function(result) {  
 	 	        	
 	 	            alert("删除成功！"); 
 	 	        		
 	 	        }  
 	 	    });  		
 		}
 	}
 	function update(){  
 	    var firstname = $('#firstname').val();  
 	    var lastname = $('#lastname').val();  
 	    var email = $('#email').val();  
 	    var addressId = $('#addressid').val(); 
 	    
 	   var customerId = $('#customerId').val(); 
 	 
 	    $.ajax({  
 	        type: "get",  
 	        url: "/customerController/updateCustomer",  
 	        data: "firstname=" + firstname + "&lastname=" + lastname + "&email=" + email + "&addressid=" + addressId+"&customerid="+customerId,  
 	        dataType:"json", 
 	   
 	        success: function(result) {  
 	        	
 	            alert("更改成功！"); 
 	        		
 	        }  
 	    });  	
 	}
 	 var j=1;
 	function editInfo(customerid) {  
 	
 		$.ajax({
 			type:"get",
 			dataType:"json",
 			data:'customerid='+customerid,
 			url:"/customerController/getCustomer",//请求的后台地址
 			success:function(msg) {//msg:返回值
 				var json=msg;
 		      
 		       $('#firstname').val(json[1].customer.firstName); 
 		       $('#lastname').val(json[1].customer.lastName);
 		       $('#email').val(json[1].customer.email);
 		      $('#customerId').val(json[1].customer.customerId);
 		       var result="";
 		      for(var i=0;i<json[0].list1.length;i++)
       	   {
 		    	 
       	          if(json[1].customer.addressId==json[0].list1[i].addressId)
       	        	  {
       	        	 
       	        	  var address=json[0].list1[i].address;
       	        	  }
       	          var str='<option value="'+json[0].list1[i].addressId+'">'+json[0].list1[i].address+'</option>'
       	           result=result+str; 
       	   }
 		       var rel='<tr>'
 		    	    +'<td class="tableleft">Address</td>'
 		    	    +' <td><select name="addressid" id="addressid">'
 		    	    +' <option value="0" id="">'+address+'</option>'
 		    	    +result+
 		    	    +' </select>'
 		    	    +' </td>'
 		    	    +' </tr>';
 		    	    
 		    	    if(j==1)
 		    	  {
 		          $('#tr1').after(rel);
 		          j=0;
 		    	  }
 			}});
 		$('#myModal').modal('show');
 	}  
</script>