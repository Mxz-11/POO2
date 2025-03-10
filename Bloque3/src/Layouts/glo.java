package Layouts;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class glo {

	/*
	 * LITERALMENTE CREA UN ESPACIO DONDE LOS ELEMENTOS QUE SE INTRODUZCAN
	 * ESTARÁN PEGADOS UNOS A OTROS Y ESTOS OCUPARÁN EL ESPACIO COMPLETO DE LA
	 * PANTALLA.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear el frame principal
        JFrame frame = new JFrame("Ejemplo de GridLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Crear un panel con GridLayout (3 filas, 2 columnas)
        JPanel panel = new JPanel(new GridLayout(3, 2));

        // Agregar etiquetas al panel
        panel.add(new JLabel("Etiqueta 1"));
        panel.add(new JLabel("Etiqueta 2"));
        panel.add(new JLabel("Etiqueta 3"));
        panel.add(new JLabel("Etiqueta 4"));
        panel.add(new JLabel("Etiqueta 5"));
        panel.add(new JLabel("Etiqueta 6"));

        // Agregar el panel al frame
        frame.add(panel);

        // Hacer visible el frame
        frame.setVisible(true);
	}

}
