/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M17
 * Generated at: 2017-05-29 07:52:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newempreg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write(" ");
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
      out.write(' ');
      out.write('\n');
      out.write('\n');
      out.write('\n');


	session=request.getSession();
	Integer user=(Integer) session.getAttribute("userid");
//	String empid=(String)session.getAttribute("eid");
	if(user!=null)
	{



      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\n");
      out.write("function validateemp()\n");
      out.write("{\n");
      out.write("\n");
      out.write("\tvar fullname=document.getElementById('ename').value;\n");
      out.write("\tvar name = /^[a-zA-Z  ]+$/;\n");
      out.write("\t\n");
      out.write(" \tif(fullname.length==null ||!name.test(fullname))\n");
      out.write(" \t{\n");
      out.write(" \t\talert(\"Enter Name which contains only alphabets \");\n");
      out.write(" \t\treturn false;\n");
      out.write(" \t\t\n");
      out.write(" \t}\n");
      out.write(" \tif($('#eadd').val()==null || $('#eadd').val()==\"\")\n");
      out.write("  \t{\n");
      out.write("\t\t alert(\"Please Enter Address\");\n");
      out.write("\t\t return false;\n");
      out.write("     }\t\n");
      out.write(" \t\n");
      out.write(" \tif($('#cname').val()==null || $('#cname').val()==\"\")\n");
      out.write("  \t{\n");
      out.write("\t\t alert(\"Please Enter Company name\");\n");
      out.write("\t\t return false;\n");
      out.write("     }\t\n");
      out.write(" \t\n");
      out.write(" \tvar eage=document.getElementById('num').value;\n");
      out.write(" \t\n");
      out.write(" \tif($('#num').val()>100 || $('#num').val()<1)\n");
      out.write(" \t{\n");
      out.write(" \t\talert(\"Enter valid age\");\n");
      out.write(" \t\treturn false;\n");
      out.write(" \t\t\n");
      out.write(" \t}\t\n");
      out.write(" \tvar esall=document.getElementById('sal').value;\n");
      out.write(" /* \tif($('#sal').val()>1000 || $('#sal').val()<1) */\n");
      out.write(" \tif(esall>1000 || esall<1)\n");
      out.write(" \t{\n");
      out.write(" \t\talert(\"Enter valid salary (0-1000)\");\n");
      out.write(" \t\treturn false;\n");
      out.write(" \t\t\n");
      out.write(" \t}\n");
      out.write(" \t\n");
      out.write(" \tvar spec=document.empregstn.specialization;\n");
      out.write(" \tfor(var i=0;i<spec.length;i++)\n");
      out.write(" \t{\n");
      out.write(" \t\tif(spec[i].checked)\n");
      out.write(" \t\t\tbreak;\n");
      out.write(" \t\telse \n");
      out.write(" \t\talert(\"Please select Specialization\");\n");
      out.write(" \t\treturn false;\n");
      out.write(" \t}\t\n");
      out.write("\n");
      out.write(" \tvar laung=document.empregstn.language;\n");
      out.write(" \tfor(var i=0;i<laung.length;i++)\n");
      out.write(" \t{\n");
      out.write(" \t\tif(laung[i].checked)\n");
      out.write(" \t\t\tbreak;\n");
      out.write(" \t\telse \n");
      out.write(" \t\talert(\"Please select Language\");\n");
      out.write(" \t\treturn false;\n");
      out.write(" \t}\t\n");
      out.write(" \t\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write(".container{\n");
      out.write("margin-top: 80px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("/* #empre{\n");
      out.write("border: 2px solid black;\n");
      out.write("} */\n");
      out.write(".empreg{\n");
      out.write("border: 2px solid black;\n");
      out.write("background-color: #f0f5f5;\n");
      out.write("padding-bottom: 40px;\n");
      out.write("padding-top: 10px;\n");
      out.write("padding-left: 20px;\n");
      out.write("padding-right: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"col-lg-4 col-md-3 col-sm-2\">\n");
      out.write("</div>\n");
      out.write("<div class=\"col-lg-4 col-md-6 col-sm-8\" id=\"empre\">\n");
      out.write("\n");
      out.write("  <form action=\"EmployeeForm\"method=\"post\" onsubmit=\"return validateemp()\" class=\"empreg\" name=\"empregstn\">\n");
      out.write("\t\t\n");
      out.write("  <h2> Employee Registration</h2>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label  >Employee Name</label>\n");
      out.write("      <input type=\"text\" id=\"ename\" placeholder=\"Enter  name\" name=\"name\" >\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label id=\"addid\" >Address</label>\n");
      out.write("       <textarea  rows=\"3\" id=\"eadd\"  placeholder=\"Enter Address\" name=\"address\"    style=\"margin-left:50px\"></textarea>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label  >Company Name</label>\n");
      out.write("     <input type=\"text\" id=\"cname\" placeholder=\"Enter company name\" name=\"company\"  >\n");
      out.write("    </div>\n");
      out.write("     <div class=\"form-group\">\n");
      out.write("      <label >Age</label>\n");
      out.write("      <input type=\"number\" id=\"num\"placeholder=\"Enter Age\" name=\"age\" style=\"margin-left:80px\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label >Salary</label>\n");
      out.write("      <input type=\"number\" id=\"sal\"placeholder=\"Enter Salary\" name=\"salary\"  style=\"margin-left:65px\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label >Gender</label>\n");
      out.write("      <input type=\"radio\" name=\"gender\" value=\"male\"  checked style=\"margin-left:50px\">Male &nbsp &nbsp\n");
      out.write("\t\t\t\t<input type=\"radio\" name=\"gender\" value=\"female\">Female\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label >Specialization</label>\n");
      out.write("     <input type=\"checkbox\" id=\"spe\" value=\"java\" name=\"specialization\" checked>Java &nbsp &nbsp\n");
      out.write("\t\t\t<input type=\"checkbox\" id=\"spe\"  value=\".net\" name=\"specialization\"> .Net &nbsp &nbsp\n");
      out.write("\t\t\t<input type=\"checkbox\" id=\"spe\"  value=\"ios\" name=\"specialization\"> iOS&nbsp &nbsp\n");
      out.write("\t\t\t<input type=\"checkbox\" id=\"spe\"  value=\"android\" name=\"specialization\"> Android &nbsp &nbsp\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label >Languages</label>\n");
      out.write("      <input type=\"checkbox\" name=\"language\" value=\"English\" checked>English &nbsp &nbsp\n");
      out.write("\t\t\t<input type=\"checkbox\" name=\"language\" value=\"Hindi\"> Hindi &nbsp &nbsp\n");
      out.write("\t\t\t<input type=\"checkbox\" name=\"language\" value=\"Marathi\"> Marathi &nbsp &nbsp\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("   <div class=\"form-group\">\n");
      out.write("    <input type=\"submit\" value=\"Submit\"  class=\"btn btn-success btn-block\" >\n");
      out.write("\t\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"form-group\">\n");
      out.write("\t<input type=\"Reset\"  value=\"Reset\"  class=\"btn btn-primary btn-block\">\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"col-lg-4 col-md-3 col-sm-2\">\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");


	 }
	
	  else
	  {
		  response.sendRedirect("Prelogin");
	  }


	 


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- ................................................\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\" \t>\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"col-lg-4 col-md-3 col-sm-2\"></div>\n");
      out.write("\n");
      out.write("<div class=\"col-lg-4 col-md-6 col-sm-8\">\n");
      out.write("<form action=\"EmployeeForm\"method=\"post\" onsubmit=\"return validateemp()\" class=\"empreg\">\n");
      out.write("\t\t<h2> Employee Registration</h2>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<table >\n");
      out.write("\t\t\t  <tr> \n");
      out.write("\t\t\t   <td><b>Employee Name </b></td>\n");
      out.write("\t\t\t   <td><input type=\"text\" id=\"ename\" placeholder=\"Enter  name\" name=\"name\" required></td>\n");
      out.write("\t\t\t  </tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t<td><b>Address </b></td>\n");
      out.write("\t\t\t<td> <textarea  rows=\"3\" id=\"eadd\"  placeholder=\"Enter Address\" name=\"address\" required  ></textarea>\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t<td><b>Company Name </b></td>\n");
      out.write("\t\t\t<td> <input type=\"text\" id=\"cname\" placeholder=\"Enter company name\" name=\"company\" required ></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td><b>Age</b></td>\n");
      out.write("\t\t\t\t<td><input type=\"number\" id=\"num\"placeholder=\"Enter Age\" name=\"age\" required></td>\n");
      out.write("\t\t\t</tr>\t\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td><b>Salary</b><br>(in lacs per annum)</td>\n");
      out.write("\t\t\t\t<td><input type=\"number\" id=\"num1\"placeholder=\"Enter Salary\" name=\"salary\" required></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t<td><b>Gender</b></td>\n");
      out.write("\t\t\t<td><input type=\"radio\" name=\"gender\" value=\"male\"  checked>Male &nbsp &nbsp\n");
      out.write("\t\t\t\t<input type=\"radio\" name=\"gender\" value=\"female\">Female\n");
      out.write("\t\t\t</td> \n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr >\n");
      out.write("\t\t\t<td><b>Specialization </b></td>\n");
      out.write("\t\t\t<td ><input type=\"checkbox\" id=\"spe\" value=\"java\" name=\"specialization\">Java &nbsp &nbsp\n");
      out.write("\t\t\t<input type=\"checkbox\" id=\"spe\"  value=\".net\" name=\"specialization\"> .Net &nbsp &nbsp\n");
      out.write("\t\t\t<input type=\"checkbox\" id=\"spe\"  value=\"ios\" name=\"specialization\"> iOS&nbsp &nbsp\n");
      out.write("\t\t\t<input type=\"checkbox\" id=\"spe\"  value=\"android\" name=\"specialization\"> Android &nbsp &nbsp\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t<td><b>Languages Known</b></td>\n");
      out.write("\t\t\t<td><input type=\"checkbox\" name=\"language\" value=\"English\" >English &nbsp &nbsp\n");
      out.write("\t\t\t<input type=\"checkbox\" name=\"language\" value=\"Hindi\"> Hindi &nbsp &nbsp\n");
      out.write("\t\t\t<input type=\"checkbox\" name=\"language\" value=\"Marathi\"> Marathi &nbsp &nbsp\n");
      out.write("\t\t\t</td> \n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr><td><td><input type=\"submit\" value=\"Submit\"  class=\"btn btn-success btn-lg\" >\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<input type=\"Reset\"  value=\"Reset\"  class=\"btn btn-primary btn-lg\"></td></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\t\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("\t</form>\n");
      out.write("</div> \n");
      out.write("\n");
      out.write("<div class=\"col-lg-4 col-md-3 col-sm-2\"></div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("........................\n");
      out.write(" -->\n");
      out.write("\n");
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
