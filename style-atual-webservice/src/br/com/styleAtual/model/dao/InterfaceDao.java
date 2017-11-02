package br.com.styleAtual.model.dao;

import java.util.List;

/**
 * 
 * @author MARCIO
 *
 * @param <O> Objeto o qual vai ser realizado as transações com o banco de dados 
 * @param <I> Vão ser dois valor int para pesquisa com paginação: firsResult para primeiro
 *  resultado e maxResult para quantidade de retorno
 * @param <S> String para pesquisa por nome do objeto
 * @param <L> Long para pesquisa por chave primaria do objeto
 */
public interface InterfaceDao <O,I,S,L>{

	/**
	 * 
	 * @param Object para ser salvo no banco de dados
	 */
	public void save(O object);
	
	/**
	 * 
	 * @param Object para ser atualizado no banco de dados
	 */
	public void update(O object);
	
	/**
	 * 
	 * @param Long id do objeto para realização de delete no banco de dados 
	 * @throws DAOException
	 */
	public void delete(L id);// throws DAOException;
	
	/**
	 * 
	 * @param Long id do objeto para pesquisa no banco de dados 
	 * @return Objeto da pesquisa no banco de dados
	 * @throws DAOException
	 */
	public O getById(L id);// throws DAOException;
	
	/**
	 * 
	 * @param Integer firsResult para primeiro resultado da pesquisa no banco de dados
	 * @param Integer maxResult para total de resultado da pesquisa no banco de dados 
	 * @return Lista com objetos da pesquisa no banco e dados
	 * @throws DAOException
	 */
	public List<O> getByPagination(I firsResult, I maxResult);// throws DAOException;
	
	/**
	 * 
	 * @param String com o nome do objeto para pesquisa no banco de dados 
	 * @return Lista com objetos da pesquisa no banco e dados
	 * @throws DAOException
	 */
	public List<O> getByName(S name);// throws DAOException;
	
	/**
	 * 
	 * @return Lista com todos objetos da pesquisa no banco e dados
	 * @throws DAOException
	 */
	public List<O> getAll();// throws DAOException;
	
	/**
	 * 
	 * @param Object para saber se existe no banco de dados
	 * @return False se o objeto não existe e true se existe no banco de dados
	 */
	public Boolean objectIsValid(O object);
}
