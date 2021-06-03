
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
public class loginPage extends Application {
  
    // launch the application
    public void start(Stage s)
    {
        // set title for the stage
        s.setTitle("Login Page");

        // create a label
        Label l = new Label("Your Username");
  
        // create a textfield
        TextField b = new TextField("");
        
        // create a label
        Label l2 = new Label("Your Password");
  
        // create a textfield
        TextField b2 = new TextField("");

        Label l3 = new Label("");
  
        // create a tile pane
        TilePane r = new TilePane();

        // Submit button
        Button button = new Button("Fetch Data");
  
        // action event
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {

                try{
                    //Register the JDBC driver
                    Class.forName("com.mysql.jdbc.Driver");
            
                    //Open the connection
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","aditya2000");
                    if(conn != null){
                        System.out.println("Successfully connected.");
                    }else{
                        System.out.println("Connection failed");
                    }
                    Statement stmt=conn.createStatement();  
                    ResultSet rs=stmt.executeQuery("SELECT * FROM LOGIN");
                    while(rs.next())
                    {
                        String temp1=rs.getString("username");
                        String temp2=rs.getString("password");
                        b.setText(temp1);
                        b2.setText(temp2);
                    }
            
                }catch(Exception e1){
                    e1.printStackTrace();
                }
            }
            
        };
  
        // when enter is pressed
        button.setOnAction(event);
  
        // add textfield
        r.getChildren().add(l);
        r.getChildren().add(b);
        r.getChildren().add(l2);
        r.getChildren().add(b2);
        r.getChildren().add(button);
        r.getChildren().add(l3);
  
        // create a scene
        Scene sc = new Scene(r, 400, 400);
  
        // set the scene
        s.setScene(sc);
  
        s.show();
    }
    public static void main(String args[])
    {
        launch(args);
    }
}