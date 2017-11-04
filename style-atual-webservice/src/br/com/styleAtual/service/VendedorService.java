package br.com.styleAtual.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.styleAtual.model.dao.InterfaceDao;
import br.com.styleAtual.model.domain.Vendedor;

@Service //Anotacao que essa classe vai ser da camada de servico
public class VendedorService implements InterfaceService<Vendedor, Integer, String, Long>{

	@Autowired //Injecao de depentencia do Spring
	private InterfaceDao<Vendedor, Integer, String, Long> vendedorDao;

	@Override
	public void  save(Vendedor vendedor) {
		// TODO Auto-generated method stub
		vendedorDao.save(vendedor);
	}

	@Override
	public void update(Vendedor vendedor) {
		// TODO Auto-generated method stub
		vendedorDao.update(vendedor);
	}

	@Override
	public String delete(Long id) {
		// TODO Auto-generated method stub
		vendedorDao.delete(id);
		String mensagen = "Vendedor excluído com sucesso!";
		return mensagen;
	}

	@Override
	public Vendedor getById(Long id) {
		// TODO Auto-generated method stub
		
		//Exemplo para saber se vendedor é valido do banco de dados
		//Teste realizado direto no dao e colado trexo do código aqui 
//		Vendedor vendedor = new Vendedor();
//		vendedor.setId(id);
//		if (vendedorDao.objectIsValid(vendedor)) {
//			System.out.println(vendedor.getId() + " id não válido");
//		}
		return vendedorDao.getById(id);
	}

	@Override
	public List<Vendedor> getByPagination(Integer firsResult, Integer maxResult) {
		// TODO Auto-generated method stub
		return vendedorDao.getByPagination(firsResult, maxResult);
	}

	@Override
	public List<Vendedor> getByName(String name) {
		// TODO Auto-generated method stub
		return vendedorDao.getByName(name);
	}

	@Override
	public List<Vendedor> getAll() {
		// TODO Auto-generated method stub
		return vendedorDao.getAll();
	}	
}
