package Layouts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class blo {

	
	/**
	 * 	LITERALMENTE SE DIVIDE LA PANTALLA EN:
	 * 		-ARRIBA
	 * 		-ABAJO
	 * 		-CENTRO
	 * 		-IZQUIERDA (WEST)
	 * 		-DERECHA (EAST)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Ejemplo de BorderLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Crear paneles para cada región del BorderLayout
        JPanel panelNorte = new JPanel();
        panelNorte.setBackground(Color.RED);
        panelNorte.add(new JLabel("Norte"));

        JPanel panelSur = new JPanel();
        panelSur.setBackground(Color.BLUE);
        panelSur.add(new JLabel("Sur"));

        JPanel panelEste = new JPanel();
        panelEste.setBackground(Color.GREEN);
        panelEste.add(new JLabel("Este"));

        JPanel panelOeste = new JPanel();
        panelOeste.setBackground(Color.YELLOW);
        panelOeste.add(new JLabel("Oeste"));

        JPanel panelCentro = new JPanel();
        panelCentro.setBackground(Color.ORANGE);
        panelCentro.setLayout(new FlowLayout()); // Usaremos un FlowLayout dentro del centro para agregar varios componentes
        panelCentro.add(new JButton("Botón 1"));
        panelCentro.add(new JButton("Botón 2"));
        panelCentro.add(new JButton("Botón 3"));

        // Asignar paneles a las diferentes regiones del BorderLayout
        frame.add(panelNorte, BorderLayout.NORTH);
        frame.add(panelSur, BorderLayout.SOUTH);
        frame.add(panelEste, BorderLayout.EAST);
        frame.add(panelOeste, BorderLayout.WEST);
        frame.add(panelCentro, BorderLayout.CENTER);

        // Hacer visible el frame
        frame.setVisible(true);
	}

}
