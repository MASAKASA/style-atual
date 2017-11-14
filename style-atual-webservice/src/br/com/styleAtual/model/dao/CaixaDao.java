package br.com.styleAtual.model.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.styleAtual.exceptions.WebServiceException;
import br.com.styleAtual.model.domain.Caixa;

@Repository //Anotação de repositório
@Transactional //Classe não somente de leitura
public class CaixaDao implements InterfaceDao<Caixa, Integer, String, Date>{

	@PersistenceContext //Anotacao que gerencia toda as transacoes do banco
	private EntityManager entityManager;
	
	@Override
	public void save(Caixa caixa) throws WebServiceException {
		entityManager.persist(caixa);
	}

	@Override
	public void update(Caixa caixa) throws WebServiceException {
		Caixa caixaManaged = entityManager.find(Caixa.class, caixa.getData());
		
		caixaManaged.setHoraAbertura(caixa.getHoraAbertura());
		caixaManaged.setHoraFechamento(caixa.getHoraFechamento());
		caixaManaged.setSaldoFinal(caixa.getSaldoFinal());
		caixaManaged.setSaldoInicial(caixa.getSaldoInicial());
		caixaManaged.setStatusCaixa(caixa.getStatusCaixa());
	}

	@Override
	public void delete(Date data) throws WebServiceException {
		entityManager.remove(entityManager.getReference(Caixa.class, data));
		
	}

	@Transactional(readOnly = true) //método somente de leitura
	@Override
	public Caixa getById(Date data) throws WebServiceException {
		String jpql = "from Caixa c where c.data = :data";
		TypedQuery<Caixa> query = entityManager.createQuery(jpql, Caixa.class);
		query.setParameter("data",data);
		
		return query.getSingleResult();
	}

	@Transactional(readOnly = true)
	@Override
	public List<Caixa> getByPagination(Integer firsResult, Integer maxResult) throws WebServiceException {
		List<Caixa> caixas;
		String jpql = "from Caixa c";
		caixas = entityManager.createQuery(jpql, Caixa.class)
				.setFirstResult(firsResult - 1)
				.setMaxResults(maxResult)
				.getResultList();
		return caixas;
	}

	//MÉTODO GET BY NAME NÃO EXISTE EM CAIXA
	@Transactional(readOnly = true)
	@Override
	public List<Caixa> getByName(String name) throws WebServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(readOnly=true)
	@Override
	public List<Caixa> getAll() throws WebServiceException {
		String jpql = "from Caixa c";
		TypedQuery<Caixa> query = entityManager.createQuery(jpql, Caixa.class);
		
		return query.getResultList();
	}

	@Override
	public Boolean objectIsValid(Caixa caixa) throws WebServiceException {
		boolean isValid = false;
		String jpql = "from Caixa c where c.data = :data";
		TypedQuery<Caixa> query = entityManager.createQuery(jpql, Caixa.class);
		query.setParameter("data", caixa.getData());
		if(query.getResultList().isEmpty()) {
			isValid = true;
		}
		return isValid;
	}
}
