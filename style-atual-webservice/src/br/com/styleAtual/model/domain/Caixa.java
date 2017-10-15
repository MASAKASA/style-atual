package br.com.styleAtual.model.domain;

import java.util.Calendar;
import java.util.Date;

public class Caixa {
	
	//ATRIBUTOS
	private Date data;
	private String status;
	private double saldoInicial;
	private double saldoFinal;
	private Calendar horaAbertura;
	private Calendar horaFechamento;
	//TODO gerente responsável por abrir e fechar
		
	//CONSTRUTOR PADRÃO
	public Caixa() {
		super();
	}
	
	//CONSTRUTOR COM ATRIBUTOS
	public Caixa(Date data, String status, double saldoInicial, double saldoFinal, Calendar horaAbertura,
			Calendar horaFechamento) {
		super();
		this.data = data;
		this.status = status;
		this.saldoInicial = saldoInicial;
		this.saldoFinal = saldoFinal;
		this.horaAbertura = horaAbertura;
		this.horaFechamento = horaFechamento;
	}
	
	//GETTERS E SETTERS
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getSaldoInicial() {
		return saldoInicial;
	}
	public void setSaldoInicial(double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}
	public double getSaldoFinal() {
		return saldoFinal;
	}
	public void setSaldoFinal(double saldoFinal) {
		this.saldoFinal = saldoFinal;
	}
	public Calendar getHoraAbertura() {
		return horaAbertura;
	}
	public void setHoraAbertura(Calendar horaAbertura) {
		this.horaAbertura = horaAbertura;
	}
	public Calendar getHoraFechamento() {
		return horaFechamento;
	}
	public void setHoraFechamento(Calendar horaFechamento) {
		this.horaFechamento = horaFechamento;
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "Caixa [data=" + data + ", status=" + status + ", saldoInicial=" + saldoInicial + ", saldoFinal="
				+ saldoFinal + ", horaAbertura=" + horaAbertura + ", horaFechamento=" + horaFechamento + "]";
	}
	
}
