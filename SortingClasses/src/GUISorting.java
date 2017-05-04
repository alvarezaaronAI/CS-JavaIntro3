
import java.util.ArrayList;

import javafx.application.Application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GUISorting extends Application {
	private Text title;
	private Button generButton;
	private Text example1;
	private Text example2;
	private Text example3;
	private Text example4;
	private ObservableList<Sorts> mainTableData;
	private ObservableList<Sorts> bigDataTable;
	final Button button = new Button("Click To Start");
	private TableView<Sorts> mainTable;
	private TableView<Sorts> bigTable;

	@SuppressWarnings("unchecked")
	public void start(Stage primaryStage) throws Exception {
		// ------------------------------------------
		// Setting Window/Stage and Naming the window
		Stage window = primaryStage;
		window.setTitle("Sorting Algorithms");
		window.setWidth(1800);
		window.setHeight(920);

		// Title of the Main Table
		title = new Text("Sorting Table");
		title.getStyleClass().add("title");
		generButton = new Button("Create a new Table View");
		generButton.getStyleClass().add("geneButton");
		example1 = new Text("example");
		example2 = new Text("example");
		example3 = new Text("example");
		example4 = new Text("example");
		// ------------------------------------------
		mainTableData = mainList();
		bigDataTable = getSize100000();

		// ------------------------------------------Sorting
		// Tables------------------------------------
		// ----------Table Views-----------
		mainTable = new TableView<>();
		mainTable.getStyleClass().add("mainTable");
		bigTable = new TableView<>();
		bigTable.getStyleClass().add("bigTable");
		// ----------Columns For Tables-----------------------
		// Setting Up Name Column
		TableColumn<Sorts, String> nameColumn0 = new TableColumn<>("SortingName");
		nameColumn0.setMinWidth(200);
		nameColumn0.getStyleClass().add("nameCol0");
		nameColumn0.setCellValueFactory(new PropertyValueFactory<>("NAME"));
		// Setting Up Size Column
		TableColumn<Sorts, Integer> sizeColumn0 = new TableColumn<>("Size");
		sizeColumn0.setMinWidth(50);
		sizeColumn0.getStyleClass().add("sizeCol0");
		sizeColumn0.setCellValueFactory(new PropertyValueFactory<>("numElements"));
		// Setting Up Swaps Column
		TableColumn<Sorts, Integer> swapColumn0 = new TableColumn<>("Swaps");
		swapColumn0.setMinWidth(100);
		swapColumn0.getStyleClass().add("swapCol0");
		swapColumn0.setCellValueFactory(new PropertyValueFactory<>("numSwaps"));
		// Setting UP Comparisons Column
		TableColumn<Sorts, Integer> compColumn0 = new TableColumn<>("Comparisons");
		compColumn0.setMinWidth(100);
		compColumn0.getStyleClass().add("compCol0");
		compColumn0.setCellValueFactory(new PropertyValueFactory<>("numComparisons"));
		// Setting Up RunTime Column
		TableColumn<Sorts, Integer> runTColumn0 = new TableColumn<>("Run Time(Sec)");
		runTColumn0.setMinWidth(50);
		runTColumn0.getStyleClass().add("runTCol0");
		runTColumn0.setCellValueFactory(new PropertyValueFactory<>("runTime"));
		// Seting Up Unsorted data
		TableColumn<Sorts, Integer> unsortColumn0 = new TableColumn<>("Unsorted Data");
		unsortColumn0.setMinWidth(650);
		unsortColumn0.setCellValueFactory(new PropertyValueFactory<>("unSortedDataString"));
		// Seting Up Sorted Data
		TableColumn<Sorts, Integer> sortedColumn0 = new TableColumn<>("Sorted Data");
		sortedColumn0.setMinWidth(650);
		sortedColumn0.setCellValueFactory(new PropertyValueFactory<>("sortedDataString"));
		//----------------------------------------------------------------
		TableColumn<Sorts, String> nameColumn1 = new TableColumn<>("SortingName");
		nameColumn1.setMinWidth(200);
		nameColumn1.getStyleClass().add("nameCol1");
		nameColumn1.setCellValueFactory(new PropertyValueFactory<>("NAME"));
		// Setting Up Size Column
		TableColumn<Sorts, Integer> sizeColumn1 = new TableColumn<>("Size");
		sizeColumn1.setMinWidth(50);
		sizeColumn1.getStyleClass().add("sizeCol1");
		sizeColumn1.setCellValueFactory(new PropertyValueFactory<>("numElements"));
		// Setting Up Swaps Column
		TableColumn<Sorts, Integer> swapColumn1 = new TableColumn<>("Swaps");
		swapColumn1.setMinWidth(100);
		swapColumn1.getStyleClass().add("swapCol1");
		swapColumn1.setCellValueFactory(new PropertyValueFactory<>("numSwaps"));
		// Setting UP Comparisons Column
		TableColumn<Sorts, Integer> compColumn1 = new TableColumn<>("Comparisons");
		compColumn1.setMinWidth(100);
		compColumn1.getStyleClass().add("compCol1");
		compColumn1.setCellValueFactory(new PropertyValueFactory<>("numComparisons"));
		// Setting Up RunTime Column
		TableColumn<Sorts, Integer> runTColumn1 = new TableColumn<>("Run Time(Sec)");
		runTColumn1.setMinWidth(50);
		runTColumn1.getStyleClass().add("runTCol1");
		runTColumn1.setCellValueFactory(new PropertyValueFactory<>("runTime"));
		// Seting Up Unsorted data
		TableColumn<Sorts, Integer> unsortColumn1 = new TableColumn<>("Unsorted Data");
		unsortColumn1.setMinWidth(650);
		unsortColumn1.setCellValueFactory(new PropertyValueFactory<>("unSortedDataString"));
		// Seting Up Sorted Data
		TableColumn<Sorts, Integer> sortedColumn1 = new TableColumn<>("Sorted Data");
		sortedColumn1.setMinWidth(650);
		sortedColumn1.setCellValueFactory(new PropertyValueFactory<>("sortedDataString"));
		// ----------Setting Up Table View--------
		
		mainTable.setItems(mainTableData);
		mainTable.getColumns().addAll(nameColumn0, sizeColumn0, swapColumn0, compColumn0, runTColumn0, unsortColumn0,
				sortedColumn0);
		bigTable.setItems(bigDataTable);
		bigTable.getColumns().addAll(nameColumn1, sizeColumn1, swapColumn1, compColumn1, runTColumn1, unsortColumn1,
				sortedColumn1);
		
		// --------------------------------Done With Adding Mini
		// Tables----------------------
		// ---------------------------------------------Setting Functions
		// Interface---------------------------------
		BorderPane interfaceT = new BorderPane();
		VBox mainVBox = new VBox();
		mainVBox.getStyleClass().add("mainVBox");
		HBox mainHBox = new HBox();
		mainHBox.getStyleClass().add("mainHBox");
		HBox bottom = new HBox();
		bottom.getStyleClass().add("buttonHbox");

		HBox tableView = new HBox();
		tableView.getStyleClass().add("inteHBox");
		HBox sortsView = new HBox();
		sortsView.getChildren().addAll(mainTable);
		HBox sortsBView = new HBox();
		sortsBView.getStyleClass().add("sortsBView");
		sortsBView.getChildren().addAll(example3,bigTable,example4);
		
		mainHBox.getChildren().addAll(title);
		bottom.getChildren().addAll(generButton);

		tableView.getChildren().addAll(example1,mainTable,example2);
		interfaceT.setTop(mainHBox);
		interfaceT.setCenter(tableView);
		interfaceT.setBottom(sortsBView);

		// ------------------------------------------
		// Viewing the Window
		primaryStage.setFullScreen(true);
		Scene scene = new Scene(interfaceT);
		scene.getStylesheets().add("GUIStyleSheet.css");
		window.setScene(scene);
		window.show();
		// ------------------------------------------
	}

	/**
	 * Private methods that set up Sorting For Table View
	 * 
	 * @return
	 */
	private ObservableList<Sorts> mainList() {
		ObservableList<Sorts> mainTemp = FXCollections.observableArrayList();
		ObservableList<Sorts> size10 = getSize10();
		ObservableList<Sorts> size100 = getSize100();
		ObservableList<Sorts> size1000 = getSize1000();
		ObservableList<Sorts> size10000 = getSize10000();
		for (int i = 0; i < size10.size(); i++) {
			mainTemp.add(size10.get(i));
		}
		for (int i = 0; i < size100.size(); i++) {
			mainTemp.add(size100.get(i));
		}
		for (int i = 0; i < size1000.size(); i++) {
			mainTemp.add(size1000.get(i));
		}
		for (int i = 0; i < size10000.size(); i++) {
		mainTemp.add(size10000.get(i));
		}
		return mainTemp;
	}

	/*
	 * Size 10 Sorting Algorithms
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private ObservableList<Sorts> getSize10() {
		ObservableList<Sorts> size10 = FXCollections.observableArrayList();
		ArrayList<Integer> tempArray = new ArrayList<>();
		for (int j = 0; j < 10; j++) {
			int randomVal = 0 + (int) (Math.random() * (10 + 0 + 1));
			tempArray.add(randomVal);
		}
		size10.add(new BubbleSortUP<>(tempArray));
		size10.add(new BubbleSortOP<>(tempArray));
		size10.add(new SelectionSort<>(tempArray));
		size10.add(new InsertionSort<>(tempArray));
		size10.add(new MergeSort<>(tempArray));
		size10.add(new QuickSort<>(tempArray));
		size10.add(new CountingSort(tempArray));
		size10.add(new RadixSort(tempArray));
		size10.add(new OddEvenSort<>(tempArray));
		size10.add(new GnomeSort<>(tempArray));

		return size10;
	}

	/*
	 * Size 100 Sorting Algorithms
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private ObservableList<Sorts> getSize100() {
		ObservableList<Sorts> size100 = FXCollections.observableArrayList();
		ArrayList<Integer> tempArray = new ArrayList<>();
		for (int j = 0; j < 100; j++) {
			int randomVal = 0 + (int) (Math.random() * (100 + 0 + 1));
			tempArray.add(randomVal);
		}
		size100.add(new BubbleSortUP<>(tempArray));
		size100.add(new BubbleSortOP<>(tempArray));
		size100.add(new SelectionSort<>(tempArray));
		size100.add(new InsertionSort<>(tempArray));
		size100.add(new MergeSort<>(tempArray));
		size100.add(new QuickSort<>(tempArray));
		size100.add(new CountingSort(tempArray));
		size100.add(new RadixSort(tempArray));
		size100.add(new OddEvenSort<>(tempArray));
		size100.add(new GnomeSort<>(tempArray));

		return size100;
	}

	/*
	 * Size 1000 Sorting Algorithms
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private ObservableList<Sorts> getSize1000() {
		ObservableList<Sorts> size1000 = FXCollections.observableArrayList();
		ArrayList<Integer> tempArray = new ArrayList<>();
		for (int j = 0; j < 1000; j++) {
			int randomVal = 0 + (int) (Math.random() * (1000 + 0 + 1));
			tempArray.add(randomVal);
		}
		size1000.add(new BubbleSortUP<>(tempArray));
		size1000.add(new BubbleSortOP<>(tempArray));
		size1000.add(new SelectionSort<>(tempArray));
		size1000.add(new InsertionSort<>(tempArray));
		size1000.add(new MergeSort<>(tempArray));
		size1000.add(new QuickSort<>(tempArray));
		size1000.add(new CountingSort(tempArray));
		size1000.add(new RadixSort(tempArray));
		size1000.add(new OddEvenSort<>(tempArray));
		size1000.add(new GnomeSort<>(tempArray));

		return size1000;
	}

	/*
	 * Size 10000 Sorting Algorithms
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private ObservableList<Sorts> getSize10000() {
		ObservableList<Sorts> size10000 = FXCollections.observableArrayList();
		ArrayList<Integer> tempArray = new ArrayList<>();
		for (int j = 0; j < 10000; j++) {
			int randomVal = 0 + (int) (Math.random() * (10000 + 0 + 1));
			tempArray.add(randomVal);
		}
		size10000.add(new BubbleSortUP<>(tempArray));
		size10000.add(new BubbleSortOP<>(tempArray));
		size10000.add(new SelectionSort<>(tempArray));
		size10000.add(new InsertionSort<>(tempArray));
		size10000.add(new MergeSort<>(tempArray));
		size10000.add(new QuickSort<>(tempArray));
		size10000.add(new CountingSort(tempArray));
		size10000.add(new RadixSort(tempArray));
		size10000.add(new OddEvenSort<>(tempArray));
		size10000.add(new GnomeSort<>(tempArray));

		return size10000;
	}

	/*
	 * Size 100000 Sorting Algorithms
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private ObservableList<Sorts> getSize100000() {
		ObservableList<Sorts> size100000 = FXCollections.observableArrayList();
		ArrayList<Integer> tempArray = new ArrayList<>();
		for (int j = 0; j < 100000; j++) {
			int randomVal = 0 + (int) (Math.random() * (100000 + 0 + 1));
			tempArray.add(randomVal);
		}
		size100000.add(new BubbleSortUP<>(tempArray));
		size100000.add(new BubbleSortOP<>(tempArray));
		size100000.add(new SelectionSort<>(tempArray));
		size100000.add(new InsertionSort<>(tempArray));
		size100000.add(new MergeSort<>(tempArray));
		size100000.add(new QuickSort<>(tempArray));
		size100000.add(new CountingSort(tempArray));
		size100000.add(new RadixSort(tempArray));
		size100000.add(new OddEvenSort<>(tempArray));
		size100000.add(new GnomeSort<>(tempArray));

		return size100000;
	}

	/**
	 * Launching Application
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
