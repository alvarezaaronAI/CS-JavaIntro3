import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class CountingSort<T> implements Sorts {
	/**
	 * Member Variables, keeping Track of Data for my GUI.
	 */
	private final String NAME = "Counting Sort";
	private int[] unSortedData = null;
	private int[] sortedData = null;
	private String unSortedDataString = " ";
	private String sortedDataString = " ";
	private int numElements = 0;
	private long numSwaps = 0;
	private long numComparisons = 0;
	private Duration runTime = null;

	/**
	 * Constructor, given Integer Array Type.
	 */
	// This will sort out the given Array of any type.
	public CountingSort(ArrayList<Integer> arrayListInput) {
		int[] tempArray = new int[arrayListInput.size()];
		for (int i = 0; i < tempArray.length; i++) {
			
			tempArray[i] = arrayListInput.get(i);
		}
		int[] copyArray = copyArray(tempArray);
		this.unSortedData = tempArray;
		this.sortedData = copyArray;
		this.numElements = this.sortedData.length;
		sort();
		System.out.println("Counting" + numElements);
	}

	/**
	 * Methods That Will Do The Sorting
	 */
	// Method that does the sorting returns a sorting array.
	public void sort() {
		Instant start = Instant.now();
		this.sortedData = sortHelper(this.sortedData);
		Instant end = Instant.now();
		this.runTime = Duration.between(start, end);
		this.unSortedDataString = stringBuilder(this.unSortedData);
		this.sortedDataString = stringBuilder(this.sortedData);
	}

	private int[] sortHelper(int[] arrayInput) {
		int tempK = 0;
		for (int i = 0; i < arrayInput.length; i++) {
			if (tempK < arrayInput[i]) {
				tempK = arrayInput[i];
			}
		}

		return countingSort(arrayInput, tempK);

	}

	// This will Sort out a array of int
	private int[] countingSort(int[] arrayInput, int k) {
		int[] result = new int[arrayInput.length];
		int[] counts = new int[k + 1];
		for (int i = 0; i <= k; i++) {
			counts[i] = 0;
		}
		for (int i = 0; i <= arrayInput.length - 1; i++) {
			counts[arrayInput[i]]++;
		}
		for (int i = 1; i <= k; i++) {
			counts[i] += counts[i - 1];
		}
		for (int i = arrayInput.length - 1; i >= 0; i--) {
			result[counts[arrayInput[i]] - 1] = arrayInput[i];
			counts[arrayInput[i]]--;
		}

		return result;

	}

	// Prints out a given array turn into String Data
	private String stringBuilder(int[] array) {
		StringBuilder tempString = new StringBuilder();
		if (array != null) {
			for (int i = 0; i < array.length; i++) {
				if (i % 20 == 0) {
					tempString.append("\n");
				}
				if (i != array.length - 1) {
					tempString.append(" " + array[i] + ", ");

				} else {
					tempString.append(" " + array[i] + "\n ");
				}
			}
		}
		tempString.append(" \n");
		String finaltemp = tempString.toString();
		return finaltemp;
	}

	// Copies a given Array and returns the array.
	private int[] copyArray(int[] listToCopyIn) {
		int[] tempArray = new int[listToCopyIn.length];
		for (int i = 0; i < listToCopyIn.length; i++) {
			tempArray[i] = listToCopyIn[i];
		}
		return tempArray;
	}

	/**
	 * Methods Getters
	 */

	public long getNumSwaps() {
		return numSwaps;
	}

	public long getNumComparisons() {
		return numComparisons;
	}

	public int[] getUnSortedData() {
		return unSortedData;
	}

	public int[] getSortedData() {
		return sortedData;
	}

	public int getNumElements() {
		return numElements;
	}

	public Duration getRunTime() {
		return runTime;
	}
	public String getNAME() {
		return NAME;
	}

	public String getUnSortedDataString() {
		return unSortedDataString;
	}

	public String getSortedDataString() {
		return sortedDataString;
	}


}