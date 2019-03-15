package br.com.projeto.dao;

import javax.persistence.EntityManager;

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

}
