package game;

import fixtures.Room;

public class Player {
	//Room currentRoom : the room the player is currently in.
	Room currentRoom;
	int homeNumber; 
	public Player() {
		int min = 50;
		int max = 100;
		homeNumber = (int)Math.floor(Math.random()*(max-min+1)+min);
	}
	
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
	
	public Room getCurrentRoom() {
		return currentRoom;
	}
	
	public int getHomeNumber() {
		return homeNumber;
	}
}
