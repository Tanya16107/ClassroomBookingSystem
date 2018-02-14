import java.util.*;
import java.io.*;

class App{
	static void mainMenu(){
		System.out.println("1. Create User:\n1. Student\n2. Faculty\n3. Admin\n");
		System.out.println("2. Login:\n1. Student\n2. Faculty\n3. Admin");
		System.out.println("\n3.Close Application");
	}

	static void studentMenu(){
		System.out.println("1. Logout\n2. Search for Course\n3. View Timetable\n4. Check Availability of Room\n5. Request Booking\n6. View My Bookings");
	}
	static void facultyMenu(){
		System.out.println("1. Logout\n2. My Courses\n3. Check Availability of Room\n4. Book Room\n5. View My Bookings");
	}
	static void adminMenu(){
		System.out.println("1. Logout\n2. Check Availability of Room\n3. Book Room\n4. View My Bookings\n5. View Requests");
	}

	static void serialize(Object p, int c) throws IOException{
		ObjectOutputStream out = null;
		try{
			switch(c){
				case 1:
				{out = new ObjectOutputStream(new FileOutputStream("studentList.txt"));
				out.writeObject(p);
				break;}
								
				case 2:
				{out = new ObjectOutputStream(new FileOutputStream("facultyList.txt"));
				out.writeObject(p);
				break;}
								
				case 3:
				{out = new ObjectOutputStream(new FileOutputStream("adminList.txt"));
				out.writeObject(p);
				break;}

				case 4:
				{out = new ObjectOutputStream(new FileOutputStream("requestedRooms.txt"));
				out.writeObject(p);
				break;}

				case 5:
				{out = new ObjectOutputStream(new FileOutputStream("roomsList.txt"));
				out.writeObject(p);
				break;}
			}
			
			
		}
		finally{
			out.close();
		}

	}

 	static LinkedList<Student> deserializeStudentList() throws IOException, ClassNotFoundException {
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream(new FileInputStream("studentList.txt"));
			return (LinkedList<Student>) in.readObject();
		}
		finally{
			in.close();
		}
	}

	static LinkedList<Room> deserializeRoomsList() throws IOException, ClassNotFoundException {
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream(new FileInputStream("roomsList.txt"));
			return (LinkedList<Room>) in.readObject();
		}
		finally{
			in.close();
		}
	}

	static LinkedList<Faculty> deserializeFacultyList() throws IOException, ClassNotFoundException {
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream(new FileInputStream("facultyList.txt"));
			return (LinkedList<Faculty>) in.readObject();
		}
		finally{
			in.close();
		}
	}

	static LinkedList<Admin> deserializeAdminList() throws IOException, ClassNotFoundException {
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream(new FileInputStream("adminList.txt"));
			return (LinkedList<Admin>) in.readObject();
		}
		finally{
			in.close();
		}
	}

	static LinkedList<RequestedRoom> deserializeRequestedRooms() throws IOException, ClassNotFoundException {
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream(new FileInputStream("requestedRooms.txt"));
			return (LinkedList<RequestedRoom>) in.readObject();
		}
		finally{
			in.close();
		}
	}


	public static void main(String[] args) throws Exception {

		
		LinkedList<Student> studentList = new LinkedList<Student>();
		LinkedList<Faculty> facultyList = new LinkedList<Faculty>();
		LinkedList<Admin> adminList = new LinkedList<Admin>();
		serialize(studentList, 1);
		serialize(facultyList, 2);
		serialize(adminList, 3);

		

		LinkedList<Room> roomsList = new LinkedList<Room>();
		Room s = new Room("C01");
		roomsList.add(s);
		s = new Room("C02");
		roomsList.add(s);
		s = new Room("C03");
		roomsList.add(s);

		s = new Room("C11");
		roomsList.add(s);
		s = new Room("C12");
		roomsList.add(s);
		s = new Room("C13");
		roomsList.add(s);

		s = new Room("C21");
		roomsList.add(s);
		s = new Room("C22");
		roomsList.add(s);
		s = new Room("C23");
		roomsList.add(s);
		s = new Room("C24");
		roomsList.add(s);

		s = new Room("LR1");
		roomsList.add(s);
		s = new Room("LR2");
		roomsList.add(s);
		s = new Room("LR3");
		roomsList.add(s);

		s = new Room("S01");
		roomsList.add(s);

		s = new Room("S02");
		roomsList.add(s);

		s = new Room("L21");
		roomsList.add(s);
		s = new Room("L22");
		roomsList.add(s);
		s = new Room("L23");
		roomsList.add(s);


		serialize(roomsList, 5);
		
		LinkedList<RequestedRoom> requestedRooms = new LinkedList<RequestedRoom>();
		serialize(requestedRooms, 4);	
		
		
		//LinkedList<Student> studentList = deserializeStudentList();
		//LinkedList<Faculty> facultyList = deserializeFacultyList();
		//LinkedList<Admin> adminList = deserializeAdminList();
		//LinkedList<Room> roomsList = deserializeRoomsList();
		//LinkedList<RequestedRoom> requestedRooms = deserializeRequestedRooms();


		
		Scanner sc = new Scanner(System.in);
		int e;

		String roomName, date, fromTime, toTime;

		while(true){
		mainMenu();

		boolean logout = false;
		int c = sc.nextInt();
		int d;
		
		switch(c){
			case 1:
			{
				d = sc.nextInt();
				System.out.print("emailID: ");
				String emailID = sc.next();
				System.out.print("password: ");
				String password = sc.next();
				
				switch(d){
					case 1:
					{
					Student newUser = new Student(emailID, password, "X");
					studentList.add(newUser);
					serialize(studentList, 1);
					break;
					}

					case 2:
					{
					Faculty newUser = new Faculty(emailID, password, "X");
					facultyList.add(newUser);
					serialize(facultyList, 2);
					break;
					}

					case 3:
					{
					Admin newUser = new Admin(emailID, password, "X");
					adminList.add(newUser);
					serialize(adminList, 3);
					break;
					}
				}
				break;
			}
			case 2:{
				//deserialize
				d = sc.nextInt();
				System.out.print("emailID: ");
				String emailID = sc.next();
				System.out.print("password: ");
				String password = sc.next();
				switch(d){
					case 1:{

						Student student = new Student(emailID, password, "X");
						if(studentList.indexOf(student)==-1){
							System.out.println("Wrong Username/password");
						}
						else{
							student = studentList.get(studentList.indexOf(student));
							while(!logout){
							studentMenu();
							e = sc.nextInt();
							switch(e){
								case 1:{
									logout = true;
								}
								break;
								case 2:{
									System.out.println("Enter keyword: ");
									String keyword = sc.next();

								}
								break;
								case 3:{
									//student.viewTimeTable();
								}
								break;
								case 4:{
									System.out.println("Room name? ");
									String s_room = sc.next();
									System.out.println("Date? ");
									String s_room_date = sc.next();
									System.out.println("From time? ");
									String s_from_time = sc.next();
									System.out.println("To time? ");
									String s_to_time = sc.next();
									//add code;



								}
								break;
								case 5:{
									System.out.println("Preferred Room? ");
									String p_room = sc.next();
									System.out.println("Capacity? ");
									int p_cap = sc.nextInt();
									sc.nextLine();
									System.out.println("Purpose: ");
									String purpose = sc.next();
									//RequestedRoom r = new RequestedRoom(p_room, p_cap, purpose);
									//student.requestRoom(r);
									//requestedRooms.add(r);
									//serialize(requestedRooms, 4);

								}
								break;
								case 6:{
									student.viewBookedRooms();

								}
								break;
							}
						}

						}
						serialize(studentList, 1);
						studentList = deserializeStudentList();
						break;
					}
					case 2:{

						Faculty faculty = new Faculty(emailID, password, "X");

						if(facultyList.indexOf(faculty)==-1){
							System.out.println("Wrong Username/password");
						}
						else{
							faculty = facultyList.get(facultyList.indexOf(faculty));
							while(!logout){
							facultyMenu();
							e = sc.nextInt();
							switch(e){
								case 1:{
									logout = true;
								}
								break;
								case 2:{
									//faculty.viewMyCourses();

								}
								break;
								case 3:{
									System.out.println("Room name? ");
									String s_room = sc.next();
									System.out.println("Date? ");
									String s_room_date = sc.next();
									System.out.println("From time? ");
									String s_from_time = sc.next();
									System.out.println("To time? ");
									String s_to_time = sc.next();
									//add code;


								}
								break;
								case 4:{
									System.out.println("Room name? ");
									String b_room = sc.next();
									System.out.println("Date? ");
									String b_room_date = sc.next();
									System.out.println("From time? ");
									String b_from_time = sc.next();
									System.out.println("To time? ");
									String b_to_time = sc.next();
									//faculty.bookRoom(b_room, b_from_time, b_to_time, b_room_date);
									

								}
								break;
								case 5:{
									faculty.viewBookedRooms();

								}
								break;
								
							}
						}
						}
						serialize(facultyList, 2);
						facultyList = deserializeFacultyList();
						break;
					}
					case 3:{

						Admin admin = new Admin(emailID, password, "X");

						if(adminList.indexOf(admin)==-1){
							System.out.println("Wrong Username/password");
						}
						else{
							admin = adminList.get(adminList.indexOf(admin));
							while(!logout){
							adminMenu();
							e = sc.nextInt();
							switch(e){
								case 1:{
									logout = true;
								}
								break;
								case 2:{
									System.out.println("Room name? ");
									String s_room = sc.next();
									System.out.println("Date? ");
									String s_room_date = sc.next();
									System.out.println("From time? ");
									String s_from_time = sc.next();
									System.out.println("To time? ");
									String s_to_time = sc.next();
									//add code;

								}
								break;
								case 3:{
									System.out.println("Room name? ");
									String b_room = sc.next();
									System.out.println("Date? ");
									String b_room_date = sc.next();
									System.out.println("From time? ");
									String b_from_time = sc.next();
									System.out.println("To time? ");
									String b_to_time = sc.next();
									//admin.bookRoom(b_room, b_from_time, b_to_time, b_room_date);
									


								}
								break;
								case 4:{
									admin.viewBookedRooms();

								}
								break;
								case 5:{
									//requestedRooms = deserializeRequestedRooms();
									//for(int i=0; i<requestedRooms.size(); i++){
									//	System.out.println(requestedRooms.get(i));
									//}
								}
								break;
								
							}
						}
						}
						break;
					}
				}
				serialize(adminList, 3);
				adminList = deserializeAdminList();
				break;


			}
			case 3:{
				System.exit(0);
			}
		}
	}

		
	}
}