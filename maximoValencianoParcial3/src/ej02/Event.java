package ej02;

public class Event {
	private static int cont = 0;
	private int id;
	private String date;
	private int maxNumberOfAttendees;
	public Event(String date, int maxNumberOfAttendees) {
		super();
		id = cont;
		cont++;
		this.date = date;
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
	public int getMaxNumberOfAttendees() {
		return maxNumberOfAttendees;
	}
	public void setMaxNumberOfAttendees(int maxNumberOfAttendees) {
		this.maxNumberOfAttendees = maxNumberOfAttendees;
	}
}
