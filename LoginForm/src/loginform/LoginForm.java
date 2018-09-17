/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Professor Wergeles
 */
public class LoginForm extends Application {
    
    public String title = "My First JavaFX Login"; 
    public int width = 600; 
    public int height = 400; 
    
    public String fontStyle = "Comic Sans MS"; 
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle(title); 
        
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(20);
        root.setVgap(20);
        root.setPadding(new Insets(25,25,25,25));
        
        Text sceneTitle = new Text("Welcome! Please Login");
        sceneTitle.setFont(Font.font(fontStyle, FontWeight.BOLD, 26));
        root.add(sceneTitle, 0, 0, 2 , 1);
        
        Label userName = new Label("Username: ");
        userName.setFont(Font.font(fontStyle, FontWeight.NORMAL, 18));
        root.add(userName, 0, 1);
        
        TextField usernameTextField = new TextField();
        root.add(usernameTextField, 1, 1);
        
        Label password = new Label("Password: ");
        password.setFont(Font.font(fontStyle, FontWeight.NORMAL, 18));
        root.add(password, 0, 2);
        
        PasswordField passwordField = new PasswordField();
        root.add(passwordField, 1, 2);
        
        Button signinButton = new Button("Sign in");
        HBox hboxForButton = new HBox(10);
        hboxForButton.setAlignment(Pos.BOTTOM_RIGHT);
        hboxForButton.getChildren().add(signinButton);
        root.add(hboxForButton, 1, 4);
        
        signinButton.setOnAction(new EventHandler<ActionEvent>(){
           @Override
           public void handle(ActionEvent e){
               
            if(usernameTextField.getText().length() < 1){
                System.out.println("ERROR: Username must be at least 1 character");
            }
            else {
                // if they meet the criteria, usually database
                // Go to another page 
                System.out.println("Username: " + usernameTextField.getText()); 
            }
            
            
            if(passwordField.getText().length() < 1){
                System.out.println("ERROR: Password must be at least 1 character");
            }
            else {
                System.out.println("Password: " + passwordField.getText());
            }

           }
        });
        
        
        Scene scene = new Scene(root, width, height);
        primaryStage.setScene(scene);
        primaryStage.show(); 
        
         
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
