package Helper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Exceptions.AsignaturaNotFoundException;
import Exceptions.AsignaturaSinAlumnosException;
import Exceptions.DobleMatriculaException;
import Universidad.Alumno;
import Universidad.Asignatura;
import Universidad.Matricula;
import Universidad.Universidad;

public class sga {
	public static void informeMatricula(Path carpeta, Universidad u){
		File f = new File(carpeta.toString());
		if (Files.notExists(carpeta)) {
			f.mkdir();
		}
		List<Matricula> mat = u.getMatriculas();

		for (Matricula m: mat) {
			String id = "Alumno" + m.getAlumno().getId();
			File archivo_Alumno = new File(f.toString(), id);
			archivo_Alumno.mkdir();
			List<Asignatura> a = m.getAsignaturas();
			for (Asignatura as: a) {
				try {
					File archivo_Asignatura = new File(archivo_Alumno, as.getNombre() + ".txt");
					FileWriter fi = new FileWriter(archivo_Asignatura);
					fi.write(as.toString());
					fi.close();
				
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void informeProfesores(Universidad u) {
		List<Matricula> mat = u.getMatriculas();
		List<Asignatura> as = u.getAsignaturas();
		
		int[] alXAsig = new int[as.size()];

		for (Matricula m: mat) {
			List<Asignatura> asAux = m.getAsignaturas();
			for (int i = 0; i < asAux.size(); i++) {
				alXAsig[asAux.get(i).getId()]++;					
			}
		}
		
		for (Asignatura a: as) {
			System.out.print(a.toString() + "  ");
			for (int i = 0; i < as.size(); i++) {
				if (a.getId() == i) {
					System.out.println("El numero de alumnos matriculados es: " + alXAsig[i]);
				}
			}
		}
	}
	
	public static void validarDatos(Universidad u) throws AsignaturaSinAlumnosException, AsignaturaNotFoundException, DobleMatriculaException {
		List<Matricula> mat = u.getMatriculas();
		List<Asignatura> as = u.getAsignaturas();
		
		int[] alXAsig = new int[as.size()];

		for (Matricula m: mat) {
			List<Asignatura> asAux = m.getAsignaturas();
			
			boolean estaPresente = false;
			for (int i = 0; i < asAux.size(); i++) {
				for (int j = 0; j < as.size(); j++) {
					if (asAux.get(i).getId() == as.get(j).getId()) {
						estaPresente = true;
						break;
					}
				}
				if (!estaPresente) {
					throw new AsignaturaNotFoundException();
				}else {
					estaPresente = false;
				}
			}
			
			int[] numAsigs = new int[as.size()];
			for (int i = 0; i < asAux.size(); i++) {
				numAsigs[asAux.get(i).getId()]++;
			}
			for (int i = 0; i < asAux.size(); i++) {
				if (numAsigs[i] > 1) {
					throw new DobleMatriculaException(m);
				}
			}			
		}
		
		for (int i = 0; i < as.size(); i++) {
			if (alXAsig[as.get(i).getId()] == 0) {
				throw new AsignaturaSinAlumnosException(as.get(i));
			}
		}
	}
	
	public static boolean toFile(Universidad u) {		
		BufferedWriter out = null;
		try {
			String content = u.toString();
			out = new BufferedWriter(new FileWriter("./src/data/universidad.txt"));
			out.write(content);
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (out != null) {
				try {
					out.close();
					return true;
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}
	
	public static Universidad fromFile () {		
		BufferedReader in = null;
		Scanner fileScanner = null;
		
		Universidad u = new Universidad();
		Asignatura a = null;
		
		try {
			in = new BufferedReader(new FileReader("./src/data/universidad.txt"));
			fileScanner = new Scanner(in);
			
			while(fileScanner.hasNext()) {
				String line = fileScanner.nextLine();
				
				if(line.startsWith("ASIGNATURAS:")) {
					fileScanner.useDelimiter(":|,");
					fileScanner.next(); //Se pilla ASIGNATURA:
					fileScanner.next(); //Se pilla id:
					int idAsignatura = Integer.valueOf(fileScanner.next()); //Se guarda el id
					fileScanner.next(); //Se pilla el nombre:
					String nombreAsignatura = fileScanner.next();
					fileScanner.next(); //creditos:
					
					int creditos = Integer.valueOf(fileScanner.next());
					fileScanner.useDelimiter("\\p{javaWhitespace}+");
				    
					a = new Asignatura(nombreAsignatura, creditos);
					System.out.println("Hello");

					System.out.println(a.toString());
					u.addAsignatura(a);
				}
				
				if(line.startsWith("Matricula:")) {
					String idAlumno = line.split(": ")[1];
					String nombreAlumno = line.split(":")[1];
					Alumno alu = new Alumno(nombreAlumno, Integer.valueOf(idAlumno));
					Matricula m = new Matricula(alu);
					line = fileScanner.nextLine();
					while(line.startsWith("Asignaturas:") && fileScanner.hasNext()) {
						line = fileScanner.nextLine();
						String idAsignatura = line.split(": ")[1];
						String nombreAsignatura = line.split(":")[1];
						String creditos = line.split(":")[1];
						m.addAsignatura(new Asignatura(Integer.valueOf(idAsignatura), nombreAsignatura, Integer.valueOf(creditos)));
						line = fileScanner.nextLine();
					};
					u.addMatricula(m);
				}
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(in != null) {
					in.close();
					return u;
				}

				if(fileScanner != null) {
					fileScanner.close();
				}
			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public static void asignaturasUniversidad(Path carpeta, Universidad u) throws IOException{
		File f = new File(carpeta.toString());
		if (Files.notExists(carpeta)) {
			f.mkdir();
		}
		List<Asignatura> asig = u.getAsignaturas();
		
		for (Asignatura a: asig) {
			try {
				
			File archivo_Alumno = new File(f.toString(), a.getNombre());
			archivo_Alumno.mkdir();
			File archivo_Asignatura = new File(archivo_Alumno, a.getNombre() + ".txt");
			FileWriter fi = new FileWriter(archivo_Asignatura);
			fi.write(a.toString());
			fi.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		
		}
	}
}
