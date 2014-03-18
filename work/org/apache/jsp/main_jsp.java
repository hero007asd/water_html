package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/top.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("<title>91早教</title>\r\n");
      out.write("<link href=\"css/css.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>早教top</title>\r\n");
      out.write("<!-- <link href=\"css/css.css\" type=\"text/css\" rel=\"stylesheet\" /> -->\r\n");
      out.write("</head>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"logo\">\r\n");
      out.write("\t<div class=\"fl\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a href=\"\">\r\n");
      out.write("\t\t\t\t<img alt=\"我要早教\" src=\"http://jr.nhis.or.kr/static/images/main/img_logo.gif\">\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("        \t<span class=\"f14b pink\">上海</span>\r\n");
      out.write("            <a href=\"javascript:;\">[切换区域]</a>\r\n");
      out.write("        </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"fl\">\r\n");
      out.write("    \t<div id=\"h_user\" class=\"right\">\r\n");
      out.write("          <img width=\"1\" vspace=\"3\" height=\"32\" align=\"middle\" style=\"vertical-align:middle;\" src=\"http://www.izaojiao.com/blank.gif\"/>\r\n");
      out.write("                <a rel=\"nofollow\" onclick=\"javascript:show_log();return false;\" href=\"http://www.izaojiao.com/login.php\">登录</a>\r\n");
      out.write("                |\r\n");
      out.write("                <a rel=\"nofollow\" href=\"http://www.izaojiao.com/register.php?city=shanghai\">免费注册</a>\r\n");
      out.write("           </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"top_area\">\r\n");
      out.write("\t<ul id=\"gnb\">\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<span>\r\n");
      out.write("\t\t\t\t<a href=\"main.jsp\">\r\n");
      out.write("\t\t\t\t\t<img alt=\"首页\" src=\"http://jr.nhis.or.kr/static/images/gnb/img_gnb1_on.gif\">\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<span>\r\n");
      out.write("\t\t\t\t<a href=\"jigou.jsp\">\r\n");
      out.write("\t\t\t\t\t<img alt=\"早教机构\" src=\"http://jr.nhis.or.kr/static/images/gnb/img_gnb1_off.gif\">\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<span>\r\n");
      out.write("\t\t\t\t<a href=\"\">\r\n");
      out.write("\t\t\t\t\t<img alt=\"早教商城\" src=\"http://jr.nhis.or.kr/static/images/gnb/img_gnb1_off.gif\">\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<span>\r\n");
      out.write("\t\t\t\t<a href=\"\">\r\n");
      out.write("\t\t\t\t\t<img alt=\"早教\" src=\"http://jr.nhis.or.kr/static/images/gnb/img_gnb7_off.gif\">\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction menuInit(){\r\n");
      out.write("\t\t//top\r\n");
      out.write("\t\t$('#top_area ul li span img').each(function(){\r\n");
      out.write("\t\t\tvar alt = $(this).attr('alt');\r\n");
      out.write("\t\t\tvar title = '首页';\r\n");
      out.write("\t\t\tif (alt == title){\r\n");
      out.write("\t\t\t\t$(this).attr('src', $(this).attr('src').replace('_off.gif' , '_on.gif' ));\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t$('#top_area ul li span').each(function(){\r\n");
      out.write("\t\t\t$(this).mouseover(function(){\r\n");
      out.write("\t\t\t\t$('#top_area ul li>span>a>img').each(function(){\r\n");
      out.write("\t\t\t\t\t$(this).attr('src', $(this).attr('src').replace('_on.gif' , '_off.gif' ));\t\t\t\t\t\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t$(this).find('>a>img').attr('src', $(this).find('>a>img').attr('src').replace('_off.gif' , '_on.gif' ));\r\n");
      out.write("\t\t\t\t$('#top_area ul li ul').css({'top':'-680px'});\r\n");
      out.write("\t\t\t\t$(this).parent().find('ul').css({'top':'68px'});\r\n");
      out.write("\t\t\t\t$('#top_area ul li ul').hide();\r\n");
      out.write("\t\t\t\t$(this).parent().find('ul').show();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$('#top_area').mouseleave(function(){\r\n");
      out.write("\t\t\t$('#top_area ul li>span>a>img').each(function(){\r\n");
      out.write("\t\t\t\t$(this).attr('src', $(this).attr('src').replace('_on.gif' , '_off.gif' ));\t\t\t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$('#top_area ul li ul').hide();\r\n");
      out.write("\t\t\tmenuInit();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<div id=\"main_area\">\r\n");
      out.write("\t<!-- <h2>我要早教</h2> -->\r\n");
      out.write("\t<!-- <div class=\"section1\">\r\n");
      out.write("\t\t<h3>我要早教</h3>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<a href=\"http://jr.nhis.or.kr/portal/site/jr/MENU_WBHDC0101\"></a>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</div> -->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>早教footer</title>\r\n");
      out.write("<!-- <link href=\"css/css.css\" type=\"text/css\" rel=\"stylesheet\" /> -->\r\n");
      out.write("</head>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t<div class=\"copyright center\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t<a rel=\"nofollow\" href=\"http://www.izaojiao.com/about.php\">关于爱早教</a>\r\n");
      out.write("\t\t│\r\n");
      out.write("\t\t<a href=\"http://www.izaojiao.com/jigou/shanghai/all\">早教机构大全</a>\r\n");
      out.write("\t\t│\r\n");
      out.write("\t\t<a href=\"http://www.izaojiao.com/zaojiaopinpai/shanghai\">早教品牌大全</a>\r\n");
      out.write("\t\t│\r\n");
      out.write("\t\t<a href=\"http://www.izaojiao.com/paihang/shanghai\">早教排行榜</a>\r\n");
      out.write("\t\t│\r\n");
      out.write("\t\t<a rel=\"nofollow\" href=\"http://www.izaojiao.com/job.php\">工作机会</a>\r\n");
      out.write("\t\t│\r\n");
      out.write("\t\t<a rel=\"nofollow\" href=\"http://www.izaojiao.com/contact.php\">联系我们</a>\r\n");
      out.write("\t\t│\r\n");
      out.write("\t\t<a href=\"http://www.izaojiao.com/links.php\">友情链接</a>\r\n");
      out.write("\t\t│\r\n");
      out.write("\t\t<a rel=\"nofollow\" href=\"http://www.izaojiao.com/page/25\">帮助中心</a>\r\n");
      out.write("\t\t│\r\n");
      out.write("\t\t<a target=\"_blank\" href=\"http://123.izaojiao.com/\">早教网址导航</a>\r\n");
      out.write("\t\t│\r\n");
      out.write("\t\t<a href=\"http://www.izaojiao.com/club/10024\">早教百科</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"gray\">\r\n");
      out.write("\t\tCopyright ©2013 iZaojiao.com All rights reserved 爱早教 早教机构 早教中心 ICP：\r\n");
      out.write("\t\t<a rel=\"nofollow\" target=\"_blank\" href=\"http://www.miibeian.gov.cn/\">沪B2-20030192</a>\r\n");
      out.write("\t\t<a rel=\"nofollow\" target=\"_blank\" href=\"http://www.miibeian.gov.cn/\">沪ICP备06061202号</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
