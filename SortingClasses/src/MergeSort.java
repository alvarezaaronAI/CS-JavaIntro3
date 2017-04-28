import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class MergeSort<T extends Comparable<T>> {
	/**
	 * Member Variables, keeping Track of Data for my GUI.
	 */
	private final String NAME = "Merge Sort";
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
	public MergeSort(ArrayList<T> arrayIn) {
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
		if (arrayListInput.size() > 1) {
			int mid = (arrayListInput.size() - 1) / 2;
			ArrayList<T> left = new ArrayList<>();
			for (int i = 0; i <= mid; i++) {
				left.add(arrayListInput.get(i));
			}
			sortHelper(left);
			ArrayList<T> right = new ArrayList<>();
			for (int i = mid + 1; i < arrayListInput.size(); i++) {
				right.add(arrayListInput.get(i));
			}
			sortHelper(right);
			arrayListInput = merge(left, right, arrayListInput);
		}
		return arrayListInput;
	}

	private ArrayList<T> merge(ArrayList<T> list1, ArrayList<T> list2, ArrayList<T> result) {
		int i = 0;
		int j = 0;
		int k = 0;
		while ((i < list1.size()) && (j < list2.size())) {
			this.numComparisons++;
			if (list1.get(i).compareTo(list2.get(j)) < 0) {
				result.set(k, list1.get(i));
				this.numSwaps++;
				i++;
			} else {
				result.set(k, list2.get(j));
				this.numSwaps++;
				j++;
			}
			k++;
		}
		while (i < list1.size()) {
			result.set(k, list1.get(i));
			this.numSwaps++;
			i++;
			k++;
		}
		while (j < list2.size()) {
			result.set(k, list2.get(j));
			this.numSwaps++;
			j++;
			k++;
		}
		return result;

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
		return "InsertionSort [NAME=" + NAME + ", unSortedData=" + unSortedData + ", sortedData=" + sortedData
				+ ", numElements=" + numElements + ", numSwaps=" + numSwaps + ", numComparisons=" + numComparisons
				+ ", runTime=" + runTime + "]";
	}

}
