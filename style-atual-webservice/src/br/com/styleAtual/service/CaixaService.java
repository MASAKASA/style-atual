package br.com.styleAtual.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.styleAtual.exceptions.WebServiceException;
import br.com.styleAtual.model.dao.InterfaceDao;
import br.com.styleAtual.model.domain.Caixa;

public class CaixaService implements InterfaceService<Caixa, Integer, String, Date> {

	@Autowired //Injecao de depentencia do Spring
	private InterfaceDao<Caixa, Integer, String, Long> caixaDao;
	
	@Override
	public void save(Caixa caixa) throws WebServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Caixa caixa) throws WebServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Date id) throws WebServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Caixa getById(Date id) throws WebServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Caixa> getByPagination(Integer firsResult, Integer maxResult) throws WebServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Caixa> getByName(String name) throws WebServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Caixa> getAll() throws WebServiceException {
		// TODO Auto-generated method stub
		return null;
	}

}
