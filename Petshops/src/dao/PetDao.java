package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import bean.Pet;



public class PetDao {

	
	public void cadastrar(Pet pet) {
		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "INSERT INTO pet( Nome, Raca, Peso, Idade, Sexo, foto, Observacao) VALUES (?,?,?,?,?,?,?)";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, pet.getNome());
			stmt.setString(2, pet.getRaca());
			stmt.setString(3, pet.getPeso());
			stmt.setString(4, pet.getIdade());
			stmt.setString(5, pet.getSexo());
			stmt.setString(6, pet.getFoto());
			stmt.setString(7, pet.getObservacao());

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void alterar(Pet pet) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "UPDATE pet SET Nome=?,Raca=?,eso=?,Idade=?,Sexo=?,foto=?,Observacao=? WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, pet.getNome());
			stmt.setString(2, pet.getRaca());
			stmt.setString(3, pet.getPeso());
			stmt.setString(4, pet.getIdade());
			stmt.setString(5, pet.getSexo());
			stmt.setString(6, pet.getFoto());
			stmt.setString(7, pet.getObservacao());
			stmt.setInt(8, pet.getId());

			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<Pet> lista() {

		Connection conexao = Conexao.obterConexao();

		ArrayList<Pet> lista = new ArrayList<Pet>();

		try {
			String sql = "SELECT FROM * pet ";

			Statement stmt = conexao.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Pet pet = new Pet(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7),rs.getString(8));
				lista.add(pet);
			}

			stmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}

	public void excluir(Pet pet) {

		Connection conexao = Conexao.obterConexao();

		try {
			String sql = "DELETE FROM pet WHERE id=?";

			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, pet.getId());
			stmt.execute();

			stmt.close();
			conexao.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
