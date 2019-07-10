<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="topo.jsp" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <title>Higiene Pet</title>

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
        <H3>Banho e Tosa</H3>
    </div>

    <!-- Adicionar produtos -->
    <div class="card-deck">
        <div class="card">
            <img class="card-img-top" src="imagens/Shampoo1-01.png" alt="Imagem de capa do card">
            <div class="card-body">
                <h5 class="card-title">Perfume Four Paws Intenso Ouro</h5>
                <p class="font-weight-bold">Marca: Chalesco.</p>
                <p>- Indicado para c�es e gatos.
                    <br>- Proporciona uma �tima fixa��o.
                    <br>- Mant�m o pet cheiroso.
                    <br>- Dura��o de at� 24 horas.
                </p>
                <br>
                <h5 class="font-weight-bold" style="color: rgb(195, 93, 36)">R$79,99</h5>

            </div>
            <div class="card-footer">
                <a href="#" class="btn btn-primary">Comprar</a>
            </div>
        </div>
        <div class="card">
            <img class="card-img-top" src="imagens/Shampoo2-01.png" alt="Imagem de capa do card">
            <div class="card-body">
                <h5 class="card-title">Shampoo Avert Noxxi Control </h5>
                <p class="font-weight-bold">Marca: Avert.</p>
                <p class="card-text">- Indicado para c�es e gatos.
                    <br>- Ideal para pets com pr�-disposi��o a problemas dermatol�gicos.
                    <br>- Equilibra a sa�de da pele e dos pelos.
                    <br>- Remove o excesso de oleosidade da pele sem ressecar.
                    <br>- Dispon�vel em embalagem de 200ml.
                </p>
                <h5 class="font-weight-bold" style="color: rgb(195, 93, 36)">R$2,99</h5>
            </div>
            <div class="card-footer">
                <a href="#" class="btn btn-primary">Comprar</a>
            </div>
        </div>
        <div class="card">
            <img class="card-img-top" src="imagens/M�quinaDeTosa-01.png" alt="Imagem de capa do card">
            <div class="card-body">
                <h5 class="card-title">M�quina de tosa Smart Trim</h5>
                <p class="font-weight-bold">Marca: Wahl Clipper</p>
                <p class="card-text">- Indicado para c�es e gatos.
                    <br>- Perfeita para dar retoques no visual do seu pet.
                    <br>- F�cil de manusear e equipada com: 01 trimmer, 04 pentes, 
                    um �leo lubrificante e um carregador bivolt (110V e 220V).
                    <br>- Possui 2 anos de garantia do fabricante.
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
        <H3>Outros</H3>
    </div>

    <!-- Adicionar produtos -->
    <div class="card-deck">
        <div class="card">
            <img class="card-img-top" src="imagens/Tapete1-01.png" alt="Imagem de capa do card">
            <div class="card-body">
                <h5 class="card-title">Banheiro Pet Park</h5>
                <p class="font-weight-bold">Marca: Chalesco.</p>
                <p>- Indicado para c�es e gatos.
                    <br>- Tapete higi�nico feito de grama sint�tica at�xica.
                    <br>- Possui tr�s camadas protetoras: a grama, onde o seu pet faz suas 
                    necessidades, a bandeja de eleva��o e a de coleta.
                    <br>- Mant�m sua casa limpa e livre de maus odores.
                </p>
                <h5 class="font-weight-bold" style="color: rgb(195, 93, 36)">R$179,90</h5>

            </div>
            <div class="card-footer">
                <a href="#" class="btn btn-primary">Comprar</a>
            </div>
        </div>
        <div class="card">
            <img class="card-img-top" src="imagens/Fralda-01.png" alt="Imagem de capa do card">
            <div class="card-body">
                <h5 class="card-title">Fralda Higi�nica</h5>
                <p class="font-weight-bold">Marca: Dog's Care.</p>
                <p class="card-text">- A melhor op��o de fraldas para o seu c�o f�mea � a Fralda Higi�nica Dog's 
                    Care C�es F�meas.Com uma manta superabsorvente com gel em flocos 
                    que garantem at� 6 horas de absor��o. Indicado para c�es com incontin�ncia urin�ria, 
                    p�s-operat�rio, passeios e viagens longas e demarca��o de territ�rio.
                </p>
                <h5 class="font-weight-bold" style="color: rgb(195, 93, 36)">R$22,39</h5>
            </div>
            <div class="card-footer">
                <a href="#" class="btn btn-primary">Comprar</a>
            </div>
        </div>
        <div class="card">
            <img class="card-img-top" src="imagens/Len�oumedecido-01.png" alt="Imagem de capa do card">
            <div class="card-body">
                <h5 class="card-title">Tapete Higi�nico Super Premium</h5>
                <p class="font-weight-bold">Marca: Petix</p>
                <p class="card-text">- Indicada para c�es.
                    <br>- Desenvolvido com a maior absor��o poss�vel, sem odores fortes e com m�xima 
                    praticidade de limpeza.
                    <br>- Com os adesivos e as abas, fica muito mais f�cil de manusear.
                    <br>- Possui atrativo canino.
                </p>
                <h5 class="font-weight-bold" style="color: rgb(195, 93, 36)">R$84,90</h5>
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