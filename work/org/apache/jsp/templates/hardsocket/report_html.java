package org.apache.jsp.templates.hardsocket;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class report_html extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link href=\"../../site_media/css/css.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../site_media/js/jquery.min.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"../../site_media/js/jscharts.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../site_media/js/report.js\"></script>  \r\n");
      out.write("<title>水质检测</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".w_content{border: 1px solid white;padding: 10px;}\r\n");
      out.write(".r_top{width: 100%;height: 50px;margin: 20px 0 5px 0;}\r\n");
      out.write(".r_top input{float: left;margin-left: 50px;width: 90px;height: 30px;text-align: center;font-weight: bold;font-size: 18px;}\r\n");
      out.write(".r_con{width: 90%;height: auto;margin: auto;margin-bottom: 30px;}\r\n");
      out.write(".r_con table{text-align: center;width: 100%;color: black;font-weight: bold;font-size: 20px;}\r\n");
      out.write(".r_con table tr th{height: 50px;}\r\n");
      out.write(".r_con table tr td{height: 40px;}\r\n");
      out.write(".ri{border-left:2px solid white;}\r\n");
      out.write(".r_con table tr td{background-color:expression((this.parentElement.sectionRowIndex%2==0)?'#efffa7':'#fff');}\r\n");
      out.write(".back{float: right;margin-right:60%;}\r\n");
      out.write(".maspan{color: black;padding-left: 50px;font-size: 18px;font-weight: bold;}\r\n");
      out.write(".r_con1{width: 100%;height: auto;}\r\n");
      out.write(".r_con1 table{width: 100%;height: auto;}\r\n");
      out.write(".r_con1 talbe tr td{width: 100px;height: 30px;}\r\n");
      out.write(".r_con2{width: 100%;height: auto;margin-bottom: 20px;margin-top: 50px;}\r\n");
      out.write(".r_con2 input{float: left;margin-left: 100px;width: 150px;height: 50px;margin-bottom: 20px;font-size: 18px;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"w_div\">\r\n");
      out.write("\t\t<div class=\"w_top\"><h1>水质检测系统</h1><input type=\"button\" name=\"logo\" id=\"logo\" value=\"登录\" class=\"w_logo\"/></div>\r\n");
      out.write("\t\t<div class=\"w_content\">\r\n");
      out.write("\t\t\t<div class=\"r_top\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"r_con\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
