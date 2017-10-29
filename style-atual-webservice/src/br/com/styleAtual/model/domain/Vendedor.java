package br.com.styleAtual.model.domain;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;

@Entity
@DiscriminatorValue(value = "V")
public class Vendedor extends Usuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6292020341014976133L;

	@DecimalMin("0.01")
	@Column(name="salario_vendedor")
	private Double salario;

	@DecimalMin("0.00")
	@Column(name="comissao_vendedor")
	private Double comissao;
	
	@DecimalMin("0.00")
	@Column(name="meta_vendedor")
	private Double meta;
	
	@DecimalMin("0.00")
	@Column(name="bonus_vendedor")
	private Double bonus;
	
	@Enumerated(EnumType.STRING)
	private EPeriodoMeta periodoMeta;
	
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

	public void setMetaDeVenda(Double meta) {
		this.meta = meta;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	public EPeriodoMeta getPeriodoMeta() {
		return periodoMeta;
	}

	public void setPeriodoMeta(EPeriodoMeta periodoMeta) {
		this.periodoMeta = periodoMeta;
	}
}
