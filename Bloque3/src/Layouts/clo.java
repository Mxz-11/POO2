package Layouts;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class clo {

	/**
	 * LITERALMENTE UNA BARAJA DE CARTAS, HAY UNA DETRAS DE OTRA. PARA ACCEDER
	 * A CADA UNO DE ESTOS ELEMENTOS SE HACE .NEXT O .PREVIOUS, PASANDO COMO PARAMETRO
	 * EL CARD LAYOUT AL QUE PREVIAMENTE SE LE HAN INTRODUCIDO LOS ELEMENTOS QUE SE ESPERAN
	 * VER.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	JFrame frame = new JFrame("Ejemplo de CardLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Crear un contenedor con CardLayout
        JPanel cardPanel = new JPanel(new CardLayout());

        // Crear paneles individuales para cada "tarjeta"
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Tarjeta 1"));

        JPanel card2 = new JPanel();
        card2.add(new JLabel("Tarjeta 2"));

        JPanel card3 = new JPanel();
        card3.add(new JLabel("Tarjeta 3"));

        // Agregar las "tarjetas" al contenedor con CardLayout
        cardPanel.add(card1, "Tarjeta 1");
        cardPanel.add(card2, "Tarjeta 2");
        cardPanel.add(card3, "Tarjeta 3");

        // Botones para cambiar entre "tarjetas"
        JButton prevButton = new JButton("Anterior");
        JButton nextButton = new JButton("Siguiente");

        // ActionListener para el botón "Anterior"
        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                cardLayout.previous(cardPanel);
            }
        });

        // ActionListener para el botón "Siguiente"
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                cardLayout.next(cardPanel);
            }
        });

        // Panel para los botones de navegación
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);

        // Añadir el contenedor de "tarjetas" y el panel de botones al frame
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Hacer visible el frame
        frame.setVisible(true);
	}

}
