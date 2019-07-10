
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <title>Pegasus Cadastro</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

    <!-- JQuery -->


    <!-- Adicionar arquivo CSS externo -->
    <link href="estilos.css" rel="stylesheet">

    <!--Ícone - Logo-->
    <link rel="shortcut icon" href="favicon.ico.ico" type="image/x-icon" />
</head>

<!-- JS -->
<script>
    //Máscara CEP
    function fMasc(objeto, mascara) {
        obj = objeto
        masc = mascara
        setTimeout("fMascEx()", 1)
    }
    function fMascEx() {
        obj.value = masc(obj.value)
    }
    function mCEP(cep) {
        cep = cep.replace(/\D/g, "")
        cep = cep.replace(/^(\d{5})(\d)/, "$1-$2")

        return cep
    }

    //Máscara Telefone
    function fMascTelefone(objeto, mascara) {
        obj = objeto
        masc = mascara
        setTimeout("fMascEx2()", 1)
    }
    function fMascEx2() {
        obj.value = masc(obj.value)
    }
    function mTelefone(telefone) {
        telefone = telefone.replace(/\D/g, "")
        telefone = telefone.replace(/(\d{2})(\d)/, "$1-$2");
        telefone = telefone.replace(/(\d{5})(\d)/, "$1-$2");

        return telefone
    }
    //Validar senha
    function validarSenha() {
        senha1 = document.f1.senha1.value
        senha2 = document.f1.senha2.value

        if (senha1 == senha2)
            null
        else
            alert("SENHAS DIFERENTES")
    }
</script>


<body>
    <!--Cabeçalho-->
    <header class="menu-principal">

        <div class="header-1">
            <div class="logo">
                <img src="imagens/logo-pegasus.png" />
            </div>
        </div>

    </header>


    <!--Formulário de cadastro-->
    <div id="wrapper">
        <div class="form-container">
            <span class="form-heading">Cadastre-se</span>
            <form id="form-cadastro" action="requisicoes/Cadastro.jsp">
                <div class="input-group">
                    <i id="user-form" class="fas fa-user"></i>
                    <input type="text" placeholder="Nome completo..." name="nome" required>
                    <span class="bar"></span>
                </div>
                <div class="input-group">
                    <i id="email-form" class="fas fa-envelope"></i>
                    <input type="email" placeholder="Email..." name="email" required>
                    <span class="bar"></span>
                </div>
                <div class="input-group">
                    <i id="adress-form" class="fas fa-map-marker-alt"></i>
                    <input type="text" placeholder="Rua" name="rua" required>
                    <span class="bar"></span>
                </div>
                <div class="input-group">
                    <i id="adress-form" class="fas fa-map-marker-alt"></i>
                    <input type="text" placeholder="Bairro" name="bairro" required>
                    <span class="bar"></span>
                </div>
                <div class="input-group">
                    <i id="adress-form" class="fas fa-map-marker-alt"></i>
                    <input type="text" placeholder="Nº" name="numero" required>
                    <span class="bar"></span>
                </div>
                <div class="input-group">
                    <i id="adress-form" class="fas fa-map-marker-alt"></i>
                    <input type="text" placeholder="Cidade" name="cidade" required>
                    <span class="bar"></span>
                </div>
                <div class="input-group">
                    <i id="adress-form" class="fas fa-map-marker-alt"></i>
                    <input type="text" placeholder="Estado" name="estado" required>
                    <span class="bar"></span>
                </div>
                <div class="input-group">
                    <i id="cep-form" class="fas fa-home"></i>
                    <input type="text" name="cep" placeholder="CEP Ex.:#####-###"
                        onkeydown="javascript: fMasc( this, mCEP );" maxlength="9" required >
                    <span class="bar"></span>
                </div>
                <div class="input-group">
                    <i id="phone-form" class="fas fa-mobile-alt"></i>
                    <input type="text" placeholder="Telefone..." name="telefone"
                    onkeydown="javascript: fMascTelefone( this, mTelefone );" maxlength="13" required>
                    <span class="bar"></span>
                </div>
                <div class="input-group">
                    <i id="password-form" class="fas fa-lock"></i>
                    <input type="password" placeholder="Senha..." name="senha1" size="20" required>
                    <span class="bar"></span>
                </div>
                <div class="input-group">
                    <i id="confirm-form" class="fas fa-lock"></i>
                    <input type="password" placeholder="Confirmar senha..." name="senha2" size="20" required>
                    <span class="bar"></span>
                </div>
                <div class="input-group">
                    <button onclick="validarSenha()">
                        <i id="send-form" class="fab fa-telegram-plane"></i>
                    </button>
                </div>
                <div class="switch-login">
                    <a href="#logar">Já tem uma conta? <span>Login</span></a>
                </div>
            </form>
        </div>
    </div>

    <!--Rodapé-->
    <footer>
        <div id="contato" class="container-fluid padding">
            <div class="row text-center">
                <div class="col-md-4">
                    <img src="imagens/logo-pegasus.png">
                    <hr class="light-1">
                    <p>47-3456-9877</p>
                    <p>pegasus.pet@gmail.com</p>
                    <p>121, Antônio da Veiga</p>
                    <p>Blumenau - SC</p>
                </div>
                <div class="col-md-4">
                    <hr class="light-2">
                    <h5>Atendimento</h5>
                    <hr class="light-3">
                    <p>Segunda à sexta: 24 hrs</p>
                    <p>Sábados: 8 às 20 hrs</p>
                    <p>Domingos: Fechado</p>
                </div>
                <div class="col-md-4">
                    <hr class="light-4">
                    <h5>Trabalhe conosco</h5>
                    <hr class="light-5">
                    <p>Não há vagas disponíveis no momento.</p>
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