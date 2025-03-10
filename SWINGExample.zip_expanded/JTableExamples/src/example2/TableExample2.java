package example2;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableExample2 {

	public static void main(String[] args) {

		
		
		MiListaDePersonasParaLaTabla dataSource = new MiListaDePersonasParaLaTabla();
		
		
		
		
		JFrame frame1 = new JFrame();

		frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JTable table1 = new JTable(dataSource.getData(), dataSource.getColumnNames());
		
		JScrollPane scroll1 = new JScrollPane(table1);
		
		scroll1.setBackground(Color.RED);
		
		frame1.add(scroll1,BorderLayout.CENTER);
		frame1.setVisible(true);
		
		
		
		
		JFrame frame = new JFrame();

		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JTable table = new JTable(dataSource.getData(), dataSource.getColumnNames());
		
		JScrollPane scroll = new JScrollPane(table);
		
		scroll.setBackground(Color.BLUE);
		
		frame.add(scroll,BorderLayout.CENTER);
		
		frame.setVisible(true);
		
		
	}

}
