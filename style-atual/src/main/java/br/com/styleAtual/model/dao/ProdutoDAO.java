package br.com.styleAtual.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.styleAtual.exceptions.DAOException;
import br.com.styleAtual.model.domain.Produto;

@Repository
public class ProdutoDAO implements InterfaceDAO<Produto, Integer, String, Long>{

	@Override
	public Produto save(Produto object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto update(Produto object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto delete(Long id) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto getById(Long id) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> getByPagination(Integer firsResult, Integer maxResult) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> getByName(String name) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> getAll() throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean objectIsValid(Produto object) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
