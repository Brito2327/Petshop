package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import bean.Higiene;


public class HigieneDao {

		
	
	public void cadastrar(Higiene higiene) {
		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "INSERT INTO higiene( tipo,valor) VALUES (?,?)";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, higiene.getTipo());
			stmt.setDouble(2, higiene.getPreco());
			

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void alterar(Higiene higiene) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "UPDATE higiene SET tipo=?,valor=? WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, higiene.getTipo());
			stmt.setDouble(2, higiene.getPreco());
			stmt.setInt(3, higiene.getId());

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<Higiene> lista() {

		Connection conexao = Conexao.obterConexao();

		ArrayList<Higiene> lista = new ArrayList<Higiene>();

		try {
			String sql = "SELECT FROM * higiene ";

			Statement stmt = conexao.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Higiene higiene = new Higiene(rs.getInt(1), rs.getString(2),rs.getDouble(3));
				lista.add(higiene);
			}

			stmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}

	public void excluir(Higiene higiene) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "DELETE FROM higiene WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, higiene.getId());
			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public Higiene BuscarPorId(int id) {
		Connection conexao = Conexao.obterConexao();
		Higiene higiene = new Higiene();
		try {
			String sql = "SELECT *FROM  higiene WHERE id=? ";

			PreparedStatement pstmt = conexao.prepareStatement(sql);
			pstmt.setInt(1,id);

			ResultSet rs = pstmt.executeQuery(sql);
			
			higiene.setId(rs.getInt(1));
			higiene.setTipo(rs.getString(2));
			higiene.setPreco(rs.getDouble(3));
			
			pstmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return higiene;
	}
}
