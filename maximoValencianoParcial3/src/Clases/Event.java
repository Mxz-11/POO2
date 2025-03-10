package Clases;

public class Event {
	private static int cont = 0;
	private int id;
	private String name;
	private String date;
	private String maxNumberOfAttendees;
	public Event(String date, String maxNumberOfAttendees, String name) {
		super();
		id = cont;
		cont++;
		this.date = date;
		this.name = name;
		this.maxNumberOfAttendees = maxNumberOfAttendees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMaxNumberOfAttendees() {
		return maxNumberOfAttendees;
	}
	public void setMaxNumberOfAttendees(String maxNumberOfAttendees) {
		this.maxNumberOfAttendees = maxNumberOfAttendees;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
