package br.com.styleAtual.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

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
public interface InterfaceController <O,I,S,L>{

	/**
	 * 
	 * @param Object para ser salvo no banco de dados 
	 */
	public ResponseEntity<O> save(O object);
	
	/**
	 * 
	 * @param Object para ser atualizado no banco de dados
	 */
	public ResponseEntity<O> update(O object);
	
	/**
	 * 
	 * @param Long id do objeto para realização de delete no banco de dados 
	 */
	public ResponseEntity<O> delete(L id);
	
	/**
	 * 
	 * @param Long id do objeto para pesquisa no banco de dados 
	 * @return Objeto da pesquisa no banco de dados
	 */
	public ResponseEntity<O> getById(L id);
	
	/**
	 * 
	 * @param Integer firsResult para primeiro resultado da pesquisa no banco de dados
	 * @param Integer maxResult para total de resultado da pesquisa no banco de dados 
	 * @return Lista com objetos da pesquisa no banco e dados
	 */
	public ResponseEntity<List<O>> getByPagination(I firsResult, I maxResult);
	
	/**
	 * 
	 * @param String com o nome do objeto para pesquisa no banco de dados 
	 * @return Lista com objetos da pesquisa no banco e dados
	 */
	public ResponseEntity<List<O>> getByName(S name);
	
	/**
	 * 
	 * @return Lista com todos objetos da pesquisa no banco e dados
	 */
	public ResponseEntity<List<O>> getAll();
}
