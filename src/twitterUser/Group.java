/**
 * 
 */
package twitterUser;

/**
 * @author Dale
 *
 */
public class Group implements Component{

	private String group;
	private static final Group instance = new Group();
	
	public Group() {
		//empty constructor
	}
	
	public static Group getInstace() {
		return instance;
	}
	
	public String getGroup() {
		return group;
	}

	public void setUser(String group) {
		this.group = group;
	}
	
	public String toString() {
		return group;
	}
	
}
