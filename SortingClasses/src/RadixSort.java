import java.lang.reflect.Array;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

public class RadixSort {
	/**
	 * Member Variables, keeping Track of Data for my GUI.
	 */
	private final String NAME = "Radix Sort";
	private ArrayList<Integer> unSortedData = null;
	private ArrayList<Integer> sortedData = null;
	private int numElements = 0;
	private Duration runTime = null;

	/**
	 * Constructor, given any ArrayList Type. maybe add a default that does only
	 * integers
	 */
	// This will sort out the given ArrayList of any type.
	public RadixSort(ArrayList<Integer> arrayIn) {
		ArrayList<Integer> copyArrayList = copyArray(arrayIn);
		this.unSortedData = arrayIn;
		this.sortedData = copyArrayList;
		this.numElements = this.sortedData.size();
	}

	/**
	 * Methods That Will Do The Sorting
	 */
	// Method that does the sorting returns a sorting array.
	public ArrayList<Integer> sort() {
		Instant start = Instant.now();
		this.sortedData = sortHelper(this.sortedData);
		Instant end = Instant.now();
		this.runTime = Duration.between(start, end);
		return this.sortedData;
	}

	// Private Method that sorts the ArrayList Of Integer
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private ArrayList<Integer> sortHelper(ArrayList<Integer> arrayListInput) {
		// creates the Arraylist of buckets that will store data from
		// arrayListInput in a specific order
		ArrayList[] buckets = new ArrayList[arrayListInput.size()];
		Integer numHigh = new Integer(0);

		// Gets the biggest number in the Array
		for (int i = 0; i < arrayListInput.size(); i++) {
			if (numHigh < (arrayListInput.get(i))) {
				numHigh = arrayListInput.get(i);
			}
		}

		// Initializes ArrayListInsideBuckets
		for (int j = 0; j < buckets.length; j++) {
			ArrayList<Integer> tempArrayList = new ArrayList<>();
			buckets[j] = tempArrayList;
		}
		// Gets the number of digits of Num High
		int numOfDig = numHigh.toString().length();
		for (int i = 1; i <= numOfDig; i++) {
			// This for loops goes through the orignal ArrayListInput and puts
			// them into the bucket base on digit

			for (int j = 0; j <= arrayListInput.size() - 1; j++) {
				int key = getDigit(arrayListInput.get(j), 10, i);
				buckets[key].add(arrayListInput.get(j));
			}
			int k = 0;
			// This for loop goes through the buckets and gets every single
			// ArrayList value and starts sorting
			for (int j = 0; j <= buckets.length - 1; j++) {
				for (int h = 0; h < buckets[j].size(); h++) {
					int x = (int) buckets[j].get(h);
					arrayListInput.set(k++, x);
				}
				buckets[j].clear();
			}
		}
		// sets it into the member variable
		this.sortedData = arrayListInput;
		return arrayListInput;
	}

	// private method that gets any digit from any number
	private int getDigit(int num, int base, int ithDig) {
		return (int) ((num / Math.pow(base, ithDig - 1)) % base);
	}

	// Prints out a given arraylist via console output
	public void consolePrintOut(ArrayList<Integer> arrayListInput) {
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
	private ArrayList<Integer> copyArray(ArrayList<Integer> listToCopyIn) {
		ArrayList<Integer> tempArray = new ArrayList<>();
		for (int i = 0; i < listToCopyIn.size(); i++) {
			tempArray.add(listToCopyIn.get(i));
		}
		return tempArray;
	}

	/**
	 * Methods Getters and Setters and To String
	 */
	public ArrayList<Integer> getUnSortedData() {
		return unSortedData;
	}

	public void setUnSortedData(ArrayList<Integer> unSortedData) {
		this.unSortedData = unSortedData;
	}

	public ArrayList<Integer> getSortedData() {
		return sortedData;
	}

	public void setSortedData(ArrayList<Integer> sortedData) {
		this.sortedData = sortedData;
	}

	public int getNumElements() {
		return numElements;
	}

	public void setNumElements(int numElements) {
		this.numElements = numElements;
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

}
