package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class default_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>展示</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://api.map.baidu.com/api?key=46ce9d0614bf7aefe0ba562f8cf87194&v=1.1&services=true\"> \r\n");
      out.write("\r\n");
      out.write("</script> \r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\"> \r\n");
      out.write("\r\n");
      out.write("body{font-size:13px;margin:10px}  \r\n");
      out.write("\r\n");
      out.write("#container{width:1200px;height:650px;border:1px solid gray}  \r\n");
      out.write("\r\n");
      out.write("</style> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"container\"></div> \r\n");
      out.write("<div>\r\n");
      out.write("<a href=\"\" class=\"iconMap\" id=\"iconMap1\"> <img src=\"site_media/img/bz.jpg\" style=\"z-index: 100;display: block;margin-left: 500px;margin-top: -550px;width: 35px;height: 35px;\"/></a> \r\n");
      out.write(" <a href=\"\" class=\"iconMap\" id=\"iconMap2\"> <img src=\"site_media/img/bz.jpg\" style=\"z-index: 101;display: block;margin-left: 550px;margin-top: -550px;width: 35px;height: 35px;\"/></a> \r\n");
      out.write(" <a href=\"\" class=\"iconMap\" id=\"iconMap3\"> <img src=\"site_media/img/bz.jpg\" style=\"z-index: 100;display: block;margin-left: 500px;margin-top: -450px;width: 35px;height: 35px;\"/></a>\r\n");
      out.write(" <a href=\"\" class=\"iconMap\" id=\"iconMap4\"> <img src=\"site_media/img/bz.jpg\" style=\"z-index: 100;display: block;margin-left: 530px;margin-top: -530px;width: 35px;height: 35px;\"/></a>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\"> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("getBoundary();\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("var map = new BMap.Map(\"container\");  \r\n");
      out.write("\r\n");
      out.write("var point = new BMap.Point(121.487899,31.249162);  // 创建点坐标\r\n");
      out.write("map.centerAndZoom(point, 12);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("map.addControl(new BMap.NavigationControl({type: BMAP_NAVIGATION_CONTROL_SMALL}));\r\n");
      out.write("map.enableScrollWheelZoom();\r\n");
      out.write("\r\n");
      out.write("function getBoundary(){       \r\n");
      out.write("    var bdary = new BMap.Boundary();\r\n");
      out.write("    var name = '黄浦区,徐汇区,松江区,奉贤区,嘉定区,宝山区,虹口区,闵行区,崇明县,闸北区,杨浦区,浦东新区,普陀区,长宁区,青浦区,静安区';\r\n");
      out.write("    var len=name.split(\",\");\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    for ( var y = 0; y < len.length; y++) {\r\n");
      out.write("    \t bdary.get(len[y], function(rs){       //获取行政区域\r\n");
      out.write("    \t        var count = rs.boundaries.length; \r\n");
      out.write("    \t        for(var i = 0; i < count; i++){\r\n");
      out.write("    \t            var ply = new BMap.Polygon(rs.boundaries[i], {strokeWeight: 2, strokeColor: \"#ff0000\"}); //建立多边形覆盖物\r\n");
      out.write("    \t            map.addOverlay(ply);  //添加覆盖物\r\n");
      out.write("    \t        }                \r\n");
      out.write("    \t    });   \r\n");
      out.write("\t}\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
