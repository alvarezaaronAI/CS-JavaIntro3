import java.util.ArrayList;

public class SortingTester {
	public static void main(String[] args) {
		ArrayList<Double> test1BS = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			int randomVal = 0 + (int) (Math.random() * (100 + 0 + 1));
			test1BS.add((double) randomVal);
		}
		System.out.println();
		BubbleSortUP<Double> test2 = new BubbleSortUP<>(test1BS);
		System.out.println(test2.sort());
		System.out.println(test2.getNAME());
		System.out.println(test2.getUnSortedData());
		System.out.println(test2.getSortedData());
		System.out.println("Time " + test2.getRunTime());
		System.out.println("Num of swaps" + test2.getNumSwaps());
		System.out.println("Num of comparisons" + test2.getNumComparisons());
		System.out.println("Num of elements" + test2.getNumElements());
	}
	
}
