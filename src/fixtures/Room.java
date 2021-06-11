/**
 * 
 */
package fixtures;

import java.util.ArrayList;

/**
 *	You might decide that a room in a particular direction always uses a certain index,
 *	e.g. a north exit always goes in index 0, 
 *	an east exit always goes in index 1, etc. If so,
 *	then the size of this array depends on how many directions you want to support.
 * @author kenneth eng
 *
 */
public class Room extends Fixtures{


	Room[] exits; // not implemented
	
	// we have list of rooms with index 0,1,2,3 and these four variable will remember it
	int west;
	int east;
	int south;
	int north;
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[3]; // 4 direction - north, west, east, south
		
	}
	
	/*
	 * param west, east, south, north indicates whether or not there are path to go through
	 */
	public void setPaths(int west, int east, int south, int north) {
		this.west = west;
		this.east = east;
		this.south = south;
		this.north = north;
	}
	
	public int getWestPath() {
		return west;
	}
	public int getEastPath() {
		return east;
	}
		
	public int getSouthPath() {
		return south;
	}
		
	public int getNorthPath() {
		return north;
	}
		
		
	public Room[] getExits() {
		return exits;
	}
		
	public Room getExit(String direction) {
		return exits[0];
	}
}
