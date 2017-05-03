import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class QuickSort<T extends Comparable<T>> implements Sorts {
	/**
	 * Member Variables, keeping Track of Data for my GUI.
	 */
	private final String NAME = "Quick Sort";
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
	public QuickSort(ArrayList<T> arrayIn) {
		ArrayList<T> copyArrayList = copyArray(arrayIn);
		this.unSortedData = arrayIn;
		this.sortedData = copyArrayList;
		this.numElements = this.sortedData.size();
		sort();
		System.out.println("Quick" + numElements);
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
		return quickSort(arrayListInput, 0, arrayListInput.size() - 1);

	}

	private ArrayList<T> quickSort(ArrayList<T> list, int low, int high) {
		if (low < high) {
			int p = partition(list, low, high);
			quickSort(list, low, p - 1);
			quickSort(list, p + 1, high);
		}
		return list;
	}

	private int partition(ArrayList<T> arrayListInput, int low, int high) {
		T pivot = arrayListInput.get(high);
		int i = low - 1;
		for (int j = low; j <= high - 1; j++) {
			this.numComparisons++;
			if (arrayListInput.get(j).compareTo(pivot) <= 0) {
				i = i + 1;
				this.numSwaps++;
				T temp = arrayListInput.get(i);
				arrayListInput.set(i, arrayListInput.get(j));
				arrayListInput.set(j, temp);
			}
		}
		this.numSwaps++;
		T temp = arrayListInput.get(i + 1);
		arrayListInput.set(i + 1, arrayListInput.get(high));
		arrayListInput.set(high, temp);
		return i + 1;
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
