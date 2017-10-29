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
public class VendedorController {

	@Autowired
	private InterfaceService<Vendedor, Integer, String, Long> vendedorService;
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public @ResponseBody List<Vendedor> getAll() {
		List<Vendedor> vendedores = vendedorService.getAll();
		return vendedores;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public @ResponseBody Vendedor save(@Valid @RequestBody Vendedor vendedor) {
		vendedorService.save(vendedor);
		return vendedor;
	}
}
