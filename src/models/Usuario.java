package models;

public class Usuario extends Pessoa  {

	private static final long serialVersionUID = 1L;
	
	
	protected String senha;
	protected String tipoUsuario;
	
	public Usuario() {
		
	}
	/**
	 * Cronstrutor usuario reduzido
	 * @param nome
	 * @param dataNascimento
	 * @param telefone
	 * @param rg
	 * @param senha
	 * @param tipoUsuario
	 */
	public Usuario(String nome, String dataNascimento, String telefone, String rg, String senha, String tipoUsuario) {
		super(nome, dataNascimento, telefone, rg);
		this.senha = senha;
		this.tipoUsuario = tipoUsuario;
	}
    
	/**
	 * construtor usuario
	 * @param id
	 * @param nome
	 * @param sexo
	 * @param dataNascimento
	 * @param telefone
	 * @param email
	 * @param rg
	 * @param senha
	 * @param tipoUsuario
	 */
	public Usuario(int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg,
			String senha, String tipoUsuario) {
		super(id, nome, sexo, dataNascimento, telefone, email, rg);
		this.senha = senha;
		this.tipoUsuario = tipoUsuario;
	}
		
	
	public Usuario(String nome, char sexo, String telefone, String rg, String senha, String tipoUsuario) {
		super(nome, sexo, telefone, rg);
		this.senha = senha;
		this.tipoUsuario = tipoUsuario;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	@Override
	public String toString() {
		return "Usuario [senha=" + senha + ", tipoUsuario=" + tipoUsuario + "]";
	}
    
}
