import java.util.*;
import java.io.*;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;


/**
	*The Booking class records individual bookings of Admin and Faculty
*/
public class Booking implements Serializable{
	private Datime a;
	private String room;

	/**
	*Class constructor
	*/
	public Booking(String room, Datime a){
		this.a = a;
		this.room = room;
	}

	/**
	*Getter method for date and time of booking
	*@return date and time of booking
	*/
	public Datime getTime(){
		return a;
	}

	/**
	*Getter method for booked room
	*@return room
	*/
	public String getRoom(){
		return room;
	}

	public StringProperty getDateProperty(){
		return new SimpleStringProperty(a.retDate());
	}

	public StringProperty getTimeProperty(){
		return new SimpleStringProperty(a.retTime());
	}

	public StringProperty getRoomProperty(){
		return new SimpleStringProperty(room);
	}

	@Override
	public String toString(){
		return getRoom()+" "+a.retDate()+" "+a.retTime();
	}




}