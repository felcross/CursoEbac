package br.com.fel.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.fel.dao.Persistente;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Table(name ="TB_LIVRO")
public class Livro implements Persistente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="livro_seq")
	@SequenceGenerator(name="livro_seq", sequenceName="sq_livro", initialValue = 1, allocationSize = 1)
	private Long id;
	@Column(name="CODIGO", length = 10, nullable = false, unique = true)
	private String codigo;
	@Column(name="TITULO", length = 50, nullable = false)
	private String titulo;
	@Column(name="AUTOR", length = 50, nullable = false)
	private String autor; 
	
	public Livro(Long id, String codigo, String titulo, String autor) {
		this.id = id;
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
	}
	public Livro() {}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	
	
	
	}
	
	


