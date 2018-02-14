import java.util.*;
import java.io.*;

import javafx.collections.ObservableList;

import javafx.collections.FXCollections;


/**
	*The Admin class extends User and provides functionalities for a user from the Administration department. 
*/
public class Admin extends User{

	private static final long serialVersionUID = 3L;
	
	/**
	*Keeps record of the user's bookings.
	*/
	private LinkedList<Booking> bookedRooms;

	/**
	*Class constructor
	*/
	public Admin(String emailID, String password, String name){
		super(emailID, password, name);
		bookedRooms = new LinkedList<Booking>();
	}

	/**
	*A method to know if EmailIDs of Admins match
	*@param s the Admin whose EmailID is to be compared to
	*@return true if they match, false otherwise
	*/
	public boolean adminMatch(Admin s){
		return this.getEmailID().equals(s.getEmailID());
	}

	/**
	*A method to add the User's bookings in his/her record
	*@param room Room to be booked
	*@param date Booking date
	*@param time Booking Time
	*/
	public void addMyBooking(String room, String date, String time){
		Datime z = new Datime(date, time);
		Booking x = new Booking(room, z);
		bookedRooms.add(x);
	}

	/**
	*A method to cancel User's booking from his/her record
	*@param z Booking to be cancelled
	*/
	public void cancelMyBooking(Booking z) throws Exception{
		bookedRooms.remove(z);
		
	}

	/**
	*A method to return User's booking in the form of a LinkedList of type Booking
	*@return LinkedList<Booking>
	*/

	public LinkedList<Booking> getBookedRoomsLL(){
		return bookedRooms;
	}



	/**
	*A method to return User's booking in the form of a ArrayList of type String
	*@return ArrayList<String>
	*/
	public ArrayList<String> getMyBookedRooms(){
		ArrayList<String> out = new ArrayList<String>();
		for(Booking b: bookedRooms){
			out.add(b.getRoom()+" "+b.getTime().retDate()+" "+b.getTime().retTime());
		}

		return out;
	}

	/**
	*A method to view User's bookings
	*/
	public void viewBookedRooms(){
		for(Booking b: bookedRooms){
			System.out.println(b.getRoom()+" "+b.getTime().retDate()+" "+b.getTime().retTime());
		}	
	}


}
