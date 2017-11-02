package br.com.styleAtual.service;

import java.util.List;

public interface InterfaceService <O,I,S,L>{

	public void save(O object);
	public void update(O object);
	public void delete(L id);
	public O getById(L id);
	public List<O> getByPagination(I firsResult, I maxResult);
	public List<O> getByName(S name);
	public List<O> getAll();
}
