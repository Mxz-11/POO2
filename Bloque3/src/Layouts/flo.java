package Layouts;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class flo {

	/**
	 * LITERALMENTE SE ADAPTA AL TAMAÑO DE LA PANTALLA.
	 * SE VAN METIENDO UNO TRAS OTRO EN EL ORDEN DE 
	 * "frame.add()"
	 * E1-E2-E3-E4-E5-...
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Ejemplo de FlowLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Crear un panel con FlowLayout
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Agregar botones al panel
        for (int i = 1; i <= 6; i++) {
            panel.add(new JButton("Botón " + i));
        }

        // Agregar el panel al frame
        frame.add(panel);

        // Hacer visible el frame
        frame.setVisible(true);
        /*
        JFrame frame = new JFrame("Ejemplo de FlowLayout con columnas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Crear un panel con FlowLayout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10)); // Espaciado horizontal y vertical entre componentes

        // Crear paneles adicionales para organizar los componentes en columnas
        JPanel column1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel column2 = new JPanel(new FlowLayout(FlowLayout.LEFT));

        // Agregar botones a los paneles de columnas
        for (int i = 1; i <= 6; i++) {
            if (i <= 3) {
                column1.add(new JButton("Botón " + i));
            } else {
                column2.add(new JButton("Botón " + i));
            }
        }

        // Agregar paneles de columnas al panel principal
        mainPanel.add(column1);
        mainPanel.add(column2);

        // Agregar el panel principal al frame
        frame.add(mainPanel);

        // Hacer visible el frame
        frame.setVisible(true);*/
	}

}
