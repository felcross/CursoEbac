package br.com.springData.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.springData.domain.Curso;

public interface ICursoRepository extends MongoRepository<Curso, String> {

}
