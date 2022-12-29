package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.Time;

import bean.Consulta;
import bean.Vacinas;


public class VacinaDAO {
	private Connection connection;
	
	public VacinaDAO() {
	connection = new FabricaConexoes().getConnection();
	}
	
	public int inserir (Vacinas vc) {
		int vacinou = 0;
		String sql = "INSERT INTO vacinas(CPF_DONO, cod_coleira, nome_vacina, data) VALUES (?,?,?,?);";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, vc.getCPF());
			stmt.setInt(2, vc.getCodColeira());
			stmt.setString(3, vc.getNomevac());
			stmt.setDate(4, vc.getData());
			vacinou = stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vacinou;
	}
	
	public boolean verifyVac(String CPF, int CodColeira) {
		boolean existe = true;
		String sqlPet = "SELECT * FROM pet WHERE CPF_DONO = ? and cod_coleira = ?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sqlPet);
			stmt.setString(1, CPF);
			stmt.setInt(2, CodColeira);
			
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				existe = false;
			}
			//System.out.println("ESSE CRMV J� PERTENCE A UM CLIENTE");

			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return existe;
	}
	
	public boolean verifyVaci(String CPF, int CodColeira, String nomevac, Date data) {
		boolean existe = true;
		String sqlPet = "SELECT * FROM vacinas WHERE CPF_DONO = ? and cod_coleira = ? and nome_vacina = ? and data = ?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sqlPet);
			stmt.setString(1, CPF);
			stmt.setInt(2, CodColeira);
			stmt.setString(3, nomevac);
			stmt.setDate(4, data);
			
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				existe = false;
			}

			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return existe;
	}
	
	public ArrayList<Vacinas> getVerVaccine() {
		String sql = "select c.nome, p.cod_coleira, p.nome as nome_pet, v.nome_vacina, v.data from vacinas v, pet p, cliente c where p.cod_coleira=v.cod_coleira and p.cpf_dono=c.cpf order by v.data desc;";
		PreparedStatement stmt;
		Vacinas vc;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList<Vacinas> vacinas = new ArrayList<>();
			while (rs.next()) {
				vc = new Vacinas();
				vc.setNomevac(rs.getString("nome_vacina"));
				vc.setData(rs.getDate("data"));
				vacinas.add(vc);
			}
			stmt.close();
			rs.close();
			return vacinas;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<Vacinas> getVacinas() {
		String sql = "SELECT * FROM vacinas;";
		PreparedStatement stmt;
		Vacinas vc;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList<Vacinas> vacinas = new ArrayList<>();
			while (rs.next()) {
				vc = new Vacinas();
				vc.setCPF(rs.getString("CPF_DONO"));
				vc.setCodColeira(rs.getInt("cod_coleira"));
				vc.setNomevac(rs.getString("nome_vacina"));
				vc.setData(rs.getDate("data"));
				vacinas.add(vc);
			}
			stmt.close();
			rs.close();
			return vacinas;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}