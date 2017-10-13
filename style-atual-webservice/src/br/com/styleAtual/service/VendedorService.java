package br.com.styleAtual.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import br.com.styleAtual.model.dao.IVendedorDao;
import br.com.styleAtual.model.dao.VendedorDao;
import br.com.styleAtual.model.doman.Vendedor;

@Service
//@Transactional
public class VendedorService implements IVendedorService {

	private IVendedorDao vendedorDao = new VendedorDao();
	
//	@Autowired
//	public void setVendedorDao(VendedorDao vendedorDao) {
//		this.vendedorDao = vendedorDao;
//	}
	
	public List<Vendedor> getAll() {
		return vendedorDao.gelAll();
	}
	
	public void save(Vendedor vendedor) {
		vendedorDao.save(vendedor);
	}
}
