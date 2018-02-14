import java.util.*;
import java.io.*;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;

import java.time.LocalDateTime;

/**
	*The RequestedRoom class keeps record of individual booking requests from Student to Admin
*/
public class RequestedRoom implements Serializable{
	private static final long serialVersionUID = 7L;
	private String purpose;
	private String preferredRoom;
	private int capacity;

	private String date;
	private String time;

	private String status = "Awaited";
	private String by;

	private LocalDateTime validTill;

	/**
	*Class constructor
	*/
	public RequestedRoom(String preferredRoom, int capacity, String purpose, String date, String time, String by){
		this.preferredRoom = preferredRoom;
		this.capacity = capacity;
		this.purpose = purpose;
		this.by = by;
		this.date = date;
		this.time = time;
		validTill = LocalDateTime.now().plusDays(5);
	}

	/**
	*Setter method alloted room
	*@param s allotted room
	*/
	public void setRoom(String s){
		preferredRoom = s;
	}

	/**
	*A method to check if the request is still valid i.e. not more than 5 days old
	*@return true if valid, false otherwise
	*/
	public boolean valid(){
		LocalDateTime current = LocalDateTime.now();
		if(current.isBefore(validTill)){
			return true;
		}
		else
			return false;
	}


	/**
	*Getter method for accessing the student who requested the booking
	*@return emailID of the student
	*/
	public String getBy(){
		return by;
	}

	/**
	*Getter method for date of booking request
	*@return date of booking request
	*/
	public String getDate(){
		return date;

	}

	/**
	*Getter method for time of booking request
	*@return time of booking request
	*/
	public String getTime(){
		return time;

	}

	/**
	*A method to know if the booking requests are the same
	*@param o the booking which is to be compared to
	*@return true if they're same, false otherwise
	*/
	@Override
	public boolean equals(Object o){
		RequestedRoom r = (RequestedRoom) o;
		return r.getPreferredRoom().equals(preferredRoom) && r.getCapacityOfRequiredRoom()==capacity && r.getPurpose().equals(purpose) && r.getBy().equals(by) && r.getDate().equals(date) && r.getTime().equals(time);
	}

	/**
	*Getter method for purpose of request
	*@return purpose of booking request
	*/
	public String getPurpose(){
		return purpose;

	}

	/**
	*Getter method for preferred room of request
	*@return preferred room of request
	*/
	public String getPreferredRoom(){
		return preferredRoom;

	}

	/**
	*Getter method for capacity of required room
	*@return capacity of required room
	*/
	public int getCapacityOfRequiredRoom(){
		return capacity;

	}
/*
	public int getTimeSinceRequest(){
		return timeSinceRequest;

	}
*/
	/**
	*Getter method for status of request
	*@return status of request - Accepted, Rejected or Awaited(by default)
	*/
	public String getStatus(){
		return status;

	}


	public StringProperty getPurposeProperty(){
		return new SimpleStringProperty(purpose);

	}
	public StringProperty getPreferredRoomProperty(){
		return new SimpleStringProperty(preferredRoom);

	}

	public IntegerProperty getCapacityProperty(){
		return new SimpleIntegerProperty(capacity);

	}

	public StringProperty getStatusProperty(){
		return new SimpleStringProperty(status);

	}

	/**
	*Setter method for setting status of request by Admin
	*@return status of request - Accepted, Rejected
	*/
	public void setStatus(String s){
		this.status = s;
	}

	@Override
	public String toString(){
		return (getPurpose()+" "+getPreferredRoom()+" "+getCapacityOfRequiredRoom()+" "+getDate()+" "+getTime());
	}
}