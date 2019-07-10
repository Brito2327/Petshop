package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProdutoDao {
	
	public String tabela() {
	
	//Contador para mudar o indice em sequencia na p�gina
	int contador = 1;

	//Iniciar estrutura
	
	
	String estrutura ="<thead>";
	estrutura+= "<tr>";
	estrutura+= "<th>ID</th>" ;
	estrutura+= "<th>nome</th>";
	estrutura+= "<th>categoria</th>";
	estrutura+= "<th>Alterar</th>";
	estrutura+= "<th>Excluir</th>";
	estrutura+= "</tr>";

	//Conex�o
	Connection conexao = Conexao.obterConexao();

	//Tentativa
	try {
	String sql = "SELECT * FROM Pedido";
	Statement stmt = conexao.createStatement();

	ResultSet rs = stmt.executeQuery(sql);

	while(rs.next()) {
		
		
	estrutura += "<tr>";
	estrutura += "<td>"+contador+"</td>";
	estrutura += "<td>"+rs.getString(2)+"</td>";
	estrutura += "<td>"+rs.getDouble(3)+"</td>";
	estrutura += "<td><a href='produtos.jsp?idProduto="+rs.getInt(1)+"'>Alterar</a></td>";
	estrutura += "<td><a href='requisicoes/excluirProduto.jsp?idProduto="+rs.getInt(1)+"'>Excluir</a></td>";
	estrutura += "</tr>";
	contador++;
	}

	stmt.close();
	conexao.close();

	}catch (Exception e) {}
	  
	  estrutura+= "</table>";

	//Retorno
	return estrutura;
	}
}


