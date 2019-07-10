package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import bean.AlimentoPedido;

public class AlimentoPedidoDao {

	public void cadastrar(AlimentoPedido alimentoPedido) {
		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "INSERT INTO alimentopedido( idAlimento, idCliente) VALUES (?,?)";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setInt(1, alimentoPedido.getIdAlimento());
			stmt.setInt(2, alimentoPedido.getIdCliente());
			

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void alterar(AlimentoPedido alimentoPedido) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "UPDATE alimentopedido SET idAlimento=?,idCliente=? WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setInt(1, alimentoPedido.getIdAlimento());
			stmt.setInt(2, alimentoPedido.getIdCliente());
			stmt.setInt(3, alimentoPedido.getId());

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<AlimentoPedido> lista() {

		Connection conexao = Conexao.obterConexao();

		ArrayList<AlimentoPedido> lista = new ArrayList<AlimentoPedido>();

		try {
			String sql = "SELECT FROM * AlimentoPedido ";

			Statement stmt = conexao.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				AlimentoPedido AlimentoPedido = new AlimentoPedido(rs.getInt(1),rs.getInt(2),rs.getInt(3));
				lista.add(AlimentoPedido);
			}

			stmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}

	public void excluir(AlimentoPedido alimentoPedido) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "DELETE FROM alimentoPedido WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, alimentoPedido.getId());
			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
