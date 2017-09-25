package br.com.styleAtual.exceptions;

public class DAOException extends RuntimeException {

	private static final long serialVersionUID = 2962414431030697487L;
	private Integer code;

	public DAOException(String menssage, Integer code) {
		super(menssage);
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}
}
