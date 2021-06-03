import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.image.*;
import javafx.scene.text.*;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import java.io.*;
public class phonebg extends Application
{
    public void start(Stage stage) throws IOException {
        //Time Label
        Label time = new Label("15:15 PM");
        time.setTextAlignment(TextAlignment.CENTER);
        time.setMinSize(320, 80);
        time.setTextFill(Color.BLACK);
        time.setFont(Font.font("Calibri", FontPosture.REGULAR, 36));
        time.setStyle("-fx-text-fill: white; -fx-background-color: transparent");
        time.relocate(90, 20);

        //Background wallpaper   
        InputStream photostream = new FileInputStream("me.jpg");
        Image image = new Image(photostream);
        ImageView imageView = new ImageView();
        imageView.setImage(image);        
        imageView.setFitWidth(320);
        imageView.setLayoutY(0);
        imageView.setPreserveRatio(true); 
        
        //App Buttons
        Button ph = new Button("Phone");
        Button cam = new Button("Camera");
        Button brow = new Button("Chrome");
        Button gall = new Button("Gallery");
        ph.setMinSize(60, 60);
        cam.setMinSize(60, 60);
        brow.setMinSize(60, 60);
        gall.setMinSize(60, 60);
        ph.setLayoutX(10);
        ph.setLayoutY(255);
        cam.setLayoutX(90);
        cam.setLayoutY(255);
        brow.setLayoutX(170);
        brow.setLayoutY(255);
        gall.setLayoutX(250);
        gall.setLayoutY(255);
        ph.setStyle(" -fx-background-radius: 50%;");
        cam.setStyle(" -fx-background-radius: 50%;");
        brow.setStyle(" -fx-background-radius: 50%;");
        gall.setStyle(" -fx-background-radius: 50%;");
        
        Button apps = new Button("...");
        apps.setMinSize(20, 20);
        apps.setLayoutX(140);
        apps.setLayoutY(320);
        apps.setStyle(" -fx-background-radius: 50%; -fx-font-size: 24px;");

        Group r = new Group(imageView);
        r.getChildren().add(time);
        // r.getChildren().add(s);
        r.getChildren().addAll(ph,cam,brow,gall,apps);
        Scene scene = new Scene(r, 320, 400);
        
        stage.setScene(scene);
        stage.show();
     }
     public static void main(String args[]) {
        launch(args);
     }
}