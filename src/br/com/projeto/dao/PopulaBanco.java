package br.com.projeto.dao;

import javax.persistence.EntityManager;


import br.com.projeto.modelo.Usuario;

public class PopulaBanco {

	public static void main(String[] args) {

		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		Usuario eduardo = new Usuario();
		
		eduardo.setNome("Eduardo Ferrazzo");
		eduardo.setSenha("1234");
		eduardo.setUserName("eferrazzo");
		
		em.persist(eduardo);
		em.getTransaction().commit();
		em.close();
		
		
	}

}
