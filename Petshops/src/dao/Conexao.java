package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	// Método de conexão
//		public static Connection obterConexao() {
//			
//			//Objeto Connection
//			Connection con = null;
//			
//			//Tentativa
//			try {
//				Class.forName("com.mysql.jdbc.Driver");
//				con = DriverManager.getConnection("jdbc:mysql://localhost/petshop", "root", "");
//				
//			}catch(Exception erro) {
//				System.out.println("Falha ao conectar "+erro.getMessage());
//			}
//			
//			//Retorno
//			return con;
//		}

	public static Connection obterConexao() {

		// Dados de acesso ao banco
		String user = "root";
		String password = "";
		String url = "jdbc:mysql://localhost/petshop";

		// variavel de conexão
		Connection conexao = null;

		// tentativa de conxao
		try {
			conexao = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			System.out.println("falha de conexão : " + e.getMessage());
		}

		// retorno
		return conexao;
	}

}
