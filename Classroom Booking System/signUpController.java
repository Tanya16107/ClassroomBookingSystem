import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;

import java.io.*;
import java.util.*;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javafx.scene.Parent;

public class signUpController
{
	@FXML
	TextField name;

	@FXML
	TextField emailID;

	@FXML
	PasswordField password;

	@FXML
	RadioButton sel_student;
	
	@FXML
	RadioButton sel_admin;

	@FXML
	RadioButton sel_faculty;

	@FXML
	Button signUpButton;

	@FXML
	private boolean userTypeSelected(){
		return sel_admin.isSelected() || sel_student.isSelected() || sel_faculty.isSelected();
	}

	@FXML
	public void signUp() throws Exception{
	
		if(emailID.getText().length()!=0 && password.getText().length()!=0 && name.getText().length()!=0 && userTypeSelected()){
			String S1=emailID.getText();
			boolean flag1=false;
			int C=0;
			for(int i=0;i<S1.length();i++)
			{
				if(S1.charAt(i)=='@')
				{
					flag1=true;
					C++;
				}
			}	
			if(C==1 && flag1)
			{
			String[] S2=S1.trim().split("@");
			if(S2[1].equals("iiitd.ac.in"))
			{	
			if(sel_student.isSelected()){
				Student newUser = new Student(emailID.getText(), password.getText(), name.getText());
					
					//deserialize
					ObjectInputStream in = null;
					
					in = new ObjectInputStream(new FileInputStream("studentList.txt"));
					LinkedList<Student> studentList = (LinkedList<Student>) in.readObject();

					boolean userExists = false;

					for (Student temp : studentList) {
			            if(newUser.studentMatch(temp)){
			            	userExists = true;
			            }
			        }
					
				
					if(!userExists){
					
					//add user 
					studentList.add(newUser);
					

					//serialize
					ObjectOutputStream out = null;
					out = new ObjectOutputStream(new FileOutputStream("studentList.txt"));
					out.writeObject(studentList);

					Stage stage =(Stage) signUpButton.getScene().getWindow();
					FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
					Parent root = fxmlLoader.load();  
					loginController su = fxmlLoader.<loginController>getController();
			
		     		Scene scene = new Scene(root);
		      		stage.setScene(scene);
		      		stage.show();

		      		Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText(null);
						alert.setContentText("Sign Up Successful!");
						alert.showAndWait();


					}

					else{
						Alert alert = new Alert(AlertType.ERROR);
						alert.setHeaderText(null);
						alert.setContentText("User already exists!");
						alert.showAndWait();
					}
					return;
				}
			

			if(sel_admin.isSelected()){
				Admin newUser = new Admin(emailID.getText(), password.getText(), name.getText());
					//deserialize
					ObjectInputStream in = null;
					
					in = new ObjectInputStream(new FileInputStream("adminList.txt"));
					LinkedList<Admin> adminList = (LinkedList<Admin>) in.readObject();
					
					boolean userExists = false;

					for (Admin temp : adminList) {
			            if(newUser.adminMatch(temp)){
			            	userExists = true;
			            }
			        }
					
				
					if(!userExists){
					//add user 
					adminList.add(newUser);
					

					//serialize
					ObjectOutputStream out = null;
					out = new ObjectOutputStream(new FileOutputStream("adminList.txt"));
					out.writeObject(adminList);

					Stage stage =(Stage) signUpButton.getScene().getWindow();
					FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
					Parent root = fxmlLoader.load();  
					loginController su = fxmlLoader.<loginController>getController();
			
		     		Scene scene = new Scene(root);
		      		stage.setScene(scene);
		      		stage.show();

		      		Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText(null);
						alert.setContentText("Sign Up Successful!");
						alert.showAndWait();

					}

					else{
						Alert alert = new Alert(AlertType.ERROR);
						alert.setHeaderText(null);
						alert.setContentText("User already exists!");
						alert.showAndWait();
					}
					return;

			}

			if(sel_faculty.isSelected()){
				Faculty newUser = new Faculty(emailID.getText(), password.getText(), name.getText());
					//deserialize
					ObjectInputStream in = null;
					
					in = new ObjectInputStream(new FileInputStream("facultyList.txt"));
					LinkedList<Faculty> facultyList = (LinkedList<Faculty>) in.readObject();

					boolean userExists = false;

					for (Faculty temp : facultyList) {
			            if(newUser.facultyMatch(temp)){
			            	userExists = true;
			            }
			        }
					
				
					if(!userExists){
					//add user 
					facultyList.add(newUser);
					

					//serialize
					ObjectOutputStream out = null;
					out = new ObjectOutputStream(new FileOutputStream("facultyList.txt"));
					out.writeObject(facultyList);

					Stage stage =(Stage) signUpButton.getScene().getWindow();
					FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
					Parent root = fxmlLoader.load();  
					loginController su = fxmlLoader.<loginController>getController();
			
		     		Scene scene = new Scene(root);
		      		stage.setScene(scene);
		      		stage.show();

		      		Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText(null);
						alert.setContentText("Sign Up Successful!");
						alert.showAndWait();
						
					}

					else{
						Alert alert = new Alert(AlertType.ERROR);
						alert.setHeaderText(null);
						alert.setContentText("User already exists!");
						alert.showAndWait();
					}
					return;
			}
			}
				else
				{
						Alert alert = new Alert(AlertType.ERROR);
						alert.setHeaderText(null);
						alert.setContentText("Please sign up using IIIT-Delhi email");
						alert.showAndWait();
				}
			}
				else
				{
						Alert alert = new Alert(AlertType.ERROR);
						alert.setHeaderText(null);
						alert.setContentText("Please enter a valid email");
						alert.showAndWait();
				}	
		}

		else{
			Alert alert = new Alert(AlertType.ERROR);
			alert.setContentText("Please enter the details");
			alert.showAndWait();
			return;
		}
	}

}