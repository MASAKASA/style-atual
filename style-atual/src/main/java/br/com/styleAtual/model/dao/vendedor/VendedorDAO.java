package br.com.styleAtual.model.dao.vendedor;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.styleAtual.exceptions.DAOException;
import br.com.styleAtual.exceptions.ErroCode;
import br.com.styleAtual.model.dao.JPAUtil;
import br.com.styleAtual.model.domain.vendedor.Vendedor;

public class VendedorDAO implements IVendedorDAO{

	private EntityManager em;
	private List<Vendedor> vendedores;
	private Vendedor vendedor;
	
	public VendedorDAO() {
		super();
		this.em =JPAUtil.getEntityManager();
		this.vendedores = new ArrayList<Vendedor>();
		this.vendedor = new Vendedor();
	}
	
	@Override
	public void save(Vendedor vendedor) {
		try {
			em.getTransaction().begin();
			em.persist(vendedor);
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			em.getTransaction().rollback();
			throw new DAOException("Erro ao salvar dados no banco!", ErroCode.BAD_REQUEST.getCode());
		} finally {
			em.close();
		}
	}
	@Override
	public void update(Vendedor vendedor) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(Long id) throws DAOException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Vendedor getById(Long id) throws DAOException {
		try {
			vendedor = em.find(Vendedor.class, id);
		} finally {
			em.close();
		}
		return vendedor;
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
	@Override
	public List<Vendedor> getAll() throws DAOException {
		try {
			vendedores = em.createQuery("select p from vendedor p", Vendedor.class).getResultList();
		} finally {
			em.close();
		}
		return vendedores;
	}
	@Override
	public Boolean vendedorIsValid(Vendedor vendedor) {
		// TODO Auto-generated method stub
		return null;
	}
}
