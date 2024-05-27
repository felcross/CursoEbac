package br.com.fel.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fel.domain.Livro;



public class LivroDao implements ILivroDao{

	


	@Override
	public Livro cadastrar(Livro livro) throws Exception {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
				EntityManager entityManager = entityManagerFactory.createEntityManager();
				
				entityManager.getTransaction().begin();
				entityManager.persist(livro);
				entityManager.getTransaction().commit();
				 
				entityManager.close();
				entityManagerFactory.close();
				
				return livro;
	}

	@Override
	public Integer atualizar(Livro livro) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer excluir(Livro livro) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Livro> buscarTodos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Livro buscar(String code) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
