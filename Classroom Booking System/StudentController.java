import javafx.scene.layout.VBox;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;
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

import javafx.application.Application;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.time.LocalDate;

import javafx.scene.control.ScrollBar;
import javafx.geometry.Orientation;

import javafx.beans.property.ReadOnlyStringWrapper;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;
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

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.*;
import java.io.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.Parent;
import javafx.util.*;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;
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


import javafx.scene.Parent;

public class StudentController
{

	Student student;

		@FXML
	Label date;

	LinkedList<Student> studentList;

	@FXML
	Label name;

	@FXML
	TextField newPassword;

	@FXML
	ListView<String> searchResults; //

	@FXML
	TextField searchField; //

	@FXML
	Parent homeView;

	@FXML
	Parent settingsView;


	@FXML
	ComboBox roomBook;

	@FXML
	ComboBox roomCal;

	@FXML
	ComboBox roomCheck;

	@FXML
	DatePicker dateCheck;

	@FXML
	DatePicker dateBook;

	@FXML
	ComboBox fromCheck;

	@FXML
	ComboBox toCheck;

	@FXML
	ComboBox fromBook;

	@FXML
	ComboBox toBook;

	@FXML
	TextField capacity;

	@FXML
	TextField purpose;

	@FXML
	Button logoutButton;

	@FXML
	Button addButton;

	@FXML
	ListView<String> bookingsTable;

	@FXML
	TableView<String[]> calendar;


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
	TableView<String[]> timeTable;

	@FXML
	TableView<String> TTDay;

	@FXML
	TableView<String> CalDay;

	@FXML
	TableColumn<String,String> cday;

	@FXML
	TableColumn<String,String> ttday;

	@FXML
	TableColumn<String[],String> tt1;
	@FXML
	TableColumn<String[],String> tt2;
	@FXML
	TableColumn<String[],String> tt3;
	@FXML
	TableColumn<String[],String> tt4;
	@FXML
	TableColumn<String[],String> tt5;
	@FXML
	TableColumn<String[],String> tt6;
	@FXML
	TableColumn<String[],String> tt7;
	@FXML
	TableColumn<String[],String> tt8;
	@FXML
	TableColumn<String[],String> tt9;
	@FXML
	TableColumn<String[],String> tt10;
	@FXML
	TableColumn<String[],String> tt11;
	@FXML
	TableColumn<String[],String> tt12;
	@FXML
	TableColumn<String[],String> tt13;
	@FXML
	TableColumn<String[],String> tt14;
	@FXML
	TableColumn<String[],String> tt15;
	@FXML
	TableColumn<String[],String> tt16;
	@FXML
	TableColumn<String[],String> tt17;
	@FXML
	TableColumn<String[],String> tt18;
	@FXML
	TableColumn<String[],String> tt19;
	@FXML
	TableColumn<String[],String> tt20;

	
	
	public StudentController() 
	{

	}


	
	@FXML
	private void initialize() 
	{
		
		//ttday.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue()));
		
		ttday.setCellValueFactory((p) -> {
            return new ReadOnlyStringWrapper(p.getValue());
        });

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

		tt1.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[0]));
                }
            });

		tt2.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[1]));
                }
            });
		tt3.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[2]));
                }
            });

		tt4.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[3]));
                }
            });
		tt5.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[4]));
                }
            });
		tt6.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[5]));
                }
            });
		tt7.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[6]));
                }
            });
		tt8.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[7]));
                }
            });
		tt9.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[8]));
                }
            });
		tt10.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[9]));
                }
            });

		tt11.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[10]));
                }
            });

		tt12.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[11]));
                }
            });
		tt13.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[12]));
                }
            });
		tt14.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[13]));
                }
            });
		tt15.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[14]));
                }
            });
		tt16.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[15]));
                }
            });
		tt17.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[16]));
                }
            });
		tt18.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[17]));
                }
            });
		tt19.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[18]));
                }
            });
		tt20.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
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
		student.setPassword(newPassword.getText());
		settingsView.setVisible(false);
		homeView.setVisible(true);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("studentList.txt"));
		out.writeObject(studentList);
	}

	/**
	*Action executed upon clicking the delete account button
	*/
	@FXML
	public void delAccount() throws Exception{
		studentList.remove(student);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("studentList.txt"));
		out.writeObject(studentList);
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
	*@param studentList database of students
	*/
	@FXML
	public void setUp(Student s, LinkedList<Student> studentList) throws Exception{
		this.student = s;
		this.studentList = studentList;
		//System.out.println(s.getNaam());
		name.setText(s.getNaam());

		Time T=new Time();
            String[][] Table=T.ViewStud(student);
            ObservableList<String[]> data = FXCollections.observableArrayList();
            data.addAll(Arrays.asList(Table));
            timeTable.setItems(data);

        List<String> days = new ArrayList<String>();
			days.add("Monday");
			days.add("Tuesday");
			days.add("Wednesday");
			days.add("Thursday");
			days.add("Friday");
			days.add("Saturday");
			days.add("Sunday");
			ObservableList<String> data2 = FXCollections.observableArrayList(days);
            TTDay.setItems(data2);

            CalDay.setItems(data2);

         
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("requestedRooms.txt"));
		LinkedList<RequestedRoom> requestedRooms = (LinkedList<RequestedRoom>) in.readObject();
		
		ObservableList<String> meriRequests = FXCollections.observableArrayList();
		for (RequestedRoom o : requestedRooms) {
			if(o.getBy().equals(this.student.getEmailID())){
    		String v = o.toString()+" "+o.getStatus();
    		//System.out.println(v);
		    meriRequests.add(v);
			}
		}

		bookingsTable.setItems(meriRequests);

		 in = new ObjectInputStream(new FileInputStream("roomsList.txt"));
		LinkedList<Room> roomsList = (LinkedList<Room>) in.readObject();
		Room R = (Room)roomsList.get(roomsList.indexOf(new Room("C01")));

       
        String[][] _table=T.ViewRoom(R, 1);
        ObservableList<String[]> _data = FXCollections.observableArrayList();
        _data.addAll(Arrays.asList(_table));
        calendar.setItems(_data);

        date.setText("July 31 - August 6");

		settingsView.setVisible(false);
		homeView.setVisible(true);
		addButton.setVisible(false);
		searchResults.setVisible(false);
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
	*Action executed upon clicking the request booking button
	*/
	@FXML
	public void reqRoomButton() throws Exception{


		try{
		String prefRoom = roomBook.getSelectionModel().getSelectedItem().toString();
		LocalDate t = dateBook.getValue();
		String date = t.getDayOfMonth()+"/"+t.getMonthValue()+"/"+t.getYear();
		String time = fromBook.getSelectionModel().getSelectedItem().toString()+"-"+toBook.getSelectionModel().getSelectedItem().toString();
		
		//System.out.println("Check1");
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("roomsList.txt"));
		LinkedList<Room> roomsList = (LinkedList<Room>) in.readObject();

		//System.out.println("Check2");

		Room r0 = (Room)roomsList.get(roomsList.indexOf(new Room(prefRoom)));

		//System.out.println("Check3");

		if(r0.CheckClash(time, date))
		{
		RequestedRoom r = new RequestedRoom(prefRoom, Integer.valueOf(capacity.getText()), purpose.getText(), date, time, this.student.getEmailID());
		
		in = new ObjectInputStream(new FileInputStream("requestedRooms.txt"));
		LinkedList<RequestedRoom> requestedRooms = (LinkedList<RequestedRoom>) in.readObject();

		requestedRooms.add(r);
		
		ObservableList meriRequests = FXCollections.observableArrayList();
		for (RequestedRoom o : requestedRooms) {
			if(o.getBy().equals(this.student.getEmailID())){
    		String v = o.toString() +" "+o.getStatus();
    		//System.out.println(v);
		    meriRequests.add(v);
			}
		}

		bookingsTable.setItems(meriRequests);

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("requestedRooms.txt"));
		out.writeObject(requestedRooms);

		Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Booking Request");
			alert.setHeaderText(null);
			alert.setContentText("Request Sent!");

			alert.showAndWait();
		
		out = new ObjectOutputStream(new FileOutputStream("studentList.txt"));
		out.writeObject(studentList);
		}

		else{
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Booking Request");
			alert.setHeaderText(null);
			alert.setContentText("Room Unavailable!");

			alert.showAndWait();
			}

			}
    catch(Exception e){}
		}
		
	
	/**
	*Action executed upon clicking the refresh button
	*/
	@FXML
	public void refresh() throws Exception{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("requestedRooms.txt"));
		LinkedList<RequestedRoom> requestedRooms = (LinkedList<RequestedRoom>) in.readObject();

	
		
		ObservableList meriRequests = FXCollections.observableArrayList();
		for (RequestedRoom o : requestedRooms) {
			if(o.getBy().equals(this.student.getEmailID())){
    		String v = o.toString()+" "+o.getStatus();
    		//System.out.println(v);
		    meriRequests.add(v);
			}
		}

		bookingsTable.setItems(meriRequests);
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
	*Action executed upon clicking the add course button
	*/
	@FXML
	public void addCourseAction() throws Exception
	{
		try{
	
			String S1=searchResults.getSelectionModel().getSelectedItem();
            List<Course> L=new ArrayList<Course>();
            FileInputStream F=new FileInputStream("db_Courses.txt");
            ObjectInputStream O=new ObjectInputStream(F);
            L=(List<Course>)O.readObject();
            for(int i=0;i<L.size();i++)
            {
            	if(L.get(i).toString().equals(S1))
            	{
            		student.AddMandatory(L.get(i));
            		searchButton();
            		break;
            	}
            }
            //student.viewTimeTable();
            Time T=new Time();
            String[][] Table=T.ViewStud(student);
            ObservableList<String[]> data = FXCollections.observableArrayList();
            data.addAll(Arrays.asList(Table));
            timeTable.setItems(data);

            /*
           	ObservableList days =  FXCollections.observableArrayList(new ArrayList<String>(Arrays.asList(new String[]{"a","bb","ccc","dd","dd","eee","ee"})));

           	TTDay.setItems(days);
           	*/

           	ScrollBar verticalBar = (ScrollBar) TTDay.lookup(".scroll-bar:vertical");
            ScrollBar horizontalBar = (ScrollBar) TTDay.lookup(".scroll-bar:horizontal");
            ScrollBar verticalBar2 = (ScrollBar) timeTable.lookup(".scroll-bar:vertical");

        	verticalBar.setPrefWidth(0);
            verticalBar.setMaxWidth(0);
            verticalBar.setVisible(false);
            verticalBar.setOpacity(0);

            horizontalBar.setPrefWidth(0);
            horizontalBar.setMaxWidth(0);
            horizontalBar.setVisible(false);
            horizontalBar.setOpacity(0);

            verticalBar2.setPrefWidth(0);
            verticalBar2.setMaxWidth(0);
            verticalBar2.setVisible(false);
            verticalBar2.setOpacity(0);

            ObjectOutputStream out = null;
			out = new ObjectOutputStream(new FileOutputStream("studentList.txt"));
			out.writeObject(studentList);

			}
    catch(Exception e){}



		

	} 

	/**
	*Action executed upon clicking the search for courses button
	*/
	@FXML
	public void searchButton() throws Exception
	{
			try{
			String S1=searchField.getText();
			Search Se=new Search();
            List<Course> L=new ArrayList<Course>();
            FileInputStream F=new FileInputStream("db_Courses.txt");
            ObjectInputStream O=new ObjectInputStream(F);
            L=(List<Course>)O.readObject();   
            //S.AddMandatory(L.get(0));
            //S.AddMandatory(L.get(1));
            //S.AddMandatory(L.get(2));
            //S.AddMandatory(L.get(12));
            //S.AddMandatory(L.get(6));
			ArrayList<String> T=Se.ShowSearch(student,S1);
            ObservableList<String> data = FXCollections.observableArrayList();
            data.addAll(T);
            searchResults.setItems(data);
            addButton.setVisible(true);
            searchResults.setVisible(true);
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