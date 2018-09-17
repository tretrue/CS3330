/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rt104wgradecalculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Robert Truesdale (Rt104w)
 */
public class Rt104wGradeCalculator extends Application{
    
    public String title = "Grade Calculator";
    public int width = 500; 
    public int height = 400;
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle(title);
        
        VBox root = new VBox(20); 
        root.setPadding(new Insets(10,20,30,30));
        root.setSpacing(5);
        
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(15);
        grid.setHgap(15);
        grid.setPrefWidth(400);
        
        Label category1Label = new Label("Category 1 (30%):");
        category1Label.setAlignment(Pos.CENTER);
        grid.add(category1Label, 0, 0 );
    
        TextField category1Field = new TextField();
        category1Field.setPrefWidth(400);
        category1Field.setAlignment(Pos.CENTER_LEFT);
        grid.add(category1Field, 0,1);
        
        
        Label category2Label = new Label("Category 2 (70%):");
        category2Label.setAlignment(Pos.CENTER);
        grid.add(category2Label, 0, 2 );
    
        TextField category2Field = new TextField();
        category2Field.setPrefWidth(400);
        category2Field.setAlignment(Pos.CENTER_LEFT);
        grid.add(category2Field, 0,3);
        
        Label category3Label = new Label("My Final Score:");
        category3Label.setAlignment(Pos.CENTER);
        grid.add(category3Label, 0, 4 );
    
        TextField category3Field = new TextField();
        category3Field.setPrefWidth(400);
        category3Field.setAlignment(Pos.CENTER_LEFT);
        grid.add(category3Field, 0,5);

        VBox button = new VBox(20);
        button.setPrefWidth(400);
        button.setPadding(new Insets(0,0,15,0));
        button.setSpacing(15);
        grid.add(button, 0, 6);
        
        Button maximize = new Button("Maximize");
        maximize.setPrefWidth(Double.MAX_VALUE);
        button.getChildren().add(maximize);
        
        Button calculate = new Button("Calculate");
        calculate.setPrefWidth(Double.MAX_VALUE);
        button.getChildren().add(calculate);
        
        Button clear = new Button("Clear");
        clear.setPrefWidth(Double.MAX_VALUE);
        button.getChildren().add(clear);
        
        Button alert = new Button("Alert");
        alert.setPrefWidth(Double.MAX_VALUE);
        button.getChildren().add(alert);
        
        //set maximaze action
        maximize.setOnAction((ActionEvent e) -> {
           
           category1Field.setText("100");
           category2Field.setText("100");
          
        });
        
        //set calcualate action
        calculate.setOnAction((ActionEvent e) -> {
            String cat1 = category1Field.getText();
            String cat2 = category2Field.getText();
            
            double val1 = Double.parseDouble(cat1);
            double val2 = Double.parseDouble(cat2);
            
            double grade = (val1*.3) + (val2 * .7);
            
            category3Field.setText("My Final score should be " + cat1 + " * 0.3 + " + cat2 + " * .7 = " + grade);
            
        });
        
        //set clear action
        clear.setOnAction((ActionEvent e) -> {
           category1Field.setText("");
           category2Field.setText("");
           category3Field.setText("");
        });
        
        
        //set alert action
        alert.setOnAction((ActionEvent e) -> {
            String cat1 = category1Field.getText();
            String cat2 = category2Field.getText();
            
            double val1 = Double.parseDouble(cat1);
            double val2 = Double.parseDouble(cat2);
            
            double grade = (val1*.3) + (val2 * .7);
            
            Alert message = new Alert(AlertType.INFORMATION, "My Final score should be " + cat1 + " * 0.3 + " + cat2 + " * .7 = " + grade, ButtonType.OK);
             message.showAndWait();
        });

        
        root.getChildren().add(grid);

        Scene scene = new Scene(root, width, height);
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         launch(args);
    }
    
}
