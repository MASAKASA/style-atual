package br.com.styleAtual.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.styleAtual.model.domain.Vendedor;

@Repository
@Transactional
public class VendedorDao implements InterfaceDao<Vendedor, Integer, String, Long>{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void save(Vendedor vendedor) {
		entityManager.persist(vendedor);
	}
	
	@Override
	public void update(Vendedor vendedor) {
		entityManager.merge(vendedor);
	}
	
	@Override
	public void delete(Long id) {// throws DAOException {
		entityManager.remove(entityManager.getReference(Vendedor.class, id));
	}
	
	@Transactional(readOnly = true)
	@Override
	public Vendedor getById(Long id) {// throws DAOException {
		String jpql = "from Vendedor v where v.id = :id";
		TypedQuery<Vendedor> query = entityManager.createQuery(jpql, Vendedor.class);
		query.setParameter("id", id);
		return query.getSingleResult();
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Vendedor> getByPagination(Integer firsResult, Integer maxResult){// throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Vendedor> getByName(String name){// throws DAOException {
		//String jpql = "from Vendedor v where v.nome like :name or u.sobrenome like :sobrenome";
		String jpql = "from Vendedor v where v.nome like :name";
		TypedQuery<Vendedor> query = entityManager.createQuery(jpql, Vendedor.class);
		query.setParameter("name", "%"+name+"%");
		//query.setParameter("sobrenome", "%"+name+"%");
		return query.getResultList();
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Vendedor> getAll(){// throws DAOException {
		String jpql = "from Vendedor u";
		TypedQuery<Vendedor> query = entityManager.createQuery(jpql, Vendedor.class);
		
		return query.getResultList();
	}
	
	@Override
	public Boolean objectIsValid(Vendedor vendedor) {
		// TODO Auto-generated method stub
		return null;
	}
}
