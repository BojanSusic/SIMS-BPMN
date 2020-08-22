package Paneli;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StatusBarPanel  extends JPanel{


	private static final long serialVersionUID = 1L;
	
	
	
	
	JLabel brojPogodaka = new JLabel("Powered by Group 1");

	public StatusBarPanel() {
		setLayout(new FlowLayout(FlowLayout.LEADING));
		setPreferredSize(new Dimension(0, 30));
		
		add(brojPogodaka);	
	}
	


}
