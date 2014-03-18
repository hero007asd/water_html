package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body, html{width: 100%;height: 100%;overflow: hidden;margin:0;}\r\n");
      out.write("#l-map {margin-right: 300px;height: 100%;overflow: hidden;}\r\n");
      out.write("#result {border-left:1px dotted #999;height:100%;width:295px;position:absolute;top:0px;right:0px;font-size:12px;}\r\n");
      out.write("dl,dt,dd,ul,li{\r\n");
      out.write("    margin:0;\r\n");
      out.write("    padding:0;\r\n");
      out.write("    list-style:none;\r\n");
      out.write("}\r\n");
      out.write("dt{\r\n");
      out.write("    font-size:14px;\r\n");
      out.write("    font-family:\"微软雅黑\";\r\n");
      out.write("    font-weight:bold;\r\n");
      out.write("    border-bottom:1px dotted #000;\r\n");
      out.write("    padding:5px 0 5px 5px;\r\n");
      out.write("    margin:5px 0;\r\n");
      out.write("}\r\n");
      out.write("dd{\r\n");
      out.write("    padding:5px 0 0 5px;\r\n");
      out.write("}\r\n");
      out.write("li{\r\n");
      out.write("    line-height:28px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t.cityList{height: 320px;width:372px;overflow-y:auto;}\r\n");
      out.write("    .sel_container{z-index:9999;font-size:12px;position:absolute;right:300px;top:0px;width:140px;background:rgba(255,255,255,0.8);height:30px;line-height:30px;padding:5px;}\r\n");
      out.write("    .map_popup {position: absolute;z-index: 200000;width: 382px;height: 344px;right:320px;top:40px;}\r\n");
      out.write("    .map_popup .popup_main { background:#fff;border: 1px solid #8BA4D8;height: 100%;overflow: hidden;position: absolute;width: 100%;z-index: 2;}\r\n");
      out.write("    .map_popup .title {background: url(\"http://map.baidu.com/img/popup_title.gif\") repeat scroll 0 0 transparent;\r\n");
      out.write("    color: #6688CC;font-size: 12px;font-weight: bold;height: 24px;line-height: 25px;padding-left: 7px;}\r\n");
      out.write("    .map_popup button {background: url(\"http://map.baidu.com/img/popup_close.gif\") no-repeat scroll 0 0 transparent;\r\n");
      out.write("    border: 0 none;cursor: pointer;height: 12px;position: absolute;right: 4px;top: 6px;width: 12px;}\t\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://api.map.baidu.com/api?v=2.0&ak=A4749739227af1618f7b0d1b588c0e85\"></script>\r\n");
      out.write("<!-- 加载百度地图样式信息窗口 -->\r\n");
      out.write("<!-- <script type=\"text/javascript\" src=\"http://api.map.baidu.com/library/SearchInfoWindow/1.5/src/SearchInfoWindow_min.js\"></script> -->\r\n");
      out.write("<!-- <link rel=\"stylesheet\" href=\"http://api.map.baidu.com/library/SearchInfoWindow/1.5/src/SearchInfoWindow_min.css\" /> -->\r\n");
      out.write("<!-- 加载城市列表 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://api.map.baidu.com/library/CityList/1.2/src/CityList_min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>叠加麻点图Demo</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"l-map\"></div>\r\n");
      out.write("\t<div id=\"result\">\r\n");
      out.write("\t\t <dl>\r\n");
      out.write("    \t<dt>基本操作</dt>\r\n");
      out.write("        <dd>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><button id=\"open\">打开</button><button id=\"close\">关闭</button>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </dd>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!--城市列表-->\r\n");
      out.write("\t<div class=\"sel_container\"><strong id=\"curCity\">北京市</strong> [<a id=\"curCityText\" href=\"javascript:void(0)\">更换城市</a>]</div>\r\n");
      out.write("\t<div class=\"map_popup\" id=\"cityList\" style=\"display:none;\">\r\n");
      out.write("\t\t<div class=\"popup_main\">\r\n");
      out.write("\t\t\t<div class=\"title\">城市列表</div>\r\n");
      out.write("\t\t\t<div class=\"cityList\" id=\"citylist_container\"></div>\r\n");
      out.write("\t\t\t<button id=\"popup_close\"></button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("   \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("// 百度地图API功能\r\n");
      out.write("var map = new BMap.Map(\"l-map\");          // 创建地图实例\r\n");
      out.write("var point = new BMap.Point(116.403694,39.927552);  // 创建点坐标\r\n");
      out.write("map.centerAndZoom(point, 15);                 // 初始化地图，设置中心点坐标和地图级别\r\n");
      out.write("map.enableScrollWheelZoom();\r\n");
      out.write("map.addControl(new BMap.NavigationControl());  //添加默认缩放平移控件\r\n");
      out.write("var customLayer;\r\n");
      out.write("function addCustomLayer(keyword) {\r\n");
      out.write("    if (customLayer) {\r\n");
      out.write("        map.removeTileLayer(customLayer);\r\n");
      out.write("    }\r\n");
      out.write("    customLayer=new BMap.CustomLayer({\r\n");
      out.write("        geotableId: 30960,\r\n");
      out.write("        q: '', //检索关键字\r\n");
      out.write("        tags: '', //空格分隔的多字符串\r\n");
      out.write("        filter: '' //过滤条件,参考http://developer.baidu.com/map/lbs-geosearch.htm#.search.nearby\r\n");
      out.write("    });\r\n");
      out.write("    map.addTileLayer(customLayer);\r\n");
      out.write("    customLayer.addEventListener('hotspotclick',callback);\r\n");
      out.write("}\r\n");
      out.write("addCustomLayer();\r\n");
      out.write("\r\n");
      out.write("function callback(e)//单击热点图层\r\n");
      out.write("{\r\n");
      out.write("  var customPoi = e.customPoi,\r\n");
      out.write("\t\t  str = [];\r\n");
      out.write("\t\tstr.push(\"address = \" + customPoi.address);\r\n");
      out.write("\t\tstr.push(\"phoneNumber = \" + customPoi.phoneNumber);\r\n");
      out.write("        var content = '<p style=\"width:280px;margin:0;line-height:20px;\">地址：' + customPoi.address + '</p>';\r\n");
      out.write("        var searchInfoWindow = new BMapLib.SearchInfoWindow(map, content, {\r\n");
      out.write("            title: customPoi.title, //标题\r\n");
      out.write("            width: 290, //宽度\r\n");
      out.write("            height: 40, //高度\r\n");
      out.write("            panel : \"panel\", //检索结果面板\r\n");
      out.write("            enableAutoPan : true, //自动平移\r\n");
      out.write("            enableSendToPhone: true, //是否显示发送到手机按钮\r\n");
      out.write("            searchTypes :[\r\n");
      out.write("                BMAPLIB_TAB_SEARCH,   //周边检索\r\n");
      out.write("                BMAPLIB_TAB_TO_HERE,  //到这里去\r\n");
      out.write("                BMAPLIB_TAB_FROM_HERE //从这里出发\r\n");
      out.write("            ]\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        var point = new BMap.Point(customPoi.point.lng, customPoi.point.lat);\r\n");
      out.write("        searchInfoWindow.open(point);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("document.getElementById(\"open\").onclick = function(){\r\n");
      out.write("\taddCustomLayer();\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("document.getElementById(\"close\").onclick = function(){\r\n");
      out.write("\tif (customLayer) {\r\n");
      out.write("        map.removeTileLayer(customLayer);\r\n");
      out.write("    }\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("// 创建CityList对象，并放在citylist_container节点内\r\n");
      out.write("var myCl = new BMapLib.CityList({container : \"citylist_container\", map : map});\r\n");
      out.write("\r\n");
      out.write("// 给城市点击时，添加相关操作\r\n");
      out.write("myCl.addEventListener(\"cityclick\", function(e) {\r\n");
      out.write("\t// 修改当前城市显示\r\n");
      out.write("\tdocument.getElementById(\"curCity\").innerHTML = e.name;\r\n");
      out.write("\r\n");
      out.write("\t// 点击后隐藏城市列表\r\n");
      out.write("\tdocument.getElementById(\"cityList\").style.display = \"none\";\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("// 给“更换城市”链接添加点击操作\r\n");
      out.write("document.getElementById(\"curCityText\").onclick = function() {\r\n");
      out.write("\tvar cl = document.getElementById(\"cityList\");\r\n");
      out.write("\tif (cl.style.display == \"none\") {\r\n");
      out.write("\t\tcl.style.display = \"\";\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\tcl.style.display = \"none\";\r\n");
      out.write("\t}\t\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("// 给城市列表上的关闭按钮添加点击操作\r\n");
      out.write("document.getElementById(\"popup_close\").onclick = function() {\r\n");
      out.write("\tvar cl = document.getElementById(\"cityList\");\r\n");
      out.write("\tif (cl.style.display == \"none\") {\r\n");
      out.write("\t\tcl.style.display = \"\";\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\tcl.style.display = \"none\";\r\n");
      out.write("\t}\t\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
