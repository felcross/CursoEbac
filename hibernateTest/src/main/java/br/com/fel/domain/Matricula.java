package br.com.fel.domain;


import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

import br.com.fel.dao.Persistente;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Table(name ="TB_MATRICULA")
public class Matricula implements Persistente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="matricula_seq")
	@SequenceGenerator(name="matricula_seq", sequenceName="sq_matricula", initialValue = 1, allocationSize = 1)
	private Long id;
	@Column(name="CODIGO", length = 10, nullable = false, unique = true)
	private String codigo;
	@Column(name="VALOR", length = 10, nullable = false)
	private Double valor;
	@Column(name="DATAMATRICULA", length = 10, nullable = false)
	private Instant dataMatricula;
	@Column(name="STATUS", length = 10, nullable = false)
	private String status;
	
	@ManyToOne
	@JoinColumn(name="id_curso_fk", foreignKey = @ForeignKey(name="fk_curso_matricula"),
	referencedColumnName="id", nullable = false)
	private Curso curso;
	
	
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
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Instant getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(Instant dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
