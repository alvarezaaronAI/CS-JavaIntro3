import java.util.ArrayList;
import java.util.Arrays;

public class SortingTester {
	public static void main(String[] args) {
		ArrayList<Double> test1BS = new ArrayList<>();
		for (int i = 0; i <= 100; i++) {
			int randomVal = 0 + (int) (Math.random() * (100 + 0 + 1));
			test1BS.add((double) randomVal);
		}
		int[] test2BS = new int[100];
		for (int i = 0; i < 100; i++) {
			int randomVal = 0 + (int) (Math.random() * (100 + 0 + 1));
			test2BS[i] = randomVal;
		}
		
		BubbleSortUP<Double> test2 = new BubbleSortUP<>(test1BS);
		System.out.println(test2.getNAME());
		System.out.println(test2.sort());
		System.out.println(test2.getUnSortedData());
		System.out.println(test2.getSortedData());
		System.out.println("Time " + test2.getRunTime());
		System.out.println("Num of swaps" + test2.getNumSwaps());
		System.out.println("Num of comparisons" + test2.getNumComparisons());
		System.out.println("Num of elements" + test2.getNumElements());
		
		System.out.println();
		System.out.println();
		
		BubbleSortOP<Double> test3 = new BubbleSortOP<>(test1BS);
		System.out.println(test3.getNAME());
		System.out.println(test3.sort());
		System.out.println(test3.getUnSortedData());
		System.out.println(test3.getSortedData());
		System.out.println("Time " + test3.getRunTime());
		System.out.println("Num of swaps" + test3.getNumSwaps());
		System.out.println("Num of comparisons" + test3.getNumComparisons());
		System.out.println("Num of elements" + test3.getNumElements());
		
		System.out.println();
		System.out.println();
		
		SelectionSort<Double> test4 = new SelectionSort<>(test1BS);
		System.out.println(test4.getNAME());
		System.out.println(test4.sort());
		System.out.println(test4.getUnSortedData());
		System.out.println(test4.getSortedData());
		System.out.println("Time " + test4.getRunTime());
		System.out.println("Num of swaps" + test4.getNumSwaps());
		System.out.println("Num of comparisons" + test4.getNumComparisons());
		System.out.println("Num of elements" + test4.getNumElements());
		
		System.out.println();
		System.out.println();
		
		InsertionSort<Double> test5 = new InsertionSort<>(test1BS);
		System.out.println(test5.getNAME());
		System.out.println(test5.sort());
		System.out.println(test5.getUnSortedData());
		System.out.println(test5.getSortedData());
		System.out.println("Time " + test5.getRunTime());
		System.out.println("Num of swaps" + test5.getNumSwaps());
		System.out.println("Num of comparisons" + test5.getNumComparisons());
		System.out.println("Num of elements" + test5.getNumElements());
		
		System.out.println();
		System.out.println();
		
		MergeSort<Double> test6 = new MergeSort<>(test1BS);
		System.out.println(test6.getNAME());
		System.out.println(test6.sort());
		System.out.println(test6.getUnSortedData());
		System.out.println(test6.getSortedData());
		System.out.println("Time " + test6.getRunTime());
		System.out.println("Num of swaps" + test6.getNumSwaps());
		System.out.println("Num of comparisons" + test6.getNumComparisons());
		System.out.println("Num of elements" + test6.getNumElements());
		
		System.out.println();
		System.out.println();
		
		QuickSort<Double> test7 = new QuickSort<>(test1BS);
		System.out.println(test7.getNAME());
		System.out.println(test7.sort());
		System.out.println(test7.getUnSortedData());
		System.out.println(test7.getSortedData());
		System.out.println("Time " + test7.getRunTime());
		System.out.println("Num of swaps" + test7.getNumSwaps());
		System.out.println("Num of comparisons" + test7.getNumComparisons());
		System.out.println("Num of elements" + test7.getNumElements());

		System.out.println();
		System.out.println();
	
		CountingSort test8 = new CountingSort(test2BS);
		System.out.println(test8.getNAME());
		System.out.println(Arrays.toString(test8.sort()));
		System.out.println(Arrays.toString(test8.getUnSortedData()));
		System.out.println(Arrays.toString(test8.getSortedData()));
		System.out.println("Time " + test8.getRunTime());
		System.out.println("Num of swaps" + test8.getNumSwaps());
		System.out.println("Num of comparisons" + test8.getNumComparisons());
		System.out.println("Num of elements" + test8.getNumElements());
		
	}
	
}
