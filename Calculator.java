import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

  public class Main extends Application 
  { 
    
    @Override
    public void start(Stage primaryStage) {
       Label label = new Label("0");
      //
      TextField textField = new TextField("0");
      textField.setMaxWidth(190);
      textField.setAlignment(Pos.TOP_RIGHT);
      textField.setEditable(false);
      //
      Button button0 = new Button("0");
      button0.setOnAction(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent e) {
              textField.setText(textField.getText() + "0");
          }
      });
      //
      Button button1 = new Button("1");
      button1.setOnAction(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent e) {
              textField.setText(textField.getText() + "1");
          }
      });
      //
      Button button2 = new Button("2");
      button2.setOnAction(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent e) {
              textField.setText(textField.getText() + "2");
          }
      });
      //
      Button button3 = new Button("3");
      button3.setOnAction(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent e) {
              textField.setText(textField.getText() + "3");
          }
      });
      //
      Button buttonPlus = new Button("+");
      buttonPlus.setOnAction(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent e) {
              label.setText(textField.getText());
              textField.setText("0");
          }
      });
      //
      Button buttonEquals = new Button("=");
      buttonEquals.setOnAction(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent e) {
              long val1 = Long.valueOf(label.getText());
              long val2 = Long.valueOf(textField.getText());
              textField.setText(String.valueOf(val1 + val2));
              label.setText("0");
          }
      });
      //
      Button buttonCleanup = new Button("C");
      buttonCleanup.setOnAction(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent e) {
              label.setText("0");
              textField.setText("0");
          }
      });
      //
      Button buttonBack = new Button("<");
      buttonBack.setOnAction(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent e) {
              int len = textField.getText().length();
              if (len > 1) {
                  textField.setText(textField.getText().substring(0, len - 1));
              }
          }
      });
      //
      HBox hboxTop = new HBox(label);
      hboxTop.setAlignment(Pos.CENTER);
      //
      HBox hboxText = new HBox(textField);
      //hboxText.setSpacing(5);
      hboxText.setAlignment(Pos.CENTER);
      //
      HBox hbox123p = new HBox(button1, button2, button3, buttonPlus);
      hbox123p.setSpacing(5);
      hbox123p.setAlignment(Pos.CENTER);
      //
      HBox hbox0 = new HBox(button0, buttonEquals);
      hbox0.setSpacing(65);
      hbox0.setAlignment(Pos.CENTER);
      //
      HBox hboxClean = new HBox(buttonBack, buttonCleanup);
      hboxClean.setSpacing(65);
      hboxClean.setAlignment(Pos.CENTER);
      //
      VBox vbox = new VBox(hboxTop, hboxText, hboxClean, hbox123p, hbox0);
      vbox.setSpacing(5);
      vbox.setAlignment(Pos.TOP_CENTER);
      //
      Scene scene = new Scene(vbox, 170, 200);
      primaryStage.setTitle("Calc");
      primaryStage.setScene(scene);
      primaryStage.setResizable(false);
      primaryStage.show();
    } 
      
    public static void main(String[] args) {
      launch(args);
    }
  }
