package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import bean.SaudePedido;

public class SaudePedidoDao {
	public void cadastrar(SaudePedido saudePedido) {
		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "INSERT INTO saudepedido(idSaude, idCliente) VALUES (?,?)";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setInt(1, saudePedido.getIdSaude());
			stmt.setInt(2, saudePedido.getIdcliente());

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void alterar(SaudePedido saudePedido) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "UPDATE saudePedido SET idSaude=?,idCliente=? WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setInt(1, saudePedido.getIdSaude());
			stmt.setInt(2, saudePedido.getIdcliente());
			stmt.setInt(3, saudePedido.getId());

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<SaudePedido> lista() {

		Connection conexao = Conexao.obterConexao();

		ArrayList<SaudePedido> lista = new ArrayList<SaudePedido>();

		try {
			String sql = "SELECT FROM * saudePedido ";

			Statement stmt = conexao.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				SaudePedido saudePedido = new SaudePedido(rs.getInt(1), rs.getInt(2), rs.getInt(3));
				lista.add(saudePedido);
			}

			stmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}

	public void excluir(SaudePedido saudePedido) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "DELETE FROM saudePedido WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, saudePedido.getId());
			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
