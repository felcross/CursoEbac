package br.com.fel.dao;

import java.util.List;

import br.com.fel.domain.Curso;



public interface ICursoDao {
	
	public Curso cadastrar(Curso curso) throws Exception;
	public Integer atualizar(Curso curso) throws Exception;
	public Curso buscar(String code) throws Exception;
	public List<Curso> buscarTodos() throws Exception;
	public Integer excluir(Curso curso) throws Exception;
}
