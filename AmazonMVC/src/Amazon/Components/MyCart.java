package Amazon.Components;

import java.util.ArrayList;

public class MyCart{
	
	public static ArrayList<int[]> CartContents= new ArrayList<int[]>();
	
	public static void addToCart(int productIdentifier, int amount) {
		
		for(int i=0; i<CartContents.size(); i++) {
			if(CartContents.get(i)[0]==productIdentifier) {
				int[] toIncrementExisting = {CartContents.get(i)[0],CartContents.get(i)[1]+amount};
				CartContents.set(i,toIncrementExisting);
				return;
			}
		}
		
		int[] toBeAdded = {productIdentifier, amount};
		CartContents.add(toBeAdded);
}
	
	
	
}