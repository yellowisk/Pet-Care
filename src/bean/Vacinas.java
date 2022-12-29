package bean;

import java.sql.Date;

public class Vacinas {
	
	private String CPF;
	private int codColeira;
	private Date data;
	private String nomevac;
	
	public Vacinas(String cPF, int codColeira, Date data, String nomevac) {
		super();
		CPF = cPF;
		this.codColeira = codColeira;
		this.data = data;
		this.nomevac = nomevac;
	}

	public Vacinas() {
		// TODO Auto-generated constructor stub
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public int getCodColeira() {
		return codColeira;
	}

	public void setCodColeira(int codColeira) {
		this.codColeira = codColeira;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getNomevac() {
		return nomevac;
	}

	public void setNomevac(String nomevac) {
		this.nomevac = nomevac;
	}

	@Override
	public String toString() {
		return "Vacinas [CPF=" + CPF + ", codColeira=" + codColeira + ", data=" + data + ", nomevac=" + nomevac + "]";
	}
	
}