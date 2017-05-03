
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
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GUISorting extends Application {
	private Text title;
	private Button generButton;
	private Text example1;
	private Text example2;
	private ObservableList<Sorts> diez;
	private ObservableList<Sorts> cien;
	private ObservableList<Sorts> mil;
	private ObservableList<Sorts> diezMil;
	private ObservableList<Sorts> cienMil;
	final ProgressIndicator loadingIndicator = new ProgressIndicator();
	final Button button = new Button("Click To Start");
	private TableView<Sorts> mainTable;
	private TableView<Sorts> size10;
	private TableView<Sorts> size100;
	private TableView<Sorts> size1000;
	private TableView<Sorts> size10000;
	private TableView<Sorts> size100000;

	@SuppressWarnings("unchecked")
	public void start(Stage primaryStage) throws Exception {
		// Setting up Loading Screen
		loadingIndicator.setVisible(false);
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
		// ------------------------------------------
		diez = getSize10();
		cien = getSize100();
		mil = getSize1000();
		diezMil = getSize10000();
		//cienMil = getSize100000();
		
		// ------------------------------------------Sorting Tables------------------------------------
		// ----------Table Views-----------
		mainTable = new TableView<>();
		mainTable.getStyleClass().add("mainTable");
		size10 = new TableView<>();
		size10.getStyleClass().add("size10"); 
		size100 = new TableView<>();
		size100.getStyleClass().add("size100");
		size1000 = new TableView<>();
		size1000.getStyleClass().add("size1000");
		size10000 = new TableView<>();
		size10000.getStyleClass().add("size10000");
		size100000 = new TableView<>();
		size100000.getStyleClass().add("size100000");
		// ----------Columns For Tables
		// -----------------------
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
		// --------------------------------------------------------------------------
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
		// --------------------------------------------------------------------------
		TableColumn<Sorts, String> nameColumn2 = new TableColumn<>("SortingName");
		nameColumn2.setMinWidth(200);
		nameColumn2.getStyleClass().add("nameCol2");
		nameColumn2.setCellValueFactory(new PropertyValueFactory<>("NAME"));
		// Setting Up Size Column
		TableColumn<Sorts, Integer> sizeColumn2 = new TableColumn<>("Size");
		sizeColumn2.setMinWidth(50);
		sizeColumn2.getStyleClass().add("sizeCol2");
		sizeColumn2.setCellValueFactory(new PropertyValueFactory<>("numElements"));
		// Setting Up Swaps Column
		TableColumn<Sorts, Integer> swapColumn2 = new TableColumn<>("Swaps");
		swapColumn2.setMinWidth(100);
		swapColumn2.getStyleClass().add("swapCol2");
		swapColumn2.setCellValueFactory(new PropertyValueFactory<>("numSwaps"));
		// Setting UP Comparisons Column
		TableColumn<Sorts, Integer> compColumn2 = new TableColumn<>("Comparisons");
		compColumn2.setMinWidth(100);
		compColumn2.getStyleClass().add("compCol2");
		compColumn2.setCellValueFactory(new PropertyValueFactory<>("numComparisons"));
		// Setting Up RunTime Column
		TableColumn<Sorts, Integer> runTColumn2 = new TableColumn<>("Run Time(Sec)");
		runTColumn2.setMinWidth(50);
		runTColumn2.getStyleClass().add("runTCol2");
		runTColumn2.setCellValueFactory(new PropertyValueFactory<>("runTime"));
		// Seting Up Unsorted data
		TableColumn<Sorts, Integer> unsortColumn2 = new TableColumn<>("Unsorted Data");
		unsortColumn2.setMinWidth(650);
		unsortColumn2.setCellValueFactory(new PropertyValueFactory<>("unSortedDataString"));
		// Seting Up Sorted Data
		TableColumn<Sorts, Integer> sortedColumn2 = new TableColumn<>("Sorted Data");
		sortedColumn2.setMinWidth(650);
		sortedColumn2.setCellValueFactory(new PropertyValueFactory<>("sortedDataString"));
		// --------------------------------------------------------------------------
		TableColumn<Sorts, String> nameColumn3 = new TableColumn<>("SortingName");
		nameColumn3.setMinWidth(200);
		nameColumn3.getStyleClass().add("nameCol3");
		nameColumn3.setCellValueFactory(new PropertyValueFactory<>("NAME"));
		// Setting Up Size Column
		TableColumn<Sorts, Integer> sizeColumn3 = new TableColumn<>("Size");
		sizeColumn3.setMinWidth(50);
		sizeColumn3.getStyleClass().add("sizeCol3");
		sizeColumn3.setCellValueFactory(new PropertyValueFactory<>("numElements"));
		// Setting Up Swaps Column
		TableColumn<Sorts, Integer> swapColumn3 = new TableColumn<>("Swaps");
		swapColumn3.setMinWidth(100);
		swapColumn3.getStyleClass().add("swapCol3");
		swapColumn3.setCellValueFactory(new PropertyValueFactory<>("numSwaps"));
		// Setting UP Comparisons Column
		TableColumn<Sorts, Integer> compColumn3 = new TableColumn<>("Comparisons");
		compColumn3.setMinWidth(100);
		compColumn3.getStyleClass().add("compCol3");
		compColumn3.setCellValueFactory(new PropertyValueFactory<>("numComparisons"));
		// Setting Up RunTime Column
		TableColumn<Sorts, Integer> runTColumn3 = new TableColumn<>("Run Time(Sec)");
		runTColumn3.setMinWidth(50);
		runTColumn3.getStyleClass().add("runTCol3");
		runTColumn3.setCellValueFactory(new PropertyValueFactory<>("runTime"));
		// Seting Up Unsorted data
		TableColumn<Sorts, Integer> unsortColumn3 = new TableColumn<>("Unsorted Data");
		unsortColumn3.setMinWidth(650);
		unsortColumn3.setCellValueFactory(new PropertyValueFactory<>("unSortedDataString"));
		// Seting Up Sorted Data
		TableColumn<Sorts, Integer> sortedColumn3 = new TableColumn<>("Sorted Data");
		sortedColumn3.setMinWidth(650);
		sortedColumn3.setCellValueFactory(new PropertyValueFactory<>("sortedDataString"));
		// --------------------------------------------------------------------------
		TableColumn<Sorts, String> nameColumn4 = new TableColumn<>("SortingName");
		nameColumn4.setMinWidth(200);
		nameColumn4.getStyleClass().add("nameCol4");
		nameColumn4.setCellValueFactory(new PropertyValueFactory<>("NAME"));
		// Setting Up Size Column
		TableColumn<Sorts, Integer> sizeColumn4 = new TableColumn<>("Size");
		sizeColumn4.setMinWidth(50);
		sizeColumn4.getStyleClass().add("sizeCol4");
		sizeColumn4.setCellValueFactory(new PropertyValueFactory<>("numElements"));
		// Setting Up Swaps Column
		TableColumn<Sorts, Integer> swapColumn4 = new TableColumn<>("Swaps");
		swapColumn4.setMinWidth(100);
		swapColumn4.getStyleClass().add("swapCol4");
		swapColumn4.setCellValueFactory(new PropertyValueFactory<>("numSwaps"));
		// Setting UP Comparisons Column
		TableColumn<Sorts, Integer> compColumn4 = new TableColumn<>("Comparisons");
		compColumn4.setMinWidth(100);
		compColumn4.getStyleClass().add("compCol4");
		compColumn4.setCellValueFactory(new PropertyValueFactory<>("numComparisons"));
		// Setting Up RunTime Column
		TableColumn<Sorts, Integer> runTColumn4 = new TableColumn<>("Run Time(Sec)");
		runTColumn4.setMinWidth(50);
		runTColumn4.getStyleClass().add("runTCol4");
		runTColumn4.setCellValueFactory(new PropertyValueFactory<>("runTime"));
		// Seting Up Unsorted data
		TableColumn<Sorts, Integer> unsortColumn4 = new TableColumn<>("Unsorted Data");
		unsortColumn4.setMinWidth(650);
		unsortColumn4.setCellValueFactory(new PropertyValueFactory<>("unSortedDataString"));
		// Seting Up Sorted Data
		TableColumn<Sorts, Integer> sortedColumn4 = new TableColumn<>("Sorted Data");
		sortedColumn4.setMinWidth(650);
		sortedColumn4.setCellValueFactory(new PropertyValueFactory<>("sortedDataString"));

		// ----------Setting Up Table View--------
		size10.setItems(diez);
		size10.getColumns().addAll(nameColumn0, sizeColumn0, swapColumn0, compColumn0, runTColumn0, unsortColumn0,
				sortedColumn0);
		size100.setItems(cien);
		size100.getColumns().addAll(nameColumn1, sizeColumn1, swapColumn1, compColumn1, runTColumn1, unsortColumn1,
				sortedColumn1);
		size1000.setItems(mil);
		size1000.getColumns().addAll(nameColumn2, sizeColumn2, swapColumn2, compColumn2, runTColumn2, unsortColumn2,
				sortedColumn2);
		size10000.setItems(diezMil);
		size10000.getColumns().addAll(nameColumn3, sizeColumn3, swapColumn3, compColumn3, runTColumn3, unsortColumn3,
				sortedColumn3);
		size100000.setItems(cienMil);
		size100000.getColumns().addAll(nameColumn4, sizeColumn4, swapColumn4, compColumn4, runTColumn4, unsortColumn4,
				sortedColumn4);
		// --------------------------------Done With Adding Mini Tables----------------------
		// ---------------------------------------------Setting Functions Interface---------------------------------
		VBox mainVBox = new VBox();
		mainVBox.getStyleClass().add("mainVBox");
		HBox mainHBox = new HBox();
		mainHBox.getStyleClass().add("mainHBox");
		HBox interfaceBox = new HBox();
		interfaceBox.getStyleClass().add("inteHBox");
		mainHBox.getChildren().addAll(title);
		mainVBox.getChildren().addAll(mainHBox, size10, size100, size1000, size10000, size100000, generButton);
		interfaceBox.getChildren().addAll(example1, mainVBox, example2);

		// ------------------------------------------
		// Viewing the Window
		primaryStage.setFullScreen(true);
		Scene scene = new Scene(interfaceBox);
		scene.getStylesheets().add("GUIStyleSheet.css");
		window.setScene(scene);
		window.show();
		// ------------------------------------------
	}

	/**
	 * Private methods that set up Sorting For Table View
	 * @return 
	 */
	private ObservableList<Sorts> mainList() {
		ObservableList<Sorts> mainTemp = FXCollections.observableArrayList();
		ObservableList<Sorts> size10 = getSize10();
		ObservableList<Sorts> size100 = getSize100();
		ObservableList<Sorts> size1000= getSize1000();
		ObservableList<Sorts> size10000 = getSize10000();
		ObservableList<Sorts> size100000 = getSize100000();
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
		for (int i = 0; i < size100000.size(); i++) {
			mainTemp.add(size100000.get(i));
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
