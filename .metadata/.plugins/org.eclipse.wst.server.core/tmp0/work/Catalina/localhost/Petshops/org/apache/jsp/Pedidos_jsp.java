/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.21
 * Generated at: 2019-07-09 14:22:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.Pedido;
import dao.PedidoDao;

public final class Pedidos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("bean.Pedido");
    _jspx_imports_classes.add("dao.PedidoDao");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Pedido</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- JQuery -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"https://use.fontawesome.com/releases/v5.0.8/js/all.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Fotorama -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/fotorama/4.6.4/fotorama.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/fotorama/4.6.4/fotorama.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Adicionar arquivo CSS -->\r\n");
      out.write("    <link href=\"estilosCarrinho.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Icone -->\r\n");
      out.write("    <link rel=\"shortcur icon\" href=\"favicon.ico.ico\" type=\"image/x-icon\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <!--Cabeçalho-->\r\n");
      out.write("    <header class=\"menu-principal\">\r\n");
      out.write("        \r\n");
      out.write("            <div class=\"header-1\">\r\n");
      out.write("                <div class=\"logo\">\r\n");
      out.write("                    <img src=\"imagens/Logo.png\" />\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"redes-sociais\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("      \r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write(" var total = 0; // variável que retorna o total dos produtos que estão na LocalStorage.\r\n");
      out.write(" var i = 0;     // variável que irá percorrer as posições\r\n");
      out.write(" var valor = 0; // variável que irá receber o preço do produto convertido em Float.\r\n");
      out.write(" \r\n");
      out.write(" for(i=1; i<=99; i++) // verifica até 99 produtos registrados na localStorage\r\n");
      out.write(" {\r\n");
      out.write("\t var prod = localStorage.getItem(\"produto\" + i + \"\"); // verifica se há recheio nesta posição. \r\n");
      out.write("\t if(prod != null) \r\n");
      out.write("\t {\t\r\n");
      out.write("\t\t // exibe os dados da lista dentro da div itens\r\n");
      out.write("\t\t document.getElementById(\"p1\").innerHTML += localStorage.getItem(\"qtd\" + i) + \" x \";\r\n");
      out.write("\t\t document.getElementById(\"p2\").innerHTML += localStorage.getItem(\"produto\" + i);\r\n");
      out.write("\t\t document.getElementById(\"p3\").innerHTML += \" \";\r\n");
      out.write("\t\t document.getElementById(\"p4\").innerHTML += \"R$: \" + localStorage.getItem(\"valor\" + i) + \"<hr>\";\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t // calcula o total dos recheios\r\n");
      out.write("\t\t valor = parseFloat(localStorage.getItem(\"valor\" + i)); // valor convertido com o parseFloat()\r\n");
      out.write("\t\t total = (total + valor); // arredonda para 2 casas decimais com o .toFixed(2)\r\n");
      out.write("\t }\r\n");
      out.write(" } \r\n");
      out.write(" // exibe o total dos recheios\r\n");
      out.write(" document.getElementById(\"total\").innerHTML = total.toFixed(2); \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--/header-->\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"breadcrumbs\">\r\n");
      out.write("                <ol class=\"breadcrumb\">\r\n");
      out.write("                    <i class=\"fas fa-shopping-bag\"></i>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <h3>Seu pedido</h3>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ol>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"table-responsive cart_info\">\r\n");
      out.write("                <table class=\"table table-condensed\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr class=\"cart_menu\">\r\n");
      out.write("                            <td class=\"description\">Produto</td>\r\n");
      out.write("                            <td class=\"description\">valor</td>\r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td class=\"cart_product\"id=\"p1\">\r\n");
      out.write("                               \r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td class=\"cart_product\"id=\"p2\">\r\n");
      out.write("                               \r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td class=\"cart_product\"id=\"p3\">\r\n");
      out.write("                               \r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td class=\"cart_product\"id=\"p4\">\r\n");
      out.write("                               \r\n");
      out.write("                            </td>\r\n");
      out.write("                            \r\n");
      out.write("                           \r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    \r\n");
      out.write("    <!--Rodapé-->\r\n");
      out.write("    <footer>\r\n");
      out.write("        <div id=\"contato\" class=\"container-fluid padding\">\r\n");
      out.write("            <div class=\"row text-center\">\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <img src=\"imagens/Logo.png\">\r\n");
      out.write("                    <hr class=\"light-1\">\r\n");
      out.write("                    <p>47-3456-9877</p>\r\n");
      out.write("                    <p>pegasus.pet@gmail.com</p>\r\n");
      out.write("                    <p>121, Antônio da Veiga</p>\r\n");
      out.write("                    <p>Blumenau - SC</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <hr class=\"light-2\">\r\n");
      out.write("                    <h5>Atendimento</h5>\r\n");
      out.write("                    <hr class=\"light-3\">\r\n");
      out.write("                    <p>Segunda à sexta: 24 hrs</p>\r\n");
      out.write("                    <p>Sábados: 8 às 20 hrs</p>\r\n");
      out.write("                    <p>Domingos: Fechado</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <hr class=\"light-4\">\r\n");
      out.write("                    <h5>Trabalhe conosco</h5>\r\n");
      out.write("                    <hr class=\"light-5\">\r\n");
      out.write("                    <p>Não há vagas disponíveis no momento.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-12\">\r\n");
      out.write("                    <hr class=\"light-6\">\r\n");
      out.write("                    <h5>&copy; pegasus.com</h5>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
