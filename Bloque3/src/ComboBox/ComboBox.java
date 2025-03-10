package ComboBox;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComboBox {
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Hello World");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		JLabel label = new JLabel("");
		frame.getContentPane().add(label);
		
		String[] opciones = {"Gato (Gordo)", "Conejo", "Cerdito"};
        JComboBox<String> comboBox = new JComboBox<>(opciones);
        
        comboBox.addActionListener(e -> {
            String seleccion = (String) comboBox.getSelectedItem();
            label.setText("Has seleccionado: " + seleccion);
        });
        
        panel.add(comboBox);
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
