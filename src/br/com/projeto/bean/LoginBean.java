package br.com.projeto.bean;


import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.projeto.dao.DAO;
import br.com.projeto.modelo.Usuario;

@ManagedBean
public class LoginBean {

	private Usuario usuario = new Usuario();

	public Usuario getUsuario() {
		return usuario;
	}
	
	public String efetuaLogin() {
		boolean existeUsuario = new DAO<Usuario>(Usuario.class).existeUsuario(this.usuario);
		if (existeUsuario) {
			FacesContext context = FacesContext.getCurrentInstance();
			context.getExternalContext().getSessionMap().put("usuarioLogado", this.usuario);
			return "usuario?faces-redirect=true";
		}
		return null;
	}
	public String logout() {
		FacesContext context = FacesContext.getCurrentInstance();
		context.getExternalContext().getSessionMap().remove("usuarioLogado");
		return "login?faces-redirect=true";
		
	}
	
}
