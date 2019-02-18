package one.servicepartner.workforce.optimization;

import org.springframework.stereotype.Service;

/**
 * @author arthur.buchla@gmail.com
 *
 */
@Service
public class SpoWorkforceOptimizationService {

	private int[] rooms = new int[] {13,12, 4, -1};
	private Cleaner[] senior;
	private Cleaner[] junior;

	public String[] getOptimalNumberOfCleaners(int roomSizes[], int juniorCapacity, int seniorCapacity) {
		rooms = roomSizes;
		senior = new Cleaner[seniorCapacity];
		junior = new Cleaner[juniorCapacity];
		
		return new String[] {"test1", "test2", "test3"};
	}
	
	public int[] getRooms() {
		return rooms;
	}
	
	public void addRoomCapacity(int capacity) {
		rooms[3] = capacity;
	}
	

}
