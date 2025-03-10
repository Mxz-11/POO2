package boton;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class boton {
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Hello World");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
        
        JButton button = new JButton("Haz clic aquí");
        
		JLabel label = new JLabel("Hello world");
        panel.add(button);
        
		frame.getContentPane().add(label);
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

}
