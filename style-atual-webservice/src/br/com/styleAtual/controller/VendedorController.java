package br.com.styleAtual.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.styleAtual.exceptions.ErrorCode;
import br.com.styleAtual.exceptions.WebServiceException;
import br.com.styleAtual.model.domain.Vendedor;
import br.com.styleAtual.service.InterfaceService;

@Controller //Anotacao informando que essa classe vai ser da camada de controle com comandos rest
@RequestMapping("vendedor") //Mapiamneto Rest para o Spring poder encontrar o controlador certo[http://localhost:8080/style-atual-webservice/vendedor]
public class VendedorController implements InterfaceController<Vendedor, Integer, String, Long>{

	//@Autowired //Injecao de depentencia
	private InterfaceService<Vendedor, Integer, String, Long> vendedorService;
	
	@Override
	@RequestMapping(value = "/save", method = RequestMethod.POST) //Mapiamneto Rest para o Spring poder encontrar o metodo no certo[http://localhost:8080/style-atual-webservice/vendedor/save]. Tambem informando que a requisicao vai ser via POST
	public ResponseEntity<Vendedor> save(@Valid @RequestBody Vendedor vendedor) { //@ResponseEntity para informar que o envio e o retorno vai em SJon no Body. @Valid para que o Hibernate-validator valida o objeto em relacao as anotacoes colocadas na entidade
		try {
			vendedorService.save(vendedor);
		}catch (NullPointerException ex) {
			throw new WebServiceException("Vendedor com dados incompletos.", 
					ErrorCode.BAD_REQUEST.getCode());
		} catch (RuntimeException ex) {
			throw new WebServiceException("Vendedor com dados incompletos.", 
					ErrorCode.BAD_REQUEST.getCode());
		}
		return new ResponseEntity<Vendedor>(vendedor, HttpStatus.CREATED);
	}

	@Override
	@RequestMapping(value = "/update" , method = RequestMethod.PUT)//Mapiamneto Rest para o Spring poder encontrar o metodo no certo[http://localhost:8080/style-atual-webservice/vendedor/update]. Tambem informando que a requisicao vai ser via PUT
	public ResponseEntity<Vendedor> update(@Valid @RequestBody Vendedor vendedor) {//@ResponseEntity para informar que o  envio e o retorno vai em SJon no Body. @Valid para que o Hibernate-validator valida o objeto em relacao as anotacoes colocadas na entidade
		try {
			vendedorService.update(vendedor);
		} catch (NullPointerException ex) {
			throw new WebServiceException("Vendedor informado para atualização não existe: " 
					+ ex.getMessage(), ErrorCode.NOT_FOUND.getCode());
		} catch (RuntimeException ex) {
			throw new WebServiceException("Erro ao atualizar vendedor no banco de dados: " 
					+ ex.getMessage(), ErrorCode.SERVER_ERROR.getCode());
		}
		return new ResponseEntity<Vendedor>(vendedor, HttpStatus.NO_CONTENT);
	}

	@Override
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)//Mapiamneto Rest para o Spring poder encontrar o metodo no certo com parametro na requisicao[http://localhost:8080/style-atual-webservice/vendedor/delete/{id}]. Tambem informando que a requisicao vai ser via DELETE
	public ResponseEntity<Vendedor> delete(@PathVariable("id") Long id) {//@ResponseEntity para informar que o retorno vai em SJon no Body. @PathVariable Parametro da requisicao REST
		Vendedor vendedor = null;
		try {
			vendedor = vendedorService.getById(id);//Escolhi por retornar o objeto deletado
			vendedorService.delete(id);
		} catch (IllegalArgumentException ex) {
			throw new WebServiceException("Vendedor informado para remoção não existe: " + ex.getMessage(), ErrorCode.NOT_FOUND.getCode());
		} catch (RuntimeException ex) {
			throw new WebServiceException("Vendedor não cadastrado.", ErrorCode.NOT_FOUND.getCode());
		}
		return new ResponseEntity<Vendedor>(vendedor, HttpStatus.NO_CONTENT);
	}

	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)//Mapiamneto Rest para o Spring poder encontrar o metodo no certo com parametro na requisicao[http://localhost:8080/style-atual-webservice/vendedor/{id}]. Tambem informando que a requisicao vai ser via GET
	public ResponseEntity<Vendedor> getById(@PathVariable("id") Long id) {//@ResponseEntity para informar que o retorno vai em SJon no Body. @PathVariable Parametro da requisicao REST
		Vendedor vendedor = null;
		try {
			vendedor = vendedorService.getById(id);
		} catch (RuntimeException ex) {
			throw new WebServiceException("Erro ao buscar vendedor por id no banco de dados: " 
					+ ex.getMessage(), ErrorCode.SERVER_ERROR.getCode());
		}
		return new ResponseEntity<Vendedor>(vendedor, HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/pagination", method = RequestMethod.GET)//Mapiamneto Rest para o Spring poder encontrar o metodo no certo com dois parametros na requisicao[http://localhost:8080/style-atual-webservice/vendedor/pagination?firsResult=1&maxResult=3]. Tambem informando que a requisicao vai ser via GET
	public ResponseEntity<List<Vendedor>> getByPagination(@RequestParam("firsResult") Integer firsResult, 
			@RequestParam("maxResult") Integer maxResult) {//@ResponseEntity para informar que o retorno vai em SJon no Body. @RequestParam Parametros embutido na requisicao sem criar outra requisicao REST
		List<Vendedor> vendedores = null;
		try {
			vendedores = vendedorService.getByPagination(firsResult, maxResult);
		} catch (RuntimeException ex) {
			throw new WebServiceException("Erro ao buscar Vendedores no banco de dados: " 
					+ ex.getMessage(), ErrorCode.SERVER_ERROR.getCode());
		}
		if (vendedores.isEmpty()) {
			throw new WebServiceException("Página com vendedores vazia.", ErrorCode.NOT_FOUND.getCode());
		}
		return new ResponseEntity<List<Vendedor>>(vendedores, HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "", method = RequestMethod.GET)//Mapiamneto Rest para o Spring poder encontrar o metodo no certo com parametro na requisicao[http://localhost:8080/style-atual-webservice/vendedor?name=andre]. Tambem informando que a requisicao vai ser via GET
	public ResponseEntity<List<Vendedor>> getByName(@RequestParam("name") String name) {//@ResponseEntity para informar que o retorno vai em SJon no Body. @RequestParam Parametro embutido na requisicao sem criar outra requisicao REST
		List<Vendedor> vendedores = null;
		try {
			vendedores = vendedorService.getByName(name);
		} catch (RuntimeException ex) {
			throw new WebServiceException("Erro ao buscar vendedores por nome no banco de dados: " 
					+ ex.getMessage(), ErrorCode.SERVER_ERROR.getCode());
		}
		if (vendedores.isEmpty()) {
			throw new WebServiceException("A consulta não encontrou vendedores.", ErrorCode.NOT_FOUND.getCode());
		}
		
		return new ResponseEntity<List<Vendedor>>(vendedores, HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)//Mapiamneto Rest para o Spring poder encontrar o metodo no certo[http://localhost:8080/style-atual-webservice/vendedor/getAll]. Tambem informando que a requisicao vai ser via GET
	public ResponseEntity<List<Vendedor>> getAll() {//@ResponseEntity para informar que o retorno vai em SJon no Body
		List<Vendedor> vendedores = null;
		try {
			vendedores = vendedorService.getAll();
		} catch (RuntimeException ex) {
			throw new WebServiceException("Erro ao recuperar todos os vendedores do banco: " 
					+ ex.getMessage(), ErrorCode.SERVER_ERROR.getCode());
		}
		if (vendedores.isEmpty()) {
			throw new WebServiceException("A consulta não encontrou vendedores.", 
					ErrorCode.NOT_FOUND.getCode());
		}
		return new ResponseEntity<List<Vendedor>>(vendedores, HttpStatus.OK);
	}
}