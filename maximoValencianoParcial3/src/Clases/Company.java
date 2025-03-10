package Clases;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private static int cont = 0;
	private int id;
	private String name;
	private int anio;
	private int anioF;
	private List<HistoricalTicketing> ht = new ArrayList<>();
	private List<Person> per = new ArrayList<>();
	
	public Company(String name, int anio, int anioF) {
		super();
		id = cont;
		cont++;
		this.name = name;
		this.anio = anio;
		this.anioF = anioF;
	}
	
	public void addTicket(HistoricalTicketing h) {
		ht.add(h);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getAnioF() {
		return anioF;
	}
	public void setAnioF(int anioF) {
		this.anioF = anioF;
	}
	public List<HistoricalTicketing> getHt() {
		return ht;
	}
	public void setHt(List<HistoricalTicketing> ht) {
		this.ht = ht;
	}

	public List<Person> getPer() {
		return per;
	}

	public void setPer(List<Person> per) {
		this.per = per;
	}
	
	
	
}
