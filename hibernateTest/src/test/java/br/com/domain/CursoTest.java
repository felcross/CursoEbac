package br.com.domain;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.fel.dao.CursoDao;
import br.com.fel.dao.ICursoDao;
import br.com.fel.domain.Curso;

public class CursoTest {
	
	private ICursoDao cursoDao;
	
	public CursoTest(){
		cursoDao = new CursoDao();
	}
	

	@Test
	public void cadastrar() throws Exception {
		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("curso teste");
		curso.setNome("curso java ");
	    curso = cursoDao.cadastrar(curso);
		
	    assertNotNull(curso);
	    assertNotNull(curso.getId());
		
	}
	
	
}
