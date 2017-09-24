package br.com.styleAtual.model.domain.vendedor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.styleAtual.controller.conversor.EnumVendedorMeta;

@Entity
public class Vendedor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 2, max = 255)
	private String nome;
	
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

	public Vendedor(Long id, String nome, Float salario, Float comissao, Float metaDeVenda, Float bonus,
			EnumVendedorMeta periodoMeta) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.comissao = comissao;
		this.metaDeVenda = metaDeVenda;
		this.bonus = bonus;
		this.periodoMeta = periodoMeta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
