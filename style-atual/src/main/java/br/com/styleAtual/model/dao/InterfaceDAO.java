package br.com.styleAtual.model.dao;

import java.util.List;

import br.com.styleAtual.exceptions.DAOException;

public interface InterfaceDAO <O,I,S,L>{

	public O save(O object);
	public O update(O object);
	public O delete(L id) throws DAOException;
	public O getById(L id) throws DAOException;
	public List<O> getByPagination(I firsResult, I maxResult) throws DAOException;
	public List<O> getByName(S name) throws DAOException;
	public List<O> getAll() throws DAOException;
	public Boolean objectIsValid(O object);
}
