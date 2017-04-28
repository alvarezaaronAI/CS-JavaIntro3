
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

public class CountingSort {
	/**
	 * Member Variables, keeping Track of Data for my GUI.
	 */
	private final String NAME = "Counting Sort";
	private int[] unSortedData = null;
	private int[] sortedData = null;
	private int numElements = 0;
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
	}

	/**
	 * Methods That Will Do The Sorting
	 */
	// Method that does the sorting returns a sorting array.
	public int[] sort() {
		Instant start = Instant.now();
		this.sortedData = sortHelper(this.sortedData);
		Instant end = Instant.now();
		this.runTime = Duration.between(start, end);
		return this.sortedData;
	}

	private int[] sortHelper(int[] arrayInput) {
		int tempK = 0;
		for (int i = 0; i < arrayInput.length; i++) {
			if (tempK < arrayInput[i]) {
				tempK = arrayInput[i];
			}
		}
		System.out.println("Hey" +tempK);

		return countingSort(arrayInput, tempK);

	}

	// This will Sort out a array of int
	private int[] countingSort(int[] arrayInput, int k) {
		int[] result = new int[arrayInput.length];
		int[] counts = new int[k + 1];
		for (int i = 0; i <= k; i++) {
			counts[i] = 0;
		}
		for (int i = 0; i <= arrayInput.length-1; i++) {
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

	// Prints out a given array via console output
	public void printUnsortedArray() {
		if (this.unSortedData != null) {
			for (int i = 0; i < this.unSortedData.length; i++) {
				if (i % 10 == 0) {
					System.out.print("\n");
				}
				if (i != this.unSortedData.length - 1) {
					System.out.print(this.unSortedData[i] + ", ");

				} else {
					System.out.print(this.unSortedData[i] + "\n");

				}

			}
		} else {
			System.out.println("----The array has No Reference(null)----");
		}
	} // Prints out a given array via console output

	public void printSortedArray() {
		if (this.sortedData != null) {
			for (int i = 0; i < this.sortedData.length; i++) {
				if (i % 10 == 0) {
					System.out.print("\n");
				}
				if (i != this.sortedData.length - 1) {
					System.out.print(this.sortedData[i] + ", ");

				} else {
					System.out.print(this.sortedData[i] + "\n");

				}

			}
		} else {
			System.out.println("----The array has No Reference(null)----");
		}
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
	 * Methods Getters and Setters and To String
	 */
	public int[] getUnSortedData() {
		return unSortedData;
	}

	public void setUnSortedData(int[] unSortedData) {
		this.unSortedData = unSortedData;
	}

	public int[] getSortedData() {
		return sortedData;
	}

	public void setSortedData(int[] sortedData) {
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

	@Override
	public String toString() {
		return "CountingSort [NAME=" + NAME + ", unSortedData=" + Arrays.toString(unSortedData) + ", sortedData="
				+ Arrays.toString(sortedData) + ", numElements=" + numElements + ", runTime=" + runTime + "]";
	}

}
