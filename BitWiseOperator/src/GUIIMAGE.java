
import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class GUIIMAGE extends Application {
	/*
	 * Member Variables for GUI
	 */
	//Intro
	private Stage window;
	//Interface
	private BorderPane mainIFBP;
	private Button button1, button2;
	//Functionality 
	private Menu menuFile,menuEdit;
	private MenuItem openFile,edit;
	private MenuBar menuBar;
	private File fileInput;
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		/*
		 * Intro To Stage
		 */
		window = primaryStage;
		window.setTitle("Image Modifier");
		/*
		 * Setting Menu Titles
		 */
		menuFile = new Menu("File");
		menuFile.getStyleClass().add("menuFile");
		menuEdit = new Menu("Edit");
		menuEdit.getStyleClass().add("menuEdit");
		/*
		 * Menu Items Creator
		 */
		openFile = new MenuItem("Open File...");
		openFile.getStyleClass().add("openFileItem");
		edit = new MenuItem("Background Color...");
		edit.getStyleClass().add("editItem");
		/*
		 * Setting Menu Items
		 */
		menuFile.getItems().add(openFile);
		menuEdit.getItems().add(edit);
		
		/*
		 * Menu Bar
		 */
		menuBar = new MenuBar();
		menuBar.getStyleClass().add("menuBar");
		menuBar.getMenus().addAll(menuFile,menuEdit);
		/*
		 * Interface
		 */
		mainIFBP = new BorderPane();
		mainIFBP.setTop(menuBar);
		/*
		 * Scene Setup
		 */
		Scene scene = new Scene(mainIFBP,1800,920);
		scene.getStylesheets().add("GUIIMAGE.css");
		window.setScene(scene);
		window.show();

	}
	public void button1Action() {
		FileChooser file = new FileChooser();
		File path = file.showOpenDialog(null);
		try {
			this.fileInput = path;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
