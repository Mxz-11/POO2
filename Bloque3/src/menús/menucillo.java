package menús;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class menucillo {

	private static void createAndShowGUI() {
		// Crear el marco (JFrame)
        JFrame frame = new JFrame("Ejemplo de Menú");
        
        // Establecer el tamaño del marco
        frame.setSize(400, 200);
        
        // Establecer la operación de cierre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Crear la barra de menú (JMenuBar)
        JMenuBar menuBar = new JMenuBar();
        
        // Crear el menú (JMenu)
        JMenu menu = new JMenu("Opciones");
        
        // Crear los elementos del menú (JMenuItem)
        JMenuItem menuItem1 = new JMenuItem("Opción 1");
        JMenuItem menuItem2 = new JMenuItem("Opción 2");
        JMenuItem menuItem3 = new JMenuItem("Opción 3");
        JMenuItem exitItem = new JMenuItem("Salir");
        
        // Añadir los elementos al menú
        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(menuItem3);
        menu.addSeparator(); // Añadir un separador
        menu.add(exitItem);
        
        // Añadir el menú a la barra de menú
        menuBar.add(menu);
        
        // Establecer la barra de menú en el marco
        frame.setJMenuBar(menuBar);
        
        // Crear un panel (JPanel)
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Selecciona una opción del menú.");
        panel.add(label);
        
        // Añadir el panel al marco
        frame.add(panel);
        
        // Añadir ActionListeners a los elementos del menú
        menuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Has seleccionado Opción 1");
            }
        });

        menuItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Has seleccionado Opción 2");
            }
        });

        menuItem3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Has seleccionado Opción 3");
            }
        });

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Salir de la aplicación
            }
        });
        
        // Hacer visible el marco
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
