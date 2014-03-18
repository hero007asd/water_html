package org.apache.jsp.templates.hardsocket;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class year_html extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../site_media/js/jquery.min.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$().ready(function(){\r\n");
      out.write("//     $(\"#bta\").click(function(){\r\n");
      out.write("//         $(\"#unit\").stop(true,false).animate({\"left\":0},500);\r\n");
      out.write("//     });\r\n");
      out.write("    $(\"#btb\").click(function(){\r\n");
      out.write("        $(\"#unit\").stop(true,false).animate({\"left\":-150},500);\r\n");
      out.write("    })\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("*{padding:0; margin:0;}\r\n");
      out.write("#box{width:300px; height:150px; margin-bottom:50px; position:relative; overflow:hidden;}\r\n");
      out.write("#unit{width:600px; position:absolute;}\r\n");
      out.write("#unit div{float:left; width:300px; height:150px;}\r\n");
      out.write("#bga{background-color:#F30;}\r\n");
      out.write("#bgb{background-color:#F90;}\r\n");
      out.write("#bta,#btb{float:left; width:50px; padding-right:50px; color:#FFF; cursor:pointer;}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<title>jquery左右滑动效果的实现</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"width:800px; height:300px; padding-top:100px; background-color:#999; margin:0 auto;\">\r\n");
      out.write("    <div id=\"box\">\r\n");
      out.write("        <div id=\"unit\">\r\n");
      out.write("<!--             <div id=\"bga\">框一</div> -->\r\n");
      out.write("            <div id=\"bgb\">框二</div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("<!--     <div id=\"bta\">左</div> -->\r\n");
      out.write("    <div id=\"btb\">右</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
