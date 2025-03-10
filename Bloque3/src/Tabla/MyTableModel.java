package Tabla;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel {
	 private List<Person> data = new ArrayList<>();
     private String[] columns = {"Nombre", "Edad", "Ciudad"};

     @Override
     public int getRowCount() {
         return data.size();
     }

     @Override
     public int getColumnCount() {
         return columns.length;
     }

     @Override
     public Object getValueAt(int rowIndex, int columnIndex) {
         Person person = data.get(rowIndex);
         switch (columnIndex) {
             case 0:
                 return person.name;
             case 1:
                 return person.age;
             case 2:
                 return person.city;
             default:
                 return null;
         }
     }

     @Override
     public String getColumnName(int column) {
         return columns[column];
     }

     // Método para agregar una persona al modelo de datos
     public void addPerson(Person person) {
         data.add(person);
         fireTableDataChanged(); // Notificar al JTable que los datos han cambiado
     }

     // Método para actualizar la edad de una persona en el modelo de datos
     public void updatePersonAge(int rowIndex, int newAge) {
         if (rowIndex >= 0 && rowIndex < data.size()) {
             data.get(rowIndex).age = newAge;
             fireTableRowsUpdated(rowIndex, rowIndex); // Notificar al JTable que se ha actualizado una fila
         }
     }
}
