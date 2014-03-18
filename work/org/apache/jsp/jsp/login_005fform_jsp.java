package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("a.pop_win_close {\r\n");
      out.write("\ttop: 5px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".pop_win {\r\n");
      out.write("\tpadding: 0\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".pop_win h3 {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tpadding: 12px 10px 8px 10px;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tcolor: #006600;\r\n");
      out.write("\tbackground: #ebf5eb;\r\n");
      out.write("\t*height: auto\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dui-dialog .hd h3 {\r\n");
      out.write("\tcolor: #006600\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".pop_win h3 span,.dui-dialog .hd h3 span {\r\n");
      out.write("\tcolor: #888;\r\n");
      out.write("\tfont-size: 12px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".pop_win h3 a,.dui-dialog .hd h3 a {\r\n");
      out.write("\tfont-size: 12px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#pop_win_login {\r\n");
      out.write("\tmargin: 15px;\r\n");
      out.write("\twidth: 280px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#pop_win_login fieldset {\r\n");
      out.write("\tborder: 0 none;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tmargin: 0\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#pop_win_login .item {\r\n");
      out.write("\tmargin: 15px 0 12px 0;\r\n");
      out.write("\toverflow: visible\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#pop_win_login label {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tmargin-right: 15px;\r\n");
      out.write("\ttext-align: right;\r\n");
      out.write("\twidth: 30px;\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tline-height: 30px;\r\n");
      out.write("\tvertical-align: baseline\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#pop_win_login label.sub {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tdisplay: inline;\r\n");
      out.write("\twidth: auto;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("\tfloat: none;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tcolor: #666\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#pop_win_login input {\r\n");
      out.write("\tmargin-right: 3px;\r\n");
      out.write("\tvertical-align: middle\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#pop_win_login .text {\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("\theight: 18px;\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\t-moz-border-radius: 3px;\r\n");
      out.write("\t-webkit-border-radius: 3px;\r\n");
      out.write("\tborder-radius: 3px;\r\n");
      out.write("\tborder: 1px solid #c9c9c9\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#pop_win_login .text:focus {\r\n");
      out.write("\tborder: 1px solid #a9a9a9\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<h3>登录<span> ( <a\r\n");
      out.write("\t\thref=\"http://www.izaojiao.com/register.php?city=shanghai\">还没有注册?</a>\r\n");
      out.write("\t\t)\r\n");
      out.write("\t</span>\r\n");
      out.write("</h3>\r\n");
      out.write("<form id=\"pop_win_login\" name=\"lzform\" method=\"post\"\r\n");
      out.write("\taction=\"http://localhost:8080/zaojiao/login\">\r\n");
      out.write("\t<fieldset>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"source\" value=\"simple\" />\r\n");
      out.write("\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t<label for=\"form_email\">帐号</label>\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"form_email\" class=\"text pop_email\" value=\"\" title=\"邮箱/手机号码\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t<label for=\"form_password\">密码</label>\r\n");
      out.write("\t\t\t<input type=\"password\" name=\"form_password\" id=\"pop_password\" class=\"text\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"item recsubmit\">\r\n");
      out.write("\t\t\t<label>&nbsp;</label>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<span class=\"bn-flat\"><input type=\"submit\" value=\"登录\"></span>\r\n");
      out.write("\t\t\t\t<a href=\"http://www.izaojiao.com/get_pass.php\" target=\"_blank\">忘记密码?</a>\r\n");
      out.write("\t\t\t\t<span class=\"red\" id=\"pop_tips\"></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</fieldset>\r\n");
      out.write("\t<div style=\"margin-left: 45px;\">\r\n");
      out.write("\t\t<div>您也可以用以下合作网站登录：</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a href=\"http://www.izaojiao.com/api/qq_login.php?city=shanghai\"\r\n");
      out.write("\t\t\t\tclass=\"qq\">QQ帐号</a> | \r\n");
      out.write("\t\t\t<a href=\"http://www.izaojiao.com/api/sina_login.php?city=shanghai\"\r\n");
      out.write("\t\t\t\tclass=\"sina\">新浪微博</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t(function() {\r\n");
      out.write("\t\tvar pop_email = $(\".pop_email\");\r\n");
      out.write("\t\tif (pop_email.val()) {\r\n");
      out.write("\t\t\tsetTimeout(function() {\r\n");
      out.write("\t\t\t\t$(\"#pop_password\").focus();\r\n");
      out.write("\t\t\t}, 300);\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tsetTimeout(function() {\r\n");
      out.write("\t\t\t\tpop_email.focus();\r\n");
      out.write("\t\t\t}, 300);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tpop_email.focus(function() {\r\n");
      out.write("\t\t\t$(\"#pop_tips\").html('');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(\"#pop_password\").focus(function() {\r\n");
      out.write("\t\t\t$(\"#pop_tips\").html('');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$('#pop_win_login').submit(\r\n");
      out.write("\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\tvar paras = \"act=login&loginId=\" + pop_email.val()\r\n");
      out.write("\t\t\t\t\t\t\t+ \"&pwd=\" + $(\"#pop_password\").val();\r\n");
      out.write("\t\t\t\t\t$.post(\"http://localhost:8080/zaojiao/login\", paras, function(r) {\r\n");
      out.write("\t\t\t\t\t\tvar res = $.trim(r).split(\"\\t\");\r\n");
      out.write("\t\t\t\t\t\tif (res[0] == \"null\") {\r\n");
      out.write("\t\t\t\t\t\t\t//$(\"#pop_tips\").html(res[1]);\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#pop_tips\").html('请检查您的帐号和密码');\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\tsetTimeout(\"reloadpage()\", 120);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t})();\r\n");
      out.write("</script>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
