<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="topo.jsp" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <title>Farm�cia Pet</title>

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

    <!--Cabe�alho-->
    


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
        <H3>Sa�de bucal</H3>
    </div>

    <!-- Adicionar produtos -->
    <div class="card-deck">
        <div class="card">
            <img class="card-img-top" src="imagens/1.jpg" alt="Imagem de capa do card">
            <div class="card-body">
                <h5 class="card-title">Escova Dental Good Care</h5>
                <p class="font-weight-bold">Marca: Mundo Animal.</p>
                <p>- Indicado para c�es e gatos.
                    <br>- Previne o mau h�lito.
                    <br>- Auxilia no combate do t�rtaro.
                    <br>- Promove higieniza��o dos dentes.
                    <br>- Seu formato facilita o alcance de todas as partes da boca do pet.
                </p>
                <h5 class="font-weight-bold" style="color: rgb(195, 93, 36)">R$19,99</h5>

            </div>
            <div class="card-footer">
                <a href="#" class="btn btn-primary">Comprar</a>
            </div>
        </div>
        <div class="card">
            <img class="card-img-top" src="imagens/2.jpg" alt="Imagem de capa do card">
            <div class="card-body">
                <h5 class="card-title">Creme Dental C�es e Gatos  </h5>
                <p class="font-weight-bold">Marca: Mundo Animal.</p>
                <p class="card-text">- Indicado para c�es e gatos.
                    <br>- Promove uma higieniza��o tranquila.
                    <br>- A bisnaga de 60g leva hexametafosfato de s�dio na composi��o, que reduz o 
                    t�rtaro e o mau h�lito.
                    <br>- A escova��o � recomendada ao menos duas vezes por semana.
                </p>
                <h5 class="font-weight-bold" style="color: rgb(195, 93, 36)">R$39,99</h5>
            </div>
            <div class="card-footer">
                <a href="#" class="btn btn-primary">Comprar</a>
            </div>
        </div>
        <div class="card">
            <img class="card-img-top" src="imagens/3.jpg" alt="Imagem de capa do card">
            <div class="card-body">
                <h5 class="card-title">Creme Dental Good Care</h5>
                <p class="font-weight-bold">Marca: Mundo Animal</p>
                <p class="card-text">- Indicado para c�es e gatos.
                    <br>- F�cil aplica��o.
                    <br>- Ideal para a higieniza��o bucal do pet.
                    <br>- Produzido com ingredientes naturais e livre de corantes.
                    <br>- Com aroma suave de menta.
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
            <img class="card-img-top" src="imagens/4.jpg" alt="Imagem de capa do card">
            <div class="card-body">
                <h5 class="card-title">Antipulgas e Carrapatos (40 a 56 kg)</h5>
                <p class="font-weight-bold">Marca: Bravecto.</p>
                <p>- Indicado para c�es.
                    <br>- Elimina pulgas e carrapatos rapidamente.
                    <br>- Prote��o que dura por 12 semanas.
                    <br>- N�o sai com o banho.
                    <br>- Embalagem com 1 comprimido mastig�vel de 1400mg.
                </p>
                <h5 class="font-weight-bold" style="color: rgb(195, 93, 36)">R$299,99</h5>

            </div>
            <div class="card-footer">
                <a href="#" class="btn btn-primary">Comprar</a>
            </div>
        </div>
        <div class="card">
            <img class="card-img-top" src="imagens/5.jpg" alt="Imagem de capa do card">
            <div class="card-body">
                <h5 class="card-title">Meticorten 5mg 10 Comprimidos</h5>
                <p class="font-weight-bold">Marca: MSD.</p>
                <p class="card-text">- Indicado para c�es e gatos.
                    <br>- Possui a��o anti-inflamat�ria, antirreum�tica e antial�rgica.
                    <br>- Auxilia no tratamento de doen�as dermatol�gicas, reum�ticas, respirat�rias e oft�lmicas.
                    <br>- Tamb�m trata casos de otite externa e alergias.
                </p>
                <h5 class="font-weight-bold" style="color: rgb(195, 93, 36)">R$17,99</h5>
            </div>
            <div class="card-footer">
                <a href="#" class="btn btn-primary">Comprar</a>
            </div>
        </div>
        <div class="card">
            <img class="card-img-top" src="imagens/6.jpg" alt="Imagem de capa do card">
            <div class="card-body">
                <h5 class="card-title">Vita Vet C 30ml</h5>
                <p class="font-weight-bold">Marca: Vetnil</p>
                <p class="card-text">- Atua como um poderoso antioxidante, melhorando as fun��es fisiol�gicas do 
                    organismo do animal.
                    <br>- Uso interno (gotas).
                    <br>- � composto por glicose e vitamina C.
                    <br>- Dispon�vel em embalagem com 30ml.
                </p>
                <h5 class="font-weight-bold" style="color: rgb(195, 93, 36)">R$23,99</h5>
            </div>
            <div class="card-footer">
                <a href="#" class="btn btn-primary">Comprar</a>
            </div>
        </div>
    </div>
    
    <br>
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