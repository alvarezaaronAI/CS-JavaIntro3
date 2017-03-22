

/*Aaron Alvarez 
Feb 8th, 2017
This class is meant to create  multiple hexegons and run the same code as HexagonPattern.
As soon as we print out a possible solution we submit it here in this class and this class reads the solution 
and prints out the solved arraylist.*/

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GUIHexagons extends Application {
	private final double width = 1500, height = 1000;
	private void HexagonWindow(Stage primaryStage) {
		
		Pane pane = new Pane();
		
		double centerX = width / 2 , centerY = height / 2;
		double radius = Math.min(width, height) * 0.4; 
		ArrayList<Double> xCoordinates = new ArrayList<Double>();
		ArrayList<Double> yCoordinates = new ArrayList<Double>();
		for (int i = 0; i < 6; i++) {
			xCoordinates.add(centerX + radius * Math.cos(2 * i * Math.PI / 6));
			yCoordinates.add(centerY - radius * Math.sin(2 * i * Math.PI / 6));
		}

		primaryStage.setTitle("Hex Gui");
		primaryStage.setScene(new Scene(pane, width, height));
		 
	}
	public String[] StringToArray(String b) //separates a string into an array of its characters.
	{
		
		String[] tempArray = b.split("");
		
		return tempArray;
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HexagonWindow(primaryStage);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}