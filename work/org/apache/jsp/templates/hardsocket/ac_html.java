package org.apache.jsp.templates.hardsocket;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ac_html extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- <script type=\"text/javascript\" src=\"http://api.map.baidu.com/api?v=1.2\"></script>  -->\r\n");
      out.write("<!-- <script type=\"text/javascript\" src=\"http://api.map.baidu.com/api?v=1.4\"></script>  -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://api.map.baidu.com/api?key=46ce9d0614bf7aefe0ba562f8cf87194&v=1.4&services=true\"> </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../site_media/js/jquery.min.js\"></script> \r\n");
      out.write("\r\n");
      out.write("<title>水质检测</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(" body,form,ul,li,a,ol,h1,h2,h3,h4,h5,h6,input,textarea,img{margin:0px;padding:0px;}  \r\n");
      out.write("ul,li,dl{list-style-type:none;} \r\n");
      out.write("a{text-decoration: none;}\r\n");
      out.write("body{font-size: 12px;font-family: \"Microsoft YaHei\";color:#777777; overflow:auto;background-color: #b0d7f9;}\r\n");
      out.write(".w_div{width: 100%;height: 1000px; }\r\n");
      out.write(".w_top{width: 100%;height: 50px;}\r\n");
      out.write(".w_top h1{text-align: center;font-weight: bold;color: black;font-size: 36px;margin-top: 5px;}\r\n");
      out.write(".w_content{width: 100%;height:auto;margin-top: 15px;m}\r\n");
      out.write(".w_contentLeft{width: 55%; height: auto;float: left;margin-right: 20px;margin-left: 10px;float: left;}\r\n");
      out.write(".w_contentRight{width: 38%;height: auto;float: left;margin: 0 50px 0 50px;}\r\n");
      out.write(".w_logo{display: block;float: right;margin-top: -35px;margin-right: 30px;width: 70px;height: 40px;text-align: center;}\r\n");
      out.write(".w_conTop{width: 100%;float: left;height: 800px;border: 1px solid blue;margin-bottom: 25px;}\r\n");
      out.write(".w_conComm{width: 100%;height: auto;float: left;}\r\n");
      out.write(".w_conComm input{display: block; width: 300px;height: 50px;float: left;margin-left: 20%;font-size: 22px;}\r\n");
      out.write(".w_contentRight ul{width: 100%;height: 45px;}\r\n");
      out.write(".w_contentRight li{float: left;text-align: center;width: 49%; height: 40px;background-color: #e5e5e5;border-right-color: black;}\r\n");
      out.write(".w_contentRight a{color: black;font-size: 24px;}\r\n");
      out.write(".w_conTab{width: 100%;height: auto;margin-top: 0px;}\r\n");
      out.write(".w_conTab table{width: 100%;height: auto;text-align: center;border: 1px solid black;}\r\n");
      out.write(".w_conTab table thead td{font-size: 22px;font-weight: 400;}\r\n");
      out.write(".w_conTab table td{font-size: 17px; border: 1px solid black;}\r\n");
      out.write(".w_conTab caption{font-size: 26px;}\r\n");
      out.write(".col{background-color: blue;color: white;}\r\n");
      out.write(".w_a{width: 100%;height: 35px;}\r\n");
      out.write(".w_a a{display: block; float: left;width: 50%;text-align: center;background-color: #e5e5e5;}\r\n");
      out.write(".w_a a:hover{background-color: white;color: black;}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t\r\n");
      out.write("\t/*设置表格样式(偶数奇数切换颜色)*/\r\n");
      out.write("\t$(\"#conTab\").find(\"tr\").css(\"background-color\", \"#f5f7ea\");\r\n");
      out.write("\t$(\"#conTab\").find(\"tr:odd\").css(\"background-color\", \"#eee0a7\");\r\n");
      out.write("\t\r\n");
      out.write("// \t$(\".w_contentRight a\").hover(function(){\r\n");
      out.write("// \t\t$(\".w_contentRight a\").parent().css(\"background-color\", \"blue\");\r\n");
      out.write("\r\n");
      out.write("// \t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
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
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"w_contentRight\">\r\n");
      out.write("\t\t\t<div class=\"w_a\"><a href=\"#\">查看报表</a><a href=\"#\">查看曲线图</a></div>\r\n");
      out.write("<!-- \t\t\t\t<ul> -->\r\n");
      out.write("<!-- \t\t\t\t\t<li><a href=\"#\">查看报表</a></li> -->\r\n");
      out.write("<!-- \t\t\t\t\t<li><a href=\"#\">查看曲线图</a></li> -->\r\n");
      out.write("<!-- \t\t\t\t</ul> -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"w_conTab\">\r\n");
      out.write("\t\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" id=\"conTab\">\r\n");
      out.write("\t\t\t\t\t\t<caption>自来水公司检测总览</caption>\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr><th></td><td>浊度</td><td>PH值</td><td>余氯</td><td>电导率</td><td>溶解氧</td><td>水温</td></tr> \r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>总监测值</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfas</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfas</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfas</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfas</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfas</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfasd</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>上海自来水公司</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfa</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfasdfaf</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfasdfaf</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfasdfaf</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfasdfaf</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfasdfaf</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>上海自来水公司</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfasdfaf</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfasdfaf</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfasdfaf</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfasdfaf</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfasdfaf</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfasdfaf</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>上海自来水公司</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfasdfaf</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfasdfaf</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfasdfaf</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfasdfaf</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfasdfaf</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfasdfaf</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>上海自来水公司</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfasdfaf</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfasdfaf</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfasdfaf</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfasdfaf</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfasdfaf</td>\r\n");
      out.write("\t\t\t\t\t\t<td>dsafdfasdfaf</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"w_conComm\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" name=\"company\" id=\"company\" value=\"自来水公司分布图\"/>\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" name=\"region\" id=\"region\" value=\"上海行政区分布图\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\"> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("var map = new BMap.Map(\"map\");\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var point = new BMap.Point(121.487899,31.249162);  // 创建点坐标\r\n");
      out.write("map.centerAndZoom(point, 10);\r\n");
      out.write("// map.addControl(new BMap.NavigationControl({type: BMAP_NAVIGATION_CONTROL_SMALL}));\r\n");
      out.write(" map.addControl(new BMap.MapTypeControl({mapTypes:[BMAP_NORMAL_MAP, BMAP_SATELLITE_MAP, BMAP_HYBRID_MAP]}));\r\n");
      out.write("map.addControl(new BMap.NavigationControl());\r\n");
      out.write("map.enableScrollWheelZoom();\r\n");
      out.write("map.enableContinuousZoom();\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var marker1 = new BMap.Marker(new BMap.Point(121.446235, 31.169152));  // 创建标注\r\n");
      out.write("map.addOverlay(marker1); \r\n");
      out.write("\r\n");
      out.write("// getBoundary(\"黄浦区-#C8C1E3\");\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var provinces = [\"黄浦区-#C8C1E3\", \"徐汇区-#FBC5DC\", \"松江区-#DBEDC7\", \"奉贤区-#E7CCAF\", \"嘉定区-#DBEDC7\",\r\n");
      out.write("                 \"宝山区-#FEFCBF\", \"宝山区-#E7CCAF\", \"虹口区-#C8C1E3\", \"闵行区-#FBC5DC\", \"崇明县-#C8C1E3\",\r\n");
      out.write("                 \"闸北区-#DBECC8\", \"杨浦区-#DBECC8\", \"浦东新区-#FCFBBB\", \"普陀区-#FCFBBB\", \"长宁区-#FCFBBB\", \"青浦区-#FCFBBB\",\r\n");
      out.write("                 \"静安区-#FCFBBB\", \"金山区-#E7CCAF\"\r\n");
      out.write("             ];\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\t\r\n");
      out.write("\tfunction getBoundary(province) {\r\n");
      out.write("\t\t  var name=province.split(\"-\");\r\n");
      out.write("\t    var boundary = new BMap.Boundary();\r\n");
      out.write("\t  \r\n");
      out.write("\t    boundary.get(name[0], function(rs){ \r\n");
      out.write("\t     //一个省可能有好几个闭合的多边形区域\r\n");
      out.write("\t      \r\n");
      out.write("\t     for (var i = 0; i < rs.boundaries.length; i++) {\r\n");
      out.write("\t    \t var   ply = new BMap.Polygon(rs.boundaries[i], {strokeColor:\"blue\", strokeWeight:2, strokeOpacity:0.5,strokeBackground:\"#C8C1E3\"}); //建立多边形覆盖物\r\n");
      out.write("\t            map.addOverlay(ply);  //添加覆盖物\r\n");
      out.write("\t           haidianCenter = new BMap.Point(121.446235,31.169152);\r\n");
      out.write("\t           haidianLabel2 = new BMap.Label(name[0],{offset: new BMap.Size(0,0), position: ply});  \r\n");
      out.write("\t            haidianLabel2.setStyle({\"line-height\": \"20px\", \"text-align\": \"center\", \"width\": \"80px\", \"height\": \"29px\", \"border\": \"none\", \"padding\": \"2px\",\"background-color\": \"\"+name[1]+\"\",});  \r\n");
      out.write("\t            map.addOverlay(haidianLabel2);  \r\n");
      out.write("\t        }                \r\n");
      out.write("\t     });    \r\n");
      out.write("\t   \r\n");
      out.write("\t} \r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t/*显示区域*/\r\n");
      out.write("\tfor (var i = provinces.length-1; i >= 0; i--) {\r\n");
      out.write("\t    getBoundary(provinces[i]);\r\n");
      out.write("\t}\r\n");
      out.write("\tvar polygon=new BMap.\r\n");
      out.write("\t\r\n");
      out.write("\tpolygon.addEventListener(\"click\", function (e) {\r\n");
      out.write("    var latlng = e.point;\r\n");
      out.write("    var info = new BMap.InfoWindow(name + \" \" + latlng.lat + \",\" + latlng.lng, {width:220});\r\n");
      out.write("    map.openInfoWindow(info, latlng);\r\n");
      out.write("\r\n");
      out.write("    //高亮闪烁显示鼠标点击的省\r\n");
      out.write("    delay = 0;\r\n");
      out.write("    for (flashTimes = 0; flashTimes < 3; flashTimes++) {\r\n");
      out.write("        delay += 200;\r\n");
      out.write("        setTimeout(function () {\r\n");
      out.write("            polygon.setFillColor(\"#FFFF00\");\r\n");
      out.write("        }, delay);\r\n");
      out.write("\r\n");
      out.write("        delay += 200;\r\n");
      out.write("        setTimeout(function () {\r\n");
      out.write("            polygon.setFillColor(color);\r\n");
      out.write("        }, delay);\r\n");
      out.write("    }\r\n");
      out.write("});\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t/*自来水公司和行政区切换操作*/\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#\")\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script> \r\n");
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
