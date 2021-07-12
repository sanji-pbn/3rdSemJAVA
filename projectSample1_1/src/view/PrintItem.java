package view;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import model.Customer;
import model.Item;

/**
 * Class to Print list of items bought by customer
 * */
public class PrintItem extends Page {

	private Customer selectedCustomer;

	private JFrame frame;

	public PrintItem(Customer customer) {
		this.selectedCustomer = customer;
	}

	@Override
	public void show() {

		
		frame = new JFrame("Print Item");
		frame.setBounds(0, 0, 450, 550);
		frame.setLocationRelativeTo(null);

		JPanel contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setBackground(Color.CYAN);
		frame.setContentPane(contentPanel);
		contentPanel.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(20, 10, 400, 500);
		contentPanel.add(panel);
		panel.setLayout(null);

		JTextArea textItem = print();
	 
		panel.add(textItem);

		frame.setVisible(true);

	}

	private JTextArea print() {
		 
		JTextArea area = new JTextArea();
		Font font = DesignHelper.getPrintFont();

		area.setBounds(10, 10, 380, 480);
		area.setFont(font);

		area.setEnabled(true);
		area.append("\tCustomer Billing System\n");
		SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
		Date dt = selectedCustomer.getDate();
		String time = tTime.format(dt);
		area.append(time+"\t!!Payment on Delievery!!"+"\n\n");
		area.append("CustomerName: " +  selectedCustomer.getName() + "  " + selectedCustomer.getVorname() + "\n");
		
		area.append("------------------------------------------------------------------\n");
		area.setEnabled(true);
	
		double iTotal = 0.0;
		area.append("Items------------------------------------Price--------------\n");
		for (Item item : selectedCustomer.getItems()) {
			area.append(item.getName() + "\n");
			area.append(item.getQty()+"x"+item.getCost()+"\t\t"+item.getTotal() + "\n");
			iTotal += item.getTotal();

		}
		area.append("-----------------------------------------------------------------\n");
		area.append("Total\t\t" + iTotal);
		area.append("\n\n----------------------\t Thank you for your Shopping--\n");
		area.append("Delievery Address:" + "\n");
		area.append("Street" + selectedCustomer.getAddress()+"\n");
		area.append("Delievery will be there within 1 Hour\n"+"If not Call here: XXXXXXXXXXX\n\n");
		
		area.append("\t--------------------------\n\n" + "\tBe Happy and Healthy :):)");
		
		return area;

	}

}
