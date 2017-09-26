package br.com.styleAtual.model.domain;

public class Produto {

	private long codigo;
	private String nome;
	private String marca;
	private char genero;
	private double precoVenda;
	private double precoCompra;
	private double desconto;
	private int quantMinima;
	private long quantEstoque;
	
	//CONSTRUTOR PADRÃO
	public Produto() {
		super();
	}
	
	//CONSTRUTOR COM ATRIBUTOS
	public Produto(long codigo, String nome, String marca, char genero, double precoVenda, double precoCompra,
			double desconto, int quantMinima, long quantEstoque) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.marca = marca;
		this.genero = genero;
		this.precoVenda = precoVenda;
		this.precoCompra = precoCompra;
		this.desconto = desconto;
		this.quantMinima = quantMinima;
		this.quantEstoque = quantEstoque;
	}
	
	//GETTERS E SETTERS
	public long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	public double getPrecoCompra() {
		return precoCompra;
	}
	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public int getQuantMinima() {
		return quantMinima;
	}
	public void setQuantMinima(int quantMinima) {
		this.quantMinima = quantMinima;
	}
	public long getQuantEstoque() {
		return quantEstoque;
	}
	public void setQuantEstoque(long quantEstoque) {
		this.quantEstoque = quantEstoque;
	}

	//TO STRING
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", marca=" + marca + ", genero=" + genero
				+ ", precoVenda=" + precoVenda + ", precoCompra=" + precoCompra + ", desconto=" + desconto
				+ ", quantMinima=" + quantMinima + ", quantEstoque=" + quantEstoque + "]";
	}
		
}
