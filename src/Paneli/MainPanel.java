package Paneli;

import java.awt.BorderLayout;

import javax.swing.JPanel;


public class MainPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private StatusBarPanel statusBarPanel = new StatusBarPanel();
	private TreeBarPanel treeBarPanel=new TreeBarPanel();
	public MainPanel() {
		
		setLayout(new BorderLayout());
		

		add(treeBarPanel, BorderLayout.WEST);
		add(statusBarPanel, BorderLayout.SOUTH);
	}

	public StatusBarPanel getStatusBarPanel() {
		return statusBarPanel;
	}
	
	
}
