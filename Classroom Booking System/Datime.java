import java.util.*;
import java.io.*;

/**
	*The Datime class is a custom Date and Time class
*/
public class Datime implements Serializable{
	private String Date;
	private String Time;

	/**
	*Class constructor
	*/
	public Datime(String d,String t)
	{
		Date=d;
		Time=t;
	}

	/**
	*A method to know Day of week from Date
	*@return int corresponding to day of week - 0 : Monday, ...
	*/
	public int retDay()
	{
		String S[]=Date.trim().split("/");
		int X=Integer.parseInt(S[0]);
		String D="";
		if(S[1].equals("8"))
		{
			X=(X)%7;
		}
		if(S[1].equals("9"))
		{
			X=(X+31)%7;
		}
		if(S[1].equals("10"))
		{
			X=(X+61)%7;
		}
		if(S[1].equals("11"))
		{
			X=(X+92)%7;
		}
		/*if(X==0)
			D="Monday";
		if(X==1)
			D="Tuesday";
		if(X==2)
			D="Wednesday";
		if(X==3)
			D="Thursday";
		if(X==4)
			D="Friday";
		if(X==5)
			D="Saturday";
		if(X==6)
			D="Sunday";*/
		return X;
	}

	/**
	*A method to know week number on which the date falls
	*@return int corresponding to week number
	*/
	public int retWeek()
	{
		String S[]=Date.trim().split("/");
		int X=Integer.parseInt(S[0]);
		String D="";
		if(S[1].equals("8"))
		{
			X=(X)/7;
		}
		if(S[1].equals("9"))
		{
			X=(X+31)/7;
		}
		if(S[1].equals("10"))
		{
			X=(X+61)/7;
		}
		if(S[1].equals("11"))
		{
			X=(X+92)/7;
		}
		return X+1;

	}

	/**
	*Getter method for time
	*@return time in String format
	*/
	public String retTime()
	{
		return this.Time;
	}

	/**
	*Getter method for date
	*@return date in String format
	*/
	public String retDate()
	{
		return this.Date;
	}

	/**
	*A method to know if the date and time are same
	*@param o the Date and Time to be compared to
	*@return true if they're same, false otherwise
	*/
	@Override
	public boolean equals(Object o){
		Datime mm = (Datime) o;
		return Time.equals(mm.retTime()) && Date.equals(mm.retDate());
	}


	/*
	public static void main(String[] args)
	{
		Datime W=new Datime("1/8/17","8:30-9:30");
		System.out.print(W.retDay()+" "+W.retWeek()+" "+W.retTime());
	}
	*/
}