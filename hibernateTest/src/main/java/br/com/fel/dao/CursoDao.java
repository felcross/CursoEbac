package br.com.fel.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fel.domain.Curso;


public class CursoDao extends GenericDao<Curso,Long> implements ICursoDao{

	@Override
	public Boolean cadastrar(Curso curso) throws Exception {
	/*	EntityManagerFactory entityManagerFactory = 
		Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(curso);
		entityManager.getTransaction().commit();
		 
		entityManager.close(); 
		entityManagerFactory.close();*/
		 
		return true;
	}

	@Override
	public void atualizar(Curso curso) throws Exception {
		// TODO Auto-generated method stub
		return;
	}

	@Override
	public Curso buscar(Long valor) throws Exception { 
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Curso> buscarTodos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(Curso curso) throws Exception {
		// TODO Auto-generated method stub
		return;
	}

}
