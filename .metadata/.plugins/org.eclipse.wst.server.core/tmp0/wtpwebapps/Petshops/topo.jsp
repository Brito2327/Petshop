<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

    <!-- JQuery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>

    <!-- Adicionar arquivo CSS externo -->
    <link href="estilos.css" rel="stylesheet">

    <!--Ícone - Logo-->
    <link rel="shortcut icon" href="imagens/favicon.ico.ico" type="image/x-icon" />
    
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>

    <!-- Librerías Bootstrap: Estilos externos del sitio web -->
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

    <!-- JQuery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>

    <!--Ícone - Logo-->
    <link rel="shortcut icon" href="imagens/favicon.ico.ico" type="image/x-icon" />

    <!-- Estilos del sitio web -->
    <link rel="stylesheet" href="elstiloCadastrar.css" />

    <!-- Funciones Javascript -->
    <script type="text/javascript" src="Js/functions.js"></script>
</head>
    
<body>
    <!--Cabeçalho-->
    <header class="menu-principal">
        
            <div class="header-1">
                <div class="logo">
                    <img src="imagens/logo-pegasus.png" />
                </div>
            </div>
       
    </header>

    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <!--Itens de navegação-->
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="index.jsp">Início <span class="sr-only">(current)</span></a>
                </li>

                <!--Dropdown-->
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Serviços</a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="BanhoEtosa.jsp">Banho e tosa</a>
                    </div>
                </li>

                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Produtos
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="alimento.jsp">Alimentação</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="higiene.jsp">Higiene</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="acessorio.jsp">Acessórios</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="farmacia.jsp">Farmácia</a>
                    </div>
                </li>

                <!--Fixos-->
                <li class="nav-item active">
                    <a class="nav-link" href="CadastroCliente.jsp">Cadastro <span class="sr-only">(current)</span></a>
                </li>

                

                <li class="nav-item active">
                    <a class="nav-link" href="#adocao">Adoção <span class="sr-only">(current)</span></a>
                </li>

                <li class="nav-item active">
                    <a class="nav-link" href="avaliacao.html">Avaliação <span class="sr-only">(current)</span></a>
                </li>

                <li class="nav-item active">
                    <a class="nav-link" href="#quemsomos">Quem somos? <span class="sr-only">(current)</span></a>
                </li>

                <li class="nav-item active">
                    <a class="nav-link" href="#contato">Contato <span class="sr-only">(current)</span></a>
                </li>
            </ul>
<%
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
	

%>

<!-- PopUp -->

<button class="btn btn-secondary my-2 my-sm-0"
                    onclick="document.getElementById('modal-wrapper').style.display='block'"
                    style="width:200px; margin-top:200px; margin-left:160px;"><i class="fas fa-user"></i>
                    Fazer login</i></button>
                   

                <div id="modal-wrapper" class="modal">

                    <form class="modal-content animate" action="/action_page.php">

                        <div class="imgcontainer">
                            <span onclick="document.getElementById('modal-wrapper').style.display='none'" class="close"
                                title="Fechar PopUp">×</span>
                            <img src="imagens/icone.jfif    " alt="Avatar" class="avatar">
                        </div>

                        <div class="container">
                            <input type="text" placeholder="Nome de usuário" name="uname">
                            <input type="password" placeholder="Senha" name="psw">
                            <button type="submit" onclick="login()">Login</button>
                            <input type="checkbox" style="margin:26px 30px;"> Remember me
                            <a href="#"
                                style="text-decoration:none; float:right; margin-right:34px; margin-top:26px;">Esqueceu a senha?</a>
                        </div>

                    </form>

                </div>


        </div>
    </nav>
<script>
 // If user clicks anywhere outside of the modal, Modal will close
function login() {
	
    var modal = document.getElementById('modal-wrapper');
    window.onclick = function (event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }
    }
}
    </script>
</html>
