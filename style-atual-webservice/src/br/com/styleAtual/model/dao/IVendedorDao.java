package br.com.styleAtual.model.dao;

import java.util.List;

import br.com.styleAtual.model.doman.Vendedor;

public interface IVendedorDao {

	public List<Vendedor> gelAll();
	public void save(Vendedor vendedor);
}
