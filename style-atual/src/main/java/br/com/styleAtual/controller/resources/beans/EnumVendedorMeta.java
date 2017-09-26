package br.com.styleAtual.controller.resources.beans;

public enum EnumVendedorMeta {

	SEM_META("Sem mata"),
	DIARIA("Diária"),
	SEMANAL("Semanal"),
	MENSAL("Mensal");
	
	private String meta;
	
	EnumVendedorMeta(String meta) {
		this.meta = meta;
	}

	public String getMeta() {
		return meta;
	}
}
