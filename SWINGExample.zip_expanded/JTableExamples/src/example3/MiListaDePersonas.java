package example3;


import java.util.ArrayList;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import common.Persona;

public class MiListaDePersonas implements TableModel {

	ArrayList<Persona> personas;

	String[] columnNames = new String[] { "Nombre", "Apellido", "Edad" };

	public MiListaDePersonas() {

		personas = new ArrayList<Persona>();

		for (int i = 0; i < 2; i++) {

			personas.add(new Persona("Nombre" + i, "Apellido" + i, i));
		}

		
		System.out.println(personas);
	}

	@Override
	public void addTableModelListener(TableModelListener l) {

	}
	
	@Override
	public void removeTableModelListener(TableModelListener l) {

	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		
		//System.out.println("getColumnClass "+columnIndex);
		
		if(columnIndex == 2)
			return Integer.class;
			
		return String.class;
	}

	@Override
	public int getColumnCount() {
		//System.out.println("getColumnCount ");
		return columnNames.length;
	}

	@Override
	public String getColumnName(int columnIndex) {
		//System.out.println("getColumnName "+columnIndex);
		return columnNames[columnIndex];
	}

	@Override
	public int getRowCount() {
		//System.out.println("getRowCount ");
		return personas.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		//System.out.println("getValueAt "+rowIndex+" - "+columnIndex);
		
		Persona p = personas.get(rowIndex);

		if (columnIndex == 0)
			return p.getNombre();

		if (columnIndex == 1)
			return p.getApellido();

		if (columnIndex == 2)
			return p.getEdad();

		return "";
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		//System.out.println("cellEditable "+rowIndex+" - "+columnIndex);
		return true;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		
		//System.out.println("setValueAt "+rowIndex+" - "+columnIndex+" - "+aValue+" - "+aValue.getClass());
		
		Persona p = personas.get(rowIndex);
		
		if (aValue instanceof String)
		{	
			String value = (String)aValue;
			
			if(columnIndex==0)
				p.setNombre(value);
			
			if(columnIndex==1)
				p.setApellido(value);
		
		}
		else if(aValue instanceof Integer) {
			
			Integer numero = (Integer)aValue;
			
			if(columnIndex == 2) {
				
				p.setEdad(numero);
				
			}
		}
		
		
		System.out.println(personas);
		
	}
}
