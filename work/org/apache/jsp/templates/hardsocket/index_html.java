package org.apache.jsp.templates.hardsocket;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_html extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write(".bg {\r\n");
      out.write("\tbackground-image: url(../../site_media/img/004.jpg);\r\n");
      out.write("\tbackground-repeat: no-repeat;\r\n");
      out.write("}\r\n");
      out.write(".line001 {\r\n");
      out.write("\tborder-right-width: 1px;\r\n");
      out.write("\tborder-bottom-width: 1px;\r\n");
      out.write("\tborder-right-style: solid;\r\n");
      out.write("\tborder-bottom-style: solid;\r\n");
      out.write("\tborder-right-color: #607495;\r\n");
      out.write("\tborder-bottom-color: #607495;\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("}\r\n");
      out.write(".line002 {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("\tborder-bottom-width: 1px;\r\n");
      out.write("\tborder-bottom-style: solid;\r\n");
      out.write("\tborder-bottom-color: #607495;\r\n");
      out.write("}\r\n");
      out.write(".f20px {\r\n");
      out.write("\tfont-family: \"微软雅黑\", \"Arial Unicode MS\";\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".line003 {\r\n");
      out.write("\tfont-family: \"微软雅黑\", \"Arial Unicode MS\";\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\tcolor: #539FDF;\r\n");
      out.write("\tborder-right-width: 1px;\r\n");
      out.write("\tborder-bottom-width: 1px;\r\n");
      out.write("\tborder-right-style: solid;\r\n");
      out.write("\tborder-bottom-style: solid;\r\n");
      out.write("\tborder-right-color: #607495;\r\n");
      out.write("\tborder-bottom-color: #607495;\r\n");
      out.write("}\r\n");
      out.write(".line004 {\r\n");
      out.write("\tfont-family: \"微软雅黑\", \"Arial Unicode MS\";\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\tcolor: #539FDF;\r\n");
      out.write("\tborder-bottom-width: 1px;\r\n");
      out.write("\tborder-bottom-style: solid;\r\n");
      out.write("\tborder-bottom-color: #607495;\r\n");
      out.write("}\r\n");
      out.write(".line005 {\r\n");
      out.write("\tborder-top-width: 1px;\r\n");
      out.write("\tborder-right-width: 1px;\r\n");
      out.write("\tborder-top-style: solid;\r\n");
      out.write("\tborder-right-style: solid;\r\n");
      out.write("\tborder-top-color: #62A1D6;\r\n");
      out.write("\tborder-right-color: #62A1D6;\r\n");
      out.write("\tborder-left-width: 1px;\r\n");
      out.write("\tborder-left-style: solid;\r\n");
      out.write("\tborder-left-color: #62A1D6;\r\n");
      out.write("}\r\n");
      out.write(".line006 {\r\n");
      out.write("\tborder: 1px solid #62A1D6;\r\n");
      out.write("}\r\n");
      out.write(".f18px {\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tcolor: #54A0DF;\r\n");
      out.write("}\r\n");
      out.write(".line007 {\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\tcolor: #54A0DF;\r\n");
      out.write("\tborder-right-width: 1px;\r\n");
      out.write("\tborder-right-style: solid;\r\n");
      out.write("\tborder-right-color: #54A0DF;\r\n");
      out.write("}\r\n");
      out.write(".f18pxw {\r\n");
      out.write("\tfont-family: \"微软雅黑\", \"Arial Unicode MS\";\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-color: #1F5183;\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("\tmargin-top: 0px;\r\n");
      out.write("\tmargin-right: 0px;\r\n");
      out.write("\tmargin-bottom: 0px;\r\n");
      out.write("}\r\n");
      out.write(".f24px {\r\n");
      out.write("\tfont-family: \"微软雅黑\", \"Arial Unicode MS\";\r\n");
      out.write("\tfont-size: 24px;\r\n");
      out.write("\tfont-weight: normal;\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("\tletter-spacing: 10px;\r\n");
      out.write("}\r\n");
      out.write(".sr001 {\r\n");
      out.write("\theight: 33px;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tborder: 1px solid #A0C5E4;\r\n");
      out.write("\tbackground-color: #2D71AE;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("function log(){\r\n");
      out.write("\twindow.location.href=\"aa.html\";\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"87\" align=\"center\" background=\"../../site_media/img/01.jpg\"><img src=\"../../site_media/img/002.png\" width=\"401\" height=\"48\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"2\" background=\"../../site_media/img/03.jpg\"><img src=\"../../site_media/img/03.jpg\" width=\"4\" height=\"4\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"20\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"860\" align=\"center\" bgcolor=\"#3969A9\"><table width=\"500\" border=\"0\" cellspacing=\"0\" cellpadding=\"1\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td class=\"line005\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"50\" colspan=\"6\" align=\"center\" background=\"../../site_media/img/005.jpg\"><table width=\"250\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"50\" align=\"center\"><img src=\"../../site_media/img/009.png\" alt=\"\" width=\"11\" height=\"11\" /></td>\r\n");
      out.write("                <td align=\"center\" class=\"f24px\">登录系统</td>\r\n");
      out.write("                <td width=\"50\" align=\"center\"><img src=\"../../site_media/img/009.png\" alt=\"\" width=\"11\" height=\"11\" /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"31\" colspan=\"6\" align=\"center\" background=\"../../site_media/img/006.jpg\" class=\"line003\">&nbsp;</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"250\" colspan=\"6\" align=\"center\" background=\"../../site_media/img/007.png\" class=\"line001\"><table width=\"90%\" border=\"0\" cellspacing=\"20\" cellpadding=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"48\" class=\"f18pxw\">用户名:</td>\r\n");
      out.write("                <td><input name=\"textfield\" type=\"text\" class=\"sr001\" id=\"textfield\" /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td class=\"f18pxw\">密&nbsp;&nbsp;&nbsp;&nbsp;码:</td>\r\n");
      out.write("                <td><input name=\"textfield2\" type=\"text\" class=\"sr001\" id=\"textfield2\" /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("              <p><img src=\"../../site_media/img/l001.png\" width=\"180\" height=\"50\" onclick=\"log();\"/></p></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    <p>&nbsp;</p>\r\n");
      out.write("    <p>&nbsp;</p></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
