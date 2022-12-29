package bean;

import java.sql.Date;
import java.sql.Time;

public class Consulta {

	private String CRMV;
	private String CPF;
	private int codColeira;
	private Date data;
	private Time hora;
	
	public Consulta(String cRMV, String cPF, int codColeira, Date data, Time hora) {
		super();
		CRMV = cRMV;
		CPF = cPF;
		this.codColeira = codColeira;
		this.data = data;
		this.hora = hora;
	}
	
	public Consulta() {
		// TODO Auto-generated constructor stub
	}

	public String getCRMV() {
		return CRMV;
	}
	public void setCRMV(String cRMV) {
		CRMV = cRMV;
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
	public Time getHora() {
		return hora;
	}
	public void setHora(Time horario) {
		this.hora = horario;
	}
	@Override
	public String toString() {
		return "Consulta [CRMV=" + CRMV + ", CPF=" + CPF + ", codColeira=" + codColeira + ", data=" + data
				+ ", hora=" + hora + "]";
	}

	
	
	
}
