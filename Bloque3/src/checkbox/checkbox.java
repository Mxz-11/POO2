package checkbox;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class checkbox {
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Hello World");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        JPanel panel = new JPanel();
		JLabel label = new JLabel();
        JCheckBox checkBox = new JCheckBox("Marcar esta casilla");
		frame.getContentPane().add(label);
		
		checkBox.addActionListener(e -> {
            if (checkBox.isSelected()) {
                label.setText("La casilla está marcada");
            } else {
                label.setText("La casilla está desmarcada");
            }
        });
		
		panel.add(checkBox);
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
