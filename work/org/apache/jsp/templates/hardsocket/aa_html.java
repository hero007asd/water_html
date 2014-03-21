package org.apache.jsp.templates.hardsocket;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aa_html extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type=\"text/javascript\" src=\"../../site_media/js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../site_media/js/page.js\"></script> \r\n");
      out.write("<link href=\"../../site_media/css/css.css\" type=\"text/css\" rel=\"stylesheet\" /> \r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {background-color: #1F5183;margin-left: 0px;margin-top: 0px;margin-right: 0px;margin-bottom: 0px;}\r\n");
      out.write(".p_con{width: 100%;height:840px; background: #3969A9;}\r\n");
      out.write("/*background: url(../../site_media/img/004.jpg);background-repeat: no-repeat;*/\r\n");
      out.write(".p_content{width: 980px;height: 840px;margin-left: 130px;background-position: 0px 30px;}\r\n");
      out.write(".p_top{width: 520px;height: 65px;position: absolute;top: 110px;left: 60px; } \r\n");
      out.write("/* .p_top a,.p_bottom a{float: left;background: url(../../site_media/img/b002.png);background-repeat: no-repeat;width: 50%;height: 63px;text-align: center;color:white;text-decoration: none;padding-top: 20px;font-weight: bold;font-size: 22px;} */\r\n");
      out.write("/* .p_star a,.p_bottom a{float: left;background: url(../../site_media/img/b001.png);background-repeat: no-repeat;width: 50%;height: 63px;text-align: center;color:white;text-decoration: none;padding-top: 20px;font-weight: bold;font-size: 22px;} */\r\n");
      out.write(".p_left{width: 1000px;height: auto;float: left;margin-top: 10px;margin-left: 15px;}\r\n");
      out.write(".p_corp{float: left;background: url(../../site_media/img/b002.png);background-repeat: no-repeat;width: 50%;height: 63px;text-align: center;color:white;text-decoration: none;padding-top: 20px;font-weight: bold;font-size: 22px;}\r\n");
      out.write(".p_star{float: left;background: url(../../site_media/img/b001.png);background-repeat: no-repeat;width: 50%;height: 63px;text-align: center;color:white;text-decoration: none;padding-top: 20px;font-weight: bold;font-size: 22px;}\r\n");
      out.write("\r\n");
      out.write(".p_right{width: 550px;height:auto;color: white;position: absolute;top:300px;right: 130px;font-size: 15px;}\r\n");
      out.write(".line003{border-bottom: 1px solid #607495;border-right: 1px solid #607495;color: #539FDF;font-family: \"微软雅黑\",\"Arial Unicode MS\";font-size: 16px;height: 50px;font-weight: bold;}\r\n");
      out.write(".line001 {border-right-width: 1px;border-bottom-width: 1px;border-right-style: solid;border-bottom-style: solid;border-right-color: #607495;border-bottom-color: #607495;font-size: 14px;color: #FFF;}\r\n");
      out.write(".line002 {font-size: 14px;color: #FFF;border-bottom-width: 1px;border-bottom-style: solid;border-bottom-color: #607495;}\r\n");
      out.write(".f20px {font-family: \"微软雅黑\", \"Arial Unicode MS\";font-size: 20px;color: #FFF;font-weight: bold;}\r\n");
      out.write(".line005 {border-top-width: 1px;border-right-width: 1px;border-top-style: solid;border-right-style: solid;border-top-color: #62A1D6;border-right-color: #62A1D6;border-left-width: 1px;border-left-style: solid;border-left-color: #62A1D6;}\r\n");
      out.write(".p_bottom{width: 530px;height: 65px;position: absolute;top:220px;left: 65%;}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t//鼠标放到a标签事件\r\n");
      out.write("// \t $(\".p_corp\").hover(function(){\r\n");
      out.write("// \t        $(this).removeClass(\"p_corp\");\r\n");
      out.write("// \t        $(this).addClass(\"p_star\");\r\n");
      out.write("//         },function(){\r\n");
      out.write("//         \t $(this).removeClass(\"p_star\");\r\n");
      out.write("//              $(this).addClass(\"p_corp\");\r\n");
      out.write("//            });\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
      out.write("<div class=\"p_con\">\r\n");
      out.write("\t<div class=\"p_content\">\r\n");
      out.write("\t\t<div class=\"p_top\" id=\"p_top\"><a href=\"javascript://\" id=\"p_corp\" class=\"p_corp\" >自来水公司分布图</a><a href=\"javascript://\" id=\"p_star\" class=\"p_corp\">上海行政区分布图</a></div>\r\n");
      out.write("\t<div class=\"p_bottom\">\r\n");
      out.write("\t\t<a href=\"report.html?stat=1\" class=\"p_corp\" >水质报表</a>\r\n");
      out.write("\t\t<a href=\"report.html?stat=2\" class=\"p_corp\" >水质趋势图</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"p_left\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t<div class=\"p_right\">\r\n");
      out.write("<!-- \t\t\t<table width=\"550\" border=\"0\" cellspacing=\"0\" cellpadding=\"1\">  -->\r\n");
      out.write("<!-- \t          <tr> -->\r\n");
      out.write("<!-- \t            <td class=\"line005\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"> -->\r\n");
      out.write("<!-- \t              <tr> -->\r\n");
      out.write("<!-- \t                <td height=\"50\" colspan=\"6\" background=\"../../site_media/img/005.jpg\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"f20px\"> -->\r\n");
      out.write("<!-- \t                  <tr> -->\r\n");
      out.write("<!-- \t                    <td width=\"50\" align=\"center\"><img src=\"../../site_media/img/009.png\" alt=\"\" width=\"11\" height=\"11\" /></td> -->\r\n");
      out.write("<!-- \t                    <td>上海自来水市北有限公司</td> -->\r\n");
      out.write("<!-- \t                    <td width=\"100\" align=\"center\"><img src=\"../../site_media/img/dy.png\" width=\"78\" height=\"27\" /></td> -->\r\n");
      out.write("<!-- \t                  </tr> -->\r\n");
      out.write("<!-- \t                </table></td> -->\r\n");
      out.write("<!-- \t              </tr> -->\r\n");
      out.write("<!-- \t              <tr> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/006_1.jpg\" class=\"line003\">上海自来水公司</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/006_1.jpg\" class=\"line003\">浊度(ntu)</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/006_1.jpg\" class=\"line003\">PH值 </td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/006_1.jpg\" class=\"line003\">余氯 (mg/L)</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/006_1.jpg\" class=\"line003\">电导率(ms/mv)</td> -->\r\n");
      out.write("<!-- \t                <td  align=\"center\" background=\"../../site_media/img/006_1.jpg\" class=\"line003\">溶解氧(mq/l)</td> -->\r\n");
      out.write("<!-- \t              </tr> -->\r\n");
      out.write("<!-- \t              <tr> -->\r\n");
      out.write("<!-- \t                <td height=\"20\" align=\"center\" background=\"../../site_media/img/007.png\" class=\"line001\">大规模的顶戴 无可救药魂牵梦萦载 </td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/007.png\" class=\"line001\">&nbsp;12</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/007.png\" class=\"line001\">&nbsp;12</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/007.png\" class=\"line001\">&nbsp;12</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/007.png\" class=\"line001\">&nbsp;12</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/007.png\" class=\"line002\">&nbsp;12</td> -->\r\n");
      out.write("<!-- \t              </tr> -->\r\n");
      out.write("<!-- \t              <tr> -->\r\n");
      out.write("<!-- \t                <td height=\"20\" align=\"center\" background=\"../../site_media/img/008.png\" class=\"line001\">&nbsp;</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/008.png\" class=\"line001\">&nbsp;</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/008.png\" class=\"line001\">&nbsp;</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/008.png\" class=\"line001\">&nbsp;</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/008.png\" class=\"line001\">&nbsp;</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/008.png\" class=\"line002\">&nbsp;</td> -->\r\n");
      out.write("<!-- \t              </tr> -->\r\n");
      out.write("<!-- \t              <tr> -->\r\n");
      out.write("<!-- \t                <td height=\"20\" align=\"center\" background=\"../../site_media/img/007.png\" class=\"line001\">12 </td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/007.png\" class=\"line001\">&nbsp;</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/007.png\" class=\"line001\">&nbsp;</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/007.png\" class=\"line001\">&nbsp;</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/007.png\" class=\"line001\">&nbsp;</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/007.png\" class=\"line002\">&nbsp;</td> -->\r\n");
      out.write("<!-- \t              </tr> -->\r\n");
      out.write("<!-- \t              <tr> -->\r\n");
      out.write("<!-- \t                <td height=\"20\" align=\"center\" background=\"../../site_media/img/008.png\" class=\"line001\">&nbsp;</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/008.png\" class=\"line001\">&nbsp;</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/008.png\" class=\"line001\">&nbsp;</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/008.png\" class=\"line001\">&nbsp;</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/008.png\" class=\"line001\">&nbsp;</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/008.png\" class=\"line002\">&nbsp;</td> -->\r\n");
      out.write("<!-- \t              </tr> -->\r\n");
      out.write("<!-- \t              <tr> -->\r\n");
      out.write("<!-- \t                <td height=\"20\" align=\"center\" background=\"../../site_media/img/007.png\" class=\"line001\">12 </td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/007.png\" class=\"line001\">&nbsp;</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/007.png\" class=\"line001\">&nbsp;</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/007.png\" class=\"line001\">&nbsp;</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/007.png\" class=\"line001\">&nbsp;</td> -->\r\n");
      out.write("<!-- \t                <td align=\"center\" background=\"../../site_media/img/007.png\" class=\"line002\">&nbsp;</td> -->\r\n");
      out.write("<!-- \t              </tr> -->\r\n");
      out.write("<!-- \t             </table> -->\r\n");
      out.write("<!-- \t\t\t</td>  -->\r\n");
      out.write("<!--  \t\t </tr> -->\r\n");
      out.write("<!-- \t </table> -->\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
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
