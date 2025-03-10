package Tabla;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class tablaCulera {
	private static void createAndShowGUI() {
		// Crear el frame principal
        JFrame frame = new JFrame("Ejemplo de Actualización en JTable");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Crear el modelo de datos para el JTable
        MyTableModel model = new MyTableModel();

        // Crear el JTable con el modelo de datos
        JTable table = new JTable(model);

        // Crear un botón para actualizar la edad de una persona
        JButton updateButton = new JButton("Actualizar Edad");
        JButton meter = new JButton("Meter Edad");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Supongamos que queremos actualizar la edad de la primera persona en la lista
                if (model.getRowCount() > 0) {
                    // Modificar la edad de la primera persona
                    model.updatePersonAge(0, 40); // Actualizar la edad a 40 años
                }
            }
        });
        
        meter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Supongamos que queremos actualizar la edad de la primera persona en la lista
                if (model.getRowCount() > 0) {
                    // Modificar la edad de la primera persona
                    model.addPerson(new Person("fran", 12, "tostus"));
                }
            }
        });

        // Añadir el JTable y el botón a un JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);
        JPanel panel = new JPanel();
        panel.add(updateButton);
        panel.add(meter);
        frame.add(panel, "North");
        frame.add(scrollPane);

        // Hacer visible el frame
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
