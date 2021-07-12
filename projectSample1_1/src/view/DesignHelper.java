package view;

import java.awt.Font;

/** Helper Class to use different design options
 * */
public class DesignHelper {

	/**
	 * @return Font Tahoma with size 18
	 * */
	public static Font getFont()
	{
		return new Font("Tahoma", Font.PLAIN, 18);
	}
 
	public static Font getPrintFont() {
		return new Font("Serif", Font.PLAIN, 14);
	}
	
}
