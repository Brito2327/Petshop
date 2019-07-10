package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import bean.AcessorioPedido;

public class AcessorioPedidoDao {

	public void cadastrar(AcessorioPedido acessorioPedido) {
		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "INSERT INTO acessorioPedido( idAcessorio, idCliente) VALUES (?,?)";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setInt(1, acessorioPedido.getIdAcessorio());
			stmt.setInt(2, acessorioPedido.getIdCliente());

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void alterar(AcessorioPedido acessorioPedido) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "UPDATE acessorioPedido SET idAcessorio=?,idCliente=? WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setInt(1, acessorioPedido.getIdAcessorio());
			stmt.setInt(2, acessorioPedido.getIdCliente());
			stmt.setInt(3, acessorioPedido.getId());

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<AcessorioPedido> lista() {

		Connection conexao = Conexao.obterConexao();

		ArrayList<AcessorioPedido> lista = new ArrayList<AcessorioPedido>();

		try {
			String sql = "SELECT FROM * acessorioPedido ";

			Statement stmt = conexao.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				AcessorioPedido acessorioPedido = new AcessorioPedido(rs.getInt(1), rs.getInt(2), rs.getInt(3));
				lista.add(acessorioPedido);
			}

			stmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}

	public void excluir(AcessorioPedido acessorioPedido) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "DELETE FROM acessorioPedido WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, acessorioPedido.getId());
			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
