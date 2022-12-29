package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Cliente;
import bean.Consulta;
import bean.Veterinario;

public class VeterinarioDAO {
private Connection connection;
	
	public VeterinarioDAO() {
	connection = new FabricaConexoes().getConnection();
	}

	public int inserir(Veterinario v) {
	int inseriu = 0;
	String sql = "INSERT INTO veterinario(CRMV_VET, nome, idade, email, logradouro, bairro, CEP, numero, especializacao, diploma, experiencia) VALUES (?,?,?,?,?,?,?,?,?,?,?);";
	PreparedStatement stmt;
	try {
		stmt = (PreparedStatement) connection.prepareStatement(sql);
		stmt.setString(1, v.getCRMV());
		stmt.setString(2, v.getNome_vet());
		stmt.setInt(3, v.getIdade_vet());
		stmt.setString(4, v.getEmail());
		stmt.setString(5, v.getLogradouro());
		stmt.setString(6, v.getBairro());
		stmt.setString(7, v.getCEP());
		stmt.setInt(8, v.getNumero());
		stmt.setString(9, v.getEspecializacao());
		stmt.setString(10, v.getDiploma());
		stmt.setString(11, v.getExperiencia());
		inseriu = stmt.executeUpdate();
		stmt.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return inseriu;
}

	public int detalhar(Veterinario v) {
		int detalhou = 0;
		String sql = "UPDATE veterinario SET especializacao = ?, diploma = ?, experiencia = ? WHERE CRMV_VET = ?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, v.getEspecializacao());
			stmt.setString(2, v.getDiploma());
			stmt.setString(3, v.getExperiencia());
			stmt.setString(4, v.getCRMV());
			detalhou = stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return detalhou;
	}
	
	public int remover(Veterinario v) {
		int removeu = 0;
		String sql = "DELETE FROM veterinario WHERE CRMV_VET = ?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, v.getCRMV());
			removeu = stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return removeu;
	}
	
	public ArrayList<Veterinario> getDetailConsulta() {
		String sql = "select v.especializacao, v.nome, c.cod_coleira, c.hora, c.data from (veterinario v inner join consulta c on c.crmv_vet=v.crmv_vet) where exists (select * from pet p where p.cod_coleira=c.cod_coleira) order by c.hora desc;";
		PreparedStatement stmt;
		Veterinario v;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList<Veterinario> veterinarios = new ArrayList<>();
			while (rs.next()) {
				v = new Veterinario();
				v.setEspecializacao(rs.getString("especializacao"));
				v.setNome_vet(rs.getString("nome"));
				veterinarios.add(v);
			}
			stmt.close();
			rs.close();
			return veterinarios;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<Veterinario> getFreely(String especializacaorqrd) {
		String sql = "select v.nome, v.especializacao, v.experiencia, v.crmv_vet from veterinario v where not exists (select * from consulta c where c.crmv_vet=v.crmv_vet) and especializacao = ? order by v.crmv_vet;";
		PreparedStatement stmt;
		Veterinario v;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, especializacaorqrd);

			ResultSet rs = stmt.executeQuery();
			ArrayList<Veterinario> veterinarios = new ArrayList<>();
			while (rs.next()) {
				v = new Veterinario();
				v.setNome_vet(rs.getString("nome"));
				v.setEspecializacao(rs.getString("especializacao"));
				v.setExperiencia(rs.getString("experiencia"));
				v.setCRMV(rs.getString("crmv_vet"));
				veterinarios.add(v);
			}
			stmt.close();
			rs.close();
			return veterinarios;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean existeCMRV(String CRMV) {
		boolean existe = false;
		String sqlPet = "SELECT * FROM veterinario WHERE CRMV_VET = ?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sqlPet);
			stmt.setString(1, CRMV);
			
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				existe = true;
			}
			//System.out.println("ESSE CRMV J� PERTENCE A UM CLIENTE");

			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return existe;
	}

	public ArrayList<String> getCRMVs() {
		String sql = "SELECT CRMV_VET FROM veterinario;";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList <String> crmvs = new ArrayList<>();
			while (rs.next()) {
				crmvs.add(rs.getString("CRMV_VET"));
			}
			rs.close();
			stmt.close();
			return crmvs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<Veterinario> getVets() {
		String sql = "SELECT * FROM veterinario;";
		Veterinario v;
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList<Veterinario> vets = new ArrayList<>();
			while (rs.next()) {
				v = new Veterinario();
				v.setCRMV(rs.getString("CRMV_VET"));
				v.setNome_vet(rs.getString("nome"));
				v.setIdade_vet(rs.getInt("idade"));
				v.setEmail(rs.getString("email"));;
				v.setLogradouro(rs.getString("logradouro"));
				v.setBairro(rs.getString("bairro"));
				v.setCEP(rs.getString("CEP"));
				v.setNumero(rs.getInt("numero"));
				v.setDiploma(rs.getString("diploma"));
				v.setEspecializacao(rs.getString("especializacao"));
				v.setExperiencia(rs.getString("experiencia"));
				vets.add(v);
			}
			rs.close();
			stmt.close();
			return vets;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<String> getESPs() {
		String sql = "SELECT distinct especializacao FROM veterinario;";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList <String> esps = new ArrayList<>();
			while (rs.next()) {
				esps.add(rs.getString("especializacao"));
			}
			rs.close();
			stmt.close();
			return esps;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}