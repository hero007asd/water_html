package org.apache.jsp.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class wQuality_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>水质检测</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(" body,form,ul,li,a,ol,h1,h2,h3,h4,h5,h6,input,textarea,img{margin:0px;padding:0px;}  \r\n");
      out.write("ul,li,dl{list-style-type:none;} \r\n");
      out.write("body{font-size: 12px;font-family: \"Microsoft YaHei\";color:#777777; overflow:auto;}\r\n");
      out.write(".w_div{width: 100%;height: 1000px; border: 1px solid red;}\r\n");
      out.write(".w_top{width: 100%;height: 50px;}\r\n");
      out.write(".w_top h1{text-align: center;font-weight: bold;color: black;font-size: 36px;margin-top: 5px;}\r\n");
      out.write(".w_content{width: 100%;height: 100%;border: 1px solid blue;margin-top: 15px;}\r\n");
      out.write(".w_contentLeft{width: 49%; border: 1px solid blue;height: 900px;float: left;margin-right: 30px;}\r\n");
      out.write(".w_contentRight{width: 49%;height: 500px;border: 1px solid blue;float: left;}\r\n");
      out.write(".w_logo{display: block;float: right;margin-top: -35px;margin-right: 30px;width: 70px;height: 40px;text-align: center;}\r\n");
      out.write(".w_conTop{width: 100%;float: left;height: 800px;border: 1px solid blue;margin-bottom: 15px;}\r\n");
      out.write(".w_conComm{width: 100%;height: auto;border: 1px solid red;}\r\n");
      out.write(".w_conComm input{display: block; width: 200px;height: 50px;margin-left: 150px;float: left;}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"w_div\">\r\n");
      out.write("\t\t<div class=\"w_top\"><h1>水质检测系统</h1><input type=\"button\" name=\"logo\" id=\"logo\" value=\"登录\" class=\"w_logo\"/></div>\r\n");
      out.write("\t\t<div class=\"w_content\">\r\n");
      out.write("\t\t\t<div class=\"w_contentLeft\">\r\n");
      out.write("\t\t\t\t<div class=\"w_conTop\" id=\"map\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"w_conComm\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" name=\"company\" id=\"company\" value=\"自来水公司分布图\"/>\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" name=\"region\" id=\"region\" value=\"上海行政区分布图\"/>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"w_contentRight\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
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
