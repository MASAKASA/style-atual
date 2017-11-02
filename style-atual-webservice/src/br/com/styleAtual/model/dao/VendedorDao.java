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
		Vendedor vendedorManaged = entityManager.find(Vendedor.class, vendedor.getId());
		
		vendedorManaged.setNome(vendedor.getNome());
		vendedorManaged.setSenha(vendedor.getSenha());
		vendedorManaged.setBonus(vendedor.getBonus());
		vendedorManaged.setComissao(vendedor.getComissao());
		vendedorManaged.setMeta(vendedor.getMeta());
		vendedorManaged.setPeriodoMeta(vendedor.getPeriodoMeta());
		vendedorManaged.setSalario(vendedor.getSalario());
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
		List<Vendedor> vendedores;
		String jpql = "from Vendedor v";
		vendedores = entityManager.createQuery(jpql, Vendedor.class)
				.setFirstResult(firsResult - 1)
				.setMaxResults(maxResult)
				.getResultList();
		return vendedores;
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
		String jpql = "from Vendedor v";
		TypedQuery<Vendedor> query = entityManager.createQuery(jpql, Vendedor.class);
		
		return query.getResultList();
	}
	
	@Override
	public Boolean objectIsValid(Vendedor vendedor) {
		boolean isValid = false;
		String jpql = "from Vendedor v where v.id = :id";
		TypedQuery<Vendedor> query = entityManager.createQuery(jpql, Vendedor.class);
		query.setParameter("id", vendedor.getId());
		if (query.getResultList().isEmpty()) {
			isValid = true;
		}
		return isValid;
	}
}
