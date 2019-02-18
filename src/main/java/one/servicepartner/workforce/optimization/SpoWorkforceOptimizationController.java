package one.servicepartner.workforce.optimization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author arthur.buchla@gmail.com
 *
 */
@RestController
public class SpoWorkforceOptimizationController {
	
	@Autowired
	SpoWorkforceOptimizationService optimizationService;

	@RequestMapping("/cleaners/{roomSizes}, {seniorCapacity}, {juniorCapacity}")
	public String[] getOptimalNumberOfCleaners(@PathVariable int roomSizes[], @PathVariable int seniorCapacity, @PathVariable int juniorCapacity) {
		return optimizationService.getOptimalNumberOfCleaners(roomSizes, juniorCapacity, seniorCapacity);
	}
	
	@RequestMapping(method=RequestMethod.POST, value ="/cleaners")
	public void addCleaner(@RequestBody Cleaner cleaner) {
		
	}

	@RequestMapping("/rooms")
	public int [] getRooms() {
		return optimizationService.getRooms();
	}
	
	@RequestMapping(method=RequestMethod.POST, value ="/rooms/{capacity}")
	public void addRoomCapacity(@PathVariable int capacity) {
		optimizationService.addRoomCapacity(capacity);
	}
	
}
