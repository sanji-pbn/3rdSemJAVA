package projectSample1_1;

import java.util.ArrayList;
import java.util.List;

public class WareHouse {
	// it is used to get the element present in the list at a given specific index
	public List<Item> getItems() {
		
		// creating an Empty Integer List
		List<Item> itemList = new ArrayList<Item>();

		/// need to be added
		// sapai product ko name haru 
		// id, name, cost change garne ani item bhanera object create garera aru mero menu ma bhako sapai lai leknu parne

		Item item1 = new Item();
		item1.setId(1);
		item1.setName("Wasa Knäckebrot Sesam 200g");
		item1.setCost(1.25);
		itemList.add(item1);

		return itemList;

	}

	public List<Item> getSelectedItems(List<Item> itemList) {

		List<Item> result = new ArrayList<Item>();
		
		// yaha chai abo JTextField ma more than 1 bhako lai matra linu ko lagi rakeko ho 
		for (Item item : itemList) {
			if (item.getQty() >= 1) {
				result.add(item);
			}

		}
		return result;

	}

}
