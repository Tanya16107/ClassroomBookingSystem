import java.util.*;
import java.io.*;
import java.time.LocalTime;

class Slot implements Serializable{
	private static final long serialVersionUID = 5L;
	private String category;
	private String venue;
	private String time;

	public Slot(String category, String venue, String time){
		this.category = category;
		this.venue = venue;
		this.time = time;
	}



	@Override
	public boolean equals(Object o){
		//used for comparing slots

		boolean out  = false;

		Slot s = (Slot) o;

		String[] t1 = this.time.split("-");
		for(int i=0; i<2; i++){
			String t = t1[i];
			String[] x = t.split(":");
			for(int j=0; j<2; j++){
				if(x[j].length()==1){
					x[j] = "0"+x[j];
				}
			}
			t1[i] = x[0]+":"+x[1];
		}

	
		String[] t2 = s.getTime().split("-");
		for(int i=0; i<2; i++){
			String t = t2[i];
			String[] x = t.split(":");
			for(int j=0; j<2; j++){
				if(x[j].length()==1){
					x[j] = "0"+x[j];
				}
			}
			t2[i] = x[0]+":"+x[1];
		}
		
		LocalTime t1_start = LocalTime.parse(t1[0]);
		LocalTime t1_end = LocalTime.parse(t1[1]);		

		LocalTime t2_start = LocalTime.parse(t2[0]);
		LocalTime t2_end = LocalTime.parse(t2[1]);

		if((t2_start.isAfter(t1_start) && t2_start.isBefore(t1_end)) || (t1_start.isAfter(t2_start) && t1_start.isBefore(t2_end))){
			out = true;
		}

		if(t1_start.equals(t2_start) && t1_end.equals(t2_end)){
			out = true;
		}

		return out;
	}

	public String getTime(){
		return time;
	}

	public String getCatVen(){
		return venue+" "+category;
	}

	public String toString(){
		return category+" "+time+" "+venue;
	}
}

/**
	*The Course class keeps record of individual courses
*/
public class Course implements Serializable{
	private static final long serialVersionUID = 6L;
	private String name;
	private String code;
	private String type;
	private String instructor;
	private int credits;
	private String preConditions;
	private String postConditions;

	/**
	*schedule of a room is an Array of LinkedLists
	*/
	private LinkedList[] schedule = new LinkedList[7];  // 0 = Monday, 1 = Tuesday ...

	/**
	*Class constructor
	*/
	public Course(String name, String code, String type, String instructor, int credits, String preConditions, String postConditions){
		this.name = name;
		this.code = code;
		this.type = type;
		this.instructor = instructor;
		this.credits = credits;
		this.preConditions = preConditions;
		this.postConditions = postConditions;
		for(int i=0; i<7; i++){
			schedule[i] = new LinkedList();
		}
	}

	/**
	*Getter method for schedule of course
	*@return array of linked lists
	*/
	public LinkedList[] getSchedule(){
		return schedule;
	}


	/**
	*Method for making schedule of a course
	*@param i day of week, with 0 as Monday
	*@param s slot to be added - venue, day, time
	*/
	public void buildSchedule(int i, Slot s){
		schedule[i].add(s);
	}

	/**
	*Getter method for code of course
	*@return course code
	*/
	public String getCode(){
		return code;
	}

	/**
	*Getter method for name of course
	*@return course name
	*/
	public String getName(){
		return name;
	}

	/**
	*Getter method for instructor of course
	*@return course instructor
	*/
	public String getInstructor(){
		return instructor;
	}

	public String toString(){
		return name+" "+code+" "+type+" "+instructor+" "+String.valueOf(credits);

	}

	/**
	*Getter method for post-conditions of course
	*@return course post-conditions
	*/
	public String getPostConditions(){
		return postConditions;	
	}

	public void printSchedule(){
		for(int i=0; i<7; i++){
			System.out.print(i+"->");  //day : 0 = Monday, 1= Tuesday...
			LinkedList l = schedule[i];
			for (int j = 0; j < l.size(); j++) {
            System.out.print(l.get(j));
        }
	System.out.println();
			
		}
	}

	/**
	*A method to check if two courses clash
	*@param c Course to be checked for clash with
	*@return true if courses clash, false otherwise
	*/
	public boolean clashCheck(Course c){
		LinkedList[] c_schedule = c.getSchedule();
		for(int i=0; i<7; i++){
			//System.out.println("Day "+i);
			LinkedList l = this.schedule[i];
			for(int j=0; j<l.size(); j++){
				Slot s = (Slot) l.get(j);
				if(c_schedule[i].indexOf(s)!=-1){
					return true;
				}
			}
		}
		return false;
	}



}
