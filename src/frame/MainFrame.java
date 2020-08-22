package frame;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Paneli.MainPanel;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainFrame() {
		setTitle("BPMN Editor");
		
		setSize(1920, 1040);
		getContentPane().add(new MainPanel());
		
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
