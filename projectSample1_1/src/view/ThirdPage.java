package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import model.Customer;
import model.Item;

public class ThirdPage extends Page {

	private JFrame frame;

	private Customer customer;

	JComboBox<String> dropDown;

	public ThirdPage(Customer customer) {
		this.customer = customer;
	}

	public ThirdPage() {
	}

	@Override
	public void show() {

		Font font = DesignHelper.getFont();

		frame = new JFrame();
		frame.setTitle("Buy items ");
		frame.setBounds(0, 0, 450, 550);
		frame.setLocationRelativeTo(null);

		JPanel contentPanel1 = new JPanel();
		contentPanel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel1.setBackground(Color.CYAN);
		frame.setContentPane(contentPanel1);
		contentPanel1.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(20, 10, 400, 500);
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel.setBackground(new Color(95, 158, 160));
		contentPanel1.add(panel);
		panel.setLayout(null);

		JButton btnSave = new JButton("Add");
		btnSave.setBounds(10, 10, 80, 30);
		btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				AddItem comboBox = new AddItem(customer.getItems());
				comboBox.show();
			}
		});

		JTextArea checkList = new JTextArea();
		checkList.setBounds(25, 80, 350, 300);
		checkList.setFont(font);

		JButton btnRetrieve = new JButton("Check List");
		btnRetrieve.setBounds(120, 10, 120, 30);
		btnRetrieve.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String itemsList = showItems();
				checkList.setText(itemsList);
			}
		});

		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(270, 10, 120, 30);
		btnDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (customer.getItems().size() > 0) {
					DeleteItem deleteItem = new DeleteItem(customer.getItems());
					deleteItem.show();
				} else {

				}
			}
		});

		JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 400, 120, 30);
		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				SecondPage sP = new SecondPage();
				sP.show();
			}

		});

		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(150, 400, 120, 30);

		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Customer Billing System",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		panel.add(btnExit);

		JButton btnPrint = new JButton("Print");
		btnPrint.setBounds(290, 400, 100, 30);
		btnPrint.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (customer.getItems().size() > 0) {
					PrintItem printItem = new PrintItem(customer);
					printItem.show();
					frame.setVisible(false);
				} else {

				}
			}
		});

		panel.add(checkList);
		panel.add(btnSave);
		panel.add(btnRetrieve);
		panel.add(btnPrint);
		panel.add(btnBack);
		panel.add(btnDelete);
		panel.add(btnExit);
		frame.add(panel);
		frame.setVisible(true);

	}

	private String showItems() {
		String itemList = "";
		for (Item item : customer.getItems()) {
			itemList += item.getName() + " " + item.getQty() + "\n";
		}
		return itemList;

	}

}
