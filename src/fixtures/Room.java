/**
 * 
 */
package fixtures;

import java.util.ArrayList;

/**
 * @author kenneth eng
 *
 */
public class Room extends Fixtures{
	//exits : the rooms adjacent to this one. 
	//You might decide that a room in a particular direction always uses a certain index,
	//e.g. a north exit always goes in index 0, 
	//an east exit always goes in index 1, etc. If so,
	//then the size of this array depends on how many directions you want to support.

	Room[] exits; 
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[2]; // size is your choice
	}
		
	public Room[] getExits() {
		return exits;
	}
		
	public Room getExit(String direction) {
		return exits[0];
	}
}
