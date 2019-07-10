package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import bean.Agendamento;

public class AgendamentoDao {

	public void cadastrar(Agendamento agendamento) {
		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "INSERT INTO agendamento(Data, Hora, Buscar) VALUES (?,?,?)";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1,agendamento.getData() );
			stmt.setString(2, agendamento.getHora());
			stmt.setBoolean(3, agendamento.isBuscar());
			

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void alterar(Agendamento agendamento) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "UPDATE agendamento SET Data=?,Hora=?,Buscar=? WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1,agendamento.getData() );
			stmt.setString(2, agendamento.getHora());
			stmt.setBoolean(3, agendamento.isBuscar());
			stmt.setInt(3, agendamento.getId());

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<Agendamento> lista() {

		Connection conexao = Conexao.obterConexao();

		ArrayList<Agendamento> lista = new ArrayList<Agendamento>();

		try {
			String sql = "SELECT FROM * agendamento ";

			Statement stmt = conexao.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Agendamento agendamento = new Agendamento(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getBoolean(4));
				lista.add(agendamento);
			}

			stmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}

	public void excluir(Agendamento agendamento) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "DELETE FROM agendamento WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, agendamento.getId());
			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
