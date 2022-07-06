package application;
	
import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox vbox = new VBox();
			HBox hbox = new HBox();
			vbox.setSpacing(60);
			TextField texhellow = new TextField();
			Label lbl= new Label(" Label");
			vbox.getChildren().add(texhellow);
			vbox.getChildren().add(lbl);
			
			HBox areabotones = new HBox();
			areabotones.setSpacing(10);
			Button btn1 = new Button("BOTON #1");
			Button btn2 = new Button("BOTON #2");
			Button btn3 = new Button("BOTON #3");
			areabotones.getChildren().addAll(btn1, btn2, btn3);
			
			BorderPane root = new BorderPane();
			root.setTop(vbox);
			root.setBottom(areabotones);
			Scene scene = new Scene(root,300,200);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Ejemplo Scane JavaFX");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
