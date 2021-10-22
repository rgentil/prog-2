package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Reality {

	private List<Coach> coaches;
	
	public Reality() {
		this.coaches = new ArrayList<Coach>();
	}

	public boolean tieneCoach(Coach c) {
		return coaches.contains(c);
	}
	
	public void addCoaches(Coach c) {
		if (!tieneCoach(c)) {
			coaches.add(c);
		}
	}
	
}
