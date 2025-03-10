package List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;

public class lista {
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
        
        // Creamos un JLabel para mostrar el elemento seleccionado
        JLabel label = new JLabel("Selecciona un elemento:");
		
		DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Elemento 1");
        listModel.addElement("Elemento 2");
        listModel.addElement("Elemento 3");
        listModel.addElement("Elemento 4");
        listModel.addElement("Elemento 5");
		
        JList<String> l = new JList<>(listModel);
        
		panel.add(label);
        
        frame.getContentPane().add(panel);	
		frame.pack();
		frame.setVisible(true);
	}
}
