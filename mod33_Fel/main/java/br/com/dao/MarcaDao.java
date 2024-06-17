package br.com.dao;

import java.util.List;

import br.com.domain.Marca;

public class MarcaDao extends GenericDao<Marca,Long> implements IMarcaDao{

	@Override
	public Class<Marca> getTipoClasse() {
		
		return Marca.class;
	}

	@Override
	public List<Marca> buscarTodos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
