package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstPage extends Page {

	@Override
	public void show() {

		Font font = DesignHelper.getFont();

		JFrame frame = this.getFrame("Welcome First Page");

		JPanel panel = this.getPanel();
		frame.add(panel);

		JLabel introLabel1 = new JLabel(" 'Welcome' ");
		introLabel1.setBounds(125, 40, 180, 50);
		introLabel1.setFont(font);
		panel.add(introLabel1);

		JLabel extraAdd = new JLabel("to");
		extraAdd.setBounds(170, 60, 80, 50);
		panel.add(extraAdd);

		JLabel introLabel2 = new JLabel("Online Shopping");
		introLabel2.setBounds(105, 80, 180, 50);
		introLabel2.setFont(font);
		introLabel2.setForeground(Color.MAGENTA);
		panel.add(introLabel2);

		JButton button1 = new JButton("Press");
		button1.setBounds(140, 130, 80, 20);
		panel.add(button1);
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				frame.setVisible(false);
				SecondPage secondPage = new SecondPage();
				secondPage.show();

			}
		});

		JLabel introLabel3 = new JLabel("Press to enter");
		introLabel3.setBounds(120, 150, 180, 50);
		introLabel3.setFont(font);
		introLabel3.setForeground(Color.BLUE);
		panel.add(introLabel3);

		frame.setVisible(true);
	}

	
}
