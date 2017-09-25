package br.com.styleAtual.exceptions;

public enum ErroCode {

	BAD_REQUEST(400),
	NOT_FOUND(404),
	SERVER_ERROR(500);
	
	private Integer code;

	ErroCode(Integer code) {
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}
}
