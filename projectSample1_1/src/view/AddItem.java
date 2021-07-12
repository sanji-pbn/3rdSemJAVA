package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Item;
import model.WareHouse;

public class AddItem extends Page implements ItemListener {
	
	private Item selectedItem;
	
	private List<Item> selectedItemList;
	
	private JFrame frame;
	
	public AddItem(List<Item> selectedItems) {
		this.selectedItemList = selectedItems;
		this.selectedItem = new Item();
	}

	public JComboBox<Object> createDropDown() {

		List<Item> itemList = WareHouse.getItems();

		Object[] list =  itemList.toArray();
		
		JComboBox<Object> itemDropdown = new JComboBox<Object>(list);

		return itemDropdown;

	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		System.out.println(arg0.toString());
	}

	@Override
	public void show() {
		frame = new JFrame("Add Item");
		frame.setSize(250, 250);
		frame.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		JLabel labelSelect = new JLabel("Select Item: ");
		labelSelect.setBounds(10, 10, 100, 100);
		panel.add(labelSelect);

		JComboBox<Object> itemDropDown = createDropDown();		
		itemDropDown.addItemListener(this);
		panel.add(itemDropDown);

		JLabel labelQty = new JLabel("Qty");
		panel.add(labelQty);

		JTextField textQty = new JTextField("1");
		textQty.setColumns(5);
		panel.add(textQty);

		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(20, 50, 100, 30);
		btnConfirm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				selectedItem = (Item) itemDropDown.getSelectedItem();
				selectedItem.setQty(Integer.parseInt(textQty.getText()));
				
				selectedItemList.add(selectedItem);
				
				System.out.println("Confirm button pressed " + itemDropDown.getSelectedItem());
				System.out.println("the selectedItem is: "+ selectedItem.getToString());
				frame.setVisible(false);
				frame.dispose();
				
			}
		});

		panel.add(btnConfirm);
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frame.dispose();
			}
		});

		panel.add(btnCancel);

		frame.add(panel);
		frame.setVisible(true);

	}

	public Item getSelectedItem() {
		return selectedItem;
	}

	public void setSelectedItem(Item selectedItem) {
		this.selectedItem = selectedItem;
	}
	
	

}
