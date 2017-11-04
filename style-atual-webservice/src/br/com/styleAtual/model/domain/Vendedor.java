package br.com.styleAtual.model.domain;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;

@Entity //Anotacao para mapiar a entidade no banco
@DiscriminatorValue(value = "V") //Atributo da coluna tipo informando que os dados contidos na linha vai ser de um vendedor 
public class Vendedor extends Usuario implements Serializable {
	
	/**
	 * Serial criado automaticamente. Boa pratica de programação
	 */
	private static final long serialVersionUID = 6292020341014976133L;

	@DecimalMin("0.01") //Menos valor coluna
	@Column(name="salario_vendedor") //Nome da coluna
	private Double salario;

	@DecimalMin("0.00") //Menos valor coluna
	@Column(name="comissao_vendedor") //Nome da coluna
	private Double comissao;
	
	@DecimalMin("0.00") //Menos valor coluna
	@Column(name="meta_vendedor") //Nome da coluna
	private Double meta;
	
	@DecimalMin("0.00") //Menos valor coluna
	@Column(name="bonus_vendedor") //Nome da coluna
	private Double bonus;
	
	@Enumerated(EnumType.STRING) //Informando que no banco os dados da classe Enun seram em String:[SEM_META, DIARIA, SEMANAL ou MENSAL]
	private PeriodoMeta periodoMeta;
	
	public Vendedor() {
		super();
	}

	@Override
	public String toString() {
		
		return "Vendedor [id = " + getId() + ", nome = " + getNome() + ", senha = " + getSenha()
			+ ", salario = " + salario + ", comissao = " + comissao 
			+ ", metaDeVenda = " + meta + ", bonus = " + bonus 
			+ ", periodoMeta = " + getPeriodoMeta().getMeta() +"]";
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public Double getMeta() {
		return meta;
	}

	public void setMeta(Double meta) {
		this.meta = meta;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	public PeriodoMeta getPeriodoMeta() {
		return periodoMeta;
	}

	public void setPeriodoMeta(PeriodoMeta periodoMeta) {
		this.periodoMeta = periodoMeta;
	}
}
