/**
 * 
 */
package game;

/**
 * @author Kenneth Eng
 *
 */
public class GameInputException extends Exception{

	/**
	 * 
	 */
	public GameInputException(String msg) {
		// TODO Auto-generated constructor stub
		//super(msg);
		System.out.println("you have entered " + msg  
		+"\n Please try again\n");
		
	}

}
