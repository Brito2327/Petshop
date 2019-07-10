<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="topo.jsp" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <title>Alimenta��o Pet</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

    <!-- JQuery -->
    

    <!-- Fotorama -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/fotorama/4.6.4/fotorama.css" rel="stylesheet">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/fotorama/4.6.4/fotorama.js"></script>

    <!-- Adicionar arquivo CSS -->
    <link href="estilos.css" rel="stylesheet">

</head>

<body>

    

    <!-- Navbar -->
    

    <!-- Banner -->
    <section class="fotorama" data-width="100%" data-loop="true" data-autoplay="2500" data-stopautoplayontouch="false"
        data-transition="crossfade">
        <img src="imagens/img1.jpg">
        <img src="imagens/img2.jpg">
        <img src="imagens/img3.jpg">
    </section>

    <!-- T�tulo de produto 1 -->
    <div class="menu-produto">
        <br>
        <H3>Ra��o</H3>
    </div>

    <!-- Adicionar produtos -->
    <div class="card-deck">
        <div class="card">
            <img class="card-img-top" src="imagens/Ra��o1-01.png" alt="Imagem de capa do card">
            <div class="card-body">
                <h5 class="card-title">Ra��o Golden Sabor Frango e Arroz - 15kg</h5>
                <p class="font-weight-bold">Marca: Golden | Premier Pet.</p>
                <p>- Indicado para c�es adultos.
                    <br>- Espec�fica para os pets com mais de 7 anos de idade.
                    <br>- Proporciona prote��o articular.
                    <br>- Oferece aporte nutricional ideal e balanceado.
                    <br>- Auxilia no controle de peso.
                </p>
                <h5 class="font-weight-bold" style="color: rgb(195, 93, 36)">R$115,23</h5>

            </div>
            <div class="card-footer">
                <a href="#" class="btn btn-primary">Comprar</a>
            </div>
        </div>
        <div class="card">
            <img class="card-img-top" src="imagens/Ra��o2-01.png" alt="Imagem de capa do card">
            <div class="card-body">
                <h5 class="card-title">Ra��o Natural para Calopsita</h5>
                <p class="font-weight-bold">Marca: Nutr�pica.</p>
                <p class="card-text">- Indicada para calopsitas.
                    <br>- Formulada com 16 cereais integrais.
                    <br>- � composta por part�culas extrusadas e sementes.
                    <br>- Alimenta��o completa e balanceada.
                    <br>- Dispon�vel em embalagem com 300 g, 900 g ou 5 kg.
                </p>
                <h5 class="font-weight-bold" style="color: rgb(195, 93, 36)">R$19,99</h5>
            </div>
            <div class="card-footer">
                <a href="#" class="btn btn-primary">Comprar</a>
            </div>
        </div>
        <div class="card">
            <img class="card-img-top" src="imagens/Ra��o3-01.png" alt="Imagem de capa do card">
            <div class="card-body">
                <h5 class="card-title">Alimento Alcon Guppy</h5>
                <p class="font-weight-bold">Marca: Alcon Pet</p>
                <p class="card-text">- Indicado para peixes.
                    <br>- Com seu formato de flocos pequenos � mais facilmente ingerida pelos peixes pequenos.
                    <br>- Sua f�rmula cont�m minerais org�nicos quelatados, omega-3, probi�ticos e enzimas 
                    digestivas que melhoram a flora intestinal.
                </p>
                <h5 class="font-weight-bold" style="color: rgb(195, 93, 36)">R$359,99</h5>
            </div>
            <div class="card-footer">
                <a href="#" class="btn btn-primary">Comprar</a>
            </div>
        </div>
    </div>

    <br>
    <!-- T�tulo de produto 2 -->
    <div class="menu-produto">
        <br>
        <H3>Petiscos</H3>
    </div>

    <!-- Adicionar produtos -->
    <div class="card-deck">
        <div class="card">
            <img class="card-img-top" src="imagens/Petisco1-01.png" alt="Imagem de capa do card">
            <div class="card-body">
                <h5 class="card-title">Petisco Sabor Carne</h5>
                <p class="font-weight-bold">Marca: Doguitos.</p>
                <p>- Indicado para c�es.
                    <br>- Petisco delicioso feito com carne fresca.
                    <br>- Conta com aroma irresist�vel.
                    <br>- Pode ser oferecido para pets de todos os portes e idades.
                    <br>- Dispon�vel em embalagem com 65 g.
                </p>
                <h5 class="font-weight-bold" style="color: rgb(195, 93, 36)">R$4,90</h5>

            </div>
            <div class="card-footer">
                <a href="#" class="btn btn-primary">Comprar</a>
            </div>
        </div>
        <div class="card">
            <img class="card-img-top" src="imagens/Petisco2-01.png" alt="Imagem de capa do card">
            <div class="card-body">
                <h5 class="card-title">Bifinho Sabor Carnes e Cereais</h5>
                <p class="font-weight-bold">Marca:  Keldog | Kelco Pet.</p>
                <p class="card-text">- D� mais sabor � hora do adestramento. Ofere�a como pr�mio para seu dog, 
                    um Bifinho KelDog C�es Adultos e Filhotes Carnes e Cereais � leve e enriquecido com cereais 
                    para o desenvolvimento do seu pet. Ele � indicado para c�es de todas as idades e ra�as.
                </p>
                <h5 class="font-weight-bold" style="color: rgb(195, 93, 36)">R$3,15</h5>
            </div>
            <div class="card-footer">
                <a href="#" class="btn btn-primary">Comprar</a>
            </div>
        </div>
        <div class="card">
            <img class="card-img-top" src="imagens/Petisco3-01.png" alt="Imagem de capa do card">
            <div class="card-body">
                <h5 class="card-title">Ra��o �mida Sabor Salm�o</h5>
                <p class="font-weight-bold">Marca: Petix</p>
                <p class="card-text">- A Ra��o �mida GranPlus Para Gatos Adultos Sach� Sabor Salm�o tem tudo 
                    que seu gato precisa para uma deliciosa refei��o. Desenvolvida para gatos com paladares
                     exigentes, com nutrientes na medida certa para seu gato e delicioso sabor salm�o..
                </p>
                <h5 class="font-weight-bold" style="color: rgb(195, 93, 36)">R$1,76</h5>
            </div>
            <div class="card-footer">
                <a href="#" class="btn btn-primary">Comprar</a>
            </div>
        </div>
    </div>
    
    <br>
    <br>
    <br>

    <!--Redes sociais-->
    <div class="container-fluid padding">
        <div class="row text-center padding">
            <div class="col-12">
                <h2>Siga nossos perfis</h2>
            </div>
            <div class="col-12 social padding">
                <a href="#"><i class="fab fa-facebook"></i></a>
                <a href="#"><i class="fab fa-twitter"></i></a>
                <a href="#"><i class="fab fa-instagram"></i></a>
            </div>
        </div>
    </div>

    <br>
    <br>
    <!--Rodap�-->
    <footer>
        <div class="container-fluid padding">
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