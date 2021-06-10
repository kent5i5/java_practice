/**
 * 
 */
package fixtures;

/**
 * 
 *  class attributes:
 *  String name : a short name / title for the fixture
 *  String shortDescription : a one-sentence-long description of a fixture, used to briefly mention the fixture
 *  String longDescription : a paragraph-long description of the thing, displayed when the player investigates the fixture thoroughly (looks at it, or enters a room)
 *  
 * @author kenneth eng
 *
 */
public abstract class Fixtures {
	String name;
	String shortDescription;
	String longDescription;
	
	public Fixtures(String name, String shortDescription, String longDescription) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	/**
//	 * @param shortDescription : a one-sentence-long description of a fixture, 
//	 * used to briefly mention the fixture
//	 */
//	public void main(String shortDescription) {
//		// TODO Auto-generated method stub
//
//	}
//	
//	/**
//	 * @param longDescription : a paragraph-long description of the thing, '
//	 * displayed when the player investigates the fixture thoroughly (looks at it, or enters a room)
//	 */
//	public void main(String longDescription) {
//		// TODO Auto-generated method stub
//
//	}

}
