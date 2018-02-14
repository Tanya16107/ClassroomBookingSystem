import java.lang.*;
import java.io.*;
import java.util.*;


/**
	*The Search class provides the personalised search results for each student who searches for courses depending upon his/her course list
*/
public class Search{

	/**
	*@param Succ the student searching for courses
	*@param Q1 the kewords searched for
	*@return an array list of String containing details of the courses.
	*/
	public ArrayList<String> ShowSearch(Student Succ,String Q1)
	{
		ArrayList<String> RetA=new ArrayList<String>();
		try{
			List<Course> L=new ArrayList<Course>();
			FileInputStream F=new FileInputStream("db_Courses.txt");
			ObjectInputStream O=new ObjectInputStream(F);
			L=(List<Course>)O.readObject();
			HashMap < String,List < Course > > M=new HashMap <String,List<Course>>();
			for(int j=0;j<L.size();j++)
			{
				String S1=L.get(j).getPostConditions();
				S1=S1.replaceAll(",","");
				S1=S1.replaceAll("\\.","");
				List<String> S2=new ArrayList<String>(Arrays.asList(S1.split("\\s+")));
				for(int i=0;i<S2.size();i++)
				{
					if(M.containsKey(S2.get(i).toLowerCase()))
					{
						List<Course> Temp=M.get(S2.get(i).toLowerCase());
						Temp.add(L.get(j));
						M.put(S2.get(i).toLowerCase(),Temp);
					}
					else
					{
						List<Course> Temp=new ArrayList<Course>();
						Temp.add(L.get(j));
						M.put(S2.get(i).toLowerCase(),Temp);
					}
				}
			}
			List<Course> DDD=Succ.getCourses();
			HashSet<Course> LEL=new HashSet<Course>();
			List<String> Q2=new ArrayList<String>(Arrays.asList(Q1.split("\\s+")));
			for(int i=0;i<Q2.size();i++)
			{
				if(M.containsKey(Q2.get(i).toLowerCase()))
				{
					List<Course> Temp=M.get(Q2.get(i).toLowerCase());
					for(int j=0;j<Temp.size();j++)
					{
						Boolean flag=true;
						for(int k=0;k<DDD.size();k++)
						{
							if(Temp.get(j).clashCheck(DDD.get(k)))
								flag=false;
						}
						if(flag==true)
							LEL.add(Temp.get(j));
					}
				}
			}
			Iterator<Course> itr=LEL.iterator();
			while(itr.hasNext())
			{
				RetA.add(itr.next().toString());
			}
		}catch(Exception E){
			E.printStackTrace();
		}
		return RetA;
	}
	
}