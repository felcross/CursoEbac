
package br.com.felMongo.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.felMongo.dao.CursoDao;
import br.com.felMongo.dao.ICursoDao;
import br.com.felMongo.domain.Curso;


public class CursoTest {

	private ICursoDao cursoDao;
	
	public CursoTest() {
		cursoDao = new CursoDao();
	}

	@Test
	public void cadastrar() {
		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("CURSO TESTE - Hibernate OGM");
		curso.setNome("Curso de Java Backend");
		curso = cursoDao.cadastrar(curso);
		 
		assertNotNull(curso);
		assertNotNull(curso.getId());
	}
}
  