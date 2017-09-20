package br.com.styleAtual.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.styleAtual.model.domain.vendedor.Vendedor;

@Controller
@RequestMapping("vendedor")
public class VendedorController {

	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	public List<Vendedor> lista() {
		
		// TODO terminar implementação
		return null;
	}
	
}
