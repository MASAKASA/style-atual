package br.com.styleAtual.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.styleAtual.exceptions.DAOException;
import br.com.styleAtual.exceptions.ErroCode;
import br.com.styleAtual.model.dao.InterfaceDao;
import br.com.styleAtual.model.domain.Vendedor;

@Service //Anotacao que essa classe vai ser da camada de servico
public class VendedorService implements InterfaceService<Vendedor, Integer, String, Long>{

	@Autowired //Injecao de depentencia do Spring
	private InterfaceDao<Vendedor, Integer, String, Long> vendedorDao;

	@Override
	public void  save(Vendedor vendedor) {
		// TODO Auto-generated method stub
		try {
			vendedorDao.save(vendedor);
		} catch (RuntimeException ex) {
			//throw new DAOException("Vendedor com dados incompletos.", ErroCode.BAD_REQUEST.getCode());
		}
	}

	@Override
	public void update(Vendedor vendedor) {
		// TODO Auto-generated method stub
		try {
			vendedorDao.update(vendedor);
		} catch (NullPointerException ex) {
//			throw new DAOException("Vendedor informado para atualização não existe: " 
//					+ ex.getMessage(), ErroCode.NOT_FOUND.getCode());
		} catch (RuntimeException ex) {
//			throw new DAOException("Erro ao atualizar vendedor no banco de dados: " 
//					+ ex.getMessage(), ErroCode.SERVER_ERROR.getCode());
		}
		
	}

	@Override
	public String delete(Long id) {
		// TODO Auto-generated method stub
		String mensagen = null;
		try {
			vendedorDao.delete(id);
			mensagen = "Vendedor excluído com sucesso!";
		} catch (IllegalArgumentException ex) {
//			throw new DAOException("Vendedor informado para remoção não existe: " 
//					+ ex.getMessage(), ErroCode.NOT_FOUND.getCode());
		} catch (RuntimeException ex) {
//			throw new DAOException("Erro ao remover vendedor do banco de dados: " 
//					+ ex.getMessage(), ErroCode.SERVER_ERROR.getCode());
		}
		return mensagen;
	}

	@Override
	public Vendedor getById(Long id) {
		//Exemplo para saber se vendedor é valido do banco de dados
		//Teste realizado direto no dao e colado trexo do código aqui 
//		Vendedor vendedor = new Vendedor();
//		vendedor.setId(id);
//		if (vendedorDao.objectIsValid(vendedor)) {
//			System.out.println(vendedor.getId() + " id não válido");
//		}
		
		// TODO Auto-generated method stub
		Vendedor vendedor = null;
		try {
			vendedor = vendedorDao.getById(id);
		} catch (RuntimeException ex) {
//			throw new DAOException("Erro ao buscar vendedor por id no banco de dados: " 
//					+ ex.getMessage(), ErroCode.SERVER_ERROR.getCode());
		}
		return vendedor;
	}

	@Override
	public List<Vendedor> getByPagination(Integer firsResult, Integer maxResult) {
		// TODO Auto-generated method stub
		List<Vendedor> vendedores = null;
		try {
			vendedores = vendedorDao.getByPagination(firsResult, maxResult);
		} catch (RuntimeException ex) {
//			throw new DAOException("Erro ao buscar Vendedores no banco de dados: " 
//					+ ex.getMessage(), ErroCode.SERVER_ERROR.getCode());
		}
		
		if (vendedores.isEmpty()) {
			//throw new DAOException("Página com vendedores vazia.", ErroCode.NOT_FOUND.getCode());
		}
		
		return vendedores;
	}

	@Override
	public List<Vendedor> getByName(String name) {
		// TODO Auto-generated method stub
		List<Vendedor> vendedores = null;
		try {
			vendedores = vendedorDao.getByName(name);
		} catch (RuntimeException ex) {
//			throw new DAOException("Erro ao buscar vendedores por nome no banco de dados: " 
//					+ ex.getMessage(), ErroCode.SERVER_ERROR.getCode());
		}
		
		if (vendedores.isEmpty()) {
			//throw new DAOException("A consulta não encontrou vendedores.", ErroCode.NOT_FOUND.getCode());
		}
		
		return vendedores;
	}

	@Override
	public List<Vendedor> getAll() {
		// TODO Auto-generated method stub
		List<Vendedor> vendedores = null;
		try {
			vendedores = vendedorDao.getAll();
		} catch (RuntimeException ex) {
//			throw new DAOException("Erro ao recuperar todos os vendedores do banco: " 
//					+ ex.getMessage(), ErroCode.SERVER_ERROR.getCode());
		}
		
		if (vendedores.isEmpty()) {
			//throw new DAOException("A consulta não encontrou vendedores.", ErroCode.NOT_FOUND.getCode());
		}
		return vendedores;
	}	
}