package br.com.domain;

import static org.junit.Assert.assertNotNull;

import java.time.Instant;

import org.junit.Test;

import br.com.fel.dao.IMatriculaDao;
import br.com.fel.dao.MatriculaDao;
import br.com.fel.domain.Matricula;

public class MatriculaTest {
	
	private IMatriculaDao matriculaDao;
	
	public MatriculaTest(){
		
		matriculaDao = new MatriculaDao();
	}
	

	@Test
	public void cadastrar() throws Exception {
		Matricula matricula = new Matricula();
		matricula.setCodigo("A1");
		matricula.setStatus("ATIVA");
		matricula.setValor(900d);
		matricula.setDataMatricula(Instant.now());
		matricula = matriculaDao.cadastrar(matricula);
		
	    assertNotNull(matricula);
	    assertNotNull(matricula.getId());
		
	}
	
	
}
