import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

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
	private Duration runTime = null;

	/*
	 * Constructor, given any ArrayList Type.
	 */
	// This will automatically create an ArrayList of n random integers only.
	public BubbleSortUP(int sizeOfArrayIn) {
		//ArrayList that store the original list 
		ArrayList<Integer> randomArrayList = new ArrayList<>();
		//ArrayList that stores the original list no sorting what so ever
		ArrayList<Integer> copyArrayList = new ArrayList<>();
		for (int i = 0; i < sizeOfArrayIn; i++) {
			int randomVal = 0 + (int) (Math.random() * (sizeOfArrayIn + 0 + 1));
			randomArrayList.add(randomVal);
			copyArrayList.add(randomVal);
		}
		//setting up everything for the user
		Instant start = Instant.now();
		this.sortedData = sort((ArrayList<T>) randomArrayList);
		Instant end = Instant.now();
		this.savedData = (ArrayList<T>) copyArrayList;
		this.runTime = Duration.between(start, end);
		this.numElements = randomArrayList.size();
		// ----------EraseAfterThisIsOnlyForTestingPurposes------------
		System.out.println("TestingPurposes1");
		System.out.println("This is the ArrayList That was Created");
		System.out.println("Non Sorted");
		consolePrintOut(this.savedData);
		System.out.println("Sorted");
		consolePrintOut(this.sortedData);
		System.out.println("Sorting Took " + runTime + "amount of time.");
		// -------------------------------------------------------------
	}

	// This will sort out the given ArrayList of any type.
	public BubbleSortUP(ArrayList<T> arrayIn) {
		ArrayList<T> copyArrayList = new ArrayList<>();
		for (int i = 0; i < arrayIn.size(); i++) {
			copyArrayList.add(arrayIn.get(i));
		}
		Instant start = Instant.now();
		this.sortedData = sort(arrayIn);
		Instant end = Instant.now();
		this.savedData = copyArrayList;
		this.runTime = Duration.between(start, end);
		this.numElements = this.sortedData.size();
		// ----------EraseAfterThisIsOnlyForTestingPurposes------------
		System.out.println("TestingPurposes2");
		System.out.println("This is the ArrayList You Created");
		System.out.println("Non Sorted");
		consolePrintOut(this.savedData);
		System.out.println("Sorted");
		consolePrintOut(this.sortedData);
		System.out.println("Sorting Took " + runTime + "amount of time.");
		// -------------------------------------------------------------
	}

	/*
	 * Methods That Will Do The Sorting
	 */
	// This will Sort out a array list of any type
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
		this.sortedData = arrayListInput;
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
		return "BubbleSortUP [NAME=" + NAME + ", savedData=" + savedData + ", sortedData=" + sortedData
				+ ", numElements=" + numElements + ", numComparisons=" + numComparisons + ", numSwaps=" + numSwaps
				+ ", runTimeSeconds=" + runTime + "]";
	}

}
