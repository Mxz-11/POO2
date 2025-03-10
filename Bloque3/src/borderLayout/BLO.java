package borderLayout;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class BLO {
	private static void createAndShowGUI() {
        
        //Create and set up the window.
        JFrame frame = new JFrame("BorderLayoutDemo");		//Creamos el Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	//Hacemos que se termine cuando cerremos el programa
        
        if (!(frame.getContentPane().getLayout() instanceof BorderLayout)) {
        	frame.getContentPane().add(new JLabel("Container doesn't use BorderLayout!"));
            return;
        }        
        
        JLabel label = new JLabel("Perretes");	//Creo la etiqueta Perretes
        JLabel car = new JLabel("Carta para adoptar a un perrete");	//Creo la etiqueta Perretes

        JLabel titleLabel = new JLabel("Perretes en el refugio", SwingConstants.CENTER);	//Creo la etiqueta Perretes en el refugio y pongo que se ponga en el centro
        frame.getContentPane().add(label, BorderLayout.NORTH);	//Añado en el centro de la pantalla y en la parte de arriba la etiqueta perretes
        
        JPanel centerPanel = new JPanel(); 	//Creo un panel
        centerPanel.setLayout(new GridLayout(0, 2));	//Hago que sea de tipo grid el layout del panel
        JPanel carta = new JPanel();
        carta.setLayout(new BoxLayout(carta, BoxLayout.Y_AXIS));

    	frame.getContentPane().setComponentOrientation(java.awt.ComponentOrientation.RIGHT_TO_LEFT);	//Ponemos que esté en la derecha
      
    	JEditorPane editorPane = new JEditorPane();	//Creo un panel para editar
    	editorPane.setEditable(true);	//Hago que se pueda editar
    	
        DefaultListModel<String> listModel = new DefaultListModel<>();	//Creo una lista para guardar los perros en el refugio
        //Les doy valores
        listModel.addElement("Paco");
        listModel.addElement("Trueno");
        listModel.addElement("Oreo");
        listModel.addElement("Delta");
        listModel.addElement("Firulais");
        
        String[] opciones = {"Paco", "Trueno", "Oreo", "Delta", "Firulais"};
        JComboBox<String> comboBox = new JComboBox<>(opciones);
        
        JList<String> lista = new JList<>(listModel);	//Creo la lista y le doy los valores de la listModel
        
        JButton button = new JButton("Adoptar");
        
        JPanel listaPanel = new JPanel(new GridLayout(0, 1));	
        listaPanel.add(titleLabel);
        listaPanel.add(lista);
        listaPanel.add(comboBox);
        listaPanel.add(button);
        
        carta.add(car);
        carta.add(editorPane);
        
        
        
        centerPanel.add(listaPanel);
        centerPanel.add(carta);
        frame.getContentPane().add(centerPanel, BorderLayout.CENTER);
        
        frame.pack();
        frame.setVisible(true);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
         
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}

}
