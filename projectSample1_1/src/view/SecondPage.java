package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import model.Address;
import model.Customer;

public class SecondPage extends Page {

	private Customer customer;
	
	@Override
	public void show() {

		Font font = DesignHelper.getFont();		

		JFrame frame = this.getFrame("SecondPage");
		frame.setBounds(0, 0, 450, 700);
		frame.setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menuHelp = new JMenu("Help");
		JMenu info = new JMenu("Info");		
		JTextArea area = new JTextArea("This Page is for getting information about\n" +
				"the Customer, so that the delievery will \n" +
				"be easier.\n");
		area.setPreferredSize(new Dimension(300,50));
		info.add(area);
		menuHelp.add(info);
		
		JMenu info1 = new JMenu("*");
		JTextArea area1 = new JTextArea("Please try to fill up all the * sign boxes,\n" +
				"so that it will be easier for us to deliever.");
		area1.setPreferredSize(new Dimension(300,50));
		info1.add(area1);
		menuHelp.add(info1);
		
		JMenu info2 = new JMenu("Reset");
		JTextArea area2 = new JTextArea("If you want to reset all your data,\n" + 
		"it will help you with new fill up.");
		area2.setPreferredSize(new Dimension(300,50));
		info2.add(area2);
		menuHelp.add(info2);
		menuBar.add(menuHelp);
		

		JPanel contentPanel1 = new JPanel();
		contentPanel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel1.setBackground(Color.CYAN);
		frame.setContentPane(contentPanel1);
		contentPanel1.setLayout(null);

		/// Customer Panel
		// -----------------------------------------
		JPanel panel = new JPanel();
		panel.setBounds(20, 10, 380, 640);
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel.setBackground(new Color(95, 158, 160));
		contentPanel1.add(panel);
		panel.setLayout(null);

		JLabel label = new JLabel("INFORMATION-TABLE");
		label.setBounds(100, 10, 250, 35);
		label.setFont(font);
		panel.add(label);

		// first name
		JLabel labelFirstName = new JLabel("First name *");
		labelFirstName.setBounds(10, 50, 150, 35);
		labelFirstName.setFont(font);
		panel.add(labelFirstName);

		JTextField textFirstName = new JTextField();
		textFirstName.setBounds(160, 50, 200, 35);
		textFirstName.setFont(font);
		panel.add(textFirstName);

		// Second name
		JLabel labelLastName = new JLabel("Last Name *");
		labelLastName.setBounds(10, 102, 150, 35);
		labelLastName.setFont(font);
		panel.add(labelLastName);

		JTextField textLastName = new JTextField();
		textLastName.setBounds(160, 100, 200, 35);
		textLastName.setFont(font);
		panel.add(textLastName);
		
		// Address
		JLabel street = new JLabel("Street *");
		street.setBounds(10, 154, 150, 35);
		street.setFont(font);
		panel.add(street);
		
		JTextField textStreet = new JTextField();
		textStreet.setBounds(160, 150, 200, 35);
		textStreet.setFont(font);
		panel.add(textStreet);
		
		// House Number
		JLabel houseNr = new JLabel("HouseNr *");
		houseNr.setBounds(10, 206, 150, 35);
		houseNr.setFont(font);
		panel.add(houseNr);
		
		JTextField textHouseNr = new JTextField();
		textHouseNr.setBounds(160, 200, 200, 35);
		textHouseNr.setFont(font);
		panel.add(textHouseNr);
		
		// Postbox Number
		JLabel plz = new JLabel("PLZ *");
		plz.setBounds(10, 258, 150, 35);
		plz.setFont(font);
		panel.add(plz);
		
		JTextField textPlz = new JTextField();
		textPlz.setBounds(160, 250, 200, 35);
		textPlz.setFont(font);
		panel.add(textPlz);
		
		textPlz.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent ke) {
				//String value = textPlz.getText();
				//int l = value.length();
				if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' ) {
		               textPlz.setEditable(true);
		            }else {
		            	textPlz.setEditable(false);
		            }				
			}
		});
		
		// City
		JLabel city = new JLabel("City *");
		city.setBounds(10, 310, 150, 35);
		city.setFont(font);
		panel.add(city);
		
		JTextField textCity = new JTextField();
		textCity.setBounds(160, 300, 200, 35);
		textCity.setFont(font);
		panel.add(textCity);
		
		
		// Phone number
		JLabel mobileNr = new JLabel("MobileNr *");
		mobileNr.setBounds(10, 356, 150, 35);
		mobileNr.setFont(font);
		panel.add(mobileNr);
		
		JTextField textMobileNr = new JTextField();
		textMobileNr.setBounds(160, 350, 200, 35);
		textMobileNr.setFont(font); 
		panel.add(textMobileNr);
		
		textMobileNr.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent ke) {
				//String value = textMobileNr.getText();
				//int l = value.length();
				if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
					textMobileNr.setEditable(true);
		            }else {
		            	textMobileNr.setEditable(false);
		            }
				
			}
		});
		
		// Receipt Name
		JLabel receiptName = new JLabel("Receipt Name");
		receiptName.setBounds(10, 406, 150, 35);
		receiptName.setFont(font);
		panel.add(receiptName);
		
		JTextField textReceiptName = new JTextField();
		textReceiptName.setBounds(160, 400, 200, 35);
		textReceiptName.setFont(font);
		panel.add(textReceiptName);
		
		// Details(Note)
		JLabel details = new JLabel("Details ");
		details.setBounds(10, 456, 150, 35);
		details.setFont(font);
		panel.add(details);
		
		JTextArea textDetails = new JTextArea();
		textDetails.setBounds(160, 450, 200, 100);
		textDetails.setFont(font);
		panel.add(textDetails);
							

		JButton btnSave = new JButton("Save");
		btnSave.setFont(font);
		btnSave.setBounds(10, 590, 80, 30);
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				customer = new Customer();
				customer.setName(textLastName.getText());
				customer.setVorname(textFirstName.getText());
				Address address = new Address();
				address.setStreet(textStreet.getText());
				address.setHouseNr(textHouseNr.getText());
				address.setPlz(textPlz.getText());
				
				address.setCity(textCity.getText());
				customer.setAddress(address);
				customer.setMobileNr(textMobileNr.getText());
				customer.setReceipientName(textReceiptName.getText());
				customer.setDetails(textDetails.getText());
				
				boolean valid = customer.validate();
				if (valid) {
					
					frame.setVisible(false);
					frame.dispose();
					
					ThirdPage tp = new ThirdPage(customer);
					tp.show();
				
				} else {
					if (JOptionPane.showConfirmDialog(frame, "Invalid, must fill up * box", "Validation",
							JOptionPane.CLOSED_OPTION) == JOptionPane.CLOSED_OPTION) {
						System.exit(0);
					}
				}
				
			}
		});
		
		panel.add(btnSave);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(font);
		btnReset.setBounds(130, 590, 100, 30);
		
		btnReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				textFirstName.setText(null);
				textLastName.setText(null);
				textStreet.setText(null);
				textHouseNr.setText(null);
				textPlz.setText(null);
				textCity.setText(null);
				textMobileNr.setText(null);
				textReceiptName.setText(null);
				textDetails.setText(null);
			}
			
		});
		panel.add(btnReset);

		JButton btnCancel = new JButton("Exit");
		btnCancel.setFont(font);
		btnCancel.setBounds(265, 590, 100, 30);

		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Customer Billing System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);			
				}	
			}
		});
		panel.add(btnCancel);

		frame.setVisible(true);
	}

}
