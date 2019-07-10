$(function () {
  var operation = "C"; //"C"=Criar
  var selected_index = -1; // Índice do elemento selecionado na lista
  var tblPersons = localStorage.getItem("tblPersons"); //Retornar dados armazenados
  tblPersons = JSON.parse(tblPersons); //Converter String
  if (tblPersons === null) // Iniciar array vazio, se não houver dados
      tblPersons = [];

  function Create() {
    //Obter os valores da HTML - Transformar em String.
    var person = JSON.stringify({
      ID: $("#txtID").val(),
      Name: $("#txtNome").val(),
      Phone: $("#txtValor").val(),
      Email: $("#txtCategoria").val()
    }); 
    //Adicionar o objeto à tabela
    tblPersons.push(person);
    //Armazenar os dados ma Local Storage
    localStorage.setItem("tblPersons", JSON.stringify(tblPersons));
    alert("Os dados foram armazenados!"); //Alerta
    return true;
  }

  function Edit() {
    // Editar o item selecionado na tabela
    tblPersons[selected_index] = JSON.stringify({
        ID: $("#txtID").val(),
        Name: $("#txtNome").val(),
        Phone: $("#txtValor").val(),
        Email: $("#txtCategoria").val()
    });
    //Armazenar os dados na Local Storage
    localStorage.setItem("tblPersons", JSON.stringify(tblPersons)); 
    alert("O produto foi editado!"); //Alerta
    return true;
  }

  function Delete() {
    //Deletar o item selecionado na tabela
    tblPersons.splice(selected_index, 1); 
    //Atualizar os dados na Local Storage
    localStorage.setItem("tblPersons", JSON.stringify(tblPersons)); 
    alert("Produto deletado!"); //Alerta
  }
  //Adicionar a tabela à estrutura HTML
  function List() {
    $("#tblList").html("");
    $("#tblList").html(
            "<thead>" +
            "<tr>" +                
            "<th>ID</th>" +
            "<th>Nome</th>" +
            "<th>Valor</th>" +
            "<th>Categoria</th>" +
            "<th>Ações</th>" +
            "</tr>" +
            "</thead>" +
            "<tbody>" +
            "</tbody>"
            );
    //Proocurar e adicionar o item à tabela HTML
    for (var i in tblPersons) {
        var per = JSON.parse(tblPersons[i]);
        $("#tblList tbody").append("<tr>" +                    
                "<td>" + per.ID + "</td>" +
                "<td>" + per.Name + "</td>" +
                "<td>" + per.Phone + "</td>" +
                "<td>" + per.Email + "</td>" +                    
                "<td><img src='imagens/edit.png' alt='Edit" + i + "' class='btnEdit'/>&nbsp &nbsp<img src='imagens/delete.png' alt='Delete" + i + "' class='btnDelete'/></td>" +
                "</tr>"
                );
    }
  }
  //Função de diferenciação - Adicionando ou Editando?
  $("#frmPerson").bind("submit", function () {
    if (operation === "C")
        return Create();
    else
        return Edit();
  });
  
  List();

  $(".btnEdit").bind("click", function () {
    operation = "E"; //"E" = Editar
    //Obter o identificador do item a ser editado
    selected_index = parseInt($(this).attr("alt").replace("Edit", ""));
    // Converter de JSON -> formato adequado para editar dados
    var per = JSON.parse(tblPersons[selected_index]); 
    $("#txtID").val(per.ID);
    $("#txtNome").val(per.Name);
    $("#txtValor").val(per.Phone);
    $("#txtCategoria").val(per.Email);
    $("#txtID").attr("readonly", "readonly");
    $("#txtNome").focus();
  });

  $(".btnDelete").bind("click", function () {
    //Obter o identificador do item a ser deletado
    selected_index = parseInt($(this).attr("alt").replace("Delete", "")); 
    //Deletar item
    Delete();
    //Voltar a listar os items na tabela
    List();
  });
});

