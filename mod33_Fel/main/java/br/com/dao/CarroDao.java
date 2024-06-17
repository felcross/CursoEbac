package br.com.dao;

import java.util.List;

import br.com.domain.Carro;

public class CarroDao extends GenericDao<Carro,Long> implements ICarroDao{

	@Override
	public Class<Carro> getTipoClasse() {
		
		return Carro.class;
	}

	@Override
	public List<Carro> buscarTodos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
