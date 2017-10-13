package br.com.styleAtual.model.dao;

import java.util.LinkedList;
import java.util.List;

import br.com.styleAtual.model.doman.Vendedor;

public class VendedorDao implements IVendedorDao {

	private static List<Vendedor> us;
	
	public VendedorDao() {
		createUserList();
	}

    private List<Vendedor> createUserList() {
        if (us == null) {
            us = new LinkedList<Vendedor>();
            us.add(new Vendedor(System.currentTimeMillis()+1L, "Marcio"));
 
        }
        return us;
    }
	
	public List<Vendedor> gelAll() {
		return us;
	}
	
	public void save(Vendedor vendedor) {
		us.add(vendedor);
	}
}
