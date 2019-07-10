package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import bean.Acessorio;


public class AcessorioDao {

	
	public void cadastrar(Acessorio acessorio) {
		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "INSERT INTO acessorio(acessorio,VALOR) VALUES(?,?)";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1,acessorio.getAcessorio());
			stmt.setDouble(2,acessorio.getPreco());
			

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
	

	public void alterar(Acessorio acessorio) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "UPDATE acessorio SET acessorio=?,VALOR=? WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			
			stmt.setString(1,acessorio.getAcessorio());
			stmt.setDouble(2,acessorio.getPreco());
			stmt.setInt(3,acessorio.getId());
			

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<Acessorio> lista() {

		Connection conexao = Conexao.obterConexao();

		ArrayList<Acessorio> lista = new ArrayList<Acessorio>();

		try {
			String sql = "SELECT FROM * acessorio ";

			Statement stmt = conexao.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Acessorio acessorio = new Acessorio(rs.getInt(1),rs.getString(2),rs.getDouble(3));
				lista.add(acessorio);
			}
			
			stmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}
	
	public void excluir(Acessorio acessorio) {
		
		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "DELETE FROM acessorio WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, acessorio.getId());
			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public Acessorio BuscarPorId(int id) {
		Connection conexao = Conexao.obterConexao();
		Acessorio acessorio = new Acessorio();
		try {
			String sql = "SELECT *FROM  acessorio WHERE id=? ";

			PreparedStatement pstmt = conexao.prepareStatement(sql);
			pstmt.setInt(1,id);

			ResultSet rs = pstmt.executeQuery(sql);
			
			acessorio.setId(rs.getInt(1));
			acessorio.setAcessorio(rs.getString(2));
			acessorio.setPreco(rs.getDouble(3));
			
			pstmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return acessorio;
	}
}
