

/*Aaron Alvarez 
Feb 8th, 2017
This class is meant to create  multiple hexegons and run the same code as HexagonPattern.
As soon as we print out a possible solution we submit it here in this class and this class reads the solution 
and prints out the solved arraylist.*/

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class GUIHexagons extends Application {
	private double width = 270.0;
	private double height = 90.0;

	private void HexagonWindow(Stage primaryStage) {
		Group rootOfScenegraph = new Group();
		primaryStage.setScene(new Scene(rootOfScenegraph, width, height));
		
		
		Polygon hexagon = new Polygon(new double[] { 225.0,15.0,  250.0,30.0,  250.0,60.0,  225.0,75.0,  200.0,60.0,  200.0,30.0 });
		hexagon.setStroke(Color.BLACK);
		hexagon.setStrokeWidth(3);
		hexagon.setFill(null);

		rootOfScenegraph.getChildren().addAll( hexagon);
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