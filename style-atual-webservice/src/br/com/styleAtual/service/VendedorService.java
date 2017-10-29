package br.com.styleAtual.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.styleAtual.model.dao.InterfaceDao;
import br.com.styleAtual.model.domain.Vendedor;

@Service
public class VendedorService implements InterfaceService<Vendedor, Integer, String, Long>{

	@Autowired
	private InterfaceDao<Vendedor, Integer, String, Long> vendedorDao;

	@Override
	public void  save(Vendedor vendedor) {
		vendedorDao.save(vendedor);
	}

	@Override
	public Vendedor update(Vendedor vendedor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vendedor delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vendedor getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vendedor> getByPagination(Integer firsResult, Integer maxResult) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vendedor> getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vendedor> getAll() {
		return vendedorDao.getAll();
	}

	@Override
	public Boolean objectIsValid(Vendedor vendedor) {
		// TODO Auto-generated method stub
		return null;
	}	
}
