package br.com.fel.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fel.domain.Curso;


public class CursoDao extends GenericDao<Curso,Long> implements ICursoDao{


}
