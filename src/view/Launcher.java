package view;


import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Launcher extends JFrame {
	
	public Launcher() {
		setTitle("Tweet");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		Launcher p = new Launcher();
	    
		p.pack();
		p.setSize(400, 400);
	    p.setLocationRelativeTo(null);
	    p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setVisible(true);
		
	}
	
}

