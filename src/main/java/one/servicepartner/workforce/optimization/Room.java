package one.servicepartner.workforce.optimization;

import java.util.ArrayList;
import java.util.List;

public class Room {

	String id = "-1";
	List<Cleaner> cleaners;

	public Room(String id) {
		this.id = id;
		cleaners = new ArrayList<>();
	}

	public Room(String id, List<Cleaner> cleaners) {
		this.id = id;
		this.cleaners = cleaners;
	}
}
