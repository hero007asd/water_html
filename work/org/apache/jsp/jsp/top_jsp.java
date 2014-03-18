package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
      out.write("  \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<!--<link href=\"../css/css.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/login.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/common.js\"></script>  -->\r\n");
      out.write("<title>早教top</title>\r\n");
      out.write("</head>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"fl\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a href=\"http://localhost:8080/zaojiao\">\r\n");
      out.write("\t\t\t\t<img alt=\"我要早教\" src=\"http://jr.nhis.or.kr/static/images/main/img_logo.gif\">\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("        \t<span class=\"f14b pink\" id=\"addValue\"></span>\r\n");
      out.write("            <a href=\"javascript:;\" id=\"addressValue\">[切换区域]</a>\r\n");
      out.write("            <ul class=\"addUl\">\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0);\">北京</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0);\">上海</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0);\">广州</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0);\">深圳</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0);\">杭州</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0);\">南京</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"fl\">\r\n");
      out.write("    \t<div id=\"h_user\" class=\"right\">\r\n");
      out.write("    \t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("           </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- \t<div class=\"fl\">\r\n");
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
      out.write("\t\t<div id=\"hide_user\" class=\"right hidden\">\r\n");
      out.write("\t\t\t<a id=\"user_name\" rel=\"nofollow\" href=\"#\"></a>\r\n");
      out.write("\t\t\t|\r\n");
      out.write("\t\t\t<a id=\"logout\" rel=\"nofollow\" href=\"#\">退出</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    \t<div id=\"h_user\" class=\"right\">\r\n");
      out.write("\t\t<a href=\"\">\r\n");
      out.write("\t\t\t<img alt=\"首页\" src=\"http://jr.nhis.or.kr/static/images/main/img_toplink1.gif\">\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t<a href=\"\">\r\n");
      out.write("\t\t\t<img alt=\"注册\" src=\"http://jr.nhis.or.kr/static/images/main/img_toplink2.gif\">\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t<a href=\"\">\r\n");
      out.write("\t\t\t<img alt=\"登录\" src=\"http://jr.nhis.or.kr/static/images/main/img_toplink2.gif\">\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t<form action=\"login\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"login_id\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"pwd\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("                <a id=\"login\" rel=\"nofollow\" href=\"loginTest\">登录</a>\r\n");
      out.write("                <a id=\"login\" rel=\"nofollow\" href=\"#\">登录</a>\r\n");
      out.write("                |\r\n");
      out.write("                <a id=\"register\" rel=\"nofollow\" href=\"register\">免费注册</a>\r\n");
      out.write("                \r\n");
      out.write("                |\r\n");
      out.write("                <a class=\"qq\" rel=\"nofollow\" title=\"直接使用QQ帐号登录\" href=\"http://www.izaojiao.com/api/qq_login.php?city=shanghai\">QQ登录</a>\r\n");
      out.write("                |\r\n");
      out.write("                <a class=\"sina\" rel=\"nofollow\" title=\"直接使用新浪微博帐号登录\" href=\"http://www.izaojiao.com/api/sina_login.php?city=shanghai\">新浪微博登录</a>\r\n");
      out.write("                |加关注\r\n");
      out.write("           </div>\r\n");
      out.write("\t</div> -->\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t/*获取当前用户所在城市*/\r\n");
      out.write("\t\t$.getScript(\r\n");
      out.write("\t\t\t\t'http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=js',\r\n");
      out.write("\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t$(\"#addValue\").html(remote_ip_info.city);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t/*切换城市*/\r\n");
      out.write("\t\t$(\"#addressValue\").hover(function() {\r\n");
      out.write("\t\t\t$(\".addUl\").show();\r\n");
      out.write("\t\t}, function() {\r\n");
      out.write("\t\t\t$(\".addUl\").mouseover(function() {\r\n");
      out.write("\t\t\t\t $(\".addUl\").show();\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t$(\".addUl\").mouseout(function(){\r\n");
      out.write("\t\t\t\t$(\".addUl\").hide();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$(\".addUl\").hide();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t/*当点击切换城市a标签时，div消失*/\r\n");
      out.write("\t\t$(\".addUl a\").live('click',function(){\r\n");
      out.write("\t\t\t$(\".addUl\").hide();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t</script>\r\n");
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

  private boolean _jspx_meth_c_005fchoose_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /jsp/top.jsp(44,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty sessionScope.userName}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t\t\r\n");
        out.write("                <a id=\"user_name\" class=\"red\" rel=\"nofollow\" href=\"javascript:;\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</a>，欢迎您！\r\n");
        out.write("                |\r\n");
        out.write("                <a id=\"logout\" rel=\"nofollow\" href=\"http://localhost:8080/zaojiao/logout\">退出登录</a>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <a id=\"login\" rel=\"nofollow\" onclick=\"javascript:show_log();return false;\" href=\"javascript:;\">登录</a>\r\n");
        out.write("                |\r\n");
        out.write("                <a id=\"register\" rel=\"nofollow\" onclick=\"javascript:show_log();return false;\" href=\"register\">免费注册</a>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }
}
