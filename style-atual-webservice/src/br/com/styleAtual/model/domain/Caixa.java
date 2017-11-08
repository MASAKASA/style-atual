package br.com.styleAtual.model.domain;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "caixa") //Nome da tabela
public class Caixa implements Serializable{
	
	/**
	 * Serial criado automaticamente. Boa pr·tica de programaÁ„o
	 */
	private static final long serialVersionUID = 4825401393613991083L;
	
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Estrategia de auto incremento
	@Column(name="data_abertura")
	private Date data;
	
	@NotNull
	@Column(name="status_caixa")
	private String status;
	
	@NotNull
	@Column(name="saldo_inicial")
	private double saldoInicial;
	
	@NotNull
	@Column(name="saldo_final")
	private double saldoFinal;
	
	@NotNull
	@Column(name="hora_abertura")
	private Calendar horaAbertura;
	
	@NotNull
	@Column(name="hora_fechamento")
	private Calendar horaFechamento;
	
	//TODO gerente respons√°vel por abrir e fechar
		
	//CONSTRUTOR PADR√ÉO
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
