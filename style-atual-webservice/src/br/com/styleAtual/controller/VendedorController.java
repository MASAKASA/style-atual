package br.com.styleAtual.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	public Vendedor update(@Valid @RequestBody Vendedor vendedor) {
		// TODO Faltando implementação
		vendedorService.update(vendedor);
		return vendedor;
	}

	@Override
	public String delete(Long id) {
		// TODO Faltando implementação
		vendedorService.delete(id);
		String mensagen = "Vendedor excluído com sucesso!";
		return mensagen;
	}

	@Override
	public Vendedor getById(Long id) {
		// TODO Faltando implementação
		return vendedorService.getById(id);
	}

	@Override
	public List<Vendedor> getByPagination(Integer firsResult, Integer maxResult) {
		// TODO Faltando implementação
		return null;
	}

	@Override
	public List<Vendedor> getByName(@QueryP String name) {
		// TODO Faltando implementação
		return null;
	}
	
	@Override
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public @ResponseBody List<Vendedor> getAll() {
		List<Vendedor> vendedores = vendedorService.getAll();
		return vendedores;
	}
}
