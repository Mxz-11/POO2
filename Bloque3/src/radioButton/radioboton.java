package radioButton;

import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class radioboton {
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Hello World");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		JLabel label = new JLabel("Selecciona una opción:");
	
        
        ButtonGroup grupo = new ButtonGroup();

        panel.add(label);
        
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
