package br.com.projeto.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long usuario_id;
	private String nome;
	private String userName;
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nomeDoUsuario) {
		nome = nomeDoUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senhaDoUsuario) {
		senha = senhaDoUsuario;
	}

	public Long getId() {
		return usuario_id;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
