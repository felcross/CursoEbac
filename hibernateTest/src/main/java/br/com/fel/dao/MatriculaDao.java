package br.com.fel.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fel.domain.Matricula;


public class MatriculaDao implements IMatriculaDao{

	@Override
	public Matricula cadastrar(Matricula matricula) throws Exception {
		EntityManagerFactory entityManagerFactory = 
		Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(matricula);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		entityManagerFactory.close();
		
		return matricula;
	}

	@Override
	public Integer atualizar(Matricula matricula) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Matricula buscar(String code) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Matricula> buscarTodos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer excluir(Matricula matricula) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
