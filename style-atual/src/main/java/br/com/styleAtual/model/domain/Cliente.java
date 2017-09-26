package br.com.styleAtual.model.domain;

public class Cliente {
	
	//ATRIBUTOS
	private long codigo;
	private String telefone;
	private String nome;
	private Endereco endereco;
	
	//CONSTRUTOR PADRÃO
	public Cliente() {
		super();
	}
	
	//CONSTRUTOR COM ATRIBUTOS NOME E CODIGO
	public Cliente(long codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	//CONSTRUTOR COM TODOS ATRIBUTOS	
	public Cliente(long codigo, String telefone, String nomeCliente, Endereco endereco) {
		super();
		this.codigo = codigo;
		this.telefone = telefone;
		this.nome = nomeCliente;
		this.endereco = endereco;
	}
	
	//GETTERS E SETTERS
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	//TO STRING
	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", telefone=" + telefone + ", nome=" + nome + ", endereco=" + endereco
				+ "]";
	}
	
}
