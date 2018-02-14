import javafx.scene.layout.VBox;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import javafx.scene.control.ComboBox;
import java.io.*;
import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import java.time.LocalDate;
import javafx.beans.property.ReadOnlyStringWrapper;
import java.util.Arrays;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.layout.StackPane;
import javafx.util.Callback;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.cell.ComboBoxListCell;
import java.util.*;
import java.io.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;

import javafx.scene.control.ComboBox;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import java.util.Arrays;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Callback;
import java.io.*;
import java.util.*;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.Parent;


/**
	*This is the controller class for faculty.fxml
*/
public class FacultyController
{
	Faculty faculty;

	LinkedList<Faculty> facultyList;

	@FXML
	Label name;

	@FXML
	TextField newPassword;

	@FXML
	Parent homeView;

	@FXML
	Parent settingsView;

	@FXML
	ComboBox roomBook;

	@FXML
	DatePicker dateBook;

	@FXML
	ComboBox fromBook;

	@FXML
	ComboBox toBook;

	@FXML
	ComboBox roomCheck;

	@FXML
	DatePicker dateCheck;

	@FXML
	ComboBox fromCheck;

	@FXML
	ComboBox toCheck;

	@FXML
	ComboBox roomCal;

	@FXML
	Button logoutButton;

	@FXML
	TableView<String[]> calendar;
	@FXML
	TableColumn<String,String> cday;

	@FXML
	TableView<String> CalDay;

	@FXML
	Label weekNo;

	@FXML
	TableColumn<String[],String> cal1;
	@FXML
	TableColumn<String[],String> cal2;
	@FXML
	TableColumn<String[],String> cal3;
	@FXML
	TableColumn<String[],String> cal4;
	@FXML
	TableColumn<String[],String> cal5;
	@FXML
	TableColumn<String[],String> cal6;
	@FXML
	TableColumn<String[],String> cal7;
	@FXML
	TableColumn<String[],String> cal8;
	@FXML
	TableColumn<String[],String> cal9;
	@FXML
	TableColumn<String[],String> cal10;
	@FXML
	TableColumn<String[],String> cal11;
	@FXML
	TableColumn<String[],String> cal12;
	@FXML
	TableColumn<String[],String> cal13;
	@FXML
	TableColumn<String[],String> cal14;
	@FXML
	TableColumn<String[],String> cal15;
	@FXML
	TableColumn<String[],String> cal16;
	@FXML
	TableColumn<String[],String> cal17;
	@FXML
	TableColumn<String[],String> cal18;
	@FXML
	TableColumn<String[],String> cal19;
	@FXML
	TableColumn<String[],String> cal20;

	@FXML
	ListView<String> bookingsTable;	

	@FXML
	ListView<String> myCoursesTable;	

	@FXML
	Label date;
	
	
	public FacultyController() 
	{

	}


	
	@FXML
	private void initialize() 
	{
		cday.setCellValueFactory((p) -> {
            return new ReadOnlyStringWrapper(p.getValue());
        });

        cal1.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[0]));
                }
            });

		cal2.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[1]));
                }
            });
		cal3.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[2]));
                }
            });

		cal4.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[3]));
                }
            });
		cal5.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[4]));
                }
            });
		cal6.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[5]));
                }
            });
		cal7.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[6]));
                }
            });
		cal8.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[7]));
                }
            });
		cal9.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[8]));
                }
            });
		cal10.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[9]));
                }
            });

		cal11.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[10]));
                }
            });

		cal12.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[11]));
                }
            });
		cal13.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[12]));
                }
            });
		cal14.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[13]));
                }
            });
		cal15.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[14]));
                }
            });
		cal16.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[15]));
                }
            });
		cal17.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[16]));
                }
            });
		cal18.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[17]));
                }
            });
		cal19.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[18]));
                }
            });
		cal20.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[19]));
                }
            });
	}


	/**
	*Action executed upon clicking the settings button
	*/
	@FXML
	public void settings(){
		homeView.setVisible(false);
		settingsView.setVisible(true);
	}

	/**
	*Action executed upon clicking the change password button
	*/
	@FXML
	public void changePassword() throws Exception{
		faculty.setPassword(newPassword.getText());
		settingsView.setVisible(false);
		homeView.setVisible(true);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("facultyList.txt"));
		out.writeObject(facultyList);
	}


	/**
	*Action executed upon clicking the delete account button
	*/
	@FXML
	public void delAccount() throws Exception{
		facultyList.remove(faculty);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("facultyList.txt"));
		out.writeObject(facultyList);
		logout();
	}

	/**
	*Action executed upon clicking the return button
	*/
	@FXML
	public void backToHome(){
		settingsView.setVisible(false);
		homeView.setVisible(true);
	}

	/**
	*A method to pass on a specific user from different controllers
	*@param s User whose dashboard is to be loaded
	*@param facultyList database of faculty
	*/
	@FXML
	public void setUp(Faculty s, LinkedList<Faculty> facultyList) throws Exception{
		this.faculty = s;
		this.facultyList = facultyList;
		
		name.setText(s.getNaam());

		Time T=new Time();

		List<String> days = new ArrayList<String>();
			days.add("Monday");
			days.add("Tuesday");
			days.add("Wednesday");
			days.add("Thursday");
			days.add("Friday");
			days.add("Saturday");
			days.add("Sunday");
			ObservableList<String> data2 = FXCollections.observableArrayList(days);
            CalDay.setItems(data2);

            		ObjectInputStream in = new ObjectInputStream(new FileInputStream("roomsList.txt"));
		LinkedList<Room> roomsList = (LinkedList<Room>) in.readObject();
		Room R = (Room)roomsList.get(roomsList.indexOf(new Room("C01")));


            String[][] _table=T.ViewRoom(R, 1);
        ObservableList<String[]> _data = FXCollections.observableArrayList();
        _data.addAll(Arrays.asList(_table));
        calendar.setItems(_data);

        ArrayList<String> X = this.faculty.getMyBookedRooms();
            ObservableList<String> data = FXCollections.observableArrayList();
            data.addAll(X);
            bookingsTable.setItems(data);

            date.setText("July 31 - August 6");

		settingsView.setVisible(false);
		homeView.setVisible(true);


		List<Course> D=new ArrayList<Course>();
		FileInputStream F=new FileInputStream("db_Courses.txt");
		ObjectInputStream O=new ObjectInputStream(F);
		D=(List<Course>)O.readObject();


		ArrayList<String> mereCourses = new ArrayList<String>();

		for(Course c : D){
			if(c.getInstructor().equals(faculty.getNaam())){
				mereCourses.add(c.getName()+" "+c.getCode());
			}
		}


		 ObservableList<String> _mereCourses = FXCollections.observableArrayList();
            _mereCourses.addAll(mereCourses);
            myCoursesTable.setItems(_mereCourses);

	}

	/**
	*Action executed upon clicking the logout button
	*/
	@FXML
	public void logout() throws Exception{
		Stage stage =(Stage) logoutButton.getScene().getWindow(); 
		Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));		
		Scene scene = new Scene(root); 
		stage.setScene(scene);    
		stage.show();
	}

	/**
	*Action executed upon clicking the Check Availability button
	*/
	@FXML
	public void checkAvail() throws Exception{
		try{
		String checkRoom = roomCheck.getSelectionModel().getSelectedItem().toString();
		LocalDate t = dateCheck.getValue();
		String date = t.getDayOfMonth()+"/"+t.getMonthValue()+"/"+t.getYear();
		String time = fromCheck.getSelectionModel().getSelectedItem().toString()+"-"+toCheck.getSelectionModel().getSelectedItem().toString();
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("roomsList.txt"));
		LinkedList<Room> roomsList = (LinkedList<Room>) in.readObject();

		Room r = (Room)roomsList.get(roomsList.indexOf(new Room(checkRoom)));

		if(r.CheckClash(time, date)){
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Room Availabilty");
			alert.setHeaderText(null);
			alert.setContentText("Room is Available!");

			alert.showAndWait();
		}

		else
			{
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Room Availabilty");
			alert.setHeaderText(null);
			alert.setContentText("Room Unavailable!");

			alert.showAndWait();}

			}
    catch(Exception e){}


	}

	/**
	*Action executed upon clicking the Book Room button
	*/
	@FXML
	public void bookButton() throws Exception{
		try{
		String bookRoom = roomBook.getSelectionModel().getSelectedItem().toString();
		LocalDate t = dateBook.getValue();
		String date = t.getDayOfMonth()+"/"+t.getMonthValue()+"/"+t.getYear();
		String time = fromBook.getSelectionModel().getSelectedItem().toString()+"-"+toBook.getSelectionModel().getSelectedItem().toString();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("roomsList.txt"));
		LinkedList<Room> roomsList = (LinkedList<Room>) in.readObject();

		Room r = (Room)roomsList.get(roomsList.indexOf(new Room(bookRoom)));

		if(r.CheckClash(time, date)){
			r.book(time, date);
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("roomsList.txt"));
			out.writeObject(roomsList);
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Room Booking");
			alert.setHeaderText(null);
			alert.setContentText("Booking Successful!");
			alert.showAndWait();
			faculty.addMyBooking(bookRoom,date,time);

			ArrayList<String> T = this.faculty.getMyBookedRooms();
            ObservableList<String> data = FXCollections.observableArrayList();
            data.addAll(T);
            bookingsTable.setItems(data);

		}

		else
			{
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Room Booking");
			alert.setHeaderText(null);
			alert.setContentText("Room Unavailable!");
			alert.showAndWait();}
			}
    catch(Exception e){}
		
	}

	/**
	*Action executed upon clicking the Cancel Booking button
	*/
	@FXML
	public void cancelBookingAction() throws Exception{
		try{
			String S1=bookingsTable.getSelectionModel().getSelectedItem();
            
            List<Booking> L = this.faculty.getBookedRoomsLL();
            for(int i=0;i<L.size();i++)
            {
            	if(L.get(i).toString().equals(S1))
            	{
            		Booking waste = L.get(i);
            		faculty.cancelMyBooking(waste);
            		ObjectInputStream in = new ObjectInputStream(new FileInputStream("roomsList.txt"));
					
					LinkedList<Room> roomsList = (LinkedList<Room>) in.readObject();
					Room r = (Room)roomsList.get(roomsList.indexOf(new Room(waste.getRoom())));
					r.cancel(waste.getTime());
					ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("roomsList.txt"));
					out.writeObject(roomsList);
            	}
            }
            ArrayList<String> X = this.faculty.getMyBookedRooms();
            ObservableList<String> data = FXCollections.observableArrayList();
            data.addAll(X);
            bookingsTable.setItems(data);

            ObjectOutputStream out = null;
			out = new ObjectOutputStream(new FileOutputStream("facultyList.txt"));
			out.writeObject(facultyList);

			loadRoom();

			}
    catch(Exception e){}
            
	}

	/**
	*Action executed upon clicking the next week button
	*/
	@FXML 
	public void nextWeek() throws Exception
	{
		try{
		int w = Integer.valueOf(weekNo.getText())+1;
		if(w<=18){
		String r = roomCal.getSelectionModel().getSelectedItem().toString();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("roomsList.txt"));
		LinkedList<Room> roomsList = (LinkedList<Room>) in.readObject();
		Room R = (Room)roomsList.get(roomsList.indexOf(new Room(r)));

		

		weekNo.setText(String.valueOf(w));
		weekDates(w);

        Time T=new Time();
        String[][] Table=T.ViewRoom(R, w);
        ObservableList<String[]> data = FXCollections.observableArrayList();
        data.addAll(Arrays.asList(Table));
        calendar.setItems(data);
    	}
    }
    catch(Exception e){}
	}

	/**
	*Action executed upon clicking the previous week button
	*/
	@FXML 
	public void prevWeek() throws Exception
	{
		try{
		int w = Integer.valueOf(weekNo.getText())-1;
		if(w>0){
		String r = roomCal.getSelectionModel().getSelectedItem().toString();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("roomsList.txt"));
		LinkedList<Room> roomsList = (LinkedList<Room>) in.readObject();
		Room R = (Room)roomsList.get(roomsList.indexOf(new Room(r)));

		
		weekNo.setText(String.valueOf(w));
		weekDates(w);


        Time T=new Time();
        String[][] Table=T.ViewRoom(R, w);
        ObservableList<String[]> data = FXCollections.observableArrayList();
        data.addAll(Arrays.asList(Table));
        calendar.setItems(data);
    	}
    }
    catch(Exception e){}
	}


	/**
	*Action executed upon selecting a room from the combo box
	*/
	@FXML 
	public void loadRoom() throws Exception
	{
		try{

		String r = roomCal.getSelectionModel().getSelectedItem().toString();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("roomsList.txt"));
		LinkedList<Room> roomsList = (LinkedList<Room>) in.readObject();
		Room R = (Room)roomsList.get(roomsList.indexOf(new Room(r)));

		int w = Integer.valueOf(weekNo.getText());

        Time T=new Time();
        String[][] Table=T.ViewRoom(R, w);
        ObservableList<String[]> data = FXCollections.observableArrayList();
        data.addAll(Arrays.asList(Table));
        calendar.setItems(data);
    }
    catch(Exception e){}
	}

	/**
	*A method to display dates corresponding to the week
	*/
	@FXML
	public void weekDates(int w){
		switch(w){
			case 1:{
				date.setText("July 31 - August 6");
				return;	
			}
			case 2:{
				date.setText("August 7 - August 13");
				return;	
			}
			case 3:{
				date.setText("August 14 - August 20");
				return;	
			}
			case 4:{
				date.setText("August 21 - August 27");
				return;	
			}
			case 5:{
				date.setText("August 28 - September 3");
				return;	
			}
			case 6:{
				date.setText("September 4 - September 10");
				return;	
			}
			case 7:{
				date.setText("September 11 - September 17");
				return;	
			}
			case 8:{
				date.setText("September 18 - September 24");
				return;	
			}
			case 9:{
				date.setText("September 25 - October 1");
				return;	
			}
			case 10:{
				date.setText("October 2 - October 8");
				return;	
			}
			case 11:{
				date.setText("October 9 - October 15");
				return;	
			}
			case 12:{
				date.setText("October 16 - October 22");
				return;	
			}
			case 13:{
				date.setText("October 23 - October 29");
				return;	
			}
			case 14:{
				date.setText("October 30 - November 5");
				return;	
			}
			case 15:{
				date.setText("November 6 - November 12");
				return;	
			}
			case 16:{
				date.setText("November 13 - November 19");
				return;	
			}
			case 17:{
				date.setText("November 20 - November 26");
				return;	
			}
			case 18:{
				date.setText("November 27 - December 3");
				return;	
			}

		}
	}
	

}