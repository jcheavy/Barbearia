package controller;

import controller.helper.LoginHelper;
import models.Usuario;
import telas.TelaLogin;

public class LoginController {
	
	private TelaLogin telaLogin;
	private LoginHelper loginHelper;
	
	public LoginController(TelaLogin telaLogin) {	
		this.telaLogin = telaLogin;
		this.loginHelper = new LoginHelper(telaLogin);
	}	
	
	public void Clicando () {
		System.out.println("Busca no banco de dados !");
		
		telaLogin.exibeMensagem("Busquei no banco de dados");
		entraNoSistema();
	}
	
	public void entraNoSistema() {
		
		Usuario usuario = loginHelper.ObterModelo();		 
		String nome =  telaLogin.getTextUsuario().getText();
		String password = telaLogin.getPwdPassword().getText();
		System.out.println(nome);
		System.out.println(password);
	}

}
