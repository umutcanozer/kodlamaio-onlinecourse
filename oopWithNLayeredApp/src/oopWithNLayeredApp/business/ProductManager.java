package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	//private List<Logger> loggers;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao,Logger[] loggers /*List<Logger> loggers*/) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		// business rules
		if (product.getUnitPrice() < 10) {
			throw new Exception("Price cannot be less than 10.");
		}

		productDao.add(product);
		
		for (Logger logger : loggers) { //[db, mail]
			logger.log(product.getName());
		}
	}
}
