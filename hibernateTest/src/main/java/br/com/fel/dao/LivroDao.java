package br.com.fel.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fel.domain.Livro;



public class LivroDao extends GenericDao<Livro,Long> implements ILivroDao {

	@Override
	public Class<Livro> getTipoClasse() {
		return Livro.class;
	}


}
