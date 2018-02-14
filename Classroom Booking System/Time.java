import java.lang.*;
import java.io.*;
import java.util.*;

/**
	*The Time class provides the personalised calendar for each student and individual calendar for each room
*/
public class Time{

	/**
	*A method for viewing calendar of room for a particular week
	*@param S the room whose calendar is to be viewed
	*@param Week the week number of the Monsoon semester
	*@return a 2-D Array of calendar data
	*/
	public String[][] ViewRoom(Room S,int Week)
	{
		
			String[][] Table=new String[7][30];
		try{
			List<Course> D=new ArrayList<Course>();
			FileInputStream F=new FileInputStream("db_Courses.txt");
			ObjectInputStream O=new ObjectInputStream(F);
			D=(List<Course>)O.readObject();
			for(int i=0;i<7;i++)
			{
				for(int j=0;j<30;j++)
					Table[i][j]="      ";
			}
			for(int i=0;i<D.size();i++)
			{
				LinkedList[] LOL=D.get(i).getSchedule();
				for(int j=0;j<5;j++)
				{
					LinkedList Temp=LOL[j];
					for(int k=0;k<Temp.size();k++)
					{
						String Y1=((Slot)Temp.get(k)).getCatVen();
						String[] Y2=Y1.trim().split("\\s+");
						if(Y2[0].equals(S.getRoom()))
						{
						String X1=((Slot)Temp.get(k)).getTime();
						String[] X2=X1.trim().split("-");
						String[] X3=X2[0].trim().split(":");
						String[] X4=X2[1].trim().split(":");
						if(Integer.parseInt(X3[0])>=8)
						{
							if(X3[1].equals("00"))
							{
								Table[j][Integer.parseInt(X3[0])*2-16]=D.get(i).getCode();
								int TT=Integer.parseInt(X4[0]);
								if(TT>=8)
								{
									int XX=Integer.parseInt(X3[0])*2-16;
									if(X4[1].equals("00"))
									{
										TT=TT*2-16;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}
									else if(X4[1].equals("30"))
									{
										TT=TT*2-16+1;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}
								}
								else
								{
									int XX=Integer.parseInt(X3[0])*2-16;
									if(X4[1].equals("00"))
									{
										TT=(TT-1)*2+10;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}
									else if(X4[1].equals("30"))
									{
										TT=(TT-1)*2+10+1;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}

								}

							}
							if(X3[1].equals("30"))
							{
								Table[j][Integer.parseInt(X3[0])*2-16+1]=D.get(i).getCode();
								int TT=Integer.parseInt(X4[0]);
								if(TT>=8)
								{
									int XX=Integer.parseInt(X3[0])*2-16+1;
									if(X4[1].equals("00"))
									{
										TT=TT*2-16;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}
									else if(X4[1].equals("30"))
									{
										TT=TT*2-16+1;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}
								}
								else
								{
									int XX=Integer.parseInt(X3[0])*2-16+1;
									if(X4[1].equals("00"))
									{
										TT=(TT-1)*2+10;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}
									else if(X4[1].equals("30"))
									{
										TT=(TT-1)*2+10+1;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}

								}
							}
						}
						else if(Integer.parseInt(X3[0])<8)
						{
							if(X3[1].equals("00"))
							{
								Table[j][(Integer.parseInt(X3[0])-1)*2+10]=D.get(i).getCode();
								int TT=Integer.parseInt(X4[0]);
								if(TT>=8)
								{
									int XX=(Integer.parseInt(X3[0])-1)*2+10;
									if(X4[1].equals("00"))
									{
										TT=TT*2-16;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}
									else if(X4[1].equals("30"))
									{
										TT=TT*2-16+1;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}
								}
								else
								{
									int XX=(Integer.parseInt(X3[0])-1)*2+10;
									if(X4[1].equals("00"))
									{
										TT=(TT-1)*2+10;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}
									else if(X4[1].equals("30"))
									{
										TT=(TT-1)*2+10+1;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}

								}
							}
							if(X3[1].equals("30"))
							{
								Table[j][(Integer.parseInt(X3[0])-1)*2+10+1]=D.get(i).getCode();
								int TT=Integer.parseInt(X4[0]);
								if(TT>=8)
								{
									int XX=(Integer.parseInt(X3[0])-1)*2+10+1;
									if(X4[1].equals("00"))
									{
										TT=TT*2-16;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}
									else if(X4[1].equals("30"))
									{
										TT=TT*2-16+1;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}
								}
								else
								{
									int XX=(Integer.parseInt(X3[0])-1)*2+10+1;
									if(X4[1].equals("00"))
									{
										TT=(TT-1)*2+10;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}
									else if(X4[1].equals("30"))
									{
										TT=(TT-1)*2+10+1;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}

								}
							
							}

						}
					}
					}
				}
			}
			LinkedList<Datime> Spec=S.getBook();
			for(int i=0;i<Spec.size();i++)
			{
				if(Week==Spec.get(i).retWeek())
				{
						int j=Spec.get(i).retDay();
						String X1=Spec.get(i).retTime();
						String[] X2=X1.trim().split("-");
						String[] X3=X2[0].trim().split(":");
						String[] X4=X2[1].trim().split(":");
						if(Integer.parseInt(X3[0])>=8)
						{
							if(X3[1].equals("00"))
							{
								Table[j][Integer.parseInt(X3[0])*2-16]="BOOKED";
								int TT=Integer.parseInt(X4[0]);
								if(TT>=8)
								{
									int XX=Integer.parseInt(X3[0])*2-16;
									if(X4[1].equals("00"))
									{
										TT=TT*2-16;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]="BOOKED";
										}
									}
									else if(X4[1].equals("30"))
									{
										TT=TT*2-16+1;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]="BOOKED";
										}
									}
								}
								else
								{
									int XX=Integer.parseInt(X3[0])*2-16;
									if(X4[1].equals("00"))
									{
										TT=(TT-1)*2+10;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]="BOOKED";
										}
									}
									else if(X4[1].equals("30"))
									{
										TT=(TT-1)*2+10+1;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]="BOOKED";
										}
									}

								}

							}
							if(X3[1].equals("30"))
							{
								Table[j][Integer.parseInt(X3[0])*2-16+1]="BOOKED";
								int TT=Integer.parseInt(X4[0]);
								if(TT>=8)
								{
									int XX=Integer.parseInt(X3[0])*2-16+1;
									if(X4[1].equals("00"))
									{
										TT=TT*2-16;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]="BOOKED";
										}
									}
									else if(X4[1].equals("30"))
									{
										TT=TT*2-16+1;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]="BOOKED";
										}
									}
								}
								else
								{
									int XX=Integer.parseInt(X3[0])*2-16+1;
									if(X4[1].equals("00"))
									{
										TT=(TT-1)*2+10;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]="BOOKED";
										}
									}
									else if(X4[1].equals("30"))
									{
										TT=(TT-1)*2+10+1;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]="BOOKED";
										}
									}

								}
							}
						}
						else if(Integer.parseInt(X3[0])<8)
						{
							if(X3[1].equals("00"))
							{
								Table[j][(Integer.parseInt(X3[0])-1)*2+10]="BOOKED";
								int TT=Integer.parseInt(X4[0]);
								if(TT>=8)
								{
									int XX=(Integer.parseInt(X3[0])-1)*2+10;
									if(X4[1].equals("00"))
									{
										TT=TT*2-16;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]="BOOKED";
										}
									}
									else if(X4[1].equals("30"))
									{
										TT=TT*2-16+1;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]="BOOKED";
										}
									}
								}
								else
								{
									int XX=(Integer.parseInt(X3[0])-1)*2+10;
									if(X4[1].equals("00"))
									{
										TT=(TT-1)*2+10;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]="BOOKED";
										}
									}
									else if(X4[1].equals("30"))
									{
										TT=(TT-1)*2+10+1;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]="BOOKED";
										}
									}

								}
							}
							if(X3[1].equals("30"))
							{
								Table[j][(Integer.parseInt(X3[0])-1)*2+10+1]="BOOKED";
								int TT=Integer.parseInt(X4[0]);
								if(TT>=8)
								{
									int XX=(Integer.parseInt(X3[0])-1)*2+10+1;
									if(X4[1].equals("00"))
									{
										TT=TT*2-16;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]="BOOKED";
										}
									}
									else if(X4[1].equals("30"))
									{
										TT=TT*2-16+1;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]="BOOKED";
										}
									}
								}
								else
								{
									int XX=(Integer.parseInt(X3[0])-1)*2+10+1;
									if(X4[1].equals("00"))
									{
										TT=(TT-1)*2+10;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]="BOOKED";
										}
									}
									else if(X4[1].equals("30"))
									{
										TT=(TT-1)*2+10+1;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]="BOOKED";
										}
									}

}}
								}
				}
			}
			/*
			for(int i=0;i<7;i++)
			{
				for(int j=0;j<20;j++)
					System.out.print(Table[i][j]+" ");
				System.out.println();
			}*/
		}catch(Exception E){
			E.printStackTrace();
		}	
		
			return Table;
	}


	/**
	*A method for viewing time table of a student
	*@param S the Student who wants to view his/her time-table
	*@return a 2-D Array of time-table data
	*/
	public String[][] ViewStud(Student S)
	{

		String[][] Table=new String[7][30];
		try{
			List<Course> L=new ArrayList<Course>();
			FileInputStream F=new FileInputStream("db_Courses.txt");
			ObjectInputStream O=new ObjectInputStream(F);
			L=(List<Course>)O.readObject();List<Course> D=S.getCourses();
			
			for(int i=0;i<7;i++)
			{
				for(int j=0;j<30;j++)
					Table[i][j]="      ";
			}
			for(int i=0;i<D.size();i++)
			{
				LinkedList[] LOL=D.get(i).getSchedule();
				for(int j=0;j<5;j++)
				{
					LinkedList Temp=LOL[j];
					for(int k=0;k<Temp.size();k++)
					{
						String X1=((Slot)Temp.get(k)).getTime();
						String[] X2=X1.trim().split("-");
						String[] X3=X2[0].trim().split(":");
						String[] X4=X2[1].trim().split(":");
						if(Integer.parseInt(X3[0])>=8)
						{
							if(X3[1].equals("00"))
							{
								Table[j][Integer.parseInt(X3[0])*2-16]=D.get(i).getCode();
								int TT=Integer.parseInt(X4[0]);
								if(TT>=8)
								{
									int XX=Integer.parseInt(X3[0])*2-16;
									if(X4[1].equals("00"))
									{
										TT=TT*2-16;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}
									else if(X4[1].equals("30"))
									{
										TT=TT*2-16+1;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}
								}
								else
								{
									int XX=Integer.parseInt(X3[0])*2-16;
									if(X4[1].equals("00"))
									{
										TT=(TT-1)*2+10;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}
									else if(X4[1].equals("30"))
									{
										TT=(TT-1)*2+10+1;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}

								}

							}
							if(X3[1].equals("30"))
							{
								Table[j][Integer.parseInt(X3[0])*2-16+1]=D.get(i).getCode();
								int TT=Integer.parseInt(X4[0]);
								if(TT>=8)
								{
									int XX=Integer.parseInt(X3[0])*2-16+1;
									if(X4[1].equals("00"))
									{
										TT=TT*2-16;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}
									else if(X4[1].equals("30"))
									{
										TT=TT*2-16+1;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}
								}
								else
								{
									int XX=Integer.parseInt(X3[0])*2-16+1;
									if(X4[1].equals("00"))
									{
										TT=(TT-1)*2+10;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}
									else if(X4[1].equals("30"))
									{
										TT=(TT-1)*2+10+1;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}

								}
							}
						}
						else if(Integer.parseInt(X3[0])<8)
						{
							if(X3[1].equals("00"))
							{
								Table[j][(Integer.parseInt(X3[0])-1)*2+10]=D.get(i).getCode();
								int TT=Integer.parseInt(X4[0]);
								if(TT>=8)
								{
									int XX=(Integer.parseInt(X3[0])-1)*2+10;
									if(X4[1].equals("00"))
									{
										TT=TT*2-16;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}
									else if(X4[1].equals("30"))
									{
										TT=TT*2-16+1;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}
								}
								else
								{
									int XX=(Integer.parseInt(X3[0])-1)*2+10;
									if(X4[1].equals("00"))
									{
										TT=(TT-1)*2+10;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}
									else if(X4[1].equals("30"))
									{
										TT=(TT-1)*2+10+1;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}

								}
							}
							if(X3[1].equals("30"))
							{
								Table[j][(Integer.parseInt(X3[0])-1)*2+10+1]=D.get(i).getCode();
								int TT=Integer.parseInt(X4[0]);
								if(TT>=8)
								{
									int XX=(Integer.parseInt(X3[0])-1)*2+10+1;
									if(X4[1].equals("00"))
									{
										TT=TT*2-16;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}
									else if(X4[1].equals("30"))
									{
										TT=TT*2-16+1;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}
								}
								else
								{
									int XX=(Integer.parseInt(X3[0])-1)*2+10+1;
									if(X4[1].equals("00"))
									{
										TT=(TT-1)*2+10;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}
									else if(X4[1].equals("30"))
									{
										TT=(TT-1)*2+10+1;
										for(int l=XX+1;l<TT;l++)
										{
											Table[j][l]=D.get(i).getCode();
										}
									}

								}
							}
						}
					}
				}
			}
			/*for(int i=0;i<7;i++)
			{
				for(int j=0;j<20;j++)
					System.out.print(Table[i][j]+" ");
				System.out.println();
			}*/
		}catch(Exception E){
			E.printStackTrace();
		}
		return Table;
	}

}