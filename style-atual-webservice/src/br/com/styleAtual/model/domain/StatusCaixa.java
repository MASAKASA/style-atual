package br.com.styleAtual.model.domain;

public enum StatusCaixa {
	
	ABERTO("aberto"),
	FECHADO("fechado");
	
	private String status;
	
	StatusCaixa(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

}
