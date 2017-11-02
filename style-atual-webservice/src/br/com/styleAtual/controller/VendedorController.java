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

@Controller
@RequestMapping("vendedor")
public class VendedorController implements InterfaceController<Vendedor, Integer, String, Long>{

	@Autowired
	private InterfaceService<Vendedor, Integer, String, Long> vendedorService;
	
	@Override
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public @ResponseBody Vendedor save(@Valid @RequestBody Vendedor vendedor) {
		vendedorService.save(vendedor);
		return vendedor;
	}

	@Override
	@RequestMapping(value = "/update" , method = RequestMethod.PUT)
	public @ResponseBody Vendedor update(@Valid @RequestBody Vendedor vendedor) {
		vendedorService.update(vendedor);
		return vendedor;
	}

	@Override
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public @ResponseBody String delete(@PathVariable("id") Long id) {
		vendedorService.delete(id);
		String mensagen = "Vendedor excluído com sucesso!";
		return mensagen;
	}

	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Vendedor getById(@PathVariable("id") Long id) {
		return vendedorService.getById(id);
	}

	@Override
	@RequestMapping(value = "/pagination", method = RequestMethod.GET)
	public @ResponseBody List<Vendedor> getByPagination(@RequestParam("firsResult") Integer firsResult, 
			@RequestParam("maxResult") Integer maxResult) {
		return vendedorService.getByPagination(firsResult, maxResult);
	}

	@Override
	@RequestMapping(value = "", method = RequestMethod.GET)
	public @ResponseBody List<Vendedor> getByName(@RequestParam("name") String name) {
		return vendedorService.getByName(name);
	}
	
	@Override
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public @ResponseBody List<Vendedor> getAll() {
		List<Vendedor> vendedores = vendedorService.getAll();
		return vendedores;
	}
}
