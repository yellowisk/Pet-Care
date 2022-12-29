package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

import bean.Cliente;
import bean.Consulta;
import bean.Veterinario;

public class ConsultaDAO {
		private Connection connection;
		
		public ConsultaDAO() {
		connection = new FabricaConexoes().getConnection();
		}
	
		public int marcar (Consulta cn) {
			int agendou = 0;
			String sql = "INSERT INTO consulta(CRMV_VET, CPF_DONO, cod_coleira, data, hora) VALUES (?,?,?,?,?);";
			PreparedStatement stmt;
			try {
				stmt = (PreparedStatement) connection.prepareStatement(sql);
				stmt.setString(1, cn.getCRMV());
				stmt.setString(2, cn.getCPF());
				stmt.setInt(3, cn.getCodColeira());
				stmt.setDate(4, cn.getData());
				stmt.setTime(5, cn.getHora());
				agendou = stmt.executeUpdate();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return agendou;
		}
		
		public int alterar(Consulta cn) {
			int alterou = 0;
			String sql = "UPDATE consulta SET data = ?, hora = ? where CRMV_VET = ? and cod_coleira = ? and CPF_DONO = ?";
			PreparedStatement stmt;
			try {
				stmt = (PreparedStatement) connection.prepareStatement(sql);
				stmt.setDate(1, cn.getData());
				stmt.setTime(2, cn.getHora());
				stmt.setString(3, cn.getCRMV());
				stmt.setInt(4, cn.getCodColeira());
				stmt.setString(5, cn.getCPF());
				alterou = stmt.executeUpdate();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return alterou;
		}
		
		public int remover(Consulta cn) {
			int removeu = 0;
			String sql = "DELETE FROM consulta WHERE CRMV_VET = ? AND cod_coleira = ? AND CPF_DONO = ? and data = ? and hora = ?";
			PreparedStatement stmt;
			try {
				stmt = (PreparedStatement) connection.prepareStatement(sql);
				stmt.setString(1, cn.getCRMV());
				stmt.setInt(2, cn.getCodColeira());
				stmt.setString(3, cn.getCPF());
				stmt.setDate(4, cn.getData());
				stmt.setTime(5, cn.getHora());
				removeu = stmt.executeUpdate();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return removeu;
		}
		
		public ArrayList<Consulta> getConsultas() {
			String sql = "SELECT * FROM consulta;";
			PreparedStatement stmt;
			Consulta cn;
			try {
				stmt = (PreparedStatement) connection.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery();
				ArrayList<Consulta> consultas = new ArrayList<>();
				while (rs.next()) {
					cn = new Consulta();
					cn.setCRMV(rs.getString("CRMV_VET"));
					cn.setCPF(rs.getString("CPF_DONO"));
					cn.setCodColeira(rs.getInt("cod_coleira"));
					cn.setData(rs.getDate("data"));
					cn.setHora(rs.getTime("hora"));
					consultas.add(cn);
				}
				stmt.close();
				rs.close();
				return consultas;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
		
		public ArrayList<String> getDatas() {
			String sql = "SELECT distinct data FROM consulta;";
			PreparedStatement stmt;
			try {
				stmt = (PreparedStatement) connection.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery();
				ArrayList<String> consultas = new ArrayList<>();
				while (rs.next()) {
					consultas.add(rs.getString("data"));
				}
				stmt.close();
				rs.close();
				return consultas;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
		
		public ArrayList<String> getHoras() {
			String sql = "SELECT distinct hora FROM consulta;";
			PreparedStatement stmt;
			try {
				stmt = (PreparedStatement) connection.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery();
				ArrayList<String> consultas = new ArrayList<>();
				while (rs.next()) {
					consultas.add(rs.getString("hora"));
				}
				stmt.close();
				rs.close();
				return consultas;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
		
		public ArrayList<Consulta> getFirstConsulta(Date data3) {
			String sql = "select c.nome, c.cpf, min(con.hora), con.data from (cliente c inner join consulta con on c.CPF=con.CPF_DONO) where con.data = ?;";
			PreparedStatement stmt;
			Consulta cn;
			try {
				stmt = (PreparedStatement) connection.prepareStatement(sql);
				stmt.setDate(1, data3);
				
				ResultSet rs = stmt.executeQuery();
				ArrayList<Consulta> consultas = new ArrayList<>();
				while (rs.next()) {
					cn = new Consulta();
					cn.setData(rs.getDate("data"));
					cn.setHora(rs.getTime("min(con.hora)"));
					consultas.add(cn);
				}
				stmt.close();
				rs.close();
				return consultas;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
		
		public ArrayList<Consulta> getLastConsulta(Date data3) {
			String sql = "select c.nome, c.cpf, max(con.hora), con.data from (cliente c inner join consulta con on c.CPF=con.CPF_DONO) where con.data = ?;";
			PreparedStatement stmt;
			Consulta cn;
			try {
				stmt = (PreparedStatement) connection.prepareStatement(sql);
				stmt.setDate(1, data3);
				
				ResultSet rs = stmt.executeQuery();
				ArrayList<Consulta> consultas = new ArrayList<>();
				while (rs.next()) {
					cn = new Consulta();
					cn.setData(rs.getDate("data"));
					cn.setHora(rs.getTime("max(con.hora)"));
					
					consultas.add(cn);
				}
				stmt.close();
				rs.close();
				return consultas;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
		
		public ArrayList<Consulta> getDetailConsulta(Date data1, Date data2) {
			String sql = "select v.especializacao, v.nome, c.cod_coleira, c.hora, c.data from (veterinario v inner join consulta c on c.crmv_vet=v.crmv_vet) where exists (select * from pet p where p.cod_coleira=c.cod_coleira) and c.data between ? and ? order by c.data desc;";
			PreparedStatement stmt;
			Consulta cn;
			try {
				stmt = (PreparedStatement) connection.prepareStatement(sql);
				
				stmt.setDate(1, data1);
				
				stmt.setDate(2, data2);
				ResultSet rs = stmt.executeQuery();
				ArrayList<Consulta> consultas = new ArrayList<>();
				while (rs.next()) {
					cn = new Consulta();
					cn.setCodColeira(rs.getInt("cod_coleira"));
					cn.setData(rs.getDate("data"));
					cn.setHora(rs.getTime("hora"));
					System.out.println(cn.getData());
					
					consultas.add(cn);
				}
				stmt.close();
				rs.close();
				return consultas;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
		
		public boolean verifyWhole(Date data, Time hora, String CRMV, int CodColeira, String CPF) {
			boolean existe = false;
			String sqlCon = "SELECT * FROM consulta WHERE data = ? and hora = ? and CRMV_VET = ? and cod_coleira = ? and CPF_DONO = ?;";
			PreparedStatement stmt;
			try {
				stmt = (PreparedStatement) connection.prepareStatement(sqlCon);
				stmt.setDate(1, data);
				stmt.setTime(2, hora);
				stmt.setString(3, CRMV);
				stmt.setInt(4, CodColeira);
				stmt.setString(5, CPF);
				
				ResultSet rs = stmt.executeQuery();
				while(rs.next()) {
					existe = true;
				}
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return existe;
		}
		
		public boolean verifyDateTime(Date data, Time hora) {
			boolean existe = false;
			String sqlCon = "SELECT * FROM consulta WHERE data = ? and hora = ?;";
			PreparedStatement stmt;
			try {
				stmt = (PreparedStatement) connection.prepareStatement(sqlCon);
				stmt.setDate(1, data);
				stmt.setTime(2, hora);
				
				ResultSet rs = stmt.executeQuery();
				while(rs.next()) {
					existe = true;
				}
				
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return existe;
		}
		
		public boolean verifyUpdate(String CRMV, int CodColeira, String CPF) {
			boolean existe = true;
			String sqlCon = "SELECT * FROM consulta WHERE CRMV_VET = ? and cod_coleira = ? and CPF_DONO = ?;";
			PreparedStatement stmt;
			try {
				stmt = (PreparedStatement) connection.prepareStatement(sqlCon);
				stmt.setString(1, CRMV);
				stmt.setInt(2, CodColeira);
				stmt.setString(3, CPF);
				
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
		
		
		
}
