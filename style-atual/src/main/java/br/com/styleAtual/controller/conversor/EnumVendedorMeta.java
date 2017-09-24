package br.com.styleAtual.controller.conversor;

public enum EnumVendedorMeta {

	SemMeta("Sem mata"),
	Diaria("Diária"),
	Semanal("Semanal"),
	Mensal("Mensal");
	
	private String meta;
	
	EnumVendedorMeta(String meta) {
		this.meta = meta;
	}

	public String getMeta() {
		return meta;
	}
}
