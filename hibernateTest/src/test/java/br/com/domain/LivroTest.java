package br.com.domain;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;


import br.com.fel.dao.ILivroDao;
import br.com.fel.dao.LivroDao;
import br.com.fel.domain.Livro;

public class LivroTest {
	
	private ILivroDao livroDao;
	
	public LivroTest(){
		livroDao = new LivroDao();
	}
	

	@Test
	public void cadastrar() throws Exception {
		Livro livro = new Livro();
		livro.setCodigo("A34");
		livro.setAutor("desconhecido");
		livro.setTitulo("livro teste");
	      
		livro = livroDao.cadastrar(livro); 
		
		assertNotNull(livro);
	    assertNotNull(livro.getId());
		
	}
	
	
}
