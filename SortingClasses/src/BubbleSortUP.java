import java.util.ArrayList;
import java.util.Random;

public class BubbleSortUP<T extends Comparable<T>> {
	/*
	 * Member Variables, keeping Track of Data for my GUI.
	 */
	private final String NAME = "Bubble Sorting Unoptimized";
	private ArrayList<T> savedData = null;
	private ArrayList<T> sortedData = null;
	private int numElements = 0;
	private long numComparisons = 0;
	private long numSwaps = 0;
	private long runTimeSeconds = 0;

	/*
	 * Constructor, given any ArrayList Type.
	 */
	// This will automatically create an ArrayList of n random integers only.
	public BubbleSortUP(int sizeOfArray) {
		ArrayList<Integer> randomArrayList = new ArrayList<>();
		for (int i = 0; i < sizeOfArray; i++) {
			int randomVal = 0 + (int) (Math.random() * (sizeOfArray + 0 + 1));
			randomArrayList.add(randomVal);
		}

		this.savedData = (ArrayList<T>) randomArrayList;
		this.sortedData = sort((ArrayList<T>) randomArrayList);
		this.numElements = randomArrayList.size();
		// ----------EraseAfterThisIsOnlyForTestingPurposes------------
		System.out.println("TestingPurposes1");
		System.out.println("This is the ArrayList That was Created");
		System.out.println("Non Sorted");
		consolePrintOut(this.savedData);
		System.out.println("Sorted");
		consolePrintOut(this.sortedData);
		// -------------------------------------------------------------
	}

	// This will sort out the given ArrayList of any type.
	public BubbleSortUP(ArrayList<T> arrayInput) {

		this.savedData = arrayInput;
		this.sortedData = sort(arrayInput);
		this.numElements = arrayInput.size();
		// ----------EraseAfterThisIsOnlyForTestingPurposes------------
		System.out.println("TestingPurposes2");
		System.out.println("This is the array You Entered");
		consolePrintOut(this.savedData);
		// -------------------------------------------------------------
	}

	/*
	 * Methods That Will Do The Sorting
	 */
	// This will Sort out a arraylist of any type
	private ArrayList<T> sort(ArrayList<T> arrayListInput) {
		for (int i = 1; i <= arrayListInput.size() - 1; i++) {
			for (int j = 0; j <= arrayListInput.size() - 2; j++) {
				if (arrayListInput.get(j).compareTo(arrayListInput.get(j + 1)) > 0) {
					T temp = arrayListInput.get(j);
					arrayListInput.set(j, arrayListInput.get(j + 1));
					arrayListInput.set(j + 1, temp);
				}
			}
		}
		return arrayListInput;
	}

	// Prints out a given arraylist via console output
	private void consolePrintOut(ArrayList<T> arrayListInput) {
		if (arrayListInput != null) {
			for (int i = 0; i < arrayListInput.size(); i++) {
				if (i != arrayListInput.size() - 1) {
					System.out.print(arrayListInput.get(i) + ", ");

				} else {
					System.out.print(arrayListInput.get(i) + "\n");

				}
			}
		} else {
			System.out.println("The array has No Reference(null)");
		}
	}

	/*
	 * Methods Getters and Setters and To String
	 */
	public ArrayList<T> getSavedData() {
		return savedData;
	}

	public void setSavedData(ArrayList<T> savedData) {
		this.savedData = savedData;
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

	public long getNumComparisons() {
		return numComparisons;
	}

	public void setNumComparisons(long numComparisons) {
		this.numComparisons = numComparisons;
	}

	public long getNumSwaps() {
		return numSwaps;
	}

	public void setNumSwaps(long numSwaps) {
		this.numSwaps = numSwaps;
	}

	public long getRunTimeSeconds() {
		return runTimeSeconds;
	}

	public void setRunTimeSeconds(long runTimeSeconds) {
		this.runTimeSeconds = runTimeSeconds;
	}

	public String getNAME() {
		return NAME;
	}

	@Override
	public String toString() {
		return "BubbleSortUP [NAME=" + NAME + ", ogList=" + savedData + ", numElements=" + numElements
				+ ", numComparisons=" + numComparisons + ", numSwaps=" + numSwaps + ", runTimeSeconds=" + runTimeSeconds
				+ "]";
	}

}
