import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFx extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btOK = new Button("OK");//Create a new Button
		Scene scene = new Scene(btOK,200,250);//set button on the scene
		primaryStage.setTitle("NameOfStage");//set a name for the stage
		primaryStage.setScene(scene);//place the scene in the stage.
		primaryStage.show();//show the stage
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
