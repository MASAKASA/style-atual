package br.com.styleAtual.model.dao;

import java.util.List;

/**
 * 
 * @author MARCIO
 *
 * @param <O>
 * @param <I>
 * @param <S>
 * @param <L>
 */
public interface InterfaceDao <O,I,S,L>{

	/**
	 * 
	 * @param object
	 * @return
	 */
	public void save(O object);
	
	/**
	 * 
	 * @param object
	 * @return
	 */
	public O update(O object);
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws DAOException
	 */
	public O delete(L id);// throws DAOException;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws DAOException
	 */
	public O getById(L id);// throws DAOException;
	
	/**
	 * 
	 * @param firsResult
	 * @param maxResult
	 * @return
	 * @throws DAOException
	 */
	public List<O> getByPagination(I firsResult, I maxResult);// throws DAOException;
	
	/**
	 * 
	 * @param name
	 * @return
	 * @throws DAOException
	 */
	public List<O> getByName(S name);// throws DAOException;
	
	/**
	 * 
	 * @return
	 * @throws DAOException
	 */
	public List<O> getAll();// throws DAOException;
	
	/**
	 * 
	 * @param object
	 * @return
	 */
	public Boolean objectIsValid(O object);
}
