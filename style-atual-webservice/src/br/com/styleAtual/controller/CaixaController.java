package br.com.styleAtual.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.styleAtual.model.domain.Caixa;
import br.com.styleAtual.service.InterfaceService;

@Controller //Anotação de Controlador
@RequestMapping("caixa") //Mapeamneto Rest para o Spring poder encontrar o controlador certo[http://localhost:8080/style-atual-webservice/caixa]
public class CaixaController implements InterfaceController<Caixa, Integer, String, Date>{

	@Autowired //Injeção de Dependência
	private InterfaceService<Caixa, Integer, String, Date> caixaService;
	
	
	@Override
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<Caixa> save(@Valid @RequestBody Caixa caixa) {
		caixaService.save(caixa);
		return new ResponseEntity<>(caixa, HttpStatus.CREATED);
	}

	@Override
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseEntity<Caixa> update(@Valid @RequestBody Caixa caixa) {
		caixaService.update(caixa);
		return new ResponseEntity<Caixa>(caixa, HttpStatus.NO_CONTENT);
	}

	
	@Override
	@RequestMapping(value = "/delete/{data}", method = RequestMethod.DELETE)
	public ResponseEntity<Caixa> delete(Date id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "/{data}", method = RequestMethod.GET)
	public ResponseEntity<Caixa> getById(Date id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "/pagination", method = RequestMethod.GET)
	public ResponseEntity<List<Caixa>> getByPagination(Integer firsResult, Integer maxResult) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<Caixa>> getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public ResponseEntity<List<Caixa>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
