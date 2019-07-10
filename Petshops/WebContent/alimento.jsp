<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="topo.jsp" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <title>Alimentação Pet</title>

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

    <!-- Título de produto 1 -->
    <div class="menu-produto">
        <br>
        <H3>Ração</H3>
    </div>

    <!-- Adicionar produtos -->
    <div class="card-deck">
        <div class="card">
            <img class="card-img-top" src="imagens/Ração1-01.png" alt="Imagem de capa do card">
            <div class="card-body">
                <h5 class="card-title">Ração Golden Sabor Frango e Arroz - 15kg</h5>
                <p class="font-weight-bold">Marca: Golden | Premier Pet.</p>
                <p>- Indicado para cães adultos.
                    <br>- Específica para os pets com mais de 7 anos de idade.
                    <br>- Proporciona proteção articular.
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
            <img class="card-img-top" src="imagens/Ração2-01.png" alt="Imagem de capa do card">
            <div class="card-body">
                <h5 class="card-title">Ração Natural para Calopsita</h5>
                <p class="font-weight-bold">Marca: Nutrópica.</p>
                <p class="card-text">- Indicada para calopsitas.
                    <br>- Formulada com 16 cereais integrais.
                    <br>- É composta por partículas extrusadas e sementes.
                    <br>- Alimentação completa e balanceada.
                    <br>- Disponível em embalagem com 300 g, 900 g ou 5 kg.
                </p>
                <h5 class="font-weight-bold" style="color: rgb(195, 93, 36)">R$19,99</h5>
            </div>
            <div class="card-footer">
                <a href="#" class="btn btn-primary">Comprar</a>
            </div>
        </div>
        <div class="card">
            <img class="card-img-top" src="imagens/Ração3-01.png" alt="Imagem de capa do card">
            <div class="card-body">
                <h5 class="card-title">Alimento Alcon Guppy</h5>
                <p class="font-weight-bold">Marca: Alcon Pet</p>
                <p class="card-text">- Indicado para peixes.
                    <br>- Com seu formato de flocos pequenos é mais facilmente ingerida pelos peixes pequenos.
                    <br>- Sua fórmula contém minerais orgânicos quelatados, omega-3, probióticos e enzimas 
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
    <!-- Título de produto 2 -->
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
                <p>- Indicado para cães.
                    <br>- Petisco delicioso feito com carne fresca.
                    <br>- Conta com aroma irresistível.
                    <br>- Pode ser oferecido para pets de todos os portes e idades.
                    <br>- Disponível em embalagem com 65 g.
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
                <p class="card-text">- Dê mais sabor à hora do adestramento. Ofereça como prêmio para seu dog, 
                    um Bifinho KelDog Cães Adultos e Filhotes Carnes e Cereais é leve e enriquecido com cereais 
                    para o desenvolvimento do seu pet. Ele é indicado para cães de todas as idades e raças.
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
                <h5 class="card-title">Ração Úmida Sabor Salmão</h5>
                <p class="font-weight-bold">Marca: Petix</p>
                <p class="card-text">- A Ração Úmida GranPlus Para Gatos Adultos Sachê Sabor Salmão tem tudo 
                    que seu gato precisa para uma deliciosa refeição. Desenvolvida para gatos com paladares
                     exigentes, com nutrientes na medida certa para seu gato e delicioso sabor salmão..
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
    <!--Rodapé-->
    <footer>
        <div class="container-fluid padding">
            <div class="row text-center">
                <div class="col-md-4">
                    <img src="imagens/Logo.png">
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