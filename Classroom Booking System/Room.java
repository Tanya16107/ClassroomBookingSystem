import java.util.*;
import java.io.*;

/**
	*The Room class represents a room and keeps record of bookings apart from regular classes in the room
*/

public class Room implements Serializable{
	private String Name;
	private LinkedList<Datime> SpecialBooking;

	/**
	*Class constructor
	*/
	public Room(String Name)
	{
		this.Name=Name;
		SpecialBooking=new LinkedList<Datime>();
	}

	/**
	*A method to know if two rooms are same
	*@param o the room which is to be compared to
	*@return true if they're same, false otherwise
	*/
	@Override
	public boolean equals(Object o){

		Room r = (Room)o;
		return this.Name.equals(r.getRoom());

	}

	/**
	*Getter method for accessing the room name
	*@return name of room
	*/
	public String getRoom()
	{
		return Name;
	}
	
	/**
	*A method to display room's schedule
	*@param Week week number
	*/
	public void Show(int Week)
	{
		Time T = new Time();
		String[][] Table=T.ViewRoom(this,Week);

			for(int i=0;i<7;i++)
			{
				for(int j=0;j<20;j++)
					System.out.print(Table[i][j]+" ");
				System.out.println();
			}
	}

	/**
	*Getter method for accessing bookings apart from regular classes in the room
	*@return Linked List of bookings apart from regular classes in the room
	*/
	public LinkedList<Datime> getBook()
	{
		return SpecialBooking;
	}

	/**
	*A method for checking if the room is available
	*@param time Time period for which availability is to be checked
	*@param date Date on which availability is to be checked
	*@return true if available, false otherwise
	*/
	public boolean CheckClash(String time,String date)
	{//returns true if available 
		Datime D=new Datime(date,time);
		int T=D.retWeek();
		Time X=new Time();
		String[][] LEL=X.ViewRoom(this,T);
		int Day=D.retDay();
		String[] S1=time.trim().split("-");
		String[] S2=S1[0].trim().split(":");
		String[] S3=S1[1].trim().split(":");
		int A1=Integer.parseInt(S2[0]);
		int A2=Integer.parseInt(S3[0]);
		if(A1>=8)
		{
			if(S2[1].equals("00"))
			{
				A1=(A1*2)-16;
			}
			if(S2[1].equals("30"))
			{
				A1=(A1*2)-16+1;
			}
		}
		else
		{
			if(S2[1].equals("00"))
			{
				A1=(A1-1)*2+10;
			}
			if(S2[1].equals("30"))
			{
				A1=(A1-1)*2+10+1;
			}

		}
		if(A2>=8)
		{
			if(S3[1].equals("00"))
			{
				A2=(A2*2)-16;
			}
			if(S3[1].equals("30"))
			{
				A2=(A2*2)-16+1;
			}
		}
		else
		{
			if(S3[1].equals("00"))
			{
				A2=(A2-1)*2+10;
			}
			if(S3[1].equals("30"))
			{
				A2=(A2-1)*2+10+1;
			}

		}
		boolean flag=true;
		for(int i=A1;i<A2;i++)
		{
			if(!LEL[Day][i].equals("      "))
				flag=false;
		}
		return flag;

	}

	/*
	public static void main(String[] args)
	{
		/**
		List<Course> L=new ArrayList<Course>();
		FileInputStream F=new FileInputStream("db_Courses.txt");
		ObjectInputStream O=new ObjectInputStream(F);
		L=(List<Course>)O.readObject();
		for(int i=0;i<O.size();i++)
		{	
			LinkedList[] Temp=O.get(i).getSchedule();
			for(int j=0;j<5;j++)
			{
				LinkedList Temp2=Temp[j];
				
				Similar approach as in Time.java
				
			}
		}
		
		Room M=new Room("C21");
		M.book("8:30-9:30","1/8/17");
		M.Show(1);
		M.book("10:00-11:00","9/8/17");
		M.Show(2);
		System.out.println(M.CheckClash("12:00-1:00","17/11/17"));
	}	
	*/


/*	public boolean isAvailable(String fromtime, String date){

	}
*/
	/**
	*A method for booking the room
	*@param time Time period for which the room is to be booked
	*@param date Date on which room is to be booked
	*/
	public void book(String time, String date){
		Datime M=new Datime(date,time); 
		SpecialBooking.add(M);
	}

	/**
	*A method for cancelling bookings
	*@param a Time and Date on which the booking is to be cancelled
	*/
	public void cancel(Datime a){
		SpecialBooking.remove(a);
	}

}