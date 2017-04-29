
import java.util.Observable;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUISorting extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		//------------------------------------------
		//Setting Window/Stage and Naming the window
		Stage window = primaryStage;
		window.setTitle("SortingAlgorithms");
		//------------------------------------------
		//TableView
		TableView<BubbleSortUP> bubbleSortTable;
		//Setting Up Column
		TableColumn<BubbleSortUP, String> nameColumn = new TableColumn<>("Sorting Type");
		nameColumn.setMinWidth(200);
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("Sorting Name"));
		TableColumn<BubbleSortUP, String> sizeColumn = new TableColumn<>("Size");
		nameColumn.setMinWidth(200);
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("Size "));
		TableColumn<BubbleSortUP, String> swapColumn = new TableColumn<>("#(s) Of Swaps");
		nameColumn.setMinWidth(200);
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("Swaps"));
		//------------------------------------------
		//Setting Functions to view At
		VBox vBox = new VBox();
		vBox.getChildren().addAll();
		//------------------------------------------
		//Viewing the Window
		Scene scene = new Scene(vBox);
		window.setScene(scene);
		window.show();
		//------------------------------------------
	}
	public static void main(String[] args) {
		launch(args);
	}
}
