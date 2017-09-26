package br.com.styleAtual.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.styleAtual.controller.resources.beans.EnumVendedorMeta;

@Entity
public class Vendedor extends Usuario {
	
	@DecimalMin("0.01")
	private Float salario;

	@DecimalMin("0.00")
	private Float comissao;
	
	@DecimalMin("0.00")
	private Float metaDeVenda;
	
	@DecimalMin("0.00")
	private Float bonus;
	
	@NotNull
	private EnumVendedorMeta periodoMeta;
	
	public Vendedor() {
		super();
	}

	public Vendedor(Float salario, Float comissao, Float metaDeVenda, Float bonus,
			EnumVendedorMeta periodoMeta) {
		super();
		this.salario = salario;
		this.comissao = comissao;
		this.metaDeVenda = metaDeVenda;
		this.bonus = bonus;
		this.periodoMeta = periodoMeta;
	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}

	public Float getComissao() {
		return comissao;
	}

	public void setComissao(Float comissao) {
		this.comissao = comissao;
	}

	public Float getMetaDeVenda() {
		return metaDeVenda;
	}

	public void setMetaDeVenda(Float metaDeVenda) {
		this.metaDeVenda = metaDeVenda;
	}

	public Float getBonus() {
		return bonus;
	}

	public void setBonus(Float bonus) {
		this.bonus = bonus;
	}

	public EnumVendedorMeta getPeriodoMeta() {
		return periodoMeta;
	}

	public void setPeriodoMeta(EnumVendedorMeta periodoMeta) {
		this.periodoMeta = periodoMeta;
	}

	@Override
	public String toString() {
		
		return "Vendedor \n"
						+ "id = " + getId() + ";\n"
						+ "nome = " + getNome() + ";\n"
						+ "salario = " + getSalario() + ";\n"
						+ "comissao = " + getComissao() + ";\n"
						+ "metaDeVenda = " + getMetaDeVenda() + ";\n"
						+ "bonus = " + getBonus() + ";\n"
						+ "periodoMeta = " + getPeriodoMeta().getMeta() +".\n";
	}
}
