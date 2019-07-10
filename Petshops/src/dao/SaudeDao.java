package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import bean.Saude;


public class SaudeDao {

	public void cadastrar(Saude saude) {
		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "INSERT INTO Saude( categoria,valor) VALUES (?,?)";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, saude.getTipo());
			stmt.setDouble(2,saude.getPreco());
			

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void alterar(Saude saude) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "UPDATE Saude SET categoria=?,valor=? WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, saude.getTipo());
			stmt.setDouble(2,saude.getPreco());
			stmt.setInt(3, saude.getId());

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<Saude> lista() {

		Connection conexao = Conexao.obterConexao();

		ArrayList<Saude> lista = new ArrayList<Saude>();

		try {
			String sql = "SELECT FROM * saude ";

			Statement stmt = conexao.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Saude saude = new Saude(rs.getInt(1), rs.getString(2),rs.getDouble(3));
				lista.add(saude);
			}

			stmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}

	public void excluir(Saude saude) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "DELETE FROM saude WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, saude.getId());
			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public Saude BuscarPorId(int id) {
		Connection conexao = Conexao.obterConexao();
		Saude saude = new Saude();
		try {
			String sql = "SELECT *FROM  saude WHERE id=? ";

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
