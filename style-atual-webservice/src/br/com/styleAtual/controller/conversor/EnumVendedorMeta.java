package br.com.styleAtual.controller.conversor;

public enum EnumVendedorMeta {

	SEM_META("Sem mata"),
	DIARIA("Di�ria"),
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
