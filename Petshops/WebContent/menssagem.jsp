<%

//Tentativa
	try{
		
		//Obter a mensagem
		String mensagem = request.getParameter("mensagem");
	
		//Tipos de mensagem
		switch(mensagem){
			case "falhalogin":
				out.print("");
			break;
			
			case "falhaSessao":
				out.print("<div class='mensagem'>Realize o login</div>");
			break;
			
			case "cadastroOk":
				out.print("<div class='mensagem'>Produto cadastrado com sucesso</div>");
			break;
			
			case "cadastroFalha":
				out.print("<div class='mensagem'>Falha ao cadastrar o produto</div>");
			break;
			
			case "excluirOk":
			out.print("div class='mensagem'>Produto excluido com sucesso!</div>");
			
			case "excluirFalha":
			out.print("div class='mensagem'>Falha ao excluir o produto!</div>");
			
			case "alterarOk":
			out.print("div class='mensagem'>Produto alterado com sucesso!</div>");
			
			case "alterarFalha":
			out.print("div class='mensagem'>Falha ao alterar o produto!</div>");
		}
		
	}catch(Exception erro){}
	
%>