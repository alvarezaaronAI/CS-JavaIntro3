import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class BubbleSortOP<T extends Comparable<T>> {
	/**
	 * Member Variables, keeping Track of Data for my GUI.
	 */
	private final String NAME = "Bubble Sorting Optimized";
	private ArrayList<T> unSortedData = null;
	private ArrayList<T> sortedData = null;
	private int numElements = 0;
	private long numSwaps = 0;
	private long numComparisons = 0;
	private Duration runTime = null;

	/**
	 * Constructor, given any ArrayList Type. maybe add a default that does only
	 * integers
	 */
	// This will sort out the given ArrayList of any type.
	public BubbleSortOP(ArrayList<T> arrayIn) {
		ArrayList<T> copyArrayList = copyArray(arrayIn);
		this.unSortedData = arrayIn;
		this.sortedData = copyArrayList;
		this.numElements = this.sortedData.size();
	}

	/**
	 * Methods That Will Do The Sorting
	 */
	// Method that does the sorting returns a sorting array.
	public ArrayList<T> sort() {
		Instant start = Instant.now();
		this.sortedData = sortHelper(this.sortedData);
		Instant end = Instant.now();
		this.runTime = Duration.between(start, end);
		return this.sortedData;
	}

	// This will Sort out a array list of any type
	private ArrayList<T> sortHelper(ArrayList<T> arrayListInput) {
		int tempSwaps = 0;
		int tempCompa = 0;
		for (int i = 1; i <= arrayListInput.size(); i++) {
			boolean swapped = false; 
			for (int j = 0; j <= arrayListInput.size() - 2; j++) {
				tempCompa++;
				if (arrayListInput.get(j).compareTo(arrayListInput.get(j + 1)) > 0) {
					tempSwaps++;
					T temp = arrayListInput.get(j);
					arrayListInput.set(j, arrayListInput.get(j + 1));
					arrayListInput.set(j + 1, temp);
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
		// assign the total swaps after after sorting array
		this.numSwaps = tempSwaps;
		// assign the total comparisons after sorting array
		this.numComparisons = tempCompa;
		return arrayListInput;
	}

	// Prints out a given arraylist via console output
	public void consolePrintOut(ArrayList<T> arrayListInput) {
		if (arrayListInput != null) {
			for (int i = 0; i < arrayListInput.size(); i++) {
				if (i % 10 == 0) {
					System.out.print("\n");
				}
				if (i != arrayListInput.size() - 1) {
					System.out.print(arrayListInput.get(i) + ", ");

				} else {
					System.out.print(arrayListInput.get(i) + "\n");

				}

			}
		} else {
			System.out.println("----The array has No Reference(null)----");
		}
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
	 * Methods Getters and Setters and To String
	 */

	public ArrayList<T> getUnSortedData() {
		return unSortedData;
	}

	public void setUnSortedData(ArrayList<T> unSortedData) {
		this.unSortedData = unSortedData;
	}

	public ArrayList<T> getSortedData() {
		return sortedData;
	}

	public void setSortedData(ArrayList<T> sortedData) {
		this.sortedData = sortedData;
	}

	public int getNumElements() {
		return numElements;
	}

	public void setNumElements(int numElements) {
		this.numElements = numElements;
	}

	public long getNumSwaps() {
		return numSwaps;
	}

	public void setNumSwaps(long numSwaps) {
		this.numSwaps = numSwaps;
	}

	public long getNumComparisons() {
		return numComparisons;
	}

	public void setNumComparisons(long numComparisons) {
		this.numComparisons = numComparisons;
	}

	public Duration getRunTime() {
		return runTime;
	}

	public void setRunTime(Duration runTime) {
		this.runTime = runTime;
	}

	public String getNAME() {
		return NAME;
	}

	@Override
	public String toString() {
		return "BubbleSortOP [NAME=" + NAME + ", unSortedData=" + unSortedData + ", sortedData=" + sortedData
				+ ", numElements=" + numElements + ", numSwaps=" + numSwaps + ", numComparisons=" + numComparisons
				+ ", runTime=" + runTime + "]";
	}
	
	
}
