package br.com.styleAtual.service;

import java.util.List;

import br.com.styleAtual.model.doman.Vendedor;

public interface IVendedorService {
	public List<Vendedor> getAll();
	public void save(Vendedor vendedor);
}
