import java.util.*;
import java.io.*;

import javafx.collections.ObservableList;

import javafx.collections.FXCollections;


//to view a student's TT: Time t = new Time(); String[][] table = T.viewStudent(student)
//to search courses: Search Temp = new Search(); ArrayList<String> S = Temp.ShowSearch(this,"proofs functions");

/**
	*The Student class extends User and provides functionalities for a user from the Administration department. 
*/
public class Student extends User{

	private static final long serialVersionUID = 1L;

	/**
	*Keeps record of the student's courses.
	*/
	private List<Course> myCourseList;

	/**
	*Class constructor
	*/
	public Student(String emailID, String password, String name){
		super(emailID, password, name);
		myCourseList = new LinkedList<Course>();
	}

	/**
	*A method to know if EmailIDs of students match
	*@param s the Student whose EmailID is to be compared to
	*@return true if they match, false otherwise
	*/
	public boolean studentMatch(Student s){
		return this.getEmailID().equals(s.getEmailID());
	}

	/**
	*A method to add courses to a student's courselist
	*@param c the Course to be added
	*/
	public void AddMandatory(Course c){
		myCourseList.add(c);	
	}


	/**
	*A method to return student's courses in the form of a List of type Course
	*@return List<Course>
	*/
	public List<Course> getCourses(){
		return myCourseList;	
	}


	/**
	*A method to view Student's booking requests
	*/
	public void viewBookedRooms(){
		//Global LinkedList maintained. Redundant method.
	}

}
