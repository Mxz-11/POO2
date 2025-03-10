package ej02;

public class TechnologicalDevelopment extends Event{
	private String name;
	private String description;
	public TechnologicalDevelopment(String date, int maxNumberOfAttendees, String name, String description) {
		super(date, maxNumberOfAttendees);
		// TODO Auto-generated constructor stub
		this.name = name;
		this.description = description;
	}

}
