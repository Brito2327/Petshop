/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.21
 * Generated at: 2019-07-10 13:13:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class alimento_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/topo.jsp", Long.valueOf(1562764338223L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("    ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- JQuery -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"https://use.fontawesome.com/releases/v5.0.8/js/all.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Adicionar arquivo CSS externo -->\r\n");
      out.write("    <link href=\"estilos.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!--Ícone - Logo-->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"favicon.ico.ico\" type=\"image/x-icon\" />\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("    \r\n");
      out.write("<body>\r\n");
      out.write("    <!--Cabeçalho-->\r\n");
      out.write("    <header class=\"menu-principal\">\r\n");
      out.write("        \r\n");
      out.write("            <div class=\"header-1\">\r\n");
      out.write("                <div class=\"logo\">\r\n");
      out.write("                    <img src=\"imagens/logo-pegasus.png\" />\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("       \r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <!-- Navbar -->\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\r\n");
      out.write("            aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("\r\n");
      out.write("        <!--Itens de navegação-->\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("            <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("                <li class=\"nav-item active\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"index.jsp\">Início <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <!--Dropdown-->\r\n");
      out.write("                <li class=\"nav-item dropdown\">\r\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\"\r\n");
      out.write("                        data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                        Serviços</a>\r\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"BanhoEtosa.jsp\">Banho e tosa</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"nav-item dropdown\">\r\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\"\r\n");
      out.write("                        data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                        Produtos\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"alimento.jsp\">Alimentação</a>\r\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"higiene.jsp\">Higiene</a>\r\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"acessorio.jsp\">Acessórios</a>\r\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"farmacia.jsp\">Farmácia</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <!--Fixos-->\r\n");
      out.write("                <li class=\"nav-item active\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"CadastroCliente.jsp\">Cadastro <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("                <li class=\"nav-item active\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#adocao\">Adoção <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"nav-item active\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"avaliacao.html\">Avaliação <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"nav-item active\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#quemsomos\">Quem somos? <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"nav-item active\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#contato\">Contato <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");

try{
		
		//Obter a mensagem
		String mensagem = request.getParameter("mensagem");
	
		//Tipos de mensagem
		switch(mensagem){
			case "falhaLogin":
				out.print("<div class='mensagem'>Usuário ou senha incorretos</div>");
			break;
			case "falhaSessao":
				out.print("<div class='mensagem'>Realize o login</div>");
			break;
		}
	}catch(Exception erro){}
	


      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- PopUp -->\r\n");
      out.write("\r\n");
      out.write("<button class=\"btn btn-secondary my-2 my-sm-0\"\r\n");
      out.write("                    onclick=\"document.getElementById('modal-wrapper').style.display='block'\"\r\n");
      out.write("                    style=\"width:200px; margin-top:200px; margin-left:160px;\"><i class=\"fas fa-user\"></i>\r\n");
      out.write("                    Fazer login</i></button>\r\n");
      out.write("                   \r\n");
      out.write("\r\n");
      out.write("                <div id=\"modal-wrapper\" class=\"modal\">\r\n");
      out.write("\r\n");
      out.write("                    <form class=\"modal-content animate\" action=\"/action_page.php\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"imgcontainer\">\r\n");
      out.write("                            <span onclick=\"document.getElementById('modal-wrapper').style.display='none'\" class=\"close\"\r\n");
      out.write("                                title=\"Fechar PopUp\">×</span>\r\n");
      out.write("                            <img src=\"img/icone.jfif    \" alt=\"Avatar\" class=\"avatar\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                            <input type=\"text\" placeholder=\"Nome de usuário\" name=\"uname\">\r\n");
      out.write("                            <input type=\"password\" placeholder=\"Senha\" name=\"psw\">\r\n");
      out.write("                            <button type=\"submit\">Login</button>\r\n");
      out.write("                            <input type=\"checkbox\" style=\"margin:26px 30px;\"> Remember me\r\n");
      out.write("                            <a href=\"#\"\r\n");
      out.write("                                style=\"text-decoration:none; float:right; margin-right:34px; margin-top:26px;\">Esqueceu a senha?</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("<script>\r\n");
      out.write(" // If user clicks anywhere outside of the modal, Modal will close\r\n");
      out.write("\r\n");
      out.write("    var modal = document.getElementById('modal-wrapper');\r\n");
      out.write("    window.onclick = function (event) {\r\n");
      out.write("        if (event.target == modal) {\r\n");
      out.write("            modal.style.display = \"none\";\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    </script>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Alimentação Pet</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- JQuery -->\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <!-- Fotorama -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/fotorama/4.6.4/fotorama.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/fotorama/4.6.4/fotorama.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Adicionar arquivo CSS -->\r\n");
      out.write("    <link href=\"estilos.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <!-- Navbar -->\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <!-- Banner -->\r\n");
      out.write("    <section class=\"fotorama\" data-width=\"100%\" data-loop=\"true\" data-autoplay=\"2500\" data-stopautoplayontouch=\"false\"\r\n");
      out.write("        data-transition=\"crossfade\">\r\n");
      out.write("        <img src=\"imagens/img1.jpg\">\r\n");
      out.write("        <img src=\"imagens/img2.jpg\">\r\n");
      out.write("        <img src=\"imagens/img3.jpg\">\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <!-- Título de produto 1 -->\r\n");
      out.write("    <div class=\"menu-produto\">\r\n");
      out.write("        <br>\r\n");
      out.write("        <H3>Ração</H3>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Adicionar produtos -->\r\n");
      out.write("    <div class=\"card-deck\">\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("            <img class=\"card-img-top\" src=\"imagens/Ração1-01.png\" alt=\"Imagem de capa do card\">\r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("                <h5 class=\"card-title\">Ração Golden Sabor Frango e Arroz - 15kg</h5>\r\n");
      out.write("                <p class=\"font-weight-bold\">Marca: Golden | Premier Pet.</p>\r\n");
      out.write("                <p>- Indicado para cães adultos.\r\n");
      out.write("                    <br>- Específica para os pets com mais de 7 anos de idade.\r\n");
      out.write("                    <br>- Proporciona proteção articular.\r\n");
      out.write("                    <br>- Oferece aporte nutricional ideal e balanceado.\r\n");
      out.write("                    <br>- Auxilia no controle de peso.\r\n");
      out.write("                </p>\r\n");
      out.write("                <h5 class=\"font-weight-bold\" style=\"color: rgb(195, 93, 36)\">R$115,23</h5>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"card-footer\">\r\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary\">Comprar</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("            <img class=\"card-img-top\" src=\"imagens/Ração2-01.png\" alt=\"Imagem de capa do card\">\r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("                <h5 class=\"card-title\">Ração Natural para Calopsita</h5>\r\n");
      out.write("                <p class=\"font-weight-bold\">Marca: Nutrópica.</p>\r\n");
      out.write("                <p class=\"card-text\">- Indicada para calopsitas.\r\n");
      out.write("                    <br>- Formulada com 16 cereais integrais.\r\n");
      out.write("                    <br>- É composta por partículas extrusadas e sementes.\r\n");
      out.write("                    <br>- Alimentação completa e balanceada.\r\n");
      out.write("                    <br>- Disponível em embalagem com 300 g, 900 g ou 5 kg.\r\n");
      out.write("                </p>\r\n");
      out.write("                <h5 class=\"font-weight-bold\" style=\"color: rgb(195, 93, 36)\">R$19,99</h5>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"card-footer\">\r\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary\">Comprar</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("            <img class=\"card-img-top\" src=\"imagens/Ração3-01.png\" alt=\"Imagem de capa do card\">\r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("                <h5 class=\"card-title\">Alimento Alcon Guppy</h5>\r\n");
      out.write("                <p class=\"font-weight-bold\">Marca: Alcon Pet</p>\r\n");
      out.write("                <p class=\"card-text\">- Indicado para peixes.\r\n");
      out.write("                    <br>- Com seu formato de flocos pequenos é mais facilmente ingerida pelos peixes pequenos.\r\n");
      out.write("                    <br>- Sua fórmula contém minerais orgânicos quelatados, omega-3, probióticos e enzimas \r\n");
      out.write("                    digestivas que melhoram a flora intestinal.\r\n");
      out.write("                </p>\r\n");
      out.write("                <h5 class=\"font-weight-bold\" style=\"color: rgb(195, 93, 36)\">R$359,99</h5>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"card-footer\">\r\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary\">Comprar</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <br>\r\n");
      out.write("    <!-- Título de produto 2 -->\r\n");
      out.write("    <div class=\"menu-produto\">\r\n");
      out.write("        <br>\r\n");
      out.write("        <H3>Petiscos</H3>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Adicionar produtos -->\r\n");
      out.write("    <div class=\"card-deck\">\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("            <img class=\"card-img-top\" src=\"imagens/Petisco1-01.png\" alt=\"Imagem de capa do card\">\r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("                <h5 class=\"card-title\">Petisco Sabor Carne</h5>\r\n");
      out.write("                <p class=\"font-weight-bold\">Marca: Doguitos.</p>\r\n");
      out.write("                <p>- Indicado para cães.\r\n");
      out.write("                    <br>- Petisco delicioso feito com carne fresca.\r\n");
      out.write("                    <br>- Conta com aroma irresistível.\r\n");
      out.write("                    <br>- Pode ser oferecido para pets de todos os portes e idades.\r\n");
      out.write("                    <br>- Disponível em embalagem com 65 g.\r\n");
      out.write("                </p>\r\n");
      out.write("                <h5 class=\"font-weight-bold\" style=\"color: rgb(195, 93, 36)\">R$4,90</h5>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"card-footer\">\r\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary\">Comprar</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("            <img class=\"card-img-top\" src=\"imagens/Petisco2-01.png\" alt=\"Imagem de capa do card\">\r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("                <h5 class=\"card-title\">Bifinho Sabor Carnes e Cereais</h5>\r\n");
      out.write("                <p class=\"font-weight-bold\">Marca:  Keldog | Kelco Pet.</p>\r\n");
      out.write("                <p class=\"card-text\">- Dê mais sabor à hora do adestramento. Ofereça como prêmio para seu dog, \r\n");
      out.write("                    um Bifinho KelDog Cães Adultos e Filhotes Carnes e Cereais é leve e enriquecido com cereais \r\n");
      out.write("                    para o desenvolvimento do seu pet. Ele é indicado para cães de todas as idades e raças.\r\n");
      out.write("                </p>\r\n");
      out.write("                <h5 class=\"font-weight-bold\" style=\"color: rgb(195, 93, 36)\">R$3,15</h5>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"card-footer\">\r\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary\">Comprar</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("            <img class=\"card-img-top\" src=\"imagens/Petisco3-01.png\" alt=\"Imagem de capa do card\">\r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("                <h5 class=\"card-title\">Ração Úmida Sabor Salmão</h5>\r\n");
      out.write("                <p class=\"font-weight-bold\">Marca: Petix</p>\r\n");
      out.write("                <p class=\"card-text\">- A Ração Úmida GranPlus Para Gatos Adultos Sachê Sabor Salmão tem tudo \r\n");
      out.write("                    que seu gato precisa para uma deliciosa refeição. Desenvolvida para gatos com paladares\r\n");
      out.write("                     exigentes, com nutrientes na medida certa para seu gato e delicioso sabor salmão..\r\n");
      out.write("                </p>\r\n");
      out.write("                <h5 class=\"font-weight-bold\" style=\"color: rgb(195, 93, 36)\">R$1,76</h5>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"card-footer\">\r\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary\">Comprar</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("\r\n");
      out.write("    <!--Redes sociais-->\r\n");
      out.write("    <div class=\"container-fluid padding\">\r\n");
      out.write("        <div class=\"row text-center padding\">\r\n");
      out.write("            <div class=\"col-12\">\r\n");
      out.write("                <h2>Siga nossos perfis</h2>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-12 social padding\">\r\n");
      out.write("                <a href=\"#\"><i class=\"fab fa-facebook\"></i></a>\r\n");
      out.write("                <a href=\"#\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("                <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <!--Rodapé-->\r\n");
      out.write("    <footer>\r\n");
      out.write("        <div class=\"container-fluid padding\">\r\n");
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
