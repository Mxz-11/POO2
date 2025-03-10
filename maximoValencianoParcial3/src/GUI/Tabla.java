package GUI;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import Clases.Event;

public class Tabla extends AbstractTableModel{
	 	private String[] columnNames;
	    private Object[][] data;
	    private static final int COLUMN_INDEX_NOMBRE = 0;
	    private static final int COLUMN_INDEX_NUMERO_ASISTENTES = 1;
	    private List<Event> eventos; // Lista de objetos Evento

	    public Tabla(String[] columnNames, Object[][] data, List<Event> eventos) {
	        this.columnNames = columnNames;
	        this.data = data;
	        this.eventos = eventos;
	    }

	    @Override
	    public int getRowCount() {
	        return data.length;
	    }

	    @Override
	    public int getColumnCount() {
	        return columnNames.length;
	    }

	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        return data[rowIndex][columnIndex];
	    }

	    @Override
	    public String getColumnName(int column) {
	        return columnNames[column];
	    }

	    @Override
	    public boolean isCellEditable(int rowIndex, int columnIndex) {
	        return false; // No editable por defecto
	    }

	    @Override
	    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
	        data[rowIndex][columnIndex] = aValue;
	        fireTableCellUpdated(rowIndex, columnIndex);

	        Event evento = eventos.get(rowIndex);
	        if (columnIndex == COLUMN_INDEX_NOMBRE) {
	        	evento.setName((String) aValue);
	        } else if (columnIndex == COLUMN_INDEX_NUMERO_ASISTENTES) {
	            evento.setMaxNumberOfAttendees((String) aValue);
	        }
	    }	
}
