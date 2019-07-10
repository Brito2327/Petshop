package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import bean.Pedido;

public class PedidoDao {

	public void cadastrar(Pedido pedido) {
		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "INSERT INTO pedido( idAlimentoPedido, idAcessorioPedido, idSaudePedido, idHigienePdido, idServico, idAgendamento) VALUES (?,?,?,?,?,?)";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setInt(1, pedido.getIdAlimentoPedido());
			stmt.setInt(2, pedido.getIdAcessorioPedido());
			stmt.setInt(3, pedido.getIdAgendamento());
			stmt.setInt(4, pedido.getIdhigienePedido());
			stmt.setInt(5, pedido.getIdSaudePedido());
			stmt.setInt(6, pedido.getIdServico());
			

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void alterar(Pedido pedido) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "UPDATE pedido SET id=?,idAlimentoPedido=?,idAcessorioPedido=?,idSaudePedido=?,idHigienePdido=?,idServico=?,idAgendamento=? WHERE id?=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setInt(1, pedido.getIdAlimentoPedido());
			stmt.setInt(2, pedido.getIdAcessorioPedido());
			stmt.setInt(3, pedido.getIdAgendamento());
			stmt.setInt(4, pedido.getIdhigienePedido());
			stmt.setInt(5, pedido.getIdSaudePedido());
			stmt.setInt(6, pedido.getIdServico());
			stmt.setInt(6, pedido.getId());
			

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<Pedido> lista() {

		Connection conexao = Conexao.obterConexao();

		ArrayList<Pedido> lista = new ArrayList<Pedido>();

		try {
			String sql = "SELECT FROM * Pedido ";

			Statement stmt = conexao.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Pedido Pedido = new Pedido(rs.getInt(1), rs.getInt(2), rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7));
				lista.add(Pedido);
			}

			stmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}

	public void excluir(Pedido pedido) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "DELETE FROM pedido WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, pedido.getId());
			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
