package example4;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableExample4 {

	public static void main(String[] args) {

		JFrame frame = new JFrame();

		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		MiListaDePersonas data = new MiListaDePersonas();
		
		JTable table = new JTable(data);
		
		//le digo que la columna del procentaje se renderiza con mi CellRender de progresBars
		table.getColumn(table.getColumnName(3)).setCellRenderer(new ProgressCellRender());
		
		JScrollPane scroll = new JScrollPane(table);
		
		scroll.setBackground(Color.RED);
		
		frame.add(scroll,BorderLayout.CENTER);
		
		frame.setVisible(true);
	}

}
