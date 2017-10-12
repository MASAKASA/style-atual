//package br.com.styleAtual.service;
//
//import java.util.List;
//
//import br.com.styleAtual.model.dao.InterfaceDAO;
//import br.com.styleAtual.model.dao.VendedorDAO;
//import br.com.styleAtual.model.domain.Vendedor;
//
//public class VendedorService implements InterfaceService<Vendedor, Integer, String, Long>{
//
//	private InterfaceDAO vendedorDAO;
//
//	public VendedorService() {
//		super();
//		vendedorDAO = new VendedorDAO();
//	}
//
//	@Override
//	public Vendedor save(Vendedor vendedor) {
//		return (Vendedor) vendedorDAO.save(vendedor);
//	}
//
//	@Override
//	public Vendedor update(Vendedor vendedor) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Vendedor delete(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Vendedor getById(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Vendedor> getByPagination(Integer firsResult, Integer maxResult) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Vendedor> getByName(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Vendedor> getAll() {
//		return vendedorDAO.getAll();
//	}
//
//	@Override
//	public Boolean objectIsValid(Vendedor vendedor) {
//		// TODO Auto-generated method stub
//		return null;
//	}	
//}
