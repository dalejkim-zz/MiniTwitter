package twitterUser;

import java.util.*;

public class User extends Observable implements Observer {

	private String userID;
	private List<User> followers = new ArrayList<User>();
	private List<User> following = new ArrayList<User>();
	private List<String> newsFeed = new ArrayList<String>();
	private List<String> tweets = new ArrayList<String>();
	
	private static final User instance = new User();
	
	public User() {
		//empty constructor
	}
	
	public static User getInstace() {
		return instance;
	}
	
	public String getUser() {
		return userID;
	}

	public void setUser(String user) {
		this.userID = user;
	}
	
	public String toString() {
		return userID;
	}
	
	public void followUser(User userID) {
		User stalked = userID;
		this.following.add(stalked);
		notifyObservers(stalked);
		updateUser(stalked);
		followers.add(stalked);
	}
	
	public void writeTweet(String tweet) {
		tweets.add(tweet);
		notifyObservers(tweet);
		updateTweet(tweet);
	}

	@Override
	public void update(String user, String tweet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User stalked) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTweet(String tweet) {
		// TODO Auto-generated method stub
		
	}
	
	public void update(Observable arg0, Object arg1) {
		
	}

}
