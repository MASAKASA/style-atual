package br.com.styleAtual.controller.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.styleAtual.model.domain.Vendedor;
import br.com.styleAtual.service.InterfaceService;
import br.com.styleAtual.service.VendedorService;

@Controller
@RequestMapping("vendedor")
public class VendedorResources {
	
	private InterfaceService vendedorService = new VendedorService();

	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	public List<Vendedor> lista() {
		return vendedorService.getAll();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public Vendedor save(Vendedor vendedor) {
		return (Vendedor) vendedorService.save(vendedor);
	}
}
