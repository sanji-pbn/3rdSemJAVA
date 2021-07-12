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
		area.append("\tCustomer Billing Systems\n\n"
				+ "\n-----------------------------------------------------------------------------------\n");
		// =================================================
		area.setEnabled(true);
		// =================================================
		 
		SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
		//tTime.format(timer.getTime());
		Date dt = selectedCustomer.getDate();
		String time = tTime.format(dt);
		// =================================================
		area.append("Customer Billing Systems\n");
		area.append(time+"\n");
		double iTotal = 0.0;

		for (Item item : selectedCustomer.getItems()) {
			area.append(item.getName() + "\t" + item.getTotal() + "\n");
			iTotal += item.getTotal();

		}
		area.append("-------\t Thank you\t-------\n");
		area.append("Total\5t" + iTotal);
		
		return area;

	}

}
