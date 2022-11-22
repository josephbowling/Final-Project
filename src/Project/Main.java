package Project;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
  public TextField tfAddHours = new TextField();
  public TextField tfAddMinutes = new TextField();
  public TextField tfAddSeconds = new TextField();
  public Button btCalculate = new Button("Convert Time");
  public Button btCurrent = new Button("Convert Current Time");

  @Override
  public void start(Stage primaryStage) {
  
    GridPane gridPane = new GridPane();
    gridPane.setHgap(5);
    gridPane.setVgap(5);
    gridPane.add(new Label("Add Hours:"), 0, 0);
    gridPane.add(new Label("Add Minutes:"), 0, 1);
    gridPane.add(new Label("Add Seconds:"), 0, 2);
    gridPane.add(tfAddHours, 1, 0);
    gridPane.add(tfAddMinutes, 1, 1);
    gridPane.add(tfAddSeconds, 1, 2);
    gridPane.add(btCalculate, 1, 5);
    gridPane.add(btCurrent, 1, 10);

    gridPane.setAlignment(Pos.CENTER);
    tfAddHours.setAlignment(Pos.BOTTOM_RIGHT);
    tfAddMinutes.setAlignment(Pos.BOTTOM_RIGHT);
    tfAddSeconds.setAlignment(Pos.BOTTOM_RIGHT);
    GridPane.setHalignment(btCalculate, HPos.CENTER);
    GridPane.setHalignment(btCurrent, HPos.CENTER);

    Scene scene = new Scene(gridPane, 400, 250);
    primaryStage.setTitle("Time Converter");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}