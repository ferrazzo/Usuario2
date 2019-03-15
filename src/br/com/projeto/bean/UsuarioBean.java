package br.com.projeto.bean;

import br.com.projeto.dao.DAO;
import br.com.projeto.modelo.Usuario;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class UsuarioBean {

	private Usuario usuario = new Usuario();

	public Usuario getUsuario() {
		return usuario;
	}
	public String gravar() {
		
		return "usuario?faces-redirect=true";
	}
}
