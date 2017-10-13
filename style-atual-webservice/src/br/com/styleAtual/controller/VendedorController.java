 package br.com.styleAtual.controller;

import java.util.List;

//import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.styleAtual.model.doman.Vendedor;
import br.com.styleAtual.service.IVendedorService;
import br.com.styleAtual.service.VendedorService;

@Controller
@RequestMapping("vendedor")
//@Path(value = "/vendedor")
public class VendedorController {

	//@Autowired
	private IVendedorService vendedorService = new VendedorService();
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public @ResponseBody List<Vendedor> getAll() {
		List<Vendedor> vendedores = vendedorService.getAll();
		
		return vendedores;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public @ResponseBody Vendedor save(@RequestBody Vendedor vendedor) {
		vendedorService.save(vendedor);
		return vendedor;
	}
}
