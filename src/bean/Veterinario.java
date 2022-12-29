package bean;

public class Veterinario {

	private String CRMV;
	private String Nome_vet;
	private int Idade_vet;
	private String Email;
	private String Logradouro;
	private String Bairro;
	private String CEP;
	private int Numero;
	private String Diploma;
	private String Especializacao;
	private String Experiencia;

	public Veterinario(String cRMV, String nome_vet, int idade_vet, String email, String logradouro, String bairro,
			String cEP, int numero, String diploma, String especializacao, String experiencia) {
		super();
		CRMV = cRMV;
		Nome_vet = nome_vet;
		Idade_vet = idade_vet;
		Email = email;
		Logradouro = logradouro;
		Bairro = bairro;
		CEP = cEP;
		Numero = numero;
		Diploma = diploma;
		Especializacao = especializacao;
		Experiencia = experiencia;
	}
	public Veterinario() {
		// TODO Auto-generated constructor stub
	}
	public String getCRMV() {
		return CRMV;
	}
	public void setCRMV(String cRMV) {
		CRMV = cRMV;
	}
	public String getNome_vet() {
		return Nome_vet;
	}
	public void setNome_vet(String nome_vet) {
		Nome_vet = nome_vet;
	}
	public int getIdade_vet() {
		return Idade_vet;
	}
	public void setIdade_vet(int idade_vet) {
		Idade_vet = idade_vet;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getLogradouro() {
		return Logradouro;
	}
	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public String getDiploma() {
		return Diploma;
	}
	public void setDiploma(String diploma) {
		Diploma = diploma;
	}
	public String getEspecializacao() {
		return Especializacao;
	}
	public void setEspecializacao(String especializacao) {
		Especializacao = especializacao;
	}
	public String getExperiencia() {
		return Experiencia;
	}
	public void setExperiencia(String experiencia) {
		Experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "Veterinario [CRMV=" + CRMV + ", Nome_vet=" + Nome_vet + ", Idade_vet=" + Idade_vet + ", Email=" + Email
				+ ", Logradouro=" + Logradouro + ", Bairro=" + Bairro + ", CEP=" + CEP + ", Numero=" + Numero
				+ ", Diploma=" + Diploma + ", Especializacao=" + Especializacao + ", Experiencia=" + Experiencia + "]";
	}
	
}
