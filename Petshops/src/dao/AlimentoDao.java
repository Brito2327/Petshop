package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import bean.Alimento;



public class AlimentoDao {

	public void cadastrar(Alimento alimento) {
		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "INSERT INTO alimento( tipo,valor) VALUES (?,?)";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1,alimento.getTipo());
			stmt.setDouble(2,alimento.getPreco());
			

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
	

	public void alterar(Alimento alimento) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "UPDATE alimento SET tipo=?,valor=? WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			
			stmt.setString(1,alimento.getTipo());
			stmt.setDouble(2,alimento.getPreco());
			stmt.setInt(3,alimento.getId());
			

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<Alimento> lista() {

		Connection conexao = Conexao.obterConexao();

		ArrayList<Alimento> lista = new ArrayList<Alimento>();

		try {
			String sql = "SELECT FROM * alimento ";

			Statement stmt = conexao.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Alimento aliemtno = new Alimento(rs.getInt(1),rs.getString(2),rs.getDouble(3));
				lista.add(aliemtno);
			}
			
			stmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}
	
	public void excluir(Alimento alimento) {
		
		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "DELETE FROM alimento WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, alimento.getId());
			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public Alimento BuscarPorId(int id) {
		Connection conexao = Conexao.obterConexao();
		Alimento saude = new Alimento();
		try {
			String sql = "SELECT *FROM  alimento WHERE id=? ";

			PreparedStatement pstmt = conexao.prepareStatement(sql);
			pstmt.setInt(1,id);

			ResultSet rs = pstmt.executeQuery(sql);
			
			saude.setId(rs.getInt(1));
			saude.setTipo(rs.getString(2));
			saude.setPreco(rs.getDouble(3));
			
			pstmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return saude;
	}
}