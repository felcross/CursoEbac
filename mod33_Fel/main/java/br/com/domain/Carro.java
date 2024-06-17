package br.com.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.dao.Persistente;

@Entity
@Table(name ="TB_CARRO")
public class Carro implements Persistente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="carro_seq")
	@SequenceGenerator(name="carro_seq", sequenceName="sq_carro", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name="CODIGO", length = 10, nullable = false, unique = true)
	private String codigo;
	
	@ManyToOne
	@JoinColumn(name="id_marca_fk", foreignKey = @ForeignKey(name="fk_marca_carro"),
	referencedColumnName="id", nullable = false)
	private Marca marca;
	
	@ManyToMany(cascade= {CascadeType.ALL})
	@JoinTable(
			name="TB_CARRO_ACESSORIO",
			joinColumns= {@JoinColumn(name="id_carro_fk")},
			inverseJoinColumns = {@JoinColumn(name="id_acessorio_fk")}
			)
	private List <Acessorio> Acessorios;
	
	@Column(name="COR", length = 10, nullable = false)
	private String cor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public List<Acessorio> getAcessorios() {
		return Acessorios;
	}

	public void setAcessorios(List<Acessorio> acessorios) {
		Acessorios = acessorios;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void add(Acessorio acess) {
		this.Acessorios.add(acess);
	}
	
	
	
}
