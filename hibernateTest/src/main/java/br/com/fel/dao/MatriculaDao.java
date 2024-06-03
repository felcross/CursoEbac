package br.com.fel.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import br.com.fel.domain.Matricula;


public class MatriculaDao extends GenericDao<Matricula,Long> implements IMatriculaDao{

	@Override
	public Class<Matricula> getTipoClasse() {
		return Matricula.class;
	}

	@Override
	public List<Matricula> buscarTodos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
