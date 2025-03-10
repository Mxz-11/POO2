package calcu;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculadora {

	private static void createAndShowGUI() {
        // Crear el marco principal
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Crear el panel que contendrá los botones y el campo de texto
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        // Campo de texto para mostrar la entrada y el resultado
        JTextField textField = new JTextField();
        textField.setEditable(false); // El usuario no puede editar este campo
        panel.add(textField, BorderLayout.NORTH);
        
        // Crear el panel para los botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5)); // GridLayout de 4 filas y 4 columnas
        
        // Crear los botones
        String[] buttonLabels = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "C", "0", "=", "/"
        };
        
        JButton[] buttons = new JButton[buttonLabels.length];
        
        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttonPanel.add(buttons[i]);
        }
        
        // Manejo de eventos de los botones
        ActionListener listener = new ActionListener() {
            StringBuilder input = new StringBuilder(); // Para almacenar la entrada de usuario
            double num1 = 0, num2 = 0; // Para almacenar los operandos
            char operation = ' '; // Para almacenar la operación a realizar
            
            @Override
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                
                switch (command) {
                    case "C":
                        input.setLength(0); // Borrar la entrada
                        break;
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        if (input.length() > 0) {
                            num1 = Double.parseDouble(input.toString());
                            operation = command.charAt(0);
                            input.setLength(0); // Borrar la entrada
                        }
                        break;
                    case "=":
                        if (input.length() > 0) {
                            num2 = Double.parseDouble(input.toString());
                            double result = 0;
                            switch (operation) {
                                case '+':
                                    result = num1 + num2;
                                    break;
                                case '-':
                                    result = num1 - num2;
                                    break;
                                case '*':
                                    result = num1 * num2;
                                    break;
                                case '/':
                                    if (num2 != 0) {
                                        result = num1 / num2;
                                    } else {
                                        result = Double.POSITIVE_INFINITY;
                                    }
                                    break;
                            }
                            input.setLength(0); // Borrar la entrada
                            input.append(result);
                            textField.setText(input.toString()); // Mostrar el resultado en el campo de texto
                        }
                        break;
                    default:
                        input.append(command);
                        textField.setText(input.toString()); // Mostrar la entrada en el campo de texto
                        break;
                }
            }
        };
        
        // Agregar el mismo listener a todos los botones, excepto al de "C" y "="
        for (int i = 0; i < buttonLabels.length; i++) {
            if (!buttonLabels[i].equals("C") && !buttonLabels[i].equals("=")) {
                buttons[i].addActionListener(listener);
            }
        }
        
        // Agregar el panel de botones al panel principal
        panel.add(buttonPanel, BorderLayout.CENTER);
        
        // Agregar el panel principal al marco
        frame.getContentPane().add(panel);
        
        // Ajustar el tamaño del marco y hacerlo visible
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
