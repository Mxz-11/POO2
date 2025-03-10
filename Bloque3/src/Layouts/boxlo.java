package Layouts;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class boxlo {

	/**
	 * LITERALMENTE UN FLOWLAYOUT POCHO EN EL QUE METES LOS ELEMENTOS 
	 * UNO DETRÁS DEL OTRO, OCUPANDO LO QUE NECESITE CADA UNO.
	 * Filas:
	 * 	E1-E2-E3-E4-...
	 * Cols:
	 * 	E1
	 * 	 |
	 *  E2
	 *   |
	 *  E3
	 *  ...
	 *  
	 *  LA FUNCIÓN PARA DECIR SI SE QUIEREN EN FILAS O COLS ES BoxLayout.X_AXIS
	 *  SIENDO X O Y LAS OPCIONES.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear el frame principal
        /*JFrame frame = new JFrame("Ejemplo de BoxLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Crear un panel con BoxLayout en eje Y
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Agregar botones al panel
        panel.add(new JButton("Botón 1"));
        panel.add(new JButton("Botón 2"));
        panel.add(new JButton("Botón 3"));

        // Agregar el panel al frame
        frame.add(panel);

        // Hacer visible el frame
        frame.setVisible(true);*/
		// Crear el frame principal
		
        JFrame frame = new JFrame("Ejemplo de BoxLayout en fila");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Crear un panel con BoxLayout en eje X (fila)
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        // Agregar botones al panel
        panel.add(new JButton("Botón 1"));
        panel.add(new JButton("Botón 2"));
        panel.add(new JButton("Botón 3"));

        // Agregar el panel al frame
        frame.add(panel);

        // Hacer visible el frame
        frame.setVisible(true);
        
	}

}
