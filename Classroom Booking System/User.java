import java.util.*;
import java.io.*;


/**
	*The User class is the abstract class for users. Classes Student, Faculty, Admin extend the same.
*/
public abstract class User implements Serializable{
	protected String emailID;
	protected String password;
	protected String name;

	/**
	*Class constructor
	*/
	public User(String emailID, String password, String name){
		this.emailID = emailID;
		this.password = password;
		this.name = name;
	}

	/**
	*A method to know if the Users are the same by comparing EmailIDs and passwords
	*@param o the User who's to be compared to
	*@return true if they're same, false otherwise
	*/
	@Override
	public boolean equals(Object o){
		User oo = (User) o;
		return oo.getEmailID().equals(emailID) && oo.getPassword().equals(password);
	}


	/**
	*A method to change a User's password
	*@param x the new password
	*/
	public void setPassword(String x){
		this.password = x;
	}
	
	/**
	*Getter method for EmailID
	*@return emailID of the user
	*/
	public String getEmailID(){
		return emailID;
	}

	/**
	*Getter method for password
	*@return password of the user
	*/
	public String getPassword(){
		return password;
	}

	/**
	*Getter method for name
	*@return name of the user
	*/
	public String getNaam(){
		return name;
	}

	/**
	*Abstract method to view User's bookings
	*/
	public abstract void viewBookedRooms();
}