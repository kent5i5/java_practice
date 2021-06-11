package game;

import java.util.Scanner;

public class Main {
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoomManager rm = new RoomManager();
		rm.init();
		
		
		
		//Player init
		Player playerOne = new Player();
		playerOne.setCurrentRoom(rm.startingRoom);
		printRoom(playerOne, rm);
		
	}

	//printRoom(Player) method will print a prompt to the console for the player's current room, similar to the above image.
	public static void printRoom(Player player, RoomManager rm) {
		int exit_code = 0;
		rm.map();
		System.out.println("***Current Room is '" + player.getCurrentRoom().name + "'***\n");
		System.out.println("Please enter your commands with direction following with 'go' keyword. e.g. go east");
		
		System.out.println("   Tips: you can enter 'go home' to go back your room , 'map' to show map");
		while(exit_code != -1 ){
			try {
				
				String[] inputs = collectInput();
				
				parse(inputs,  player, rm);
				
				
				

			if(inputs.length == 0) {
				throw new GameInputException("empty input");
			}
				
			} catch(GameInputException e) {			
				//e.printStackTrace();
			} catch(Exception e) {
				e.printStackTrace();
				System.out.print("System error. Program terminated");
				exit_code = -1;
			}
		}
	}

	 //collectInput() method will use a Scanner object to collect console input from the user, and then will divide that input into multiple parts. Generally those parts will look like this:

	
	private static String[] collectInput() {
		
		Scanner sc = new Scanner(System.in);
		String[] userInput = sc.nextLine().split("\s+");

		return userInput;
	}
		
	private static void parse(String[] command, Player player, RoomManager rm) throws GameInputException {
		
		if (command.length >= 2) {
			System.out.println("commands: " + command[0] + " " +  command[1]);
			switch(command[0]) {
				case "go": 
					
					if (command[1].equals( "north")) {
						int index =  player.currentRoom.getNorthPath();
						player.currentRoom = rm.rooms[ index ];
						System.out.println("You have moved to " + player.currentRoom.name );
						
						
					}
					
					if (command[1].equals( "west")) {
						int index =  player.currentRoom.getWestPath();
						player.currentRoom = rm.rooms[ index ];
						System.out.println("You have moved to " + player.currentRoom.name );
						
						
					}
					
					if (command[1].equals( "east")) {
						int index =  player.currentRoom.getEastPath();
						player.currentRoom = rm.rooms[ index ];
						System.out.println("You have moved to " + player.currentRoom.name );
					}
					
					if (command[1].equals("south")) {
						int index =  player.currentRoom.getSouthPath();
						player.currentRoom = rm.rooms[ index ];
						System.out.println("You have moved to " + player.currentRoom.name );
					}
					break;
				case "exit": System.exit(1);
					break;
				default: break;
			}
		} else if(command.length == 1) {
			switch(command[0]) {
				case "map": rm.map();  
					break;
				case "here": System.out.println("you are at "+ player.currentRoom.name);
				default: break;
			}
		} else  {
			
		}

	}

}
