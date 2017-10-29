package br.com.styleAtual.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

public interface InterfaceController <O,I,S,L>{

	public @ResponseBody O save(@Valid @RequestBody O object);
	public @ResponseBody O update(@Valid @RequestBody O object);
	public @ResponseBody S delete(L id);
	public @ResponseBody O getById(L id);
	public @ResponseBody List<O> getByPagination(I firsResult, I maxResult);
	public @ResponseBody List<O> getByName(S name);
	public @ResponseBody List<O> getAll();
}
