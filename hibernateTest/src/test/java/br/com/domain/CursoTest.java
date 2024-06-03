package br.com.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.List;

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
		Boolean  retorno = cursoDao.cadastrar(curso); 
		
	    Assert.assertTrue(retorno);
	   // assertNotNull(curso);
	   // assertNotNull(curso.getId());
		
	}
	
	@Test
	public void buscar() throws Exception {
		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("curso teste");
		curso.setNome("curso java ");
		cursoDao.cadastrar(curso);
		
		Curso cursoConsultado = cursoDao.buscar(curso.getId());
		Assert.assertNotNull(cursoConsultado);
		
		
	}
	
	
	
	@Test
	public void atualizar() throws Exception {
		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("curso teste");
		curso.setNome("curso java ");
		cursoDao.cadastrar(curso);
		
		Curso CursoBD = cursoDao.buscar(curso.getId());
		assertNotNull(CursoBD);
		assertEquals(curso.getId(), CursoBD.getId());
		assertEquals(curso.getNome(), CursoBD.getNome());
		
		CursoBD.setNome("Novo curso");
		Curso cursoAlterado = cursoDao.atualizar(CursoBD);
		assertEquals("Novo curso", cursoAlterado.getNome());
		
	}
	
	@Test
	public void buscarTodos() throws Exception {
		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("curso teste");
		curso.setNome("curso java ");
		Boolean  retorno = cursoDao.cadastrar(curso);
		Assert.assertTrue(retorno);
		
		Curso curso2 = new Curso(); 
		curso2.setCodigo("A2");
		curso2.setDescricao("curso teste2");
		curso2.setNome("curso java2 ");
		Boolean  retorno2 = cursoDao.cadastrar(curso2);
		Assert.assertTrue(retorno2); 
		
		
		 
		Collection<Curso> list = cursoDao.buscarTodos();
		assertTrue(list != null);
		assertTrue(list.size() == 2);
		
	}
	 
	
}
