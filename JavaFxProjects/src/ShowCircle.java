import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Circle circleObj = new Circle();
		circleObj.setCenterX(100);
		circleObj.setCenterY(100);
		circleObj.setRadius(50);
		circleObj.setStroke(Color.CADETBLUE);
		circleObj.setFill(Color.WHITE);
		//create a pane that would store the circle in the observable list
		Pane pane = new Pane();
		pane.getChildren().add(circleObj);
		Scene scene = new Scene(pane,200,200);
		primaryStage.setTitle("Circle");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		Application.launch(args);
	}

}
