package edu.cis232;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application {
	
		public static void main(String[] args){
			launch(args);
		}

		@Override
		public void start(Stage stage) throws Exception {
			FXMLLoader loader = new FXMLLoader();
			Parent parent = loader.load(new FileInputStream("game.fxml"));

			Scene scene = new Scene(parent);
			game controller = loader.getController();
			//controller.setScene(scene);

			stage.setTitle("Tic Tac Toe");
			stage.setScene(scene);
			stage.show();
			
		}

}
