package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class envio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Generación de Mensajes</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
if(request.getParameter("texto")!=null){
      out.write("\n");
      out.write("        ");
      javabeans.Mensaje mensa = null;
      synchronized (request) {
        mensa = (javabeans.Mensaje) _jspx_page_context.getAttribute("mensa", PageContext.REQUEST_SCOPE);
        if (mensa == null){
          try {
            mensa = (javabeans.Mensaje) java.beans.Beans.instantiate(this.getClass().getClassLoader(), "javabeans.Mensaje");
          } catch (ClassNotFoundException exc) {
            throw new InstantiationException(exc.getMessage());
          } catch (Exception exc) {
            throw new ServletException("Cannot create bean of class " + "javabeans.Mensaje", exc);
          }
          _jspx_page_context.setAttribute("mensa", mensa, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("mensa"), request);
      out.write("\n");
      out.write("        \n");
      out.write("    ");
}
      out.write("\n");
      out.write("    <h1>Generación de mensajes</h1>\n");
      out.write("    <form method=\"post\">//al no ponerse action, la página vuelve a recargarse\n");
      out.write("        <br/><br/>\n");
      out.write("        Introduzca destinatario: <input type=\"text\" name=\"destinatario\"/><br/><br/>\n");
      out.write("        Introduzca remitente: <input type=\"text\" name=\"remitente\"/><br/><br/>\n");
      out.write("        Introduzca el mensaje: <textarea name=\"texto\"/><br/><br/>\n");
      out.write("    </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
