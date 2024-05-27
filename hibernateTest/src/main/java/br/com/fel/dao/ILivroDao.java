package br.com.fel.dao;

import java.util.List;

import br.com.fel.domain.Livro;



public interface ILivroDao {
	
	public Livro cadastrar(Livro livro) throws Exception;
	public Integer atualizar(Livro livro) throws Exception;
	public Livro buscar(String code) throws Exception;
	public List<Livro> buscarTodos() throws Exception;
	public Integer excluir(Livro livro) throws Exception;
}
