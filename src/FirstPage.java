package projectSample1_1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

public class FirstPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		homePage();
	}
	
	public static void homePage() {
		JFrame frame = new JFrame("frontPage");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 300);
		frame.setLocation(50,50);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(14,14,14,14, (Color) new Color(95,158,160)));
		panel.setBackground(Color.CYAN);
		frame.add(panel);
		panel.setLayout(null);
		
		JLabel introLabel1 = new JLabel(" 'Welcome' ");
		introLabel1.setBounds(125, 40, 180, 50);
		introLabel1.setFont(new Font("Serif", Font.BOLD, 18));
		panel.add(introLabel1);
		
		JLabel extraAdd = new JLabel("to");
		extraAdd.setBounds(175, 60, 80, 50);
		panel.add(extraAdd);
		
		JLabel introLabel2 = new JLabel("Online Shopping");
		introLabel2.setBounds(100, 80, 180, 50);
		introLabel2.setFont(new Font("Serif", Font.BOLD, 19));
		introLabel2.setForeground(Color.MAGENTA);
		panel.add(introLabel2);
				
		JButton button1 = new JButton("Press");
		button1.setBounds(145, 130, 80, 20);
		panel.add(button1);
		button1.addActionListener(new ActionListener() {

			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				MainMenu mm = new MainMenu();
				mm.ShoppingMenu();				
			}
			
		});
		
		JLabel introLabel3 = new JLabel("Press to enter iShop");
		introLabel3.setBounds(110, 150, 180, 50);
		introLabel3.setFont(new Font("Serif", Font.BOLD, 15));
		introLabel3.setForeground(Color.BLUE);
		panel.add(introLabel3);
			
		
		frame.setVisible(true);
	}

}
