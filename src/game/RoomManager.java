package game;

import fixtures.Room;

public class RoomManager {
	//Room startingRoom : the room a player should start in.
	Room startingRoom;
	
	//Room[] rooms : all the rooms in the house.
	Room[] rooms;
	
	public RoomManager() {
		rooms = new Room[4];
	}
	
	public void init() {
	    Room foyer = new Room(
			"The Foyer",
			"a small foyer",
			"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
			+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
			+ "To the north is a small room, where you can see a piano.");
		this.rooms[0] = foyer;
		this.rooms[0].setPaths(2, 3, 1, 0);
	    this.startingRoom = foyer;
	        
	    //south
	    Room diningRoom = new Room(
	    			"The dining room",
	    			"a large dining room with a large table",
	    			"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
	    			+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
	    			+ "To the north is a small room, where you can see a piano.");
	    this.rooms[1] = diningRoom;
	    this.rooms[1].setPaths(1, 1, 1, 0);
	    //west
	    Room staircase = new Room(
    			"Staircase",
    			"a large dining room",
    			"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
    			+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
    			+ "To the north is a small room, where you can see a piano.");
	    this.rooms[2] = staircase;
	    this.rooms[2].setPaths(2, 0, 2, 2);
	    //north
	    Room smallRoom = new Room(
    			"The small room",
    			"a small room with a piano",
    			"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
    			+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
    			+ "To the north is a small room, where you can see a piano.");
	    this.rooms[3] = smallRoom;
	    this.rooms[3].setPaths(0, 3, 3, 3);
	}
	
	public void map() {

			System.out.println(  "-------------Room Map-----------------\n" +
					"[2-" + rooms[2].name + "]"  + "[" + rooms[0].name + " ] " + "[3 -" + rooms[3].name + "]" +"\n" +
					"         [1-" + rooms[1].name  + "] \n" 
								);

		
	}
}

