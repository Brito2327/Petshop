<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="topo.jsp" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <title>Pegasus - P�gina Inicial</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

    <!-- JQuery -->

    <!-- Adicionar arquivo CSS externo -->
    <link href="estilos.css" rel="stylesheet">

    <!--�cone - Logo-->
    <link rel="shortcut icon" href="favicon.ico.ico" type="image/x-icon" />
</head>

<!-- JS -->
<script>

</script>

    <!--Banner-->
    <div id="slides" class="carousel slide" data-ride="carousel">
        <ul class="carousel-indicators">
            <li data-target="#slides" data-slide-to="0" class="active"></li>
            <li data-target="#slides" data-slide-to="1"></li>
            <li data-target="#slides" data-slide-to="2"></li>
        </ul>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="imagens/banner-servi�os.png">
                <div class="carousel-caption">
                </div>
            </div>

            <div class="carousel-item">
                <img src="imagens/banner-adocao.png">
                <div class="carousel-caption">
                </div>
            </div>

            <div class="carousel-item">
                <img src="imagens/banner-produtos.png">
                <div class="carousel-caption">
                </div>
            </div>
        </div>
    </div>

    <!--Jumbotron-->
    <div class="container-fluid">
        <div class="row jumbotron">
            <div class="col-xs-12 col-sm-12 col-md-9 col-lg-9 col-xl-10">
                <p class="lead">O banho � extremamente importante para sa�de e higiene dos pets e � um h�bito necess�rio
                    na rotina do seu bichinho.</p>
            </div>
            <div class="col-xs-12 col-sm-12 col-md-3 col-lg-3 col-xl-2">
                <a href="banhoEtosa.html"><button type="button" class="btn btn-outline-secondary btn-lg">Ficar limpinho</button></a>
            </div>
        </div>
    </div>

    <!--Sess�o de boas-vindas-->
    <div class="container-fluid padding">
        <div class="row welcome text-center">
            <div class="col-12">
                <h1 class="display-4">Seja bem-vindo!</h1>
            </div>
            <hr>
            <div class="col-12">
                <p class="lead">Damos as boas vindas � voc�, novo cliente. Desejamos oferecer o melhor servi�o e
                    experi�ncia, cuidando do seu Pet com carinho e respeito.</p>
            </div>
        </div>
    </div>

    <!-- Sess�o �cones (Produtos, servi�os, cadastro-->
    <div class="container-fluid padding">
        <div class="row text-center padding">
            <div class="col-xs-12 col-sm-6 col-md-4">
                <a href="#"><i class="fas fa-shopping-cart"></i></a>
                <h3>PRODUTOS</h3>
                <p>Coleiras, bebedouros, casinhas e muito mais!</p>
            </div>
            <div class="col-xs-12 col-sm-6 col-md-4">
                <a href="banhoEtosa.html"><i class="fas fa-bath"></i></a>
                <h3>SERVI�OS</h3>
                <p>Seu Pet limpo e saud�vel!</p>
            </div>
            <div class="col-sm-12 col-md-4">
                <a href="cadastro.html"><i class="fas fa-user-plus"></i></a>
                <h3>CADASTRE-SE</h3>
                <p>E aproveite nossos servi�os personalizados!</p>
            </div>
        </div>
        <hr class="my-4">
    </div>

    <!--Sess�o Quem somos? - 2 column-->
    <div id="quemsomos" class="container-fluid padding">
        <div class="row padding">
            <div class="col-lg-6">
                <h2>Quem somos?</h2>
                <p>O petshop Pegasus atua no ramo desde 2015, acreditando no cuidado com
                    excel�ncia dos pets confiados aos nossos servi�os. Mais que uma empresa,
                    somos uma fam�lia apaixonada por animais e temos consci�ncia da import�ncia
                    e valor destes para seus tutores.
                    Prezamos pela qualidade do atendimento, desde o momento da recep��o em
                    nossa sede at� a sa�da segura do seu animalzinho, atrav�s de uma equipe
                    qualificada e especializada.
                </p>
                <p>O nosso desejo � fornecer a melhor experi�ncia poss�vel.
                    Para isso contamos tamb�m com sua resposta aos nossos servi�os.
                    Venha fazer parte da fam�lia Pegasus!
                </p>
                <br>
            </div>
            <div class="col-lg-6">
                <img src="imagens/equipe1.jpg" class="img-fluid">
            </div>
        </div>
    </div>

    <hr class="my-4">
    <!--Sess�o Ado��o-->
    <div id="adocao" class="container-fluid padding">
        <div class="row welcome text-center">
            <div class="col-12">
                <h1 class="display-4">Animais dispon�veis para ado��o</h1>
            </div>
            <hr>
            <div class="col-12">
                <p class="lead">Dirija-se � sede para adotar um amigo.</p>
            </div>
        </div>
    </div>

    <!--Cart�es sess�o Ado��o -->
    <div class="container-fluid padding">
        <div class="row padding">
            <div class="col-md-4">
                <div class="card">
                    <img class="card-img-top" src="imagens/adocao-1.jpg">
                    <div class="card-body">
                        <h4 class="card-title">Peralta</h4>
                        <p class="card-text">"Fui encontrado vagando pelo centro da cidade.
                            Sou muito alegre e brincalh�o. Quero um lar para dividir minha felicidade."</p>
                    </div>
                </div>
            </div>

            <div class="col-md-4">
                <div class="card">
                    <img class="card-img-top" src="imagens/adocao-2.jpeg">
                    <div class="card-body">
                        <h4 class="card-title">Baleia</h4>
                        <p class="card-text">"Me chamam de Baleia porque adoro brincar na �gua.
                            Quero fazer parte de uma fam�lia."</p>
                    </div>
                </div>
            </div>

            <div class="col-md-4">
                <div class="card">
                    <img class="card-img-top" src="imagens/adocao-3.jpg">
                    <div class="card-body">
                        <h4 class="card-title">Norman</h4>
                        <p class="card-text">"Sou muito calma e adoro um cafun�.
                            J� estou pronta para me aconchegar com meus futuros tutores."</p>
                    </div>
                </div>
            </div>

        </div>
        <hr class="my-4">

        <!--Sess�o parceiros-->
        <div class="partner">
            <h1 class="partner-1">Parceiros</h1>
        </div>

        <div class="card-mb-3">
            <img src="imagens/parceiros.jpg" class="card-img-top">
            <div class="card-body">
                <h5 class="card-title">S�tio Dona L�cia</h5>
                <p class="card-text">Temos parceria com o S�tio Dona L�cia, que oferece abrigo para animais
                    abandonados e em necessidade. Fa�a parte dessa rede!
                </p>
                <p class="card-text"><small class="text-muted">A Pegasus n�o possui controle sobre as atividades
                        do S�tio.</small></p>
                <a href="https://www.facebook.com/sitiodonalucia/"><button type="button"
                        class="btn btn-outline-secondary btn-outline-secondary">Visitar</button></a>
            </div>
        </div>

    </div>

    <!--Redes sociais-->
    <div class="container-fluid padding">
        <div class="row text-center padding">
            <div class="col-12">
                <h2>Siga nossos perfis</h2>
            </div>
            <div class="col-12 social padding">
                <a href="https://www.facebook.com/pegauspetshop"><i class="fab fa-facebook"></i></a>
                <a href="https://twitter.com/PegasusPetshop"><i class="fab fa-twitter"></i></a>
                <a href="https://www.instagram.com/petshoppegasus2019/"><i class="fab fa-instagram"></i></a>
            </div>
        </div>
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