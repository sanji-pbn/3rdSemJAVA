package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

public abstract class Page {

	public abstract void show();

	public JFrame getFrame(String title) {
		JFrame frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 300);
		frame.setLocationRelativeTo(null);
		return frame;
	}
	
	public JPanel getPanel() {
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel.setBackground(Color.CYAN);
		panel.setLayout(null);
		return panel;
	}
}
