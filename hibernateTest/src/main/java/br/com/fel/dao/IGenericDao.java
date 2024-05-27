package br.com.fel.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;






public interface IGenericDao <T extends Persistente, E extends Serializable> {
	
	public Boolean cadastrar(T entity) throws Exception;
	public void atualizar(T entity) throws Exception;
	public T buscar(E valor) throws Exception;
	public List<T> buscarTodos() throws Exception;
	public void excluir(T entity) throws Exception;
	
	
}
