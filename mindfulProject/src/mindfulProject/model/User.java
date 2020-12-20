package mindfulProject.model;


public class User {
	private static User uniqueInstance;

	private int userID;
	private String email;
	private String password;
	
	
	public User() {
		super();
	}
	
	public static User getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new User();
		}
		return uniqueInstance;
	}
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}