# SpringMvcExam

本次考试用Jetty 服务器 端口是8081
mvn clean compile

mvn jetty:run

localhost:8081/login.jsp

数据库 properties 地址  src/main/resources/db.properties

注意:登录后如果页面没有完全显示 ，轻按F5刷新一下 我也不知道为什么，有的时候会出现

新增的时候，由于数据库里面有些属性不能为空，所以必须将除了first_name,last_name.address_id,email,其他的字段设置为允许为空

测试拦截器的时候 可以http://localhost:8081/customerController/TogetCustomerList 访问这个controller   如果没有登录，会返回登录的界面
