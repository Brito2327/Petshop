package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import bean.Servico;

public class ServicoDao {

	public void cadastrar(Servico servico) {
		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "INSERT INTO servico( servico,valor) VALUES (?,?)";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, servico.getServico());
			stmt.setDouble(2, servico.getPreco());
			

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void alterar(Servico servico) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "UPDATE servico SET servico=?,valor=? WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, servico.getServico());
			stmt.setDouble(2, servico.getPreco());
			stmt.setInt(3, servico.getId());

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<Servico> lista() {

		Connection conexao = Conexao.obterConexao();

		ArrayList<Servico> lista = new ArrayList<Servico>();

		try {
			String sql = "SELECT FROM * servico ";

			Statement stmt = conexao.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Servico servico = new Servico(rs.getInt(1),rs.getString(2),rs.getDouble(3));
				lista.add(servico);
			}

			stmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}

	public void excluir(Servico servico) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "DELETE FROM servico WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, servico.getId());
			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public Servico BuscarPorId(int id) {
		Connection conexao = Conexao.obterConexao();
		Servico servico = new Servico();
		try {
			String sql = "SELECT *FROM  servico WHERE id=? ";

			PreparedStatement pstmt = conexao.prepareStatement(sql);
			pstmt.setInt(1,id);

			ResultSet rs = pstmt.executeQuery(sql);
			
			servico.setId(rs.getInt(1));
			servico.setServico(rs.getString(2));
			servico.setPreco(rs.getDouble(3));
			
			pstmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return servico;
	}
}
