package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import bean.Categoria;


public class CategoriaDao {

	
	public void cadastrar(Categoria categoria) {
		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "INSERT INTO categoria(Cliente, Funcionario) VALUES (?,?)";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setBoolean(1,categoria.isCliente());
			stmt.setBoolean(2, categoria.isFuncionario());

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
	

	public void alterar(Categoria categoria) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "UPDATE categoria SET Cliente=?,Funcionario=? WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			
			stmt.setBoolean(1,categoria.isCliente());
			stmt.setBoolean(2,categoria.isFuncionario());
			stmt.setInt(3, categoria.getId());

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<Categoria> lista() {

		Connection conexao = Conexao.obterConexao();

		ArrayList<Categoria> lista = new ArrayList<Categoria>();

		try {
			String sql = "SELECT FROM * categoria ";

			Statement stmt = conexao.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Categoria categoria = new Categoria(rs.getInt(1), rs.getBoolean(2),rs.getBoolean(3));
				lista.add(categoria);
			}
			
			stmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}
	
	public void excluir(Categoria categoria) {
		
		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "DELETE FROM usuario WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, categoria.getId());
			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
}
