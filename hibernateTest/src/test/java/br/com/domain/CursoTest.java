package br.com.domain;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.Assert;

import br.com.fel.dao.CursoDao;
import br.com.fel.dao.ICursoDao;
import br.com.fel.dao.IGenericDao;
import br.com.fel.domain.Curso;

public class CursoTest {
	
	private IGenericDao<Curso, ?> cursoDao;
	
	public CursoTest(){
		cursoDao = new CursoDao();
	}
	

	@Test
	public void cadastrar() throws Exception {
		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("curso teste");
		curso.setNome("curso java ");
		Boolean  curso1 = cursoDao.cadastrar(curso); 
		
	    Assert.assertTrue(curso1);
	   // assertNotNull(curso);
	   // assertNotNull(curso.getId());
		
	}
	 
	
}
