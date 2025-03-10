package example1;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableExample1 {

	public static void main(String[] args) {

		JFrame frame = new JFrame();

		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		
		String[][] data = { { "name1", "apellido1", "21" }, { "name1", "apellido1", "21" },
				{ "name1", "apellido1", "21" },{ "name1", "apellido1", "21" }, { "name1", "apellido1", "21" },
				{ "name1", "apellido1", "21" },{ "name1", "apellido1", "21" }, { "name1", "apellido1", "21" },
				{ "name1", "apellido1", "21" },{ "name1", "apellido1", "21" }, { "name1", "apellido1", "21" },
				{ "name1", "apellido1", "21" },{ "name1", "apellido1", "21" }, { "name1", "apellido1", "21" },
				{ "name1", "apellido1", "21" },{ "name1", "apellido1", "21" }, { "name1", "apellido1", "21" },
				{ "name1", "apellido1", "21" } };

		String [] columnas = {"Nombre","Apellido","Edad"};
		
		JTable table = new JTable(data, columnas);
		
		JScrollPane scroll = new JScrollPane(table);
		
		scroll.setBackground(Color.RED);
		
		frame.add(scroll,BorderLayout.CENTER);
		
		frame.setVisible(true);
	}

}
