import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.TextAlignment;

public class calc extends Application {
   @Override
   public void start(Stage stage) {
    Label display = new Label("  0");
    display.setMinSize(400, 80);
    display.setStyle("-fx-border-color: black; -fx-font: 24 Calibri;");
    display.setTextAlignment(TextAlignment.CENTER);
    Button b1 = new Button("1");
    Button b2 = new Button("2");
    Button b3 = new Button("3");
    Button b4 = new Button("4");
    Button b5 = new Button("5");
    Button b6 = new Button("6");
    Button b7 = new Button("7");
    Button b8 = new Button("8");
    Button b9 = new Button("9");
    Button b0 = new Button("0");
    Button bd = new Button(".");
    Button be = new Button("=");
    Button bp = new Button("+");
    Button bs = new Button("-");
    Button bm = new Button("X");
    Button bdv = new Button("/");
    Button cancel=new Button("C");
    Button cancel2=new Button("AC");
    Button per=new Button("%");
    
    GridPane g = new GridPane();
    g.add(display,0,0,5,1);
    b1.setMinSize(80, 80);
    b2.setMinSize(80, 80);
    b3.setMinSize(80, 80);
    b4.setMinSize(80, 80);
    b5.setMinSize(80, 80);
    b6.setMinSize(80, 80);
    b7.setMinSize(80, 80);
    b8.setMinSize(80, 80);
    b9.setMinSize(80, 80);
    b0.setMinSize(160, 80);
    bd.setMinSize(80, 80);
    be.setMinSize(80, 80);
    bp.setMinSize(80, 80);
    bs.setMinSize(80, 80);
    bm.setMinSize(80, 80);
    bdv.setMinSize(80, 80);
    per.setMinSize(80, 80);
    cancel.setMinSize(80,80);
    cancel2.setMinSize(80,80);

    b1.setStyle("-fx-font-size:24; -fx-background-color: #fa6900; -fx-border-color: white; -fx-text-fill: white;");
    b2.setStyle("-fx-font-size:24; -fx-background-color: #fa6900; -fx-border-color: white; -fx-text-fill: white;");
    b3.setStyle("-fx-font-size:24; -fx-background-color: #fa6900; -fx-border-color: white; -fx-text-fill: white;");
    b4.setStyle("-fx-font-size:24; -fx-background-color: #fa6900; -fx-border-color: white; -fx-text-fill: white;");
    b5.setStyle("-fx-font-size:24; -fx-background-color: #fa6900; -fx-border-color: white; -fx-text-fill: white;");
    b6.setStyle("-fx-font-size:24; -fx-background-color: #fa6900; -fx-border-color: white; -fx-text-fill: white;");
    b7.setStyle("-fx-font-size:24; -fx-background-color: #fa6900; -fx-border-color: white; -fx-text-fill: white;");
    b8.setStyle("-fx-font-size:24; -fx-background-color: #fa6900; -fx-border-color: white; -fx-text-fill: white;");
    b9.setStyle("-fx-font-size:24; -fx-background-color: #fa6900; -fx-border-color: white; -fx-text-fill: white;");
    b0.setStyle("-fx-font-size:24; -fx-background-color: #fa6900; -fx-border-color: white; -fx-text-fill: white;");
    bd.setStyle("-fx-font-size:24; -fx-background-color: #fa6900; -fx-border-color: white; -fx-text-fill: white;");
    be.setStyle("-fx-font-size:24; -fx-background-color: #fa6900; -fx-border-color: white; -fx-text-fill: white;");
    bp.setStyle("-fx-font-size:24; -fx-background-color: #fa6900; -fx-border-color: white; -fx-text-fill: white;");
    bs.setStyle("-fx-font-size:24; -fx-background-color: #fa6900; -fx-border-color: white; -fx-text-fill: white;");
    bm.setStyle("-fx-font-size:24; -fx-background-color: #fa6900; -fx-border-color: white; -fx-text-fill: white;");
    bdv.setStyle("-fx-font-size:24; -fx-background-color: #fa6900; -fx-border-color: white; -fx-text-fill: white;");
    per.setStyle("-fx-font-size:24; -fx-background-color: #fa6900; -fx-border-color: white; -fx-text-fill: white;");
    cancel.setStyle("-fx-font-size:24; -fx-text-fill: white; -fx-background-color: #ff0000; -fx-border-color: white;");
    cancel2.setStyle("-fx-font-size:24; -fx-text-fill: white; -fx-background-color: #ff0000; -fx-border-color: white;");
    // Col, row, col span, row span
    g.add(b0, 0, 4, 2, 1);
    g.add(bd, 2, 4, 1, 1);
    g.add(be, 3, 4, 1, 1);
    g.add(b1, 0, 3, 1, 1);
    g.add(b2, 1, 3, 1, 1);
    g.add(b3, 2, 3, 1, 1);
    g.add(b4, 0, 2, 1, 1);
    g.add(b5, 1, 2, 1, 1);
    g.add(b6, 2, 2, 1, 1);
    g.add(b7, 0, 1, 1, 1);
    g.add(b8, 1, 1, 1, 1);
    g.add(b9, 2, 1, 1, 1);
    g.add(cancel2, 3, 1, 1, 1);
    g.add(cancel, 3, 2, 1, 1);
    g.add(per, 3, 3, 1, 1);
    g.add(bdv, 4, 1, 1, 1);
    g.add(bm, 4, 2, 1, 1);
    g.add(bp, 4, 3, 1, 1);
    g.add(bs, 4, 4, 1, 1);
    
    Scene scene = new Scene(g, 400,400);

      stage.setTitle("JavaFX Calculator");
      stage.setScene(scene);
      stage.show();
   }
   public static void main(String args[]){
      launch(args);
   }
}