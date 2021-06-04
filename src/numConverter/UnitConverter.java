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

		UnitConverter uc = new UnitConverter();
		
		try {
			uc.renderUI();
		} catch(Exception e) {
			System.out.print("Exit");  
		}
	}
	
//	private static double collectQuantity(String unit1, String unit2) {
//		System.out.print("Enter your number- \r\n"); 
//		Scanner quantity = new Scanner(System.in);
//		return quantity.nextDouble() ;
//	}
	
//	public double convertCelsiusToFarenheit(double qty) { 
//		return ( qty * 1.8) + 32;
//	}
	
	/**
	 * @param qty the number user input
	 */
	public double convertTeaspoonsToTablespoons(double qty) { 
		return ( qty / 3);
	}
	
	/**
	 * @param qty the number user input
	 */
	public double convertTeaspoonsToCups(double qty) { 
		return ( qty / 48);
	}
	
	/**
	 * @param qty the number user input
	 */
	public double convertFeetToMeters(double qty) { 
		return ( qty / 3.281) ;
	}
	
	/**
	 * @param qty the number user input
	 */
	public double convertMilesToKilometers(double qty) { 
		return ( qty * 1.609) ;
	}

	/**
	 * Method that render the command line interface
	 */
	private void renderUI() throws Exception {
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
				case 4: System.out.print(" program closed \r\n\n");
						break;
				default: System.out.print( " please choose option 1, 2, or 3 \r\n\n"); 
						break;
			}
		}
		
	}

	/**
	 * Volume Conversion Sub-menu of the main user interface
	 */
	private void volumeConversionSubmenu() throws Exception {
		int subMenuSelection = 1;
		double answer = 0;
		while (subMenuSelection != 3) {
			System.out.print("1. Teaspoons to Tablespoons \n"
				+ "2. Teaspoons to Cups  \n" 
				+ "3. exit\n" );
			Scanner sc= new Scanner(System.in);
			subMenuSelection= sc.nextInt();
			switch(subMenuSelection) {
			
			case 1:	System.out.print("Enter your number- \r\n"); 
					Scanner sc2  = new Scanner(System.in);
					answer = convertTeaspoonsToTablespoons(sc2.nextDouble());
					System.out.print("Here's your answer- " + answer +"\r\n\n"); 
					break;
			case 2: System.out.print("Enter your number- \r\n"); 
					Scanner sc3 = new Scanner(System.in);
					answer = convertTeaspoonsToCups(sc3.nextDouble());
					System.out.print("Here's your answer- " + answer +"\r\n\n"); 
					break;
			case 3: System.out.print(" program closed\r\n\n");
					break;

			default: break;
		}
			
			
		}
	}
	
	/**
	 * Distance Conversion Sub-menu of the main user interface
	 */
	private void distanceConversionSubmenu() throws Exception {
		int subMenuSelection = 1;
		double answer = 0;
		while (subMenuSelection != 3) {
			System.out.print("1. Feet to Meters \n"
					+ "2. Miles to Kilometers  \n" 
					+ "3. exit \n" );

			Scanner sc= new Scanner(System.in);
			subMenuSelection= sc.nextInt();
			switch(subMenuSelection) {
			
				case 1:	System.out.print("Enter your number- \r\n"); 
						Scanner sc2  = new Scanner(System.in);
						answer =  this.convertFeetToMeters(sc2.nextDouble());
						System.out.print("Here's your answer- " + answer +"\r\n\n"); 
						break;
				case 2: System.out.print("Enter your number- \r\n"); 
						Scanner sc3 = new Scanner(System.in);
						answer =  this.convertMilesToKilometers(sc3.nextDouble());
						System.out.print("Here's your answer- " + answer +"\r\n\n"); 
						break;
				case 3: System.out.print(" program closed\r\n\n");
						break;
	
				default:break;
			}
		}
	}

}
