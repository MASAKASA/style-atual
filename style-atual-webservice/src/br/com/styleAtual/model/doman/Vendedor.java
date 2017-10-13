package br.com.styleAtual.model.doman;

import java.io.Serializable;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

//@Entity
//@Table(name="vendedor")
public class Vendedor implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8986571275067479170L;
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="id_vendedor")
	private Long id;
	
//	@Column(name="nome_vendedor", nullable=true)
//	@NotNull
//	@Size(min = 3, max = 50)
	private String nome;

	public Vendedor() {
		super();
	}

	public Vendedor(String nome) {
		super();
		this.nome = nome;
	}

	public Vendedor(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
