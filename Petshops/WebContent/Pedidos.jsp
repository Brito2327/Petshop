<%@page import="bean.Pedido" %>
<%@page import="dao.PedidoDao" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <title>Pedido</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

    <!-- JQuery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>

    <!-- Fotorama -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/fotorama/4.6.4/fotorama.css" rel="stylesheet">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/fotorama/4.6.4/fotorama.js"></script>

    <!-- Adicionar arquivo CSS -->
    <link href="estilosCarrinho.css" rel="stylesheet">

    <!-- Icone -->
    <link rel="shortcur icon" href="favicon.ico.ico" type="image/x-icon" />

</head>

<body>

    <!--Cabe�alho-->
    <header class="menu-principal">
        
            <div class="header-1">
                <div class="logo">
                    <img src="imagens/Logo.png" />
                </div>
                <div class="redes-sociais">
                </div>
            </div>
      
    </header>

   



<script>
 var total = 0; // vari�vel que retorna o total dos produtos que est�o na LocalStorage.
 var i = 0;     // vari�vel que ir� percorrer as posi��es
 var valor = 0; // vari�vel que ir� receber o pre�o do produto convertido em Float.
 
 for(i=1; i<=99; i++) // verifica at� 99 produtos registrados na localStorage
 {
	 var prod = localStorage.getItem("produto" + i + ""); // verifica se h� recheio nesta posi��o. 
	 if(prod != null) 
	 {	
		 // exibe os dados da lista dentro da div itens
		 document.getElementById("p1").innerHTML += localStorage.getItem("qtd" + i) + " x ";
		 document.getElementById("p2").innerHTML += localStorage.getItem("produto" + i);
		 document.getElementById("p3").innerHTML += " ";
		 document.getElementById("p4").innerHTML += "R$: " + localStorage.getItem("valor" + i) + "<hr>";
		 
		 // calcula o total dos recheios
		 valor = parseFloat(localStorage.getItem("valor" + i)); // valor convertido com o parseFloat()
		 total = (total + valor); // arredonda para 2 casas decimais com o .toFixed(2)
	 }
 } 
 // exibe o total dos recheios
 document.getElementById("total").innerHTML = total.toFixed(2); 
</script>


    <!--/header-->

   
        <div class="container">
            <div class="breadcrumbs">
                <ol class="breadcrumb">
                    <i class="fas fa-shopping-bag"></i>
                    <li>
                        <h3>Seu pedido</h3>
                    </li>
                </ol>
            </div>
            <div class="table-responsive cart_info">
                <table class="table table-condensed">
                    <thead>
                        <tr class="cart_menu">
                            <th class="description">quatidade</th>
                            <th class="description">produto</th>
                            <th class="description">valor</th>
                            <th class="description">valorTotal</th>
                            
                           
                            
                            
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td class="cart_product" id="p1">
                            </td>
                            <td class="cart_product"id="p2">
                            </td>
                            <td class="cart_product"id="p3">
                            </td>
                            <td class="cart_product"id="p4">
                            </td>
                           
                            
                           
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    
    <!--Rodap�-->
    <footer>
        <div id="contato" class="container-fluid padding">
            <div class="row text-center">
                <div class="col-md-4">
                    <img src="imagens/Logo.png">
                    <hr class="light-1">
                    <p>47-3456-9877</p>
                    <p>pegasus.pet@gmail.com</p>
                    <p>121, Ant�nio da Veiga</p>
                    <p>Blumenau - SC</p>
                </div>
                <div class="col-md-4">
                    <hr class="light-2">
                    <h5>Atendimento</h5>
                    <hr class="light-3">
                    <p>Segunda � sexta: 24 hrs</p>
                    <p>S�bados: 8 �s 20 hrs</p>
                    <p>Domingos: Fechado</p>
                </div>
                <div class="col-md-4">
                    <hr class="light-4">
                    <h5>Trabalhe conosco</h5>
                    <hr class="light-5">
                    <p>N�o h� vagas dispon�veis no momento.</p>
                </div>
                <div class="col-12">
                    <hr class="light-6">
                    <h5>&copy; pegasus.com</h5>
                </div>
            </div>
        </div>
    </footer>

</body>

</html>