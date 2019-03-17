package br.com.projeto.bean;


import br.com.projeto.dao.DAO;
import br.com.projeto.modelo.Usuario;

public class LoginBean {

	private Usuario usuario = new Usuario();

	public Usuario getUsuario() {
		return usuario;
	}
	
	public void acessar() {
			new DAO<Usuario>(Usuario.class).efetuaLogin(this.usuario);
		
	}
	
}
