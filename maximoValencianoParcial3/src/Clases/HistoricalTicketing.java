package Clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HistoricalTicketing {
	private static int cont = 0;
	private int id;
    private List<Event> ev = new ArrayList<>();
	public HistoricalTicketing() {
		super();
	}
    
    public void addEvento(Event e) {
    	ev.add(e);
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Event> getEv() {
		return ev;
	}

	public void setEv(List<Event> ev) {
		this.ev = ev;
	}
    

}
