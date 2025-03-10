package Layouts;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class gblo {

	/*
	 * LITERALMENTE ES UN GRIDLAYOUT, SOLO QUE SE LE PUEDEN DAR TAMAÑOS
	 * CON LAS FUNCIONES: "gridwidth" Y "gridheight". MIENTRAS QUE POR 
	 * OTRA PARTE, SE PUEDEN DAR POSICIONES CON LOS "GridBagConstraints"
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear el frame principal
        JFrame frame = new JFrame("Ejemplo de GridBagLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Crear un panel con GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());

        // Crear y configurar el GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL; // El componente se expande horizontalmente para llenar el espacio disponible
        gbc.insets = new Insets(5, 5, 5, 5); // Margen entre componentes

        // Agregar componentes al panel con GridBagLayout
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Etiqueta 1"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(new JLabel("Etiqueta 2"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2; // El componente ocupa dos celdas en el eje X
        panel.add(new JLabel("Etiqueta 3"), gbc);

        // Agregar el panel al frame
        frame.add(panel);

        // Hacer visible el frame
        frame.setVisible(true);
	}

}
