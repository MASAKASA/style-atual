package br.com.styleAtual.model.dao;

public class ExceptionTeste extends Exception {

	private String mensagem;

	public ExceptionTeste(String mensagem) {
		super(mensagem);
		this.mensagem = mensagem;
	}
}
