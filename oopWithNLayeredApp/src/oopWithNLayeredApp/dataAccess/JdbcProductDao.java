package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		//only db access codes... SQL
		System.out.println("Added to database using JDBC");
	}
}


