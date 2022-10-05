package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	public void add(Product product) throws Exception {
		//business rules
		if(product.getUnitPrice()<10) {
			throw new Exception("Price cannot be less than 10.");
		}
		
		JdbcProductDao productDao = new JdbcProductDao();
		productDao.add(product);
	}
}
