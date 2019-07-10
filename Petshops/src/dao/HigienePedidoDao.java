package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import bean.HigienePedido;

public class HigienePedidoDao {

	
	public void cadastrar(HigienePedido higienePedido) {
		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "INSERT INTO (idHigiene, idCliente) VALUES (?,?)";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setInt(1, higienePedido.getIdHigiene());
			stmt.setInt(2, higienePedido.getIdCliente());

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void alterar(HigienePedido higienePedido) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "UPDATE higienePedido SET idHigiene=? idCliente=? WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setInt(1, higienePedido.getIdHigiene());			
			stmt.setInt(2, higienePedido.getIdCliente());
			stmt.setInt(3, higienePedido.getId());

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<HigienePedido> lista() {

		Connection conexao = Conexao.obterConexao();

		ArrayList<HigienePedido> lista = new ArrayList<HigienePedido>();

		try {
			String sql = "SELECT FROM * higienePedido ";

			Statement stmt = conexao.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				HigienePedido higienePedido = new HigienePedido(rs.getInt(1), rs.getInt(2),rs.getInt(3));
				lista.add(higienePedido);
			}

			stmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}

	public void excluir(HigienePedido higienePedido) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "DELETE FROM higienePedido WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, higienePedido.getId());
			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
