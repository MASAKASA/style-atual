package br.com.styleAtual.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.styleAtual.model.domain.Vendedor;
import br.com.styleAtual.service.InterfaceService;

@Controller //anotacao informando que essa classe vai ser da camada de controle
@RequestMapping("vendedor") //Mapiamneto Rest para o Spring poder encontrar o controlador certo[http://localhost:8080/style-atual-webservice/vendedor] 
public class VendedorController implements InterfaceController<Vendedor, Integer, String, Long>{

	@Autowired //Injecao de depentencia
	private InterfaceService<Vendedor, Integer, String, Long> vendedorService;
	
	@Override
	@RequestMapping(value = "/save", method = RequestMethod.POST) //Mapiamneto Rest para o Spring poder encontrar o metodo no certo[http://localhost:8080/style-atual-webservice/vendedor/save]. Tambem informando que a requisicao vai ser via POST
	public @ResponseBody Vendedor save(@Valid @RequestBody Vendedor vendedor) { //@ResponseBody para informar que o envio e o retorno vai em SJon no Body. @Valid para que o Hibernate-validator valida o objeto em relacao as anotacoes colocadas na entidade
		vendedorService.save(vendedor);
		return vendedor;
	}

	@Override
	@RequestMapping(value = "/update" , method = RequestMethod.PUT)//Mapiamneto Rest para o Spring poder encontrar o metodo no certo[http://localhost:8080/style-atual-webservice/vendedor/update]. Tambem informando que a requisicao vai ser via PUT
	public @ResponseBody Vendedor update(@Valid @RequestBody Vendedor vendedor) {//@ResponseBody para informar que o  envio e o retorno vai em SJon no Body. @Valid para que o Hibernate-validator valida o objeto em relacao as anotacoes colocadas na entidade
		vendedorService.update(vendedor);
		return vendedor;
	}

	@Override
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)//Mapiamneto Rest para o Spring poder encontrar o metodo no certo com parametro na requisicao[http://localhost:8080/style-atual-webservice/vendedor/delete/{id}]. Tambem informando que a requisicao vai ser via DELETE
	public @ResponseBody String delete(@PathVariable("id") Long id) {//@ResponseBody para informar que o retorno vai em SJon no Body. @PathVariable Parametro da requisicao REST
		return vendedorService.delete(id);
	}

	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)//Mapiamneto Rest para o Spring poder encontrar o metodo no certo com parametro na requisicao[http://localhost:8080/style-atual-webservice/vendedor/{id}]. Tambem informando que a requisicao vai ser via GET
	public @ResponseBody Vendedor getById(@PathVariable("id") Long id) {//@ResponseBody para informar que o retorno vai em SJon no Body. @PathVariable Parametro da requisicao REST
		return vendedorService.getById(id);
	}

	@Override
	@RequestMapping(value = "/pagination", method = RequestMethod.GET)//Mapiamneto Rest para o Spring poder encontrar o metodo no certo com dois parametros na requisicao[http://localhost:8080/style-atual-webservice/vendedor/pagination?firsResult=1&maxResult=3]. Tambem informando que a requisicao vai ser via GET
	public @ResponseBody List<Vendedor> getByPagination(@RequestParam("firsResult") Integer firsResult, 
			@RequestParam("maxResult") Integer maxResult) {//@ResponseBody para informar que o retorno vai em SJon no Body. @RequestParam Parametros embutido na requisicao sem criar outra requisicao REST
		return vendedorService.getByPagination(firsResult, maxResult);
	}

	@Override
	@RequestMapping(value = "", method = RequestMethod.GET)//Mapiamneto Rest para o Spring poder encontrar o metodo no certo com parametro na requisicao[http://localhost:8080/style-atual-webservice/vendedor?name=andre]. Tambem informando que a requisicao vai ser via GET
	public @ResponseBody List<Vendedor> getByName(@RequestParam("name") String name) {//@ResponseBody para informar que o retorno vai em SJon no Body. @RequestParam Parametro embutido na requisicao sem criar outra requisicao REST
		return vendedorService.getByName(name);
	}
	
	@Override
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)//Mapiamneto Rest para o Spring poder encontrar o metodo no certo[http://localhost:8080/style-atual-webservice/vendedor/getAll]. Tambem informando que a requisicao vai ser via GET
	public @ResponseBody List<Vendedor> getAll() {//@ResponseBody para informar que o retorno vai em SJon no Body
		List<Vendedor> vendedores = vendedorService.getAll();
		return vendedores;
	}
}
