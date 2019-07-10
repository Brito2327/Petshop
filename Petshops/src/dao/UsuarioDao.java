package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import bean.Usuario;

public class UsuarioDao {

	public void Cadastrar(Usuario usuario) {

	
		
		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "INSERT INTO usuario ( Email, idCategoria, Senha) VALUES(?,?,?)";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, usuario.getEmail());
			stmt.setInt(2, usuario.getIdCategoria());
			stmt.setString(3, usuario.getSenha());

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void alterar(Usuario usuario) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "UPDATE usuario SET Email=?,idCategoria=?,Senha=? WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, usuario.getEmail());
			stmt.setInt(2, usuario.getIdCategoria());
			stmt.setString(3, usuario.getSenha());
			stmt.setInt(4, usuario.getId());

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<Usuario> lista() {

		Connection conexao = Conexao.obterConexao();

		ArrayList<Usuario> lista = new ArrayList<Usuario>();

		try {
			String sql = "SELECT FROM * usuario ";

			Statement stmt = conexao.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Usuario usuario = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(4), rs.getInt(3));
				lista.add(usuario);
			}
			
			stmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}
	
	public void excluir(Usuario usuario) {
		
		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "DELETE FROM usuario WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getId());
			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public int verificarLogin(String email, String senha) {

		// Conexão
		Connection conexao = Conexao.obterConexao();

		// contador
		int contador = 0;

		// Tentativa
		try {

			// SQL
			String sql = "SELECT * FROM usuario WHERE Email = ? AND Senha = ?";

			// PreparedStatement
			PreparedStatement pstmt = conexao.prepareStatement(sql);

			// Parâmetros
			pstmt.setString(1, email);
			pstmt.setString(2, senha);

			// Obter dados
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				contador = rs.getInt(1);

			}

		} catch (Exception erro) {
			System.out.println("Falha ao logar " + erro.getMessage());
		}

		// Retorno
		return contador;

	}
}
