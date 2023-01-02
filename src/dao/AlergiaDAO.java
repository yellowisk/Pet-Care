package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.Time;

import bean.Alergias;

public class AlergiaDAO {
	private Connection connection;
	
	public AlergiaDAO() {
	connection = new FabricaConexoes().getConnection();
	}
	changing test
	public int inserir (Alergias a) {
		int inseriu = 0;
		String sql = "INSERT INTO alergias(CPF_DONO, cod_coleira, alergia) VALUES (?,?,?);";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, a.getCPF());
			stmt.setInt(2, a.getCodColeira());
			stmt.setString(3, a.getNome());
			inseriu = stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return inseriu;
	}
	
	public boolean verifyAle(String CPF, int CodColeira) {
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

			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return existe;
	}
	
	public boolean verifyAler(String CPF, int CodColeira, String Nome) {
		boolean existe = true;
		String sqlPet = "SELECT * FROM alergias WHERE CPF_DONO = ? and cod_coleira = ? and alergia = ?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sqlPet);
			stmt.setString(1, CPF);
			stmt.setInt(2, CodColeira);
			stmt.setString(3, Nome);
			
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
	
	public ArrayList<Alergias> getAlergias() {
		String sql = "SELECT * FROM alergias;";
		PreparedStatement stmt;
		Alergias a;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList<Alergias> alergias = new ArrayList<>();
			while (rs.next()) {
				a = new Alergias();
				a.setCPF(rs.getString("CPF_DONO"));
				a.setCodColeira(rs.getInt("cod_coleira"));
				a.setNome(rs.getString("alergia"));
				alergias.add(a);
			}
			stmt.close();
			rs.close();
			return alergias;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
