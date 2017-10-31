package br.com.styleAtual.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public interface InterfaceController <O,I,S,L>{

	public O save(O object);
	public O preUpdate(L id);
	public O update(O object);
	public S delete(L id);
	public O getById(L id);
	public List<O> getByPagination(I firsResult, I maxResult);
	public List<O> getByName(S name);
	public List<O> getAll();
}
