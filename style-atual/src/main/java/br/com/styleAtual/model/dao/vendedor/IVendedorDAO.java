package br.com.styleAtual.model.dao.vendedor;

import java.util.List;

import br.com.styleAtual.exceptions.DAOException;
import br.com.styleAtual.model.domain.vendedor.Vendedor;

public interface IVendedorDAO {

	public void save(Vendedor vendedor);
	public void update(Vendedor vendedor);
	public void delete(Long id) throws DAOException;
	public Vendedor getById(Long id) throws DAOException;
	public List<Vendedor> getByPagination(Integer firsResult, Integer maxResult) throws DAOException;
	public List<Vendedor> getByName(String name) throws DAOException;
	public List<Vendedor> getAll() throws DAOException;
	public Boolean vendedorIsValid(Vendedor vendedor);
}
