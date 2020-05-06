package models;

public class Cliente extends Pessoa {

private static final long serialVersionUID = 1L;
	
	private String endereco;
	private String cep;
	
	public Cliente() {
		
	}

	public Cliente(int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg,
			String endereco, String cep) {
		super(id, nome, sexo, dataNascimento, telefone, email, rg);
		this.endereco = endereco;
		this.cep = cep;
	}

	public Cliente(String nome, String dataNascimento, String telefone, String rg, String endereco, String cep) {
		super(nome, dataNascimento, telefone, rg);
		this.endereco = endereco;
		this.cep = cep;
	}
		
	public Cliente(String nome, char sexo, String telefone, String rg, String endereco, String cep) {
		super(nome, sexo, telefone, rg);
		this.endereco = endereco;
		this.cep = cep;
	}
		
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Cliente [endereco=" + endereco + ", cep=" + cep + "]";
	}
}
