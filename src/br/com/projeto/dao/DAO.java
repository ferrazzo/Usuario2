package br.com.projeto.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;


import br.com.projeto.modelo.Usuario;

public class DAO<T> {

	private final Class<T> classe;

	public DAO(Class<T> classe) {
		this.classe = classe;
	}

	public void adiciona(T t) {
		EntityManager em = new JPAUtil().getEntityManager();

		em.getTransaction().begin();

		em.persist(t);

		em.getTransaction().commit();

		em.close();
	}

	public void buscaUsuario(T t) {
		EntityManager em = new JPAUtil().getEntityManager();

		em.getTransaction().begin();

		em.persist(t);

		em.getTransaction().commit();

		em.close();
	}
	public boolean existeUsuario(Usuario usuario) {
		EntityManager em = new JPAUtil().getEntityManager();
		
		TypedQuery<Usuario> query = em.createQuery("select u  from Usuario u where u.userName = :pUserName and u.senha = :pSenha", Usuario.class);
		
		query.setParameter("pUserName", usuario.getUserName());
		query.setParameter("pSenha", usuario.getSenha());
		
		try {
			query.getSingleResult();
		}catch(NoResultException ex) {
			System.out.println("Usuário e senha inválido");
			return false;
		}
		em.close();
		
		return true;
	}
	public boolean listaUsuarios(Usuario usuario) {
		EntityManager em = new JPAUtil().getEntityManager();

		TypedQuery<Usuario> query = em.createQuery("select u  from Usuario u where u.nome = :pNome", Usuario.class);
		
		query.setParameter("pNome", usuario.getNome());
		
		query.getResultList();	
		
		
		System.out.println(usuario.getNome());
		System.out.println(usuario.getUserName());
		System.out.println(usuario.getSenha());
		
		em.close();
		return true;
	}

}
