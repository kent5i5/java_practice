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
	public String name;
	public String shortDescription;
	public String longDescription;

	public Fixtures(String name, String shortDescription, String longDescription) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	

}
