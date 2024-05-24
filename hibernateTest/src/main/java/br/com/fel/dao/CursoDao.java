package br.com.fel.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fel.domain.Curso;


public class CursoDao implements ICursoDao{

	@Override
	public Curso cadastrar(Curso curso) throws Exception {
		EntityManagerFactory entityManagerFactory = 
		Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(curso);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		entityManagerFactory.close();
		
		return curso;
	}

	@Override
	public Integer atualizar(Curso curso) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Curso buscar(String code) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Curso> buscarTodos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer excluir(Curso curso) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
