package bean;

public class Pet {
	
	private String CPF;
	private int codColeira;
	private String Nome;
	private int Idade;
	private double Peso;
	
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String string) {
		this.CPF = string;
	}

	public int getCodColeira() {
		return codColeira;
	}

	public void setCodColeira(int codColeira) {
		this.codColeira = codColeira;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public double getPeso() {
		return Peso;
	}

	public void setPeso(double peso) {
		Peso = peso;
	}

	public Pet(String cPF, int codColeira, String nome, int idade, double peso) {
		CPF = cPF;
		this.codColeira = codColeira;
		Nome = nome;
		Idade = idade;
		Peso = peso; 
	}

	public Pet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pet [CPF=" + CPF + ", codColeira=" + codColeira + ", Nome=" + Nome + ", Idade=" + Idade + ", Peso="
				+ Peso + "]";
	}
	
}
