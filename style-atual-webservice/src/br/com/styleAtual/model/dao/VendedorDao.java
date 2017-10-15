package br.com.styleAtual.model.dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.styleAtual.exceptions.DAOException;
import br.com.styleAtual.exceptions.ErroCode;
import br.com.styleAtual.model.domain.Vendedor;

@Repository
@Transactional
public class VendedorDao implements InterfaceDao<Vendedor, Integer, String, Long>{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Vendedor save(Vendedor vendedor) {
		try {
			em.persist(vendedor);
		} catch (RuntimeException e) {
			em.getTransaction().rollback();
			throw new DAOException("Erro ao salvar dados no banco!", ErroCode.BAD_REQUEST.getCode());
		}
		return vendedor;
	}
	
	@Override
	public Vendedor update(Vendedor vendedor) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Vendedor delete(Long id) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Vendedor getById(Long id) throws DAOException {
//		try {
//			vendedor = em.find(Vendedor.class, id);
//		} finally {
//			em.close();
//		}
		return null;
	}
	
	@Override
	public List<Vendedor> getByPagination(Integer firsResult, Integer maxResult) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Vendedor> getByName(String name) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Vendedor> getAll() throws DAOException {
		String jpql = "from vendedor u";
		TypedQuery<Vendedor> query = em.createQuery(jpql, Vendedor.class);
		
		return query.getResultList();
	}
	
	@Override
	public Boolean objectIsValid(Vendedor vendedor) {
		// TODO Auto-generated method stub
		return null;
	}
}
