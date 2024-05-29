package br.com.domain;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

import br.com.fel.dao.IGenericDao;
import br.com.fel.dao.ILivroDao;
import br.com.fel.dao.LivroDao;
import br.com.fel.domain.Curso;
import br.com.fel.domain.Livro;

public class LivroTest {
	
	private IGenericDao<Livro, ?> livroDao;
	
	public LivroTest(){
		livroDao = new LivroDao();
	}
	

	@Test
	public void cadastrar() throws Exception {
		Livro livro = new Livro();
		livro.setCodigo("A34");
		livro.setAutor("desconhecido"); 
		livro.setTitulo("livro teste");
	      
		Boolean retorno  = livroDao.cadastrar(livro); 
		
		Assert.assertTrue(retorno);
		
		//assertNotNull(livro);
	   // assertNotNull(livro.getId());
		
	}
	
	
}
