/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-04-25 03:25:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.commons;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("<!--shortcut start-->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "shortcut.jsp", out, false);
      out.write("\r\n");
      out.write("<!--shortcut end-->\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\t<div class=\"header_inner\">\r\n");
      out.write("\t\t<div class=\"logo\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"index_topad\" id=\"playLogo\" style=\"\">\r\n");
      out.write("\t\t\t\t<a href=\"/html/activity/1472179566.html\" target=\"_blank\"> <img\r\n");
      out.write("\t\t\t\t\tsrc=\"/images/html/20160829181637762.gif\">\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<a name=\"sfbest_hp_hp_head_logo\" href=\"http://www.e3mall.cn\"\r\n");
      out.write("\t\t\t\tclass=\"trackref logoleft\"> </a>\r\n");
      out.write("\t\t\t<div class=\"logo-text\">\r\n");
      out.write("\t\t\t\t<img src=\"/images/html/logo_word.jpg\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"index_promo\"></div>\r\n");
      out.write("\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t<form action=\"http://localhost:8085/search.html\" id=\"searchForm\"\r\n");
      out.write("\t\t\t\tname=\"query\" method=\"GET\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"text keyword ac_input\" name=\"keyword\"\r\n");
      out.write("\t\t\t\t\tid=\"keyword\" value=\"\" style=\"color: rgb(153, 153, 153);\"\r\n");
      out.write("\t\t\t\t\tonkeydown=\"javascript:if(event.keyCode==13) search_keys('searchForm');\"\r\n");
      out.write("\t\t\t\t\tautocomplete=\"off\"> <input type=\"button\" value=\"\"\r\n");
      out.write("\t\t\t\t\tclass=\"submit\" onclick=\"search_keys('searchForm')\">\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<div class=\"search_hot\">\r\n");
      out.write("\t\t\t\t<a target=\"_blank\"\r\n");
      out.write("\t\t\t\t\thref=\"http://www.e3mall.cn/productlist/search?inputBox=1&amp;keyword=%E5%A4%A7%E9%97%B8%E8%9F%B9#trackref=sfbest_hp_hp_head_Keywords1\">大闸蟹</a><a\r\n");
      out.write("\t\t\t\t\ttarget=\"_blank\"\r\n");
      out.write("\t\t\t\t\thref=\"http://www.e3mall.cn/productlist/search?inputBox=1&amp;keyword=%E7%9F%B3%E6%A6%B4#trackref=sfbest_hp_hp_head_Keywords2\">石榴</a><a\r\n");
      out.write("\t\t\t\t\ttarget=\"_blank\"\r\n");
      out.write("\t\t\t\t\thref=\"http://www.e3mall.cn/productlist/search?inputBox=1&amp;keyword=%E6%9D%BE%E8%8C%B8#trackref=sfbest_hp_hp_head_Keywords3\">松茸</a><a\r\n");
      out.write("\t\t\t\t\ttarget=\"_blank\"\r\n");
      out.write("\t\t\t\t\thref=\"http://www.e3mall.cn/productlist/search?inputBox=1&amp;keyword=%E7%89%9B%E6%8E%92#trackref=sfbest_hp_hp_head_Keywords4\">牛排</a><a\r\n");
      out.write("\t\t\t\t\ttarget=\"_blank\"\r\n");
      out.write("\t\t\t\t\thref=\"http://www.e3mall.cn/productlist/search?inputBox=1&amp;keyword=%E7%99%BD%E8%99%BE#trackref=sfbest_hp_hp_head_Keywords5\">白虾</a><a\r\n");
      out.write("\t\t\t\t\ttarget=\"_blank\"\r\n");
      out.write("\t\t\t\t\thref=\"http://www.e3mall.cn/productlist/search?inputBox=1&amp;keyword=%E5%85%A8%E8%84%82%E7%89%9B%E5%A5%B6#trackref=sfbest_hp_hp_head_Keywords6\">全脂牛奶</a><a\r\n");
      out.write("\t\t\t\t\ttarget=\"_blank\"\r\n");
      out.write("\t\t\t\t\thref=\"http://www.e3mall.cn/productlist/search?inputBox=1&amp;keyword=%E6%B4%8B%E6%B2%B3#trackref=sfbest_hp_hp_head_Keywords7\">洋河</a><a\r\n");
      out.write("\t\t\t\t\ttarget=\"_blank\"\r\n");
      out.write("\t\t\t\t\thref=\"http://www.e3mall.cn/productlist/search?inputBox=1&amp;keyword=%E7%BB%BF%E8%B1%86#trackref=sfbest_hp_hp_head_Keywords8\">绿豆</a><a\r\n");
      out.write("\t\t\t\t\ttarget=\"_blank\"\r\n");
      out.write("\t\t\t\t\thref=\"http://www.e3mall.cn/productlist/search?inputBox=1&amp;keyword=%E4%B8%80%E5%93%81%E7%8E%89#trackref=sfbest_hp_hp_head_Keywords9\">一品玉</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"shopingcar\" id=\"topCart\">\r\n");
      out.write("\t\t\t<s class=\"setCart\"></s><a href=\"http://localhost:8090/cart/cart.html\"\r\n");
      out.write("\t\t\t\tclass=\"t\" rel=\"nofollow\">我的购物车</a><b id=\"cartNum\">0</b> <span\r\n");
      out.write("\t\t\t\tclass=\"outline\"></span> <span class=\"blank\"></span>\r\n");
      out.write("\t\t\t<div id=\"cart_lists\">\r\n");
      out.write("\t\t\t\t<!--cartContent-->\r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}