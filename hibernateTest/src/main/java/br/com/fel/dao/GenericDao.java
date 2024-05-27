package br.com.fel.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;





public abstract class GenericDao<T extends Persistente, E extends Serializable> implements IGenericDao<T,E>  {

	 
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


	public void atualizar(T entity) throws Exception {
		// TODO Auto-generated method stub
		return;
	}

	
	public T buscar(Long valor) throws Exception { 
		// TODO Auto-generated method stub
		return null;
	}


	public List<T> buscarTodos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	public void excluir(T entity) throws Exception {
		// TODO Auto-generated method stub
		return;
	}
}
