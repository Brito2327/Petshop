 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ include file="topo.jsp" %>
 
<!DOCTYPE html>
<html>

<head>
    <title>Cadastro de Produtos</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8" />

    <!-- Librer�a Google Fonts: Tipograf�a del sitio web -->
    

</head>

<body>

    <!--Cabe�alho-->
   
    <!--Formul�rio de entrada de dados-->
    <div class="container">
        <form id="frmPerson" class="form-horizontal" action="requisicoes/ProdutoCadastro.jsp">
            <div class="form-group">
                <label for="txtID" class="col-sm-2 control-label">ID</label>
                <div class="col-sm-4">
                    <input type="text" id="txtID" class="form-control" placeholder="ID...">
                </div>
            </div>
            <div class="form-group">
                <label for="txtName" class="col-lg-2 control-label">Nome</label>
                <div class="col-sm-4">
                    <input type="text" id="txtNome" class="form-control" placeholder="Nome..." name="nome">
                </div>
            </div>
            <div class="form-group">
                <label for="txtPhone" class="col-lg-2 control-label">Valor</label>
                <div class="col-sm-4">
                    <input type="text" id="txtValor" class="form-control" placeholder="Valor..." name="valor">
                </div>
            </div>
            <div class="form-group">
                <label for="txtEmail" class="col-lg-2 control-label">Categoria</label>
                <div class="col-sm-4">
                    <select name="categoria" >
						<option value="Alimento">Alimento</option>
						<option value="Acessorio" >Acessorio</option>
						<option value="Higiene">Higiene</option>
						<option value="Farmacia">Farmacia</option>
					</select>
                </div>
            </div>
            <div class="form-group">
                <div class="col-lg-offset-2 col-sm-4">
                    <input type="submit" value="Inserir" id="btnSave" class="btn btn-success" />
                </div>
            </div>
        </form>
    </div>

    <!--Tabla con la lista de datos-->
    <div class="container">
        <table id="tblList" class="table table-bordered"></table>
    </div>

    <!--Rodap�-->
    <footer>
        <div id="contato" class="container-fluid padding">
            <div class="row text-center">
                <div class="col-md-4">
                    <img src="imagens/logo-pegasus.png">
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