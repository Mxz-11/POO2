package example4;

import java.awt.Component;

import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;


/**
 * Esta clase implementa el TableCellRenderer y sera capaz de renderizar una celda mostrando una JProgressBar
 * Para ello, utiliza una JProgressBar internat (bar) a la que setea el valor adecuado y la devuelve.
 * Cuando la JTable llame al metodo getTableCellRendererComponent, devolvera una ProgressBar con el porcentaje adecuado y será "impreso" en la celda correspondiente
 * La JTable le llamará con el valor que tiene que mostrar, tal y como lo ha recibido del TableModel.
 *
 *Fuente: https://docs.oracle.com/javase/tutorial/uiswing/components/table.html#renderer
 *Fuente: https://stackoverflow.com/questions/13753562/adding-progress-bar-to-each-table-cell-for-file-progress-java
 */
public class ProgressCellRender implements TableCellRenderer {

	//es la barra que utilizaremos para las celdas, solo necesitamos una, siempre es la misma la que se pinta con diferentes porcentajes
	JProgressBar bar;
	
	public ProgressCellRender() {
		bar = new JProgressBar();
	}
	
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        int progress = 0;
        if (value instanceof Float) {
            progress = Math.round((float) value);
        } else if (value instanceof Integer) {
            progress = (int) value;
        }
        bar.setValue(progress);
        return bar;
    }
}
