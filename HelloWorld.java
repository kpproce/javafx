package testFX;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;

import javafx.scene.Scene; 
import javafx.scene.control.*; 
import javafx.scene.layout.*; 
import javafx.stage.Stage; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.canvas.*; 
import javafx.scene.web.*; 
import javafx.scene.Group; 
  
public class HelloWorld extends Application { 
  
    // launch the application 
    public void start(Stage stage) 
    { 
  
        try { 
  
        	List<Artikel> artikelLijst= new ArrayList();
        	
        	artikelLijst.add(new Artikel("Printer", "125"));
        	artikelLijst.add(new Artikel("Wifi mouse", "15"));
        	
        	
            // set title for the stage 
            stage.setTitle("HBox"); 
  
            // create and allign Boxes 
            VBox vbox = new VBox(20); 
            vbox.setAlignment(Pos.CENTER); 
            
            HBox hbox1 = new HBox(20); 
            hbox1.setAlignment(Pos.CENTER); 
            
            HBox hbox2 = new HBox(20); 
            hbox2.setAlignment(Pos.CENTER); 
         
            TextField text1 = new TextField();
            hbox1.getChildren().add(new Label("Artikel") ); 
            hbox1.getChildren().add(text1);
     
            TextField text2= new TextField();
            hbox2.getChildren().add(new Label("Prijs  ") ); 
            hbox2.getChildren().add(text2);
            
            Label resultLabel = new Label();
            
            vbox.getChildren().add(hbox1); 
            vbox.getChildren().add(hbox2); 
            Button button1 = new Button("Voeg toe aan lijst");
            
            button1.setOnAction(e-> {
            	artikelLijst.add(new Artikel( text1.getText() ,  text2.getText() ));
            	String t = ""; 
            	
            	for (int i=0; i<artikelLijst.size(); i++) {
            		t += "\n" + artikelLijst.get(i);
            	}
            	resultLabel.setText("Besteld: " + t);
            	
            });
            
            vbox.getChildren().add(button1); 
            vbox.getChildren().add(resultLabel); 

            // *************************************************
            
           
            
            
            // create a scene 
            Scene scene = new Scene(vbox, 800, 300); 
  
            // set the scene 
            stage.setScene(scene); 
  
            stage.show(); 
            
        } 
  
        catch (Exception e) { 
  
            System.out.println(e.getMessage()); 
        } 
    } 
  
    // Main Method 
    public static void main(String args[]) 
    { 
  
        // launch the application 
        launch(args); 
    } 
} 