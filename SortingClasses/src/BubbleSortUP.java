 
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class BubbleSortUP<T extends Comparable<T>> implements Sorts {
	/**
	 * Member Variables, keeping Track of Data for my GUI.
	 */
	private final String NAME = "Bubble Sorting Unoptimized";
	private ArrayList<T> unSortedData = null;
	private ArrayList<T> sortedData = null;
	private String unSortedDataString = " ";
	private String sortedDataString = " ";
	private int numElements = 0;
	private Long numSwaps = 0l;
	private Long numComparisons = 0l;
	private Duration runTime = null;

	/**
	 * Constructor, given any ArrayList Type. maybe add a default that does only
	 * integers
	 */
	// This will sort out the given ArrayList of any type.
	public BubbleSortUP(ArrayList<T> arrayIn) {
		ArrayList<T> copyArrayList = copyArray(arrayIn);
		this.unSortedData = arrayIn;
		this.sortedData = copyArrayList;
		this.numElements = this.sortedData.size();
		sort();
	}

	/**
	 * Methods That Will Do The Sorting
	 */
	// Method that does the sorting returns a sorting array.
	@Override
	public void sort() {
		Instant start = Instant.now();
		this.sortedData = sortHelper(this.sortedData);
		Instant end = Instant.now();
		this.runTime = Duration.between(start, end);
		this.unSortedDataString = stringBuilder(this.unSortedData);
		this.sortedDataString = stringBuilder(this.sortedData);
	}

	// This will Sort out a array list of any type
	private ArrayList<T> sortHelper(ArrayList<T> arrayListInput) {
		for (int i = 1; i <= arrayListInput.size() - 1; i++) {
			for (int j = 0; j <= arrayListInput.size() - 2; j++) {
				this.numComparisons++;
				if (arrayListInput.get(j).compareTo(arrayListInput.get(j + 1)) > 0) {
					this.numSwaps++;
					T temp = arrayListInput.get(j);
					arrayListInput.set(j, arrayListInput.get(j + 1));
					arrayListInput.set(j + 1, temp);
				}
			}
		}
		return arrayListInput;
	}

	// Prints out a given arraylist turn into String Data
	private String stringBuilder(ArrayList<T> arrayListInput) {
		StringBuilder tempString = new StringBuilder();
		if (arrayListInput != null) {
			for (int i = 0; i < arrayListInput.size(); i++) {
				if (i % 20 == 0) {
					tempString.append("\n");
				}
				if (i != arrayListInput.size() - 1) {
					tempString.append(" " + arrayListInput.get(i) + ", ");

				} else {
					tempString.append(" " + arrayListInput.get(i) + "\n ");
				}
			}
		}
		tempString.append(" \n");
		String finaltemp = tempString.toString();
		return finaltemp;
	}

	// Copies a given Array and returns the array.
	private ArrayList<T> copyArray(ArrayList<T> listToCopyIn) {
		ArrayList<T> tempArray = new ArrayList<>();
		for (int i = 0; i < listToCopyIn.size(); i++) {
			tempArray.add(listToCopyIn.get(i));
		}
		return tempArray;
	}

	/**
	 * Methods Getters
	 */
	public ArrayList<T> getUnSortedData() {
		return unSortedData;
	}

	public String getNAME() {
		return NAME;
	}

	public ArrayList<T> getSortedData() {
		return sortedData;
	}

	public String getUnSortedDataString() {
		return unSortedDataString;
	}

	public String getSortedDataString() {
		return sortedDataString;
	}

	public int getNumElements() {
		return numElements;
	}

	public Duration getRunTime() {
		return runTime;
	}

	public Long getNumSwaps() {
		return numSwaps;
	}

	public Long getNumComparisons() {
		return numComparisons;
	}

	

}
