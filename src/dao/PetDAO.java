package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Pet;
import bean.Vacinas;

public class PetDAO {
	private Connection connection;
	
	public PetDAO() {
	connection = new FabricaConexoes().getConnection();
	}
	
	public int inserir(Pet p) {
	int inseriu = 0;
	String sql = "INSERT INTO pet(CPF_DONO, cod_coleira, nome, idade, peso) VALUES (?,?,?,?,?);"; 
	PreparedStatement stmt;
	try {
		stmt = (PreparedStatement) connection.prepareStatement(sql);
		stmt.setString(1, p.getCPF());
		stmt.setInt(2, p.getCodColeira());
		stmt.setString(3, p.getNome());
		stmt.setInt(4, p.getIdade());
		stmt.setDouble(5, p.getPeso());
		inseriu = stmt.executeUpdate();
		stmt.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return inseriu;
}

	public int remover(Pet p) {
		int removeu = 0;
		String sql = "DELETE FROM pet WHERE cod_coleira = ?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setInt(1, p.getCodColeira());
			removeu = stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return removeu;
	}
	
	public ArrayList<Pet> getVerVaccine(int codigo) {
		String sql = "select c.nome, p.cod_coleira, p.nome as nome_pet, v.nome_vacina, v.data from vacinas v, pet p, cliente c where p.cod_coleira=v.cod_coleira and p.cpf_dono=c.cpf and p.cod_coleira = ? order by v.data desc;";
		PreparedStatement stmt;
		Pet p;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setInt(1, codigo);
			ResultSet rs = stmt.executeQuery();
			ArrayList<Pet> pets = new ArrayList<>();
			while (rs.next()) {
				p = new Pet();
				p.setCodColeira(rs.getInt("cod_coleira"));
				p.setNome(rs.getString("nome_pet"));
				pets.add(p);
			}
			stmt.close();
			rs.close();
			return pets;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<Pet> getCounter() {
		String sql = "select count(distinct p.cod_coleira) as qntd_pets_vacs from (pet p inner join vacinas v on p.cod_coleira=v.cod_coleira) order by p.cod_coleira;";
		PreparedStatement stmt;
		Pet p;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList<Pet> pets = new ArrayList<>();
			while (rs.next()) {
				p = new Pet();
				p.setCodColeira(rs.getInt("qntd_pets_vacs"));
				pets.add(p);
			}
			stmt.close();
			rs.close();
			return pets;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<Pet> getPets() {
		String sql = "SELECT * FROM pet";
		PreparedStatement stmt;
		Pet p;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList<Pet> pets = new ArrayList<>();
			while (rs.next()) {
				p = new Pet();
				p.setCPF(rs.getString("CPF_DONO"));
				p.setCodColeira(rs.getInt("cod_coleira"));
				p.setNome(rs.getString("nome"));
				p.setIdade(rs.getInt("idade"));
				p.setPeso(rs.getDouble("peso"));
				pets.add(p);
			}
			stmt.close();
			rs.close();
			return pets;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int alter(Pet p) {
		int alterou = 0;
		String sql = "UPDATE pet SET idade = ?, peso = ? WHERE cod_coleira = ?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setInt(1, p.getIdade());
			stmt.setDouble(2, p.getPeso());
			stmt.setInt(3, p.getCodColeira());
			alterou = stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return alterou;
	}
	
	public boolean verifyCol(int CodColeira) {
		boolean existe = false;
		String sqlPet = "SELECT * FROM pet WHERE cod_coleira = ?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sqlPet);
			stmt.setInt(1, CodColeira);
			
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				existe = true;
			}
			//System.out.println("ESSE CPF J� PERTENCE A UM CLIENTE");

			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return existe;
		
	}

	public ArrayList<String> getColeiras() {
		String sql = "SELECT cod_coleira FROM pet;";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList <String> coleiras = new ArrayList<>();
			while (rs.next()) {
				coleiras.add(rs.getString("cod_coleira"));
			}
			rs.close();
			stmt.close();
			return coleiras;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}