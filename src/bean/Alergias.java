package bean;

public class Alergias {
	
	private String CPF;
	private int codColeira;
	private String nome;
	
	public Alergias(String cPF, int codColeira, String nome) {
		CPF = cPF;
		this.codColeira = codColeira;
		this.nome = nome;
	}
	
	public Alergias() {
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Alergias [CPF=" + CPF + ", codColeira=" + codColeira + ", nome=" + nome + "]";
	}
	
}
