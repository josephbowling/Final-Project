package Project;

import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class Clock extends Main {

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a clock and a label
    ClockPane clock = new ClockPane();
    String timeString = clock.getHour() + ":" + clock.getMinute() 
      + ":" + clock.getSecond();
    Label lblCurrentTime = new Label(timeString);

    // Place clock and label in border pane
    BorderPane pane = new BorderPane();
    pane.setCenter(clock);
    pane.setBottom(lblCurrentTime);
    BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 300, 300);
    primaryStage.setTitle("Current Time"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  public static void main(String[] args) {
    launch(args);
  }
}