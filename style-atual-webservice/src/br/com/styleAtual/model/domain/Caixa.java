package br.com.styleAtual.model.domain;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Entity //Entidade
@Table(name = "caixa") //Nome da tabela
public class Caixa implements Serializable{
	
	/**
	 * Serial criado automaticamente. Boa prática de programação
	 */
	private static final long serialVersionUID = 4825401393613991083L;
	
	//ATRIBUTOS
	@Id //Id da Tabela
	@Column(name="data_abertura")
	private Date data;
	
	@Enumerated(EnumType.STRING) //Informando que no banco os dados da classe Enun seram em String:[ABERTO ou FECHADO]
	@Column(name="status_caixa")
	private StatusCaixa statusCaixa;

	@NotNull
	@DecimalMin("0.00")
	@Column(name="saldo_inicial")
	private double saldoInicial;
	
	@NotNull
	@DecimalMin("0.00")
	@Column(name="saldo_final")
	private double saldoFinal;
	
	@NotNull
	@Column(name="hora_abertura")
	private Calendar horaAbertura;
	
	@NotNull
	@Column(name="hora_fechamento")
	private Calendar horaFechamento;
	
	//TODO gerente responsÃ¡vel por abrir e fechar
		
	//CONSTRUTOR PADRÃO
	public Caixa() {
		super();
	}
	
	//CONSTRUTOR COM ATRIBUTOS
	public Caixa(Date data, StatusCaixa statusCaixa, double saldoInicial, double saldoFinal, Calendar horaAbertura,
			Calendar horaFechamento) {
		super();
		this.data = data;
		this.statusCaixa = statusCaixa;
		this.saldoInicial = saldoInicial;
		this.saldoFinal = saldoFinal;
		this.horaAbertura = horaAbertura;
		this.horaFechamento = horaFechamento;
	}
	
	//Metodo de boa prática de programação
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		return result;
	}

	//Metodo de boa prática de programação
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Caixa other = (Caixa) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}
	
	//GETTERS E SETTERS
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public StatusCaixa getStatusCaixa() {
		return statusCaixa;
	}
	public void setStatusCaixa(StatusCaixa statusCaixa) {
		this.statusCaixa = statusCaixa;
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
		return "Caixa [data=" + data + ", status=" + getStatusCaixa().getStatus() + ", saldoInicial=" + saldoInicial + ", saldoFinal="
				+ saldoFinal + ", horaAbertura=" + horaAbertura + ", horaFechamento=" + horaFechamento + "]";
	}
	
}
