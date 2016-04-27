package application;
	
import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class GroggCalculatorStarter extends Application {
	@Override
	public void start(Stage primaryStage) {

		URL location = getClass().getResource("View.fxml");
		FXMLLoader fxmlLoader = new FXMLLoader(location);
		Parent root = null;
		try {
			root = fxmlLoader.load();
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}