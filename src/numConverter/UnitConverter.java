/**
 * 
 */
package numConverter;
import java.util.*;
/**
 * @author ocean
 *
 */
public class UnitConverter {
	
	/**
	 * Constructor
	 */
	UnitConverter(){
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
//		System.out.print("Enter first number- \n");  
//		Scanner sc= new Scanner(System.in);
		
		UnitConverter uc = new UnitConverter();
		
		try {
			//uc.convert(sc.nextInt());
			 // Schedule a job for the event-dispatching thread:
	         // creating and showing this application's GUI.
			
			uc.renderUI();
		} catch(Exception e) {
			System.out.print("Exit");  
		}
	}
	
	private static double collectQuantity(String unit1, String unit2) {
		return 1.0;
	}
	
	public double convertCelsiusToFarenheit(double qty) { 
		return 1.1111;
	}
	
	private void convert(int input) throws Exception{
		
		int inputValue =  input;
		
		//(18 * 1.8) + 32

		double outputValue = (inputValue * 1.8) + 32 ;
		System.out.print("Here's your answer- " + outputValue +"\r\n");
	}
	
	public void renderUI() throws Exception {
		int menuSelection = 1;
		
		//menuSelection != /*last menu option */
		while (menuSelection != 3) {
			
			System.out.print("Please select an option:\r\n" 
					+ "1. Volume conversions  \n"
					+ "2. Distance conversions  \n" 
					+ "3. exit \n" );
			Scanner sc= new Scanner(System.in);
			menuSelection = sc.nextInt();
			switch(menuSelection) {
				
				case 1:	volumeConversionSubmenu();
					
						break;
				case 2: distanceConversionSubmenu();
						break;
				case 3: System.out.print("3\r\n");
						break;
				case 4: System.out.print(" program closed \r\n");
						break;
				default: System.out.print( " please choose option 1, 2, or 3 \r\n"); 
			}
		}
		
	}

	
	private void distanceConversionSubmenu() throws Exception {
		int subMenuSelection = 1;
		while (subMenuSelection != 3) {
			System.out.print("1. Feet to Meters \n"
				+ "2. Miles to Kilometers  \n" 
				+ "3. exit\n" );
			Scanner sc= new Scanner(System.in);
			subMenuSelection= sc.nextInt();
			switch(subMenuSelection) {
			
			case 1:	System.out.print("Enter your number- \r\n"); 
					Scanner sc2  = new Scanner(System.in);
					this.convert(sc2.nextInt());
					break;
			case 2: System.out.print("Enter your number- \r\n"); 
					Scanner sc3 = new Scanner(System.in);
					this.convert(sc3.nextInt());
					break;
			case 3: System.out.print(" program closed\r\n");
					break;

			default: 
		}
			
			
		}
	}
	
	private void volumeConversionSubmenu() throws Exception {
		int subMenuSelection = 1;
		while (subMenuSelection != 3) {
			System.out.print("1. Feet to Meters \n"
					+ "2. Miles to Kilometers  \n" 
					+ "3. exit \n" );
			//System.out.print("Enter first number- \r\n"); 
			Scanner sc= new Scanner(System.in);
			subMenuSelection= sc.nextInt();
			switch(subMenuSelection) {
			
				case 1:	System.out.print("Enter your number- \r\n"); 
						Scanner sc2  = new Scanner(System.in);
						this.convert(sc2.nextInt());
						break;
				case 2: System.out.print("Enter your number- \r\n"); 
						Scanner sc3 = new Scanner(System.in);
						this.convert(sc3.nextInt());
						break;
				case 3: System.out.print(" program closed\r\n");
						break;
	
				default:
			}
		}
	}

}
