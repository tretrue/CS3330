/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documenteditor1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

/**
 *
 * @author Professor Wergeles <Professor Wergeles at cs3330@missouri.edu>
 */
public class DocumentEditor1 extends Application {
   
    public String title = "Document Editor";
    public int width = 800; 
    public int height = 700;
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle(title);
        
        VBox root = new VBox(20); 
        root.setPadding(new Insets(20, 20, 20, 20));
        root.setSpacing(5);
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(20);
        
        final ChoiceBox sendTo = new ChoiceBox(
            FXCollections.observableArrayList(
                "To:", "Cc:", "Bcc") 
        );
        
        sendTo.setPrefWidth(100);
        
        TextField sendToField = new TextField();
        sendToField.setPrefWidth(534);
        HBox sendToBox = new HBox(10);
        sendToBox.setAlignment(Pos.CENTER_LEFT);
        sendToBox.getChildren().addAll(sendTo, sendToField);
        grid.add(sendToBox, 0, 0);
        
        Label subjectLabel = new Label("Subject:");
        TextField subjectField = new TextField();
        subjectField.setPrefColumnCount(45);
        HBox subjectBox = new HBox(10);
        subjectBox.setAlignment(Pos.CENTER_LEFT);
        subjectBox.getChildren().addAll(subjectLabel, subjectField);
        grid.add(subjectBox, 0,1);
        
        HTMLEditor editor = new HTMLEditor();
        editor.setPrefSize(600,500);
        
        Button sendButton = new Button("Send");
        HBox saveBox = new HBox();
        saveBox.setAlignment(Pos.CENTER_RIGHT);
        saveBox.getChildren().add(sendButton);
       
//CAN USE EITHER OF THESE
        sendButton.setOnAction((ActionEvent e) -> {
            System.out.println("Send Button Clicked");
        });

//        sendButton.setOnAction(new EventHandler<ActionEvent>(){
//            @Override
//            public void handle(ActionEvent e){
//                
//            }
//        });
        
        root.getChildren().addAll(grid, editor, saveBox);

        
        Scene scene = new Scene(root, width, height);
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }   
}