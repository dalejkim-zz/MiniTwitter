/**
 * 
 */
package app;

import java.util.*;

import twitterUser.User;

/**
 * @author Dale
 *
 */
public class UserUI {

	Map<String, User> userUI;
	
	public UserUI() {
		userUI = new HashMap<String, User>();
	}
	
	public void add(String key, User user) {
		userUI.put(key, user);
	}
	
	public String getID(String key) {
		return userUI.get(key).toString();
	}
}
