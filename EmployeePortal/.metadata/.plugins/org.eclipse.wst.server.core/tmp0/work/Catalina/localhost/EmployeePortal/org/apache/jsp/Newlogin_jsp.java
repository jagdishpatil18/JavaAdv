/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M17
 * Generated at: 2017-05-29 07:00:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import java.io.*;

public final class Newlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/header.jsp", Long.valueOf(1495861497000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("<title>EmployeePortal</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<!-- jQuery library -->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Latest compiled JavaScript -->\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<style>\n");
      out.write(".portalname{\n");
      out.write("color: \t \t #ecf2f9;\n");
      out.write("padding: 8px 15px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("\t<div class=\"container-fluid\">\n");
      out.write("\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t ");
if(session.getAttribute("userid")!=null) {
      out.write("\n");
      out.write("\t\t  <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("             <span class=\"icon-bar\"></span>\n");
      out.write("             <span class=\"icon-bar\"></span>\n");
      out.write("             <span class=\"icon-bar\"></span>                        \n");
      out.write("          </button>\n");
      out.write("        ");
} 
      out.write("\n");
      out.write("        <h4 class=\"portalname\"><b>EmployeePortal</b></h4>\n");
      out.write("\t<!-- \t\t<a class=\"navbar-brand\" >Employee Portal</a> -->\n");
      out.write("\t    </div>\n");
      out.write("\t\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t");
if(session.getAttribute("userid")!=null) {
      out.write("\n");
      out.write("\t\t\t<li><a href=\"EmployeeDetails\">EmployeeDetails</a></li>\n");
      out.write("\t\t\t");
} 
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t");
if(session.getAttribute("userid")!=null){
      out.write("\n");
      out.write("<!-- \t\t  <li class=\"hli\" style=\"float: right \"><form action=\"Logout\" method=\"post\"  class=\"logout\">\n");
      out.write("               <input id=\"hlogout\" type=\"submit\" value=\"Logout\" class=\"btn btn-primary\">  -->\t\t\t\n");
      out.write("\t\t\t  <li><a href=\"Logout\">Logout</a></li>\n");
      out.write("\t\t\t");
 }
      out.write("\n");
      out.write("\t\t </ul>\n");
      out.write("\t\n");
      out.write("       </div>\n");
      out.write("\t</div>\n");
      out.write("\t</nav>\n");
      out.write("</body>");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- jQuery library -->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Latest compiled JavaScript -->\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("function validatelogin()\n");
      out.write("{\n");
      out.write("\n");
      out.write("    var email = document.getElementById('email');\n");
      out.write("    var filter = /^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$/;\n");
      out.write("    \n");
      out.write("    var password=document.getElementById('pwd');\n");
      out.write("\tvar pass=password.value;\n");
      out.write("\t\n");
      out.write("    if(!filter.test(email.value))\n");
      out.write("    {\n");
      out.write("    \talert(\"Enter valid Email\");\n");
      out.write("    \treturn false;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\t\n");
      out.write(" \tif(pass==\"\" || pass==null )\n");
      out.write("  \t{\n");
      out.write("\t\t alert(\"Enter Password correctly\");\n");
      out.write("\t\t return false;\n");
      out.write("     }\t\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write(".container{\n");
      out.write(" \n");
      out.write("margin-top: 100px;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".formlogin{\n");
      out.write("/* border:2px solid; */\t\n");
      out.write("background-color:#f0f5f5 ;\n");
      out.write("padding-bottom: 40px;\n");
      out.write("padding-top: 10px;\n");
      out.write("padding-left: 20px;\n");
      out.write("padding-right: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#h2login{\n");
      out.write("text-align: center;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body>\n");
 
if((Integer) session.getAttribute("userid")==null) {
      out.write("\n");
      out.write("<div class=\"container\" \t>\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"col-lg-4 col-md-3 col-sm-2\">\n");
      out.write("</div>\n");
      out.write("<div class=\"col-lg-4 col-md-6 col-sm-8\">\n");
      out.write("  \n");
      out.write("  <form role=\"form\" action=\"LoginServlet\" method=\"Post\" class=\"formlogin\">\n");
      out.write("  <h2 id=\"h2login\">Login Form</h2>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"email\" >&nbsp Email</label>\n");
      out.write("      <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Enter email\" name=\"email\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"pwd\">&nbsp Password</label>\n");
      out.write("      <input type=\"password\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter password\" name=\"password\">\n");
      out.write("    </div>\n");
      out.write("    ");
  String msg= (String)session.getAttribute("errormsg");
    	System.out.println("Error msg is ::"+msg );	  
   	 if(msg!=null)
   	 { 
      out.write(" \t \n");
      out.write("   \t\t <div><p style=\"color:red ; text-align:center\">");
 out.println(msg); 
      out.write("</p></div>\t \n");
      out.write("  ");
} 
      out.write("  \n");
      out.write("    <input id=\"sublog\" type=\"submit\" value=\"Login\" onclick=\"return validatelogin()\"  class=\"btn btn-success btn-block\" >\n");
      out.write("\t<button   formaction=\"Preuserreg\" class=\"btn btn-primary btn-block\">SignUp</button>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"col-lg-4 col-md-3 col-sm-2\">\n");
      out.write("</div>\n");
      out.write("</div>\n");
 }else{ response.sendRedirect("Employee");} 
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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