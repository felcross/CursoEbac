package br.com.fel.dao;

import java.util.List;

import br.com.fel.domain.Matricula;



public interface IMatriculaDao { 
	
	public Matricula cadastrar(Matricula matricula) throws Exception;
	public Integer atualizar(Matricula matricula) throws Exception;
	public Matricula buscar(String code) throws Exception;
	public List<Matricula> buscarTodos() throws Exception;
	public Integer excluir(Matricula matricula) throws Exception;
}
