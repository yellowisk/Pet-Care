package bean;

import java.sql.Date;

public class Cliente {

	private String CPF;
	private String nome_cli;
	private Date data_nasc;
	private Date data_entrada;
	private String email;
	
	public Cliente(String cPF, String nome_cli, Date data_nasc, Date data_entrada, String email) {
		super();
		CPF = cPF;
		this.nome_cli = nome_cli;
		this.data_nasc = data_nasc;
		this.data_entrada = data_entrada;
		this.email = email;
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getNome_cli() {
		return nome_cli;
	}

	public void setNome_cli(String nome_cli) {
		this.nome_cli = nome_cli;
	}

	public Date getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}

	public Date getData_entrada() {
		return data_entrada;
	}

	public void setData_entrada(Date data_entrada) {
		this.data_entrada = data_entrada;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [CPF=" + CPF + ", nome_cli=" + nome_cli + ", data_nasc=" + data_nasc + ", data_entrada="
				+ data_entrada + ", email=" + email + "]";
	}
	
}
