package controller.helper;

import models.Usuario;
import telas.TelaLogin;

public class LoginHelper {
	
	TelaLogin telaLogin;
	
	public LoginHelper(TelaLogin login) {
		
		this.telaLogin = telaLogin;
	}
	
	public Usuario ObterModelo() {
		Usuario modelo = new Usuario();
		String nome = telaLogin.getTextUsuario().getText();
		String senha = telaLogin.getPwdPassword().getText();
		return modelo;		
	}
	
	public void setarModelo(Usuario modelo) {
		
		String nome = modelo.getNome();
		String senha = modelo.getSenha();
		
		telaLogin.getTextUsuario().setText(nome);
		telaLogin.getPwdPassword().setText(senha);
	}
	
	public void LimparTela() {
	 
		telaLogin.getTextUsuario().setText("");
		telaLogin.getPwdPassword().setText(" ");
	}

}
