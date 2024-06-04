package br.com.fel.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fel.domain.Curso;




public class CursoDao extends GenericDao<Curso,Long> implements ICursoDao{

	@Override
	public Class<Curso> getTipoClasse() {
		return Curso.class;
	}

	@Override
	public List<Curso> buscarTodos() throws Exception {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
				EntityManager entityManager = entityManagerFactory.createEntityManager();
				
				entityManager.getTransaction().begin();
				List<Curso> list = 
						entityManager.createQuery("SELECT c FROM Curso c", Curso.class).getResultList();     
				entityManager.getTransaction().commit();
				
				entityManager.close();
				entityManagerFactory.close();  
				return list; 
	}

}
