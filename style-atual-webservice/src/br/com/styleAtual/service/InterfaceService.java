package br.com.styleAtual.service;

import java.util.List;

/**
 * 
 * @author MARCIO
 *
 * @param <O> Objeto o qual vai ser realizado os servi�os
 * @param <I> V�o ser dois valor int para pesquisa com pagina��o: firsResult para primeiro
 *  resultado e maxResult para quantidade de retorno
 * @param <S> String para pesquisa por nome do objeto
 * @param <L> Long para pesquisa por chave primaria do objeto
 */
public interface InterfaceService <O,I,S,L>{

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
	 * @param Long id do objeto para realiza��o de delete no banco de dados 
	 * @return String com confirma��o de opera��o
	 */
	public S delete(L id);
	
	/**
	 * 
	 * @param Long id do objeto para pesquisa no banco de dados 
	 * @return Objeto da pesquisa no banco de dados
	 */
	public O getById(L id);
	
	/**
	 * 
	 * @param Integer firsResult para primeiro resultado da pesquisa no banco de dados
	 * @param Integer maxResult para total de resultado da pesquisa no banco de dados 
	 * @return Lista com objetos da pesquisa no banco e dados
	 */
	public List<O> getByPagination(I firsResult, I maxResult);
	
	/**
	 * 
	 * @param String com o nome do objeto para pesquisa no banco de dados 
	 * @return Lista com objetos da pesquisa no banco e dados
	 */
	public List<O> getByName(S name);
	
	/**
	 * 
	 * @return Lista com todos objetos da pesquisa no banco e dados
	 */
	public List<O> getAll();
}
