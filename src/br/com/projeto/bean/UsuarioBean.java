package br.com.projeto.bean;

import javax.faces.bean.ManagedBean;
import br.com.projeto.dao.DAO;
import br.com.projeto.modelo.Usuario;

@ManagedBean
public class UsuarioBean {

	private Usuario usuario = new Usuario();

	public Usuario getUsuario() {
		return usuario;
	}

	public String gravar() {
		if (this.usuario.getId() == null && !this.usuario.getNome().isEmpty() && !this.usuario.getUserName().isEmpty()
				&& !this.usuario.getSenha().isEmpty()) {
			new DAO<Usuario>(Usuario.class).adiciona(this.usuario);
		} else {
			System.out.println("Teste usuario asfcdczxa");
		}
		return "usuario?faces-redirect=true";
	}

	public String voltar() {

		return "usuario?faces-redirect=true";
	}
	public void pesquisaUsuario() {
		
		boolean pesquisa = new DAO<Usuario>(Usuario.class).listaUsuarios(this.usuario);
		
		if(this.usuario.getNome().equals(pesquisa)) {
			 this.usuario.getUserName();
		}
		
	}
	public String criarUsuario() {
		
		return "cadastroUsuario?faces-redirect=true";
	}
}
