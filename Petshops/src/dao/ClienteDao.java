package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import bean.Cliente;

public class ClienteDao {

	
	public void cadastrar(Cliente cliente) {
		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "INSERT INTO cliente( Nome, Email, Telefone, idPet, idEndereco, idUsuario, idPedido) VALUES (?,?,?,?,?,?,?)";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1,cliente.getNome());
			stmt.setString(2,cliente.getEmail());
			stmt.setString(3,cliente.getTelefone());
			
			stmt.setInt(5,cliente.getEndereco());	
			stmt.setInt(6,cliente.getIdUsuario());
			

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
	

	public void alterar(Cliente cliente) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "UPDATE cliente SET Nome=?,Email=?,Telefone=? WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			
			stmt.setString(1,cliente.getNome());
			stmt.setString(2,cliente.getEmail());
			stmt.setString(3,cliente.getTelefone());
			stmt.setInt(4,cliente.getId());
			

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<Cliente> lista() {

		Connection conexao = Conexao.obterConexao();

		ArrayList<Cliente> lista = new ArrayList<Cliente>();

		try {
			String sql = "SELECT FROM * cliente ";

			Statement stmt = conexao.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Cliente cliente = new Cliente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6));
				lista.add(cliente);
			}
			
			stmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}
	
	public void excluir(Cliente cliente) {
		
		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "DELETE FROM cliente WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, cliente.getId());
			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}