package br.com.dao;

import java.util.List;

import br.com.domain.Acessorio;

public class AcessorioDao extends GenericDao<Acessorio,Long> implements IAcessorioDao{

	@Override
	public Class<Acessorio> getTipoClasse() {
		
		return Acessorio.class;
	}

	@Override
	public List<Acessorio> buscarTodos() throws Exception {
		// TODO Auto-generated method stub
		return null; 
	}

}
