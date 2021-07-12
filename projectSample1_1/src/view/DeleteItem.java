package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.Item;

public class DeleteItem extends Page   implements ItemListener  {
	
	private Item selectedItem;
	
	private List<Item> items;
	
	private JFrame frame;
	
	public DeleteItem() {
		this.selectedItem = null;
		this.items = new ArrayList<>();
		this.frame = null;
	}
	
	public DeleteItem(List<Item> items) {
		this.items = items;
		this.selectedItem = null;
		this.frame = null;
	}

	public JComboBox<Object> createDropDown() {

		List<Item> itemList = this.items;

		Object[] list =  itemList.toArray();
		
		JComboBox<Object> itemDropdown = new JComboBox<Object>(list);

		return itemDropdown;

	}
	@Override
	public void show() {
		
		this.selectedItem = items.get(0);
		frame = new JFrame("Delete Item");
		frame.setSize(250, 250);
		frame.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		JLabel labelSelect = new JLabel("Item name: ");
		labelSelect.setBounds(10, 10, 100, 100);
		panel.add(labelSelect); 


		JComboBox<Object> itemDropDown = createDropDown();
		
		itemDropDown.addItemListener(this);

		panel.add(itemDropDown);

		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 for (Item item: items) {
					 if (selectedItem.getId()==item.getId()) {
						 items.remove(item);
						 frame.setVisible(false);
						 frame.dispose();
						 return;
					 }
				 }
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
	
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		this.selectedItem = (Item) arg0.getItem();
		System.out.println(arg0.toString());
	}

	public Item getSelectedItem() {
		return selectedItem;
	}

	public void setSelectedItem(Item selectedItem) {
		this.selectedItem = selectedItem;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	
	
}
