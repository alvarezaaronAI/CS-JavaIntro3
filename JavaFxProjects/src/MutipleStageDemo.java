import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class MutipleStageDemo extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		//--------------------------------------------------------------
		//Stage 1 Primary Stage ^
		//--------------------------------------------------------------
		Scene scene = new Scene(new Button("OK"),200,250);//create the scene with the button
		primaryStage.setTitle("Stage One");//set the name of the scene
		primaryStage.setScene(scene);//set the scene onto the stage
		primaryStage.show();
		//--------------------------------------------------------------
		//end of Stage 1
		//--------------------------------------------------------------
		//--------------------------------------------------------------
		//Stage 2 (which i named it Stage 2)
		//--------------------------------------------------------------
		Stage stage2 = new Stage();
		stage2.setTitle("Stage 2");
		Scene scene2 = new Scene(new Button("Hello World"),100,100);
		stage2.setScene(scene2);
		stage2.show();
		//--------------------------------------------------------------
		//end of Stage 2 ^
		//--------------------------------------------------------------
		/*
		 * 1. Want to CREATE Buttons,text fields that go into the scene 
		 * 2. Want to CREATE Scene where all the buttons text fields go into. 
		 * 3. Want to PLACE buttons text fields onto the Scene. 
		 * 4. Want to SET the scenento the the Stage 
		 * 5. want to SHOW the STAGE
		 */
		
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
