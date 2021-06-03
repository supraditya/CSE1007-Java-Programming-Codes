import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;

public class javaefex extends Application
{
    public void start(Stage primaryStage)
    {
        Label label = new Label("My name is Aditya Menon 18BCE2049");
        label.setTextFill(Color.BLACK);
        Group root = new Group();
        root.getChildren().add(label);
        Scene scene = new Scene(root, 595,150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }    
    public static void main(String[] args) {
        launch(args);
    }
}