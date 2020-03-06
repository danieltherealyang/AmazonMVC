package Amazon.Components;

import java.util.ArrayList;

public class ProductRegistry {
	public static ArrayList<Product> productRegistry = new ArrayList<Product>();
	
	public static void fillRegistry(){
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("yeet");
		productRegistry.add(new Product(
				1, 
				"TYLER1 Trademark Alpha Shirt", 
				"Highest quality TYLER1 brandend shirt, all sizes. Made in Wuhan, best bats",
				"/Amazon/Components/products/Tyler1_Shirt.jpg",
				10.0, 
				20.0,
				arrList
				));
		
	}
}
