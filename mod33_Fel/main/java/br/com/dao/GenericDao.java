package br.com.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public abstract class GenericDao <T extends Persistente, E extends Serializable> implements IGenericDao<T,E>{
  
	 public abstract Class<T> getTipoClasse();
	 public abstract List<T> buscarTodos() throws Exception;
	 	
	@Override
	public Boolean cadastrar(T entity) throws Exception {
		EntityManagerFactory entityManagerFactory = 
		Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin(); 
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
		 
		entityManager.close(); 
		entityManagerFactory.close();
		
		return true;
	}
	
	 public GenericDao() { 
	        
	    }

	@Override
	public T atualizar(T entity) throws Exception {
		EntityManagerFactory entityManagerFactory = 
		Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entity = entityManager.merge(entity);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		return entity;
				
	}

	@Override
	public T buscar(Long valor) throws Exception { 
		EntityManagerFactory entityManagerFactory = 
			    Persistence.createEntityManagerFactory("ExemploJPA");
				EntityManager entityManager = entityManagerFactory.createEntityManager();
				
				entityManager.getTransaction().begin();
				T entity = entityManager.find(getTipoClasse(), valor);
				entityManager.getTransaction().commit();
				
				entityManager.close();
				entityManagerFactory.close();
				
				return entity; 
	}



	


	@Override
	public void excluir(T entity) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entity = entityManager.merge(entity);
		entityManager.remove(entity);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}

	
	
}
