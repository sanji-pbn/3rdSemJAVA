package projectSample1_1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

@SuppressWarnings("serial")
public class MainMenu extends JFrame{
	
	private static JFrame frame;
	private static JMenuBar menuBar;
	private static JMenu menuFile;
	private static JMenuItem file01, file02, file03;
	//- 1 panel
	private static JPanel panel1_1,panel1_2,panel1_3,panel1_4,panel1_5;
	private static JTextField text1_1,text1_2,text1_3,text1_4,text1_5,text1_6,text1_7,text1_8;
	private static JTextArea text1_9;
	//- 2 panel
	private static JCheckBox meat1b, meat1c, meat1d, meat1e;
	private static JCheckBox veg1a, veg1b, veg1c,veg1d, veg1e, veg1f;
	private static JCheckBox brot1a, brot1b, brot1c;
	private static JCheckBox saft1a, saft1b, saft1c;
	private static JCheckBox drink1a, drink1b;
	private static JTextField numDrink1a, numDrink1b;
	private static JTextField numSaft1a, numSaft1b, numSaft1c;
	private static JTextField numBrot1a, numBrot1b, numBrot1c;
	private static JTextField txtMeat1b, txtMeat1c, txtMeat1d, txtMeat1e;
	private static JTextField numVeg1a, numVeg1b, numVeg1c, numVeg1d, numVeg1e, numVeg1f;
	
	/*
	 *  classes bhana bandai hunuhuntyo 
	 *  ani tyo submit garne kura k bannu hudai tyo, k ho k bhayo
	 *  Binding ko k bhandai hunuhuntyo, maelae nasuneko lae idk
	 *  akai thau ma bhayooo 
	 *  arko class arko class
	 *  same same same same information actionListener repeat bhako xa, way to make it short easier????
	 *  
	 *  aja da lae bhannu bhako
	 *  getter ra setter 
	 *  bill banauda submit ani arko array use garera save garne 
	 *  warehouse ko lagi kasari bhanaune bhannu bhako hola--------- complicated
	 */

	public static void main(String[] args) {
		ShoppingMenu();
	}
	
	// since it is a static method, there is no this, alternative new instance of a class which implements AL
	// why I used static method
	/*
	 * Static methods takes all the data from parameters and compute something from those parameters, with no 
	 * reference to variable
	 * 
	 * I could have used a conductor
	 * public MainMenu(), but no
	 * 
	 */
	/*
	public void randomNumbers() {
		Random ran = new Random();
		int n = ran.nextInt(1000)+1;
		String val = String.valueOf(n);
		text1_1.setText(val);
	}*/
	
	public static void ShoppingMenu() {
		frame = new JFrame("Menu");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, 1152, 750);
		JPanel contentPanel1 = new JPanel();
		contentPanel1.setBorder(new EmptyBorder(5,5,5,5));
		contentPanel1.setBackground(Color.CYAN);
		frame.setContentPane(contentPanel1);
		contentPanel1.setLayout(null);
		
		
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		menuFile = new JMenu("File");
		
		////////////////////////////////////////////////
		file01 = new JMenuItem("New");
		file01.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// Information Table
				text1_1.setText(null);
				text1_2.setText(null);
				text1_3.setText(null);
				text1_4.setText(null);
				text1_5.setText(null);
				text1_6.setText(null);
				text1_7.setText(null);
				text1_8.setText(null);
				text1_9.setText(null);
				// Menu Table
				
				// checkbox
				meat1b.setSelected(false);
				meat1c.setSelected(false);
				meat1d.setSelected(false);
				meat1e.setSelected(false);

				
				veg1a.setSelected(false);
				veg1b.setSelected(false);
				veg1c.setSelected(false);
				veg1d.setSelected(false);
				veg1e.setSelected(false);
				veg1f.setSelected(false);
				
				brot1a.setSelected(false);
				brot1b.setSelected(false);
				brot1c.setSelected(false);
				
				saft1a.setSelected(false);
				saft1b.setSelected(false);
				saft1c.setSelected(false);
				
				drink1a.setSelected(false);
				drink1b.setSelected(false);
				
				// meat
				txtMeat1b.setEnabled(false);
				txtMeat1c.setEnabled(false);
				txtMeat1d.setEnabled(false);
				txtMeat1e.setEnabled(false);
				// veg
				numVeg1a.setEnabled(false);
				numVeg1b.setEnabled(false);
				numVeg1c.setEnabled(false);
				numVeg1d.setEnabled(false);		
				numVeg1e.setEnabled(false);
				numVeg1f.setEnabled(false);
				//brot
				numBrot1a.setEnabled(false);
				numBrot1b.setEnabled(false);
				numBrot1c.setEnabled(false);
				//saft
				numSaft1a.setEnabled(false);
				numSaft1b.setEnabled(false);
				numSaft1c.setEnabled(false);
				//drinks
				numDrink1a.setEnabled(false);
				numDrink1b.setEnabled(false);
				
				txtMeat1b.setText("0");
				txtMeat1c.setText("0");
				txtMeat1d.setText("0");
				txtMeat1e.setText("0");
				
				numVeg1a.setText("0");
				numVeg1b.setText("0");
				numVeg1c.setText("0");
				numVeg1d.setText("0");
				numVeg1e.setText("0");
				numVeg1f.setText("0");
				
				numBrot1a.setText("0");
				numBrot1b.setText("0");
				numBrot1c.setText("0");
				
				numSaft1a.setText("0");
				numSaft1b.setText("0");
				numSaft1c.setText("0");
				
				numDrink1a.setText("0");
				numDrink1b.setText("0");
			}
			
		});
		menuFile.add(file01);
		///////////////////////////////////////////////
		
		file02 = new JMenuItem("Total");
		menuFile.add(file02);
		
		file03 = new JMenuItem("Exit");
		file03.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Customer Billing System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
			
				}				
			}
			
		});
		menuFile.add(file03);
		menuBar.add(menuFile);
		
		JMenu menuHelp = new JMenu("Help");
		/*
		 * Sub-Menu
		 * Dammmmm, i learned how to make a detail box in menubar. i Spent 2 hours on that.
		 * change the size in a preferred dimension. hahaha
		 * setPreferredSize was the only code that i needed.
		 * was wondering how to change the paragraph but ja \n is there.
		 */
		JMenu info1 = new JMenu("New");
		JTextArea area1 = new JTextArea("This menu will reset all the Data.\n"
				+ " eg: Information and the lists you included");
		area1.setPreferredSize(new Dimension(300,40));
		info1.add(area1);
		menuHelp.add(info1);
		menuBar.add(menuHelp);
		
		JMenu info2 = new JMenu("Total");
		JTextArea area2 = new JTextArea("This menu will add all the bought Products\n"
				+ "and ask the Customer if they want to pay or go back\n"
				+ "for further buying.");
		area2.setPreferredSize(new Dimension(300,50));
		info2.add(area2);
		menuHelp.add(info2);
		
		JMenu info3 = new JMenu("Exit");
		JTextArea area3 = new JTextArea("This menu will go for exit to close the Program\n."
				+ " Ask if they want to close or not");
		area3.setPreferredSize(new Dimension(300,40));
		info3.add(area3);
		menuHelp.add(info3);
		
		JMenu menuAbout = new JMenu("About");
		JMenu about1 = new JMenu("About me");
		JTextArea area4 = new JTextArea("From 3.Sem. Developing a Customer Online\n"
				+ "Shopping Menu for Final Project of JAVA");
		area4.setPreferredSize(new Dimension(300,40));
		about1.add(area4);
		menuAbout.add(about1);
		menuBar.add(menuAbout);
		
		
		JMenu about2 = new JMenu("Version");
		JTextArea area5 = new JTextArea("Version 1.1, Undercontruction");
		area5.setPreferredSize(new Dimension(300,40));
		about2.add(area5);
		menuAbout.add(about2);
	
		
		///-----------------------------------------
		panel1_1 = new JPanel();
		panel1_1.setBounds(20, 10, 380, 500);
		panel1_1.setBorder(new MatteBorder(14,14,14,14, (Color) new Color(95,158,160)));
		panel1_1.setBackground(new Color(95,158,160));
		contentPanel1.add(panel1_1);
		panel1_1.setLayout(null);
		
		
		// First table (Information-table)
		//////////////////////////////////////////////////
		
		JLabel label0_0 = new JLabel("INFORMATION-TABLE");
		label0_0.setBounds(100, 10, 250, 35);
		label0_0.setFont(new Font("Discovery",Font.PLAIN, 18));
		panel1_1.add(label0_0);
		
		JLabel label1_0 = new JLabel("Customer Ref");
		label1_0.setBounds(10, 55, 150, 35);
		label1_0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel1_1.add(label1_0);
				
		JLabel label1_1 = new JLabel("Firstname");
		label1_1.setBounds(10, 100, 150, 35);
		label1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel1_1.add(label1_1);
		
		JLabel label1_2 = new JLabel("Surname");
		label1_2.setBounds(10, 145, 150, 35);
		label1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel1_1.add(label1_2);
		
		JLabel label1_3 = new JLabel("Address");
		label1_3.setBounds(10, 190, 150, 35);
		label1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel1_1.add(label1_3);
		
		JLabel label1_4 = new JLabel("Post Code");
		label1_4.setBounds(10, 235, 150, 35);
		label1_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel1_1.add(label1_4);
		
		JLabel label1_5 = new JLabel("City");
		label1_5.setBounds(10, 280, 150, 35);
		label1_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel1_1.add(label1_5);
		
		JLabel label1_6 = new JLabel("MobileNr");
		label1_6.setBounds(10, 325, 150, 35);
		label1_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel1_1.add(label1_6);
		
		JLabel label1_7 = new JLabel("Recipient Name");
		label1_7.setBounds(10, 370, 150, 35);
		label1_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel1_1.add(label1_7);
		
		JLabel label1_8 = new JLabel("Details");
		label1_8.setBounds(10, 415, 150, 35);
		label1_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel1_1.add(label1_8);
		
		text1_1 = new JTextField();
		text1_1.setBounds(170, 55, 180, 35);
		text1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel1_1.add(text1_1);
		
		text1_2 = new JTextField();
		text1_2.setBounds(170, 100, 180, 35);
		text1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel1_1.add(text1_2);
		
		text1_3 = new JTextField();
		text1_3.setBounds(170, 145, 180, 35);
		text1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel1_1.add(text1_3);
		
		text1_4 = new JTextField();
		text1_4.setBounds(170, 190, 180, 35);
		text1_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel1_1.add(text1_4);
		
		text1_5 = new JTextField();
		text1_5.setBounds(170, 235, 180, 35);
		text1_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel1_1.add(text1_5);
		
		text1_6 = new JTextField();
		text1_6.setBounds(170, 280, 180, 35);
		text1_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel1_1.add(text1_6);
		
		text1_7 = new JTextField();
		text1_7.setBounds(170, 325, 180, 35);
		text1_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel1_1.add(text1_7);
		
		text1_8 = new JTextField();
		text1_8.setBounds(170, 370, 180, 35);
		text1_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel1_1.add(text1_8);
		
		text1_9 = new JTextArea();
		text1_9.setBounds(170, 415, 180, 70);
		text1_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel1_1.add(text1_9);
		/////////////////////////////////////////////////////
		
		// Second Table Menu Table
		
		panel1_2 = new JPanel();
		panel1_2.setBounds(430,10,347,581);
		panel1_2.setBorder(new MatteBorder(14,14,14,14, (Color) new Color(95,158,160)));
		panel1_2.setBackground(new Color(95,158,160));
		contentPanel1.add(panel1_2);
		panel1_2.setLayout(null);
		
		JLabel list = new JLabel("Shopping List Available");
		list.setBounds(80, 0, 250, 35);
		list.setFont(new Font("Discovery",Font.PLAIN, 18));
		panel1_2.add(list);
		
		/*WareHouse wareHouse = new WareHouse();
		List<Item> itemList = wareHouse.getItems();
		*/
		/*int x = 0 ; 
		int y = 0 ;
		for(Item item:itemList) {
			// create label
			//label.setLabel(item.getName())
			//label.setPosition(x,y)
			
			// create text field
			//textfield.setPosition(x+5, y);
			
			// create confirm button
			// confirmButton.setPositoin(x+10,y)
			// confirmButton.ctionPervormend(){
			// item.setQty(Integer.parseInt(textField.getText())
			//}
			
			y = y + 10;
		}
		*/
					
		meat1b = new JCheckBox("Bio Hähnchenbrustfilet: 300g");
		meat1b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(meat1b.isSelected()) {
					txtMeat1b.setEnabled(true);
					txtMeat1b.setText("");
					txtMeat1b.requestFocus();
				}
				else {
					txtMeat1b.setEnabled(false);
					txtMeat1b.setText("0");
				}
				
			}
			
		});
		meat1b.setBackground(new Color(176,224,230));
		meat1b.setFont(new Font("Tahoma", Font.BOLD, 10));
		meat1b.setBounds(10, 35, 220, 25);
		panel1_2.add(meat1b);
		
		txtMeat1b = new JTextField();
		txtMeat1b.setHorizontalAlignment(SwingConstants.CENTER);
		txtMeat1b.setText("0");
		txtMeat1b.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtMeat1b.setColumns(10);
		txtMeat1b.setBounds(230, 35, 100, 25);
		panel1_2.add(txtMeat1b);
		
		//-------------------- Done
		
		meat1c = new JCheckBox("Bio Rinderfackfleisch: 350g");
		meat1c.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(meat1c.isSelected()) {
					txtMeat1c.setEnabled(true);
					txtMeat1c.setText("");
					txtMeat1c.requestFocus();
				}
				else {
					txtMeat1c.setEnabled(false);
					txtMeat1c.setText("0");
				}
				
			}
			
		});
		meat1c.setBackground(new Color(176,224,230));
		meat1c.setFont(new Font("Tahoma", Font.BOLD, 10));
		meat1c.setBounds(10, 60, 220, 25);
		panel1_2.add(meat1c);
		
		txtMeat1c = new JTextField();
		txtMeat1c.setHorizontalAlignment(SwingConstants.CENTER);
		txtMeat1c.setText("0");
		txtMeat1c.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtMeat1c.setColumns(10);
		txtMeat1c.setBounds(230, 60, 100, 25);
		panel1_2.add(txtMeat1c);
		
		
		meat1d = new JCheckBox("Bio Schweinrückensteck 2Stk");
		meat1d.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(meat1d.isSelected()) {
					txtMeat1d.setEnabled(true);
					txtMeat1d.setText("");
					txtMeat1d.requestFocus();
				}
				else {
					txtMeat1d.setEnabled(false);
					txtMeat1d.setText("0");
				}
				
			}
			
		});
		meat1d.setBackground(new Color(176,224,230));
		meat1d.setFont(new Font("Tahoma", Font.BOLD, 10));
		meat1d.setBounds(10, 85, 220, 25);
		panel1_2.add(meat1d);
		
		txtMeat1d = new JTextField();
		txtMeat1d.setHorizontalAlignment(SwingConstants.CENTER);
		txtMeat1d.setText("0");
		txtMeat1d.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtMeat1d.setColumns(10);
		txtMeat1d.setBounds(230, 85, 100, 25);
		panel1_2.add(txtMeat1d);
		
		
		meat1e = new JCheckBox("Hackfleisch ca.250g");
		meat1e.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(meat1e.isSelected()) {
					txtMeat1e.setEnabled(true);
					txtMeat1e.setText("");
					txtMeat1e.requestFocus();
				}
				else {
					txtMeat1e.setEnabled(false);
					txtMeat1e.setText("0");
				}
				
			}
			
		});
		meat1e.setBackground(new Color(176,224,230));
		meat1e.setFont(new Font("Tahoma", Font.BOLD, 10));
		meat1e.setBounds(10, 110, 220, 25);
		panel1_2.add(meat1e);
		
		txtMeat1e = new JTextField();
		txtMeat1e.setHorizontalAlignment(SwingConstants.CENTER);
		txtMeat1e.setText("0");
		txtMeat1e.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtMeat1e.setColumns(10);
		txtMeat1e.setBounds(230, 110, 100, 25);
		panel1_2.add(txtMeat1e);
				
		 
		/*JCheckBox meat1_5 = new JCheckBox("Pork(150g)");
		meat1_5.setBackground(new Color(176,224,230));
		meat1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		meat1_5.setBounds(10, 135, 220, 33);
		panel1_2.add(meat1_5);
		*/
		
		veg1a = new JCheckBox("Blumenkohl weiß 1 stk.");
		veg1a.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(veg1a.isSelected()) {
					numVeg1a.setEnabled(true);
					numVeg1a.setText("");
					numVeg1a.requestFocus();
				}
				else {
					numVeg1a.setEnabled(false);
					numVeg1a.setText("0");
				}
				
			}
			
		});
		veg1a.setBackground(new Color(176,224,230));
		veg1a.setFont(new Font("Tahoma", Font.BOLD, 10));
		veg1a.setBounds(10, 160, 220, 25);
		panel1_2.add(veg1a);
		
		numVeg1a = new JTextField();
		numVeg1a.setHorizontalAlignment(SwingConstants.CENTER);
		numVeg1a.setText("0");
		numVeg1a.setFont(new Font("Dialog", Font.PLAIN, 16));
		numVeg1a.setColumns(10);
		numVeg1a.setBounds(230, 160, 100, 25);
		panel1_2.add(numVeg1a);
		
		
		veg1b = new JCheckBox("Champignons Weiß 250g");
		veg1b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(veg1b.isSelected()) {
					numVeg1b.setEnabled(true);
					numVeg1b.setText("");
					numVeg1b.requestFocus();
				}
				else {
					numVeg1b.setEnabled(false);
					numVeg1b.setText("0");
				}
				
			}
			
		});
		veg1b.setBackground(new Color(176,224,230));
		veg1b.setFont(new Font("Tahoma", Font.BOLD, 10));
		veg1b.setBounds(10, 185, 220, 25);
		panel1_2.add(veg1b);
		
		numVeg1b = new JTextField();
		numVeg1b.setHorizontalAlignment(SwingConstants.CENTER);
		numVeg1b.setText("0");
		numVeg1b.setFont(new Font("Dialog", Font.PLAIN, 16));
		numVeg1b.setColumns(10);
		numVeg1b.setBounds(230, 185, 100, 25);
		panel1_2.add(numVeg1b);
		
		
		veg1c = new JCheckBox("Kartoffeln 2,5kg(De)");
		veg1c.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(veg1c.isSelected()) {
					numVeg1c.setEnabled(true);
					numVeg1c.setText("");
					numVeg1c.requestFocus();
				}
				else {
					numVeg1c.setEnabled(false);
					numVeg1c.setText("0");
				}
				
			}
			
		});
		veg1c.setBackground(new Color(176,224,230));
		veg1c.setFont(new Font("Tahoma", Font.BOLD, 10));
		veg1c.setBounds(10, 210, 220, 25);
		panel1_2.add(veg1c);
		
		numVeg1c = new JTextField();
		numVeg1c.setHorizontalAlignment(SwingConstants.CENTER);
		numVeg1c.setText("0");
		numVeg1c.setFont(new Font("Dialog", Font.PLAIN, 16));
		numVeg1c.setColumns(10);
		numVeg1c.setBounds(230, 210, 100, 25);
		panel1_2.add(numVeg1c);
		
				
		veg1d = new JCheckBox("Radieschen Bio 1Stk.");
		veg1d.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(veg1d.isSelected()) {
					numVeg1d.setEnabled(true);
					numVeg1d.setText("");
					numVeg1d.requestFocus();
				}
				else {
					numVeg1d.setEnabled(false);
					numVeg1d.setText("0");
				}
				
			}
			
		});
		veg1d.setBackground(new Color(176,224,230));
		veg1d.setFont(new Font("Tahoma", Font.BOLD, 10));
		veg1d.setBounds(10, 235, 220, 25);
		panel1_2.add(veg1d);
		
		numVeg1d = new JTextField();
		numVeg1d.setHorizontalAlignment(SwingConstants.CENTER);
		numVeg1d.setText("0");
		numVeg1d.setFont(new Font("Dialog", Font.PLAIN, 16));
		numVeg1d.setColumns(10);
		numVeg1d.setBounds(230, 235, 100, 25);
		panel1_2.add(numVeg1d);
		

		veg1e = new JCheckBox("Spargel weiß 500g(De)");
		veg1e.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(veg1e.isSelected()) {
					numVeg1e.setEnabled(true);
					numVeg1e.setText("");
					numVeg1e.requestFocus();
				}
				else {
					numVeg1e.setEnabled(false);
					numVeg1e.setText("0");
				}
				
			}
			
		});
		veg1e.setBackground(new Color(176,224,230));
		veg1e.setFont(new Font("Tahoma", Font.BOLD, 10));
		veg1e.setBounds(10, 260, 220, 25);
		panel1_2.add(veg1e);
		
		numVeg1e = new JTextField();
		numVeg1e.setHorizontalAlignment(SwingConstants.CENTER);
		numVeg1e.setText("0");
		numVeg1e.setFont(new Font("Dialog", Font.PLAIN, 16));
		numVeg1e.setColumns(10);
		numVeg1e.setBounds(230, 260, 100, 25);
		panel1_2.add(numVeg1e);
		
		veg1f = new JCheckBox("Zwiebel Bio 1 Stk.");
		veg1f.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(veg1f.isSelected()) {
					numVeg1f.setEnabled(true);
					numVeg1f.setText("");
					numVeg1f.requestFocus();
				}
				else {
					numVeg1f.setEnabled(false);
					numVeg1f.setText("0");
				}
				
			}
			
		});
		veg1f.setBackground(new Color(176,224,230));
		veg1f.setFont(new Font("Tahoma", Font.BOLD, 10));
		veg1f.setBounds(10, 285, 220, 25);
		panel1_2.add(veg1f);
		
		numVeg1f = new JTextField();
		numVeg1f.setHorizontalAlignment(SwingConstants.CENTER);
		numVeg1f.setText("0");
		numVeg1f.setFont(new Font("Dialog", Font.PLAIN, 16));
		numVeg1f.setColumns(10);
		numVeg1f.setBounds(230, 285, 100, 25);
		panel1_2.add(numVeg1f);
		
		//-----------------------
		
		brot1a = new JCheckBox("Gragger Bio Dinkel-Laib 550g");
		brot1a.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(brot1a.isSelected()) {
					numBrot1a.setEnabled(true);
					numBrot1a.setText("");
					numBrot1a.requestFocus();
				}
				else {
					numBrot1a.setEnabled(false);
					numBrot1a.setText("0");
				}
				
			}
			
		});
		brot1a.setBackground(new Color(176,224,230));
		brot1a.setFont(new Font("Tahoma", Font.BOLD, 10));
		brot1a.setBounds(10, 335, 220, 25);
		panel1_2.add(brot1a);
		
		numBrot1a = new JTextField();
		numBrot1a.setHorizontalAlignment(SwingConstants.CENTER);
		numBrot1a.setText("0");
		numBrot1a.setFont(new Font("Dialog", Font.PLAIN, 16));
		numBrot1a.setColumns(10);
		numBrot1a.setBounds(230, 335, 100, 25);
		panel1_2.add(numBrot1a);
		
		//---------------------------
		brot1b = new JCheckBox("Golden Toast Butter 500g");
		brot1b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(brot1b.isSelected()) {
					numBrot1b.setEnabled(true);
					numBrot1b.setText("");
					numBrot1b.requestFocus();
				}
				else {
					numBrot1b.setEnabled(false);
					numBrot1b.setText("0");
				}
				
			}
			
		});
		brot1b.setBackground(new Color(176,224,230));
		brot1b.setFont(new Font("Tahoma", Font.BOLD, 10));
		brot1b.setBounds(10, 360, 220, 25);
		panel1_2.add(brot1b);
		
		numBrot1b = new JTextField();
		numBrot1b.setHorizontalAlignment(SwingConstants.CENTER);
		numBrot1b.setText("0");
		numBrot1b.setFont(new Font("Dialog", Font.PLAIN, 16));
		numBrot1b.setColumns(10);
		numBrot1b.setBounds(230, 360, 100, 25);
		panel1_2.add(numBrot1b);
		
		brot1c = new JCheckBox("Wasa Knäckebrot Sesam 200g");
		brot1c.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(brot1c.isSelected()) {
					numBrot1c.setEnabled(true);
					numBrot1c.setText("");
					numBrot1c.requestFocus();
				}
				else {
					numBrot1c.setEnabled(false);
					numBrot1c.setText("0");
				}
				
			}
			
		});
		brot1c.setBackground(new Color(176,224,230));
		brot1c.setFont(new Font("Tahoma", Font.BOLD, 10));
		brot1c.setBounds(10, 385, 220, 25);
		panel1_2.add(brot1c);
		
		numBrot1c = new JTextField();
		numBrot1c.setHorizontalAlignment(SwingConstants.CENTER);
		numBrot1c.setText("0");
		numBrot1c.setFont(new Font("Dialog", Font.PLAIN, 16));
		numBrot1c.setColumns(10);
		numBrot1c.setBounds(230, 385, 100, 25);
		panel1_2.add(numBrot1c);
		
		saft1a = new JCheckBox("Capri-Sun Kirsche 10x200ml");
		saft1a.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(saft1a.isSelected()) {
					numSaft1a.setEnabled(true);
					numSaft1a.setText("");
					numSaft1a.requestFocus();
				}
				else {
					numSaft1a.setEnabled(false);
					numSaft1a.setText("0");
				}
				
			}
			
		});
		saft1a.setBackground(new Color(176,224,230));
		saft1a.setFont(new Font("Tahoma", Font.BOLD, 10));
		saft1a.setBounds(10, 435, 220, 25);
		panel1_2.add(saft1a);
		
		numSaft1a = new JTextField();
		numSaft1a.setHorizontalAlignment(SwingConstants.CENTER);
		numSaft1a.setText("0");
		numSaft1a.setFont(new Font("Dialog", Font.PLAIN, 16));
		numSaft1a.setColumns(10);
		numSaft1a.setBounds(230, 435, 100, 25);
		panel1_2.add(numSaft1a);
		

		saft1b = new JCheckBox("Coca-Cola Light 1l");
		saft1b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(saft1b.isSelected()) {
					numSaft1b.setEnabled(true);
					numSaft1b.setText("");
					numSaft1b.requestFocus();
				}
				else {
					numSaft1b.setEnabled(false);
					numSaft1b.setText("0");
				}
				
			}
			
		});
		saft1b.setBackground(new Color(176,224,230));
		saft1b.setFont(new Font("Tahoma", Font.BOLD, 10));
		saft1b.setBounds(10, 460, 220, 25);
		panel1_2.add(saft1b);
		
		numSaft1b = new JTextField();
		numSaft1b.setHorizontalAlignment(SwingConstants.CENTER);
		numSaft1b.setText("0");
		numSaft1b.setFont(new Font("Dialog", Font.PLAIN, 16));
		numSaft1b.setColumns(10);
		numSaft1b.setBounds(230, 460, 100, 25);
		panel1_2.add(numSaft1b);
		
		saft1c = new JCheckBox("Red Bull Energy Drink Dose 250ml");
		saft1c.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(saft1c.isSelected()) {
					numSaft1c.setEnabled(true);
					numSaft1c.setText("");
					numSaft1c.requestFocus();
				}
				else {
					numSaft1c.setEnabled(false);
					numSaft1c.setText("0");
				}
				
			}
			
		});
		saft1c.setBackground(new Color(176,224,230));
		saft1c.setFont(new Font("Tahoma", Font.BOLD, 10));
		saft1c.setBounds(10, 485, 220, 25);
		panel1_2.add(saft1c);
		
		numSaft1c = new JTextField();
		numSaft1c.setHorizontalAlignment(SwingConstants.CENTER);
		numSaft1c.setText("0");
		numSaft1c.setFont(new Font("Dialog", Font.PLAIN, 16));
		numSaft1c.setColumns(10);
		numSaft1c.setBounds(230, 485, 100, 25);
		panel1_2.add(numSaft1c);
		
		drink1a = new JCheckBox("Erdiger Weißbier 5,3% vol.500ml");
		drink1a.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(drink1a.isSelected()) {
					numDrink1a.setEnabled(true);
					numDrink1a.setText("");
					numDrink1a.requestFocus();
				}
				else {
					numDrink1a.setEnabled(false);
					numDrink1a.setText("0");
				}
				
			}
			
		});
		drink1a.setBackground(new Color(176,224,230));
		drink1a.setFont(new Font("Tahoma", Font.BOLD, 10));
		drink1a.setBounds(10, 510, 220, 25);
		panel1_2.add(drink1a);
		
		numDrink1a = new JTextField();
		numDrink1a.setHorizontalAlignment(SwingConstants.CENTER);
		numDrink1a.setText("0");
		numDrink1a.setFont(new Font("Dialog", Font.PLAIN, 16));
		numDrink1a.setColumns(10);
		numDrink1a.setBounds(230, 510, 100, 25);
		panel1_2.add(numDrink1a);
		
		drink1b = new JCheckBox("Grandes Vinos El Circo 13% 750ml");
		drink1b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(drink1b.isSelected()) {
					numDrink1b.setEnabled(true);
					numDrink1b.setText("");
					numDrink1b.requestFocus();
				}
				else {
					numDrink1b.setEnabled(false);
					numDrink1b.setText("0");
				}
				
			}
			
		});
		drink1b.setBackground(new Color(176,224,230));
		drink1b.setFont(new Font("Tahoma", Font.BOLD, 10));
		drink1b.setBounds(10, 535, 220, 25);
		panel1_2.add(drink1b);
		
		numDrink1b = new JTextField();
		numDrink1b.setHorizontalAlignment(SwingConstants.CENTER);
		numDrink1b.setText("0");
		numDrink1b.setFont(new Font("Dialog", Font.PLAIN, 16));
		numDrink1b.setColumns(10);
		numDrink1b.setBounds(230, 535, 100, 25);
		panel1_2.add(numDrink1b);
		
		
		
		//--------------------------------  This is Border
		panel1_3 = new JPanel();
		panel1_3.setBounds(786,10,347,581);
		panel1_3.setBorder(new MatteBorder(14,14,14,14, (Color) new Color(95,158,160)));
		panel1_3.setBackground(new Color(95,158,160));
		contentPanel1.add(panel1_3);
		panel1_3.setLayout(null);
		
		
		JLabel img1a = new JLabel("9,99 \u20ac");
		img1a.setIcon(new ImageIcon(ShoppingMenu.class.getResource("/a1.jpg")));
		img1a.setHorizontalTextPosition(JLabel.CENTER);
		img1a.setVerticalTextPosition(JLabel.BOTTOM);
		img1a.setBounds(10, 40, 60, 70);
		panel1_3.add(img1a);
		
		JLabel img1b = new JLabel("4,49 \u20ac");
		img1b.setIcon(new ImageIcon(ShoppingMenu.class.getResource("/b1.jpg")));
		img1b.setHorizontalTextPosition(JLabel.CENTER);
		img1b.setVerticalTextPosition(JLabel.BOTTOM);
		img1b.setBounds(70, 40, 60, 70);
		panel1_3.add(img1b);
		
		JLabel img1c = new JLabel("5,49 \u20ac");
		img1c.setIcon(new ImageIcon(ShoppingMenu.class.getResource("/d1.jpg")));
		img1c.setHorizontalTextPosition(JLabel.CENTER);
		img1c.setVerticalTextPosition(JLabel.BOTTOM);
		img1c.setBounds(130, 40, 60, 70);
		panel1_3.add(img1c);
		
		JLabel img1d = new JLabel("5,99 \u20ac");
		img1d.setIcon(new ImageIcon(ShoppingMenu.class.getResource("/c1.jpg")));
		img1d.setHorizontalTextPosition(JLabel.CENTER);
		img1d.setVerticalTextPosition(JLabel.BOTTOM);
		img1d.setBounds(190, 40, 60, 70);
		panel1_3.add(img1d);
		
		JLabel veg1 = new JLabel("1,79 \u20ac");
		veg1.setIcon(new ImageIcon(ShoppingMenu.class.getResource("/v1.jpg")));
		veg1.setHorizontalTextPosition(JLabel.CENTER);
		veg1.setVerticalTextPosition(JLabel.BOTTOM);
		veg1.setBounds(10, 170, 60, 70);
		panel1_3.add(veg1);
		
		JLabel veg2 = new JLabel("1,49 \u20ac");
		veg2.setIcon(new ImageIcon(ShoppingMenu.class.getResource("/v2.jpg")));
		veg2.setHorizontalTextPosition(JLabel.CENTER);
		veg2.setVerticalTextPosition(JLabel.BOTTOM);
		veg2.setBounds(70, 170, 60, 70);
		panel1_3.add(veg2);
		
		JLabel veg3 = new JLabel("1,49 \u20ac");
		veg3.setIcon(new ImageIcon(ShoppingMenu.class.getResource("/v3.jpg")));
		veg3.setHorizontalTextPosition(JLabel.CENTER);
		veg3.setVerticalTextPosition(JLabel.BOTTOM);
		veg3.setBounds(130, 170, 60, 70);
		panel1_3.add(veg3);
		
		JLabel veg4 = new JLabel("1,79 \u20ac");
		veg4.setIcon(new ImageIcon(ShoppingMenu.class.getResource("/v4.jpg")));
		veg4.setHorizontalTextPosition(JLabel.CENTER);
		veg4.setVerticalTextPosition(JLabel.BOTTOM);
		veg4.setBounds(200, 170, 60, 70);
		panel1_3.add(veg4);
		
		JLabel veg5 = new JLabel("6,99 \u20ac");
		veg5.setIcon(new ImageIcon(ShoppingMenu.class.getResource("/v5.jpg")));
		veg5.setHorizontalTextPosition(JLabel.CENTER);
		veg5.setVerticalTextPosition(JLabel.BOTTOM);
		veg5.setBounds(10, 250, 60, 70);
		panel1_3.add(veg5);
		
		JLabel veg6 = new JLabel("0,49 \u20ac");
		veg6.setIcon(new ImageIcon(ShoppingMenu.class.getResource("/v6.jpg")));
		veg6.setHorizontalTextPosition(JLabel.CENTER);
		veg6.setVerticalTextPosition(JLabel.BOTTOM);
		veg6.setBounds(90, 250, 60, 70);
		panel1_3.add(veg6);
		
		JLabel brot1 = new JLabel("3,79 \u20ac");
		brot1.setIcon(new ImageIcon(ShoppingMenu.class.getResource("/b01.jpg")));
		brot1.setHorizontalTextPosition(JLabel.CENTER);
		brot1.setVerticalTextPosition(JLabel.BOTTOM);
		brot1.setBounds(10, 350, 60, 70);
		panel1_3.add(brot1);
		
		JLabel brot2 = new JLabel("1,39 \u20ac");
		brot2.setIcon(new ImageIcon(ShoppingMenu.class.getResource("/b02.jpg")));
		brot2.setHorizontalTextPosition(JLabel.CENTER);
		brot2.setVerticalTextPosition(JLabel.BOTTOM);
		brot2.setBounds(80, 350, 60, 70);
		panel1_3.add(brot2);
		
		JLabel brot3 = new JLabel("0,99 \u20ac");
		brot3.setIcon(new ImageIcon(ShoppingMenu.class.getResource("/b03.jpg")));
		brot3.setHorizontalTextPosition(JLabel.CENTER);
		brot3.setVerticalTextPosition(JLabel.BOTTOM);
		brot3.setBounds(150, 350, 60, 80);
		panel1_3.add(brot3);
		
		JLabel saft1 = new JLabel("2,99 \u20ac");
		saft1.setIcon(new ImageIcon(ShoppingMenu.class.getResource("/s1.jpg")));
		saft1.setHorizontalTextPosition(JLabel.CENTER);
		saft1.setVerticalTextPosition(JLabel.BOTTOM);
		saft1.setBounds(10, 465, 100, 70);
		panel1_3.add(saft1);
		
		JLabel saft2 = new JLabel("1,19 \u20ac");
		saft2.setIcon(new ImageIcon(ShoppingMenu.class.getResource("/s2.jpg")));
		saft2.setHorizontalTextPosition(JLabel.CENTER);
		saft2.setVerticalTextPosition(JLabel.BOTTOM);
		saft2.setBounds(80, 450, 60, 90);
		panel1_3.add(saft2);
		
		JLabel saft3 = new JLabel("1,29 \u20ac");
		saft3.setIcon(new ImageIcon(ShoppingMenu.class.getResource("/s3.jpg")));
		saft3.setHorizontalTextPosition(JLabel.CENTER);
		saft3.setVerticalTextPosition(JLabel.BOTTOM);
		saft3.setBounds(130, 450, 60, 90);
		panel1_3.add(saft3);
		
		JLabel drink1 = new JLabel("1,19 \u20ac");
		drink1.setIcon(new ImageIcon(ShoppingMenu.class.getResource("/dr1.jpg")));
		drink1.setHorizontalTextPosition(JLabel.CENTER);
		drink1.setVerticalTextPosition(JLabel.BOTTOM);
		drink1.setBounds(180, 450, 60, 90);
		panel1_3.add(drink1);
		
		JLabel drink2 = new JLabel("5,99 \u20ac");
		drink2.setIcon(new ImageIcon(ShoppingMenu.class.getResource("/dr2.jpg")));
		drink2.setHorizontalTextPosition(JLabel.CENTER);
		drink2.setVerticalTextPosition(JLabel.BOTTOM);
		drink2.setBounds(230, 450, 60, 90);
		panel1_3.add(drink2);
		
		///---------------------------
		
		panel1_4 = new JPanel();
		panel1_4.setBorder(new MatteBorder(14,14,14,14, (Color) new Color(95,158,160)));
		panel1_4.setBackground(new Color(95,158,160));
		panel1_4.setBounds(20, 520, 380, 173);
		contentPanel1.add(panel1_4);
		
		///----------------------------

		panel1_5 = new JPanel();
		panel1_5.setBorder(new MatteBorder(14,14,14,14, (Color) new Color(95,158,160)));
		panel1_5.setBackground(new Color(95,158,140));
		panel1_5.setBounds(500, 600, 500, 92);
		contentPanel1.add(panel1_5);
		panel1_5.setLayout(null);
		
		JButton btnPrint1_1 = new JButton("Back");
		btnPrint1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnPrint1_1.setBounds(10, 15, 80, 30);
		btnPrint1_1.addActionListener(new ActionListener() {

			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				FirstPage fP = new FirstPage();
				fP.homePage();
			}
			
		});
		panel1_5.add(btnPrint1_1);
		
		JButton btnPrint1_2 = new JButton("Exit");
		btnPrint1_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Customer Billing System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
			
				}				
			}
			
		});
		btnPrint1_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnPrint1_2.setBounds(10, 50, 80, 30);
		panel1_5.add(btnPrint1_2);
		
		JButton btnPrint1_3 = new JButton("Total");
		btnPrint1_3.setFont(new Font("Tahoma", Font.PLAIN, 28));
		//btnPrint1_1.setBounds(35, 75, 212, 73);
		panel1_5.add(btnPrint1_3);


		
		frame.setVisible(true);
	}
	
	

}
