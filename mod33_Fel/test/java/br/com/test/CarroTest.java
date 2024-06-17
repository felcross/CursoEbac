package br.com.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.dao.IGenericDao;
import br.com.domain.Carro;
import br.com.dao.CarroDao;
import br.com.domain.Marca;
import br.com.domain.Acessorio;
import br.com.dao.MarcaDao;
import br.com.dao.AcessorioDao;

public class CarroTest {

	private IGenericDao<Carro, ?> carroDao;
	private IGenericDao<Marca, ?> marcaDao;
	private IGenericDao<Acessorio, ?> acessorioDao;
	
	public CarroTest(){
		carroDao = new CarroDao();
		marcaDao = new MarcaDao();
		acessorioDao = new AcessorioDao();
	}
	

@Test
public void cadastrarTest() throws Exception {
	
  Carro carro = new Carro();
  Marca marca = criarMarca("chevrolet");
  Acessorio acess = criarAcessorio("A1");
   carro.setCodigo("A1");
   carro.setMarca(marca);
   carro.setCor("Preto");
   //carro.add(acess);
  Boolean retorno = carroDao.cadastrar(carro);
   Assert.assertTrue(retorno); 
   
	
}	
	
 public Marca criarMarca(String cod) throws Exception {
	Marca marca = new Marca();
	marca.setNome(cod);			
	marcaDao.cadastrar(marca);
	 return marca; 
 }
 
 public Acessorio criarAcessorio(String cod) throws Exception {
	Acessorio acess = new Acessorio();
	acess.setDescricao("peça teste");
	acess.setCodigo(cod);
	
	//acess.add(car);
	acessorioDao.cadastrar(acess);
	 
	 return acess;
 }
		
		
}
