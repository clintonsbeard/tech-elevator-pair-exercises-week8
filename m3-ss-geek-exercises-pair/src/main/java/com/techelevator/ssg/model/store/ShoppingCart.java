package com.techelevator.ssg.model.store;

import java.util.Map;

public class ShoppingCart {

	private Map<Long, Product> products;

	public void addToCart (int quantity, Product product) {
		// shopping cart item (product, qty)
		// map <productId, shopping cart item>
		
		// does map have a shopping cart item for the product id?
		// if yes, get the current item and increment the quantity
		// else, create a new item, set the product and quantity
		// put item in map
	}
	
	// double get grandTotal()
	// loop through all values of the map and add them together, add $
}