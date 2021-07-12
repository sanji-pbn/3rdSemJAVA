package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Class used as static only
 * Used to store list of items that can be bought
 * */
public class WareHouse {
	
	// it is used to get the element present in the list at a given specific index
	
	public static List<Item> getItems() {
		
		// creating an Empty Integer List
		List<Item> itemList = new ArrayList<Item>();
			
		Item item0 = new Item(0, "--", ItemType.Nop, 0.00);
		itemList.add(item0);
		
		Item item1 = new Item(1,"Wasa Knäckebrot Sesam 200g", ItemType.Bread, 1.24 );
		itemList.add(item1);

		Item item2 = new Item(2,"Bio Hähnchenbrustfilet 300g", ItemType.Meat, 3.99 );
		itemList.add(item2);

		Item item3 = new Item(3,"Coca-Cola Light 1L", ItemType.Drink, 1.88 );
		itemList.add(item3);

		Item item4 = new Item(4,"Kartoffeln 2.5 Kg", ItemType.Vegetables, 1.49 );
		itemList.add(item4);

		return itemList;

	}

 
}
