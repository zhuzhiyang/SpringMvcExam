/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.11.v20150529
 * Generated at: 2016-08-21 12:11:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    ");

      String path = request.getContextPath();
      String basePath = request.getScheme() + "://"
                  + request.getServerName() + ":" + request.getServerPort()
                  + path + "/";

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>后台管理系统</title>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("   <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("css/bootstrap.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("css/bootstrap-responsive.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("css/style.css\" />\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/bootstrap.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/ckform.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/common.js\"></script>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        body {\r\n");
      out.write("            padding-top: 40px;\r\n");
      out.write("            padding-bottom: 40px;\r\n");
      out.write("            background-color: red;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-signin {\r\n");
      out.write("            max-width: 300px;\r\n");
      out.write("            padding: 19px 29px 29px;\r\n");
      out.write("            margin: 0 auto 20px;\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("            border: 1px solid #e5e5e5;\r\n");
      out.write("            -webkit-border-radius: 5px;\r\n");
      out.write("            -moz-border-radius: 5px;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            -webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);\r\n");
      out.write("            -moz-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);\r\n");
      out.write("            box-shadow: 0 1px 2px rgba(0, 0, 0, .05);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-signin .form-signin-heading,\r\n");
      out.write("        .form-signin .checkbox {\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-signin input[type=\"text\"],\r\n");
      out.write("        .form-signin input[type=\"password\"] {\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            height: auto;\r\n");
      out.write("            margin-bottom: 15px;\r\n");
      out.write("            padding: 7px 9px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </style>  \r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background:url(");
      out.print(basePath);
      out.write("image/1.gif);background-repeat: no-repeat;background-size :100%\">\r\n");
      out.write("<div class=\"backgrond\" >\r\n");
      out.write("<P style=\"font-size:30px\">10980--朱智阳</P>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("    <form class=\"form-signin\" method=\"post\" action=\"/customerController/login\" style=\"background:#049ff1\" >\r\n");
      out.write("        <h2 class=\"form-signin-heading\" >电影租赁管理系统</h2>\r\n");
      out.write("        <input type=\"text\" name=\"username\" class=\"input-block-level\" placeholder=\"账号\">\r\n");
      out.write("        <input type=\"password\" name=\"password\" class=\"input-block-level\" placeholder=\"密码\">\r\n");
      out.write("     \r\n");
      out.write("        <p><button class=\"btn btn-large btn-primary\" type=\"submit\" style=\"margin-left:220px;\">登录</button></p>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}