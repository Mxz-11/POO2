package Clases;

public class Person {
	private static int cont = 0;
	private int id;
	private String name;
	private int phoneNumber;
	
	
	
	public Person(String name, int phoneNumber) {
		super();
		id = cont;
		cont++;
		this.name = name;
		this.phoneNumber = phoneNumber;
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
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
