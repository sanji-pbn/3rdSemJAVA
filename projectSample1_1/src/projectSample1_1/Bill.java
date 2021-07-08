package projectSample1_1;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Bill {

	private static JTextArea area;
	private List<Item> itemList;
	
	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public void print() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(600, 0, 300, 500);
		JPanel contentPanel1 = new JPanel();
		contentPanel1.setBorder(new EmptyBorder(5,5,5,5));
		contentPanel1.setBackground(Color.CYAN);
		frame.setContentPane(contentPanel1);
		contentPanel1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 10, 260, 460);
		contentPanel1.add(panel);
		panel.setLayout(null);
		
		area = new JTextArea();
		area.setBounds(20, 10, 220, 440);
		panel.add(area);
		
		//=================================================
		area.setEnabled(true);
		//=================================================
		Calendar timer = Calendar.getInstance();
		timer.getTime();
		SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
		tTime.format(timer.getTime());
		SimpleDateFormat tDate = new SimpleDateFormat("dd-MM-yyyy");
		tDate.format(timer.getTime());
		//=================================================
		// yaha chai majale bill milaunu parne like kasari raknu bhanera as an printed output
		area.append("Customer Billing Systems\n");
		
		double iTotal = 0.0;
		for(Item item:itemList) {
			area.append(item.getName() + "\t" + item.getTotal() + "\n");
			iTotal += item.getTotal();

		}		
		area.append("-------\t Thank you\t-------\n");
		area.append("Total" + iTotal);
		
		frame.setVisible(true);
		
	}
	

}
