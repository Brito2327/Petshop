package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import bean.Endereco;



public class EnderecoDao {
		
	
	public void cadastrar(Endereco endereco) {
		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "INSERT INTO endereco(Rua, Bairro, Numero, Cidade, Cep, Estado) VALUES (?,?,?,?,?,?)";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1,endereco.getRua());
			stmt.setString(2,endereco.getBairro());
			stmt.setString(3,endereco.getNumero());
			stmt.setString(4,endereco.getCidade());
			stmt.setString(5,endereco.getCep());	
			stmt.setString(6,endereco.getEstado());
			

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
	

	public void alterar(Endereco endereco) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "UPDATE endereco SET ,Rua=?,Bairro=?,Numero=?,Cidade=?,Cep=?,Estado=? WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			
			stmt.setString(1,endereco.getRua());
			stmt.setString(2,endereco.getBairro());
			stmt.setString(3,endereco.getNumero());
			stmt.setString(4,endereco.getCidade());
			stmt.setString(5,endereco.getCep());
			stmt.setString(6,endereco.getEstado());
			stmt.setInt(7,endereco.getId());
			

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<Endereco> lista() {

		Connection conexao = Conexao.obterConexao();

		ArrayList<Endereco> lista = new ArrayList<Endereco>();

		try {
			String sql = "SELECT FROM * endereco ";

			Statement stmt = conexao.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Endereco endereco = new Endereco(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
				lista.add(endereco);
			}
			
			stmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}
	
	public void excluir(Endereco endereco) {
		
		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "DELETE FROM endereco WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, endereco.getId());
			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
		
}
