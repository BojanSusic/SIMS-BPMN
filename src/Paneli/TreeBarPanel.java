package Paneli;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TreeBarPanel  extends JPanel{


	private static final long serialVersionUID = 1L;
	
	
	
	
	JLabel brojPogodaka = new JLabel("Powered by Group 1");

	public TreeBarPanel() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setPreferredSize(new Dimension(300, 0));
		setBackground(new Color(25500));
		
		add(brojPogodaka);	
	}
	


}