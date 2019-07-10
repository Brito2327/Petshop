<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="topo.jsp" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <title>Pegasus - Banho e Tosa</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

    <!-- JQuery -->
    
    <!-- Adicionar arquivo CSS externo -->
    <link href="estilosBanhoEtosa.css" rel="stylesheet">

    <!--Ícone - Logo-->
    <link rel="shortcut icon" href="favicon.ico.ico" type="image/x-icon" />

</head>

<!-- JS -->
<script>

</script>

<body>
    <!--Cabeçalho-->
   

    
    <!-- Título-->
    <div class="menu-banhotosa">
        <br>
        <H3>Banho e tosa</H3>
    </div>

    <!-- Adicionar produtos - Banho e tosa -->
    <div class="card-deck">
        <!--Produto 1-->
        <div class="card">
            <img class="card-img-top" src="imagens/banhoetosa2.jpg" alt="Imagem de capa do card">
            <div class="card-body">
                <h5 class="card-title">Banho</h5>
                <p class="font-weight-bold">Banho sem tosa</p>
                <p> <br>- Remoção do mau cheiro e prevenção de doenças.
                    <br>- Manutenção da integridade da pele.
                    <br>- Temperatura da água testada e aprovada.
                    <br>- Secagem 100% efetiva.
                </p>
            <!-- Divisão -->
            <hr>
                <form>
                    <fieldset>

                        <legend id="choice" >Escolha o tamanho do seu animal:</legend>

                        <input type="radio" name="curso">
                        <label>Até 45Kg</label>

                        <input type="radio" name="curso">
                        <label>Acima de 45Kg</label>
                    </fieldset>
                </form>
            <!-- Divisão -->
            <hr>
                <form>
                    <label id="choice"> Adicionar serviço delivery do animal?(+ R$ 30,00)</label>
                    <select required>
                        <option>Sim</option>
                        <option>Não</option>
                    </select>
                </form>
            <!-- Divisão -->
            <hr>
                <h5 class="font-weight-bold" style="color: rgb(195, 93, 36)">Total: R$35,00</h5>
            <!-- Divisão -->
            <hr>
            <form>
                <p class="font-weight-bold">Agendar</p>
                <br>Informe a data:
                <input id="dateAndTime" type="date" required>

                <br>Informe horário:
                <input id="dateAndTime" type="time" id="appt" min="8:00" max="18:00" required>

                <p class="font-weight-bold">Obs.: A equipe entrará em contato por e-mail/telefone caso não haja
                    possibilidade de atendimento
                    na data e horário preteridos.
                </p>
            </form>
            </div>
            <!-- Divisão -->
            <hr>
            <div class="card-footer">
                <a href="#" class="btn btn-primary">Comprar</a>
            </div>
        </div>

        <!--Produto 2-->
        <div class="card">
        <img class="card-img-top" src="imagens/banhoetosa3.jpg" alt="Imagem de capa do card">
        <div class="card-body">
            <h5 class="card-title">Banho e tosa</h5>
            <p class="font-weight-bold">Máquina, tesoura, higiência, bebê</p>
            <p> <br>- Tosa específica para tipo de animal e escolha do cliente.
                <br>- Remoção do mau cheiro e prevenção de doenças.
                <br>- Manutenção da integridade da pele.
                <br>- Temperatura da água testada e aprovada.
                <br>- Secagem 100% efetiva.
            </p>
        <!-- Divisão -->
        <hr>
            <form>
                <fieldset>

                    <legend id="choice" >Escolha o tamanho do seu animal:</legend>

                    <input type="radio" name="curso">
                    <label>Até 45Kg</label>

                    <input type="radio" name="curso">
                    <label>Acima de 45Kg</label>
                </fieldset>
            </form>
            <!-- Divisão -->
        <hr>
        <form>
            <fieldset>
                <legend id="choice" >Escolha o tipo de tosa:</legend>

                <input type="radio" name="curso">
                <label>Máquina</label>

                <input type="radio" name="curso">
                <label>Tesoura</label>

                <input type="radio" name="curso">
                <label>Higiênica</label>

                <input type="radio" name="curso">
                <label>Bebê</label>
            </fieldset>
        </form>
        <!-- Divisão -->
        <hr>
            <form>
                <label id="choice">Adicionar serviço delivery do animal?(+ R$ 30,00)</label>
                <select required>
                    <option>Sim</option>
                    <option>Não</option>
                </select>
            </form>
        <!-- Divisão -->
        <hr>
            <h5 class="font-weight-bold" style="color: rgb(195, 93, 36)">Total: R$45,00</h5>
        <!-- Divisão -->
        <hr>
        <form>
            <p class="font-weight-bold">Agendar</p>
            <br>Informe a data:
            <input id="dateAndTime" type="date" required>

            <br>Informe horário:
            <input id="dateAndTime" type="time" id="appt" min="8:00" max="18:00" required>

            <p class="font-weight-bold">Obs.: A equipe entrará em contato por e-mail/telefone caso não haja
                possibilidade de atendimento
                na data e horário preteridos.
            </p>
        </form>
        </div>
        <!-- Divisão -->
        <hr>
        <div class="card-footer">
            <a href="#" class="btn btn-primary">Comprar</a>
        </div>
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