package List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class List {
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
		
        JList<String> lista = new JList<>(listModel);
        
        lista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        
        JScrollPane scrollPane = new JScrollPane(lista);
        
        panel.add(scrollPane);
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
