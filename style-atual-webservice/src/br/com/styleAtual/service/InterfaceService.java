package br.com.styleAtual.service;

import java.util.List;

import br.com.styleAtual.exceptions.WebServiceException;

/**
 * 
 * @author MARCIO
 *
 * @param <O> Objeto o qual vai ser realizado os serviços
 * @param <I> Vão ser dois valor int para pesquisa com paginação: firsResult para primeiro
 *  resultado e maxResult para quantidade de retorno
 * @param <S> String para pesquisa por nome do objeto
 * @param <L> Long para pesquisa por chave primaria do objeto
 */
public interface InterfaceService <O,I,S,L>{

	/**
	 * 
	 * @param Object para ser salvo no banco de dados
	 * @throws WebServiceException captura qualquer exceção de tempo de execução e repassa a responsabilidade para outro camada 
	 */
	public void save(O object) throws WebServiceException;
	
	/**
	 * 
	 * @param Object para ser atualizado no banco de dados
	 * @throws WebServiceException captura qualquer exceção de tempo de execução e repassa a responsabilidade para outro camada
	 */
	public void update(O object) throws WebServiceException;
	
	/**
	 * 
	 * @param Long id do objeto para realização de delete no banco de dados 
	 * @throws WebServiceException captura qualquer exceção de tempo de execução e repassa a responsabilidade para outro camada
	 */
	public void delete(L id) throws WebServiceException;
	
	/**
	 * 
	 * @param Long id do objeto para pesquisa no banco de dados 
	 * @return Objeto da pesquisa no banco de dados
	 * @throws WebServiceException captura qualquer exceção de tempo de execução e repassa a responsabilidade para outro camada
	 */
	public O getById(L id) throws WebServiceException;
	
	/**
	 * 
	 * @param Integer firsResult para primeiro resultado da pesquisa no banco de dados
	 * @param Integer maxResult para total de resultado da pesquisa no banco de dados 
	 * @return Lista com objetos da pesquisa no banco e dados
	 * @throws WebServiceException captura qualquer exceção de tempo de execução e repassa a responsabilidade para outro camada
	 */
	public List<O> getByPagination(I firsResult, I maxResult) throws WebServiceException;
	
	/**
	 * 
	 * @param String com o nome do objeto para pesquisa no banco de dados 
	 * @return Lista com objetos da pesquisa no banco e dados
	 * @throws WebServiceException captura qualquer exceção de tempo de execução e repassa a responsabilidade para outro camada
	 */
	public List<O> getByName(S name) throws WebServiceException;
	
	/**
	 * 
	 * @return Lista com todos objetos da pesquisa no banco e dados
	 * @throws WebServiceException captura qualquer exceção de tempo de execução e repassa a responsabilidade para outro camada
	 */
	public List<O> getAll() throws WebServiceException;
}
