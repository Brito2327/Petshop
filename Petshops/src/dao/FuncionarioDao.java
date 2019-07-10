package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import bean.Funcionario;

public class FuncionarioDao {

	
	public void cadastrar(Funcionario funcionario) {
		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "INSERT INTO Funcionario(Nome, idUsuario) VALUES (?,?)";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, funcionario.getNome());
			stmt.setInt(2, funcionario.getIdUsuario());
			

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void alterar(Funcionario funcionario) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "UPDATE funcionario SET Nome=?,idUsuario=? WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, funcionario.getNome());
			stmt.setInt(2, funcionario.getIdUsuario());
			stmt.setInt(2, funcionario.getId());
			
			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<Funcionario> lista() {

		Connection conexao = Conexao.obterConexao();

		ArrayList<Funcionario> lista = new ArrayList<Funcionario>();

		try {
			String sql = "SELECT FROM * funcionario ";

			Statement stmt = conexao.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Funcionario funcionario = new Funcionario(rs.getInt(1), rs.getString(2),rs.getInt(3));
				lista.add(funcionario);
			}

			stmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}

	public void excluir(Funcionario funcionario) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "DELETE FROM funcionario WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, funcionario.getId());
			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
