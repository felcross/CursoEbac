package br.com.test;

import org.junit.Test;

import br.com.dao.IGenericDao;
import br.com.domain.Carro;
import br.com.dao.CarroDao;
import br.com.domain.Marca;
import br.com.domain.Acessorio;
import br.com.dao.MarcaDao;
import br.com.dao.AcessorioDao;

public class MarcaTest {

	private IGenericDao<Carro, ?> carroDao;
	private IGenericDao<Marca, ?> marcaDao;
	private IGenericDao<Acessorio, ?> acessorioDao;
	
	public MarcaTest(){
		carroDao = new CarroDao();
		marcaDao = new MarcaDao();
		acessorioDao = new AcessorioDao();
	}
	

@Test
public void cadastrarTest() {
	
  Carro carro = new Carro();
  Marca marca = new Marca();
  marca.setNome("Chevrolet");
  //marca.setCarros(carro);
   //carro.setMarca();
  
	
}	 
	
 public Carro criarCarro() throws Exception {
	Marca marca = new Marca();
	Carro carro = new Carro();
	marca.setNome("Ferrari");
   Boolean retorno =  marcaDao.cadastrar(marca);
	
	
	 
	 return null;
 }
 
 public Acessorio criarAcessorio() {
	 return null;
 }
		
		
}
