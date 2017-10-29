package br.com.styleAtual.model.domain;

public enum EPeriodoMeta {

	SEM_META("Sem meta"),
	DIARIA("Di�ria"),
	SEMANAL("Semanal"),
	MENSAL("Mensal");
	
	private String meta;
	
	EPeriodoMeta(String meta) {
		this.meta = meta;
	}

	public String getMeta() {
		return meta;
	}
}
