package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Discos.Album;
import Discos.Artista;
import Discos.Cancion;
import Discos.Musica;

public class GUI {
	private static JLabel nombreColecLabel;
    private static JLabel numArtistasLabel;
    private static JLabel numAlbumesLabel;
    private static JLabel numCancionesLabel;
    private static Musica m;
	
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Musica");
        frame.setSize(1600, 2000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel(new GridLayout(1, 6));
        JPanel panel2 = new JPanel(new GridLayout(4, 2));
        
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);

        model.addColumn("Artista");
        model.addColumn("Album");
        model.addColumn("Titulo");
        model.addColumn("Año");
        model.addColumn("Duración");
        model.addColumn("Estilo");   
        
        agregarDatosATabla(model);        

        // Añadir la tabla al panel1
        panel1.add(new JScrollPane(table), BorderLayout.CENTER);
        
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Append");
        JMenuItem menuItem1 = new JMenuItem("Cambiar Musica");
        JMenuItem menuItem2 = new JMenuItem("Artista Nuevo");
        JMenuItem menuItem3 = new JMenuItem("Album Nuevo");
        JMenuItem menuItem4 = new JMenuItem("Dialog Musica");

        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(menuItem3);
        menu.add(menuItem4);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        
        menuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Random rand = new Random();
            	m = Helper.HelperMusica.createMusica(rand.nextInt(5) + 1, rand.nextInt(4) + 1, rand.nextInt(11) + 1, "Actualizado");
            	actualizarLabels();
                agregarDatosATabla(model);        
            }
        });
        
        menuItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Artista a = new Artista("Pedro");
            	Album al = new Album("Pedro pedro pedro, pedro pe");
            	Cancion c = new Cancion("Pedro pedro pedro, pedro pe", 1.4, 2023, "Tecknaso");
            	al.addCancion(c);
            	a.addAlbum(al);
            	m.addArtista(a);
            	actualizarLabels();
                agregarDatosATabla(model);        
            }
        });
        
        menuItem3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Set<Artista> art = m.getArt();	
            	List<Artista> listaArtistas = new ArrayList<>(art);
            	Artista ultimoArtista = listaArtistas.get(listaArtistas.size() - 1);
                listaArtistas.remove(ultimoArtista);

                Artista aux = new Artista(ultimoArtista.getNombreArt());
                for (Album i: ultimoArtista.getAlbumes()) {
                	aux.addAlbum(i);
                }
                Album an = new Album("Album Nuevo");
            	Cancion c = new Cancion("Pedro pedro pedro, pedro pe", 1.4, 2023, "Tecknaso");
            	an.addCancion(c);
            	aux.addAlbum(an);
            	listaArtistas.add(aux);
            	
            	Set<Artista> artAux = new HashSet<>(listaArtistas);
            	m.setArt(artAux);
            	
            	actualizarLabels();
                agregarDatosATabla(model);        
            }
        });
        
        menuItem4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	JDialog dialog = new JDialog(frame, "Hola mundo", true);

                // Establecer el LayoutManager
                dialog.setLayout(new GridLayout(3, 1)); // Una disposición sencilla con 3 filas y 1 columna

                // Crear los componentes
                JLabel label1 = new JLabel("Di hola :D");
                JTextField textField1 = new JTextField();
                JButton submitButton = new JButton("Crear");

                // Añadir los componentes al JDialog
                dialog.add(label1);
                dialog.add(textField1);
                dialog.add(submitButton);

                // Establecer el tamaño del JDialog
                dialog.setSize(300, 200);

                // Establecer la posición del JDialog relativa al frame
                dialog.setLocationRelativeTo(frame);

                // Añadir ActionListener al botón de submit
                submitButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String inputText = textField1.getText();
                        System.out.println("Input: " + inputText);
                        dialog.dispose(); // Cerrar el diálogo al presionar el botón
                    }
                });

                // Hacer visible el JDialog
                dialog.setVisible(true);

            }
        });

        nombreColecLabel = new JLabel(m.getNombreColec());
        numArtistasLabel = new JLabel(String.valueOf(m.getArt().size()));
        numAlbumesLabel = new JLabel(String.valueOf(m.numAlbumes()));
        numCancionesLabel = new JLabel(String.valueOf(m.numCanciones()));

        // Añadir los JLabels al panel2
        panel2.add(new JLabel("Nombre de la colección: "));
        panel2.add(nombreColecLabel);
        panel2.add(new JLabel("Número de artistas: "));
        panel2.add(numArtistasLabel);
        panel2.add(new JLabel("Número de álbumes: "));
        panel2.add(numAlbumesLabel);
        panel2.add(new JLabel("Número de canciones: "));
        panel2.add(numCancionesLabel);

        frame.add(panel1, BorderLayout.CENTER);
        frame.add(panel2, BorderLayout.EAST);

        frame.setVisible(true);
        
	}
	
	private static void agregarDatosATabla(DefaultTableModel model) {
	    model.setRowCount(0);
	    
	    Object[][] data = new Object[m.numCanciones()][6]; // Crear la matriz con el tamaño necesario

	    int i = 0;
	    for (Artista ar : m.getArt()) {
	        for (Album al : ar.getAlbumes()) {
	            for (Cancion ca : al.getCanciones()) {
	                data[i][0] = ar.getNombreArt();
	                data[i][1] = al.getNombreAlbum();
	                data[i][2] = ca.getNombre();
	                data[i][3] = ca.getAnio();
	                data[i][4] = ca.getDuracion();
	                data[i][5] = ca.getEstilo();
	                i++;
	            }
	        }
	    }

	    for (int row = 0; row < data.length; row++) {
	        Object[] rowData = data[row];
	        model.addRow(rowData);
	    }
	}
	
	public static void actualizarLabels() {
        nombreColecLabel.setText(m.getNombreColec());
        numArtistasLabel.setText(String.valueOf(m.getArt().size()));
        numAlbumesLabel.setText(String.valueOf(m.numAlbumes()));
        numCancionesLabel.setText(String.valueOf(m.numCanciones()));
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		m = Helper.HelperMusica.createMusica(3, 3, 1, "Tosus");
		
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
		
	}

}
