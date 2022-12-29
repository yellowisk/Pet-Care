package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Cliente;

public class ClienteDAO {
	private Connection connection;

	public ClienteDAO() {
		connection = new FabricaConexoes().getConnection();
	}

	public int inserir(Cliente c) {
		int inseriu = 0;
		String sql = "INSERT INTO cliente(CPF, nome, data_nasc, data_entrada, email) VALUES (?,?,?,?,?);";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, c.getCPF());
			stmt.setString(2, c.getNome_cli());
			stmt.setDate(3, c.getData_nasc());
			stmt.setDate(4, c.getData_entrada());
			stmt.setString(5, c.getEmail());
			System.out.println(c.getEmail());
			inseriu = stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return inseriu;
	}
	
	public int remover(Cliente c) {
		int removeu = 0;
		String sql = "DELETE FROM cliente WHERE CPF = ?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, c.getCPF());
			removeu = stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return removeu;
	}
	
	public int alterar(Cliente c) {
		int alterou = 0;
		String sql = "UPDATE cliente SET nome = ?, data_nasc = ?, data_entrada = ?, email = ? WHERE CPF = ?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, c.getNome_cli());
			stmt.setDate(2, c.getData_nasc());
			stmt.setDate(3, c.getData_entrada());
			stmt.setString(4, c.getEmail());
			stmt.setString(5, c.getCPF());
			alterou = stmt.executeUpdate();
			System.out.println();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return alterou;
	}
	

	public boolean verifycpf(String CPF) {
		boolean existe = false;
		String sqlPet = "SELECT * FROM cliente WHERE CPF = ?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sqlPet);
			stmt.setString(1, CPF);
			
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
	
	public ArrayList<String> getCPFs() {
		String sql = "SELECT CPF FROM cliente;";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList <String> cpfs = new ArrayList<>();
			while (rs.next()) {
				cpfs.add(rs.getString("CPF"));
			}
			rs.close();
			stmt.close();
			return cpfs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<Cliente> getClientes() {
		String sql = "SELECT * FROM cliente";
		PreparedStatement stmt;
		Cliente c;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList<Cliente> clientes = new ArrayList<>();
			while (rs.next()) {
				c = new Cliente();
				c.setCPF(rs.getString("CPF"));
				c.setNome_cli(rs.getString("nome"));
				c.setData_nasc(rs.getDate("data_nasc"));
				c.setData_entrada(rs.getDate("data_entrada"));
				c.setEmail(rs.getString("email"));
				clientes.add(c);
			}
			stmt.close();
			rs.close();
			return clientes;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<Cliente> getFirstConsulta() {
		String sql = "select c.nome, c.cpf, con.hora, con.data from (cliente c inner join consulta con on c.CPF=con.CPF_DONO) where con.hora = (select min(hora) from consulta) order by con.data;";
		PreparedStatement stmt;
		Cliente c;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList<Cliente> clientes = new ArrayList<>();
			while (rs.next()) {
				c = new Cliente();
				c.setNome_cli(rs.getString("nome"));
				c.setCPF(rs.getString("CPF"));
				clientes.add(c);
			}
			stmt.close();
			rs.close();
			return clientes;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<Cliente> getVerVaccine() {
		String sql = "select c.nome, p.cod_coleira, p.nome as nome_pet, v.nome_vacina, v.data from vacinas v, pet p, cliente c where p.cod_coleira=v.cod_coleira and p.cpf_dono=c.cpf order by v.data desc;";
		PreparedStatement stmt;
		Cliente c;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList<Cliente> clientes = new ArrayList<>();
			while (rs.next()) {
				c = new Cliente();
				c.setNome_cli(rs.getString("nome"));
				clientes.add(c);
			}
			stmt.close();
			rs.close();
			return clientes;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<Cliente> getLastConsulta() {
		String sql = "select c.nome, c.cpf, con.hora, con.data \r\n"
				+ "from (cliente c inner join consulta con on c.CPF=con.CPF_DONO) \r\n"
				+ "where con.hora = (select max(hora) from consulta) \r\n"
				+ "order by con.data;";
		PreparedStatement stmt;
		Cliente c;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList<Cliente> clientes = new ArrayList<>();
			while (rs.next()) {
				c = new Cliente();
				c.setNome_cli(rs.getString("nome"));
				c.setCPF(rs.getString("CPF"));
				clientes.add(c);
			}
			stmt.close();
			rs.close();
			return clientes;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
