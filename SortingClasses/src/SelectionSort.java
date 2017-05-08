 import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class SelectionSort<T extends Comparable<T>> implements Sorts {
	/**
	 * Member Variables, keeping Track of Data for my GUI.
	 */
	private final String NAME = "Selection Sort";
	private ArrayList<T> unSortedData = null;
	private ArrayList<T> sortedData = null;
	private String unSortedDataString = " ";
	private String sortedDataString = " ";
	private int numElements = 0;
	private long numSwaps = 0;
	private long numComparisons = 0;
	private Duration runTime = null;

	/**
	 * Constructor, given any ArrayList Type. maybe add a default that does only
	 * integers
	 */
	// This will sort out the given ArrayList of any type.
	public SelectionSort(ArrayList<T> arrayIn) {
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
		int tempSwaps = 0;
		int tempCompa = 0;
		for (int i = 0; i <= arrayListInput.size() - 1; i++) {
			int min = i;
			for (int j = i + 1; j <= arrayListInput.size() - 1; j++) {
				tempCompa++;
				if (arrayListInput.get(j).compareTo(arrayListInput.get(min)) < 0) {
					min = j;
				}
			}
			tempSwaps++;
			T temp = arrayListInput.get(i);
			arrayListInput.set(i, arrayListInput.get(min));
			arrayListInput.set(min, temp);
		}
		// assign the total swaps after after sorting array
		this.numSwaps = tempSwaps;
		// assign the total comparisons after sorting array
		this.numComparisons = tempCompa;
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

	public String getNAME() {
		return NAME;
	}

	public ArrayList<T> getUnSortedData() {
		return unSortedData;
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

	public long getNumSwaps() {
		return numSwaps;
	}

	public long getNumComparisons() {
		return numComparisons;
	}

	public Duration getRunTime() {
		return runTime;
	}

	
	
}
