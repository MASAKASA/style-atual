package br.com.styleAtual.model.domain;

public enum PeriodoMeta {

	SEM_META("Sem meta"),
	DIARIA("Diária"),
	SEMANAL("Semanal"),
	MENSAL("Mensal");
	
	private String meta;
	
	PeriodoMeta(String meta) {
		this.meta = meta;
	}

	public String getMeta() {
		return meta;
	}
}
