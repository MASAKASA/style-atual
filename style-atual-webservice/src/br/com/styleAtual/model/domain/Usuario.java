package br.com.styleAtual.model.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity //Anotacao para mapiar a entidade no banco
@Table(name = "usuario") //Nome da tabela
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //Estrategia para heranca
@DiscriminatorColumn(name = "tipo", length = 1, discriminatorType = DiscriminatorType.STRING) //Coluna para diferenciar os filhos na tabela
@DiscriminatorValue("U") //Atributo da coluna tipo informando que os dados contidos na linha vai ser de um usuario
public abstract class Usuario {

	@Id //Id da tabela
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Estrategia de auto incremento
	@Column(name="id_usuario") //Nome da coluna
	private Long id;
	
	@NotNull //Informando que nao pode ter valor nulo
	@Size(min = 2, max = 255) //Tamanho minimo e maximo
	@Column(name="nome_usuario", nullable=false) //Nome da coluna e informando que nao pode ser vazio com o false
	private String nome;
	
	@NotNull //Informando que nao pode ter valor nulo
	@Size(min = 3, max = 8) //Tamanho minimo e maximo
	@Column(name="senha_usuario", nullable=false) //Nome da coluna e informando que nao pode ser vazio com o false
	private String senha;
	
	public Usuario() {
		super();
	}
	
	//Metodo criado por boa pratica de programacao. So para o id
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	//Metodo criado por boa pratica de programacao. So para o id
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public abstract String toString();// Faz com que o metodo seja criado nos filhos

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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
