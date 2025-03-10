package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import Clases.Company;
import Clases.Event;
import Clases.HistoricalTicketing;
import Clases.Person;

// SE HA USADO AYUDA DE CHAT.OPENAI O CHATGPT
// 


public class GUI {
	private static Company c;
	private static int persona;
	private static Set<String> filtrosSeleccionados = new HashSet<>();

	private static void createAndShowGUI() {
	    JFrame frame = new JFrame("Company");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(1000, 400);

	    frame.setLayout(new BorderLayout());

	    // Crear el panel principal con BorderLayout
	    JPanel panelIzq = new JPanel();
	    panelIzq.setLayout(new BoxLayout(panelIzq, BoxLayout.Y_AXIS));
	    JPanel panelCent = new JPanel(new BorderLayout());
	    JPanel panelDerecho = new JPanel(new GridLayout(3, 2, 10, 10));

	    // Variable para guardar el número de persona seleccionada
	    int numTick = c.getHt().size();

	    String[] columnNames = {"Nombre del evento", "Numero MAX de asistentes"};
	    Object[][] data = null;

	    // Usamos DefaultTableModel en lugar de crear nuestra propia clase
	    DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
	    JTable table = new JTable(tableModel);
	    JScrollPane tableScrollPane = new JScrollPane(table);

	    panelCent.add(tableScrollPane);
	    
	    

	    ArrayList<JButton> botones = new ArrayList<>();

	    final JButton[] ultimoBotonPulsado = {null};

	    for (int i = 0; i < numTick; i++) {
	        final int j = i;
	        JButton boton = new JButton("Botón " + (i + 1));
	        botones.add(boton);
	        panelIzq.add(boton);

	        // Añadir ActionListener a cada botón
	        boton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Cambiar el color del botón pulsado a azul
	                boton.setBackground(Color.BLUE);

	                persona = j;

	                agregarDatosATabla(tableModel);

	                // Restablecer el color del último botón pulsado
	                if (ultimoBotonPulsado[0] != null && ultimoBotonPulsado[0] != boton) {
	                    ultimoBotonPulsado[0].setBackground(UIManager.getColor("Button.background"));
	                }

	                // Actualizar la referencia del último botón pulsado
	                ultimoBotonPulsado[0] = boton;
	            }
	        });
	    }

	    JTextField text1 = new JTextField();
	    JTextField text2 = new JTextField();
	    JButton boton1 = new JButton("Reset");
	    JButton boton2 = new JButton("Guardar");

	    panelDerecho.add(new JLabel("Nombre:"));
	    panelDerecho.add(text1);

	    panelDerecho.add(new JLabel("Telefono:"));
	    panelDerecho.add(text2);

	    panelDerecho.add(boton1);
	    panelDerecho.add(boton2);

	    boton1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            text1.setText("");
	            text2.setText("");
	        }
	    });

	    boton2.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            if (persona != -1) {
	                List<Person> per = c.getPer();

	                Person aux = new Person(text1.getText(), Integer.valueOf(text2.getText()));
	                aux.setId(per.get(persona).getId());
	                per.remove(persona);
	                per.add(aux);
	                
	                System.out.println(aux.getId() + aux.getName() + aux.getPhoneNumber());
	            }
	        }
	    });

	    JScrollPane scrollPane = new JScrollPane(panelIzq);
	    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

	    panelCent.add(scrollPane, BorderLayout.WEST);
	    
	    JMenuBar menuBar = new JMenuBar();

        // Crear el menú "FilterMaxAttendees"
        JMenu filterMenu = new JMenu("FilterMaxAttendees");

        // Crear los elementos de menú de tipo checkbox
        JCheckBoxMenuItem checkBoxMenuItem1 = new JCheckBoxMenuItem("Alto");
        JCheckBoxMenuItem checkBoxMenuItem2 = new JCheckBoxMenuItem("Medio");
        JCheckBoxMenuItem checkBoxMenuItem3 = new JCheckBoxMenuItem("Bajo");

        checkBoxMenuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBoxMenuItem1.isSelected()) {
                    filtrosSeleccionados.add("Alto");
                } else {
                    filtrosSeleccionados.remove("Alto");
                }
                agregarDatosATablaFiltrados(tableModel);
            }
        });

        checkBoxMenuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBoxMenuItem2.isSelected()) {
                    filtrosSeleccionados.add("Medio");
                } else {
                    filtrosSeleccionados.remove("Medio");
                }
                agregarDatosATablaFiltrados(tableModel);
            }
        });

        checkBoxMenuItem3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBoxMenuItem3.isSelected()) {
                    filtrosSeleccionados.add("Bajo");
                } else {
                    filtrosSeleccionados.remove("Bajo");
                }
                agregarDatosATablaFiltrados(tableModel);
            }
        });

        // Agregar los elementos de menú checkbox al menú "FilterMaxAttendees"
        filterMenu.add(checkBoxMenuItem1);
        filterMenu.add(checkBoxMenuItem2);
        filterMenu.add(checkBoxMenuItem3);

        menuBar.add(filterMenu);
        
	    frame.add(panelCent, BorderLayout.CENTER);
	    frame.add(panelDerecho, BorderLayout.EAST);
	    frame.setJMenuBar(menuBar);

	    frame.setVisible(true);

	}
	
	/*private static void agregarDatosATablaFiltrados(DefaultTableModel model, String filtro) {
	    model.setRowCount(0);
	    List<HistoricalTicketing> aux = c.getHt();
	    List<Object[]> filteredData = new ArrayList<>();

	    for (HistoricalTicketing ticketing : aux) {
	        for (Event event : ticketing.getEv()) {
	            // Verificar si el evento cumple con el filtro
	            if (event.getMaxNumberOfAttendees().equals(filtro)) {
	                // Agregar los datos del evento a la lista de datos filtrados
	                filteredData.add(new Object[]{event.getName(), event.getMaxNumberOfAttendees()});
	            }
	        }
	    }

	    // Agregar los datos filtrados al modelo de la tabla
	    for (Object[] rowData : filteredData) {
	        model.addRow(rowData);
	    }
	}*/
	
	private static void agregarDatosATablaFiltrados(DefaultTableModel model) {
	    model.setRowCount(0);
	    List<HistoricalTicketing> aux = c.getHt();

	    // Conjunto para mantener un registro de eventos agregados
	    Set<Event> eventosAgregados = new HashSet<>();

	    for (HistoricalTicketing ticketing : aux) {
	        for (Event event : ticketing.getEv()) {
	            // Verificar si el evento cumple con al menos uno de los filtros seleccionados
	            if (cumpleConFiltros(event) && !eventosAgregados.contains(event)) {
	                // Agregar los datos del evento a la tabla
	                model.addRow(new Object[]{event.getName(), event.getMaxNumberOfAttendees()});
	                // Agregar el evento al conjunto de eventos agregados
	                eventosAgregados.add(event);
	            }
	        }
	    }
	}

	private static boolean cumpleConFiltros(Event event) {
	    // Verificar si el evento cumple con al menos uno de los filtros seleccionados
	    for (String filtro : filtrosSeleccionados) {
	        if (filtro.equals(event.getMaxNumberOfAttendees())) {
	            return true;
	        }
	    }
	    return false;
	}
	
	private static void agregarDatosATabla(DefaultTableModel model) {
	    model.setRowCount(0);
	    List<HistoricalTicketing> aux = c.getHt();
	    Object[][] data = new Object[aux.get(persona).getEv().size()][2];

	    int i = 0;
	    
	    for (Event e : aux.get(persona).getEv()) {
	    	data[i][0] = e.getName();
            data[i][1] = e.getMaxNumberOfAttendees();
            i++;
        }

	    if (data != null) {
	        for (Object[] rowData : data) {
	            model.addRow(rowData);
	        }
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		c = Helper.CompanyHelper.createCompanyTercerParcial();
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
		
	}

}
