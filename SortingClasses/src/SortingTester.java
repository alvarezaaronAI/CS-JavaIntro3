import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SortingTester {
	public static void main(String[] args) {
		ArrayList<Integer> test1BS = new ArrayList<>();
		for (int i = 0; i < 11; i++) {
			int randomVal = 0 + (int) (Math.random() * (10 + 0 + 1));
			test1BS.add(randomVal);
		}

		BubbleSortUP<Integer> test2 = new BubbleSortUP<>(test1BS);
		System.out.println(test2.getNAME());
		test2.sort();
		System.out.println(test2.getUnSortedData());
		System.out.println(test2.getSortedData());
		System.out.println("Time " + test2.getRunTime());
		System.out.println("Num of swaps" + test2.getNumSwaps());
		System.out.println("Num of comparisons" + test2.getNumComparisons());
		System.out.println("Num of elements" + test2.getNumElements());

		System.out.println();
		System.out.println();

		BubbleSortOP<Integer> test3 = new BubbleSortOP<>(test1BS);
		System.out.println(test3.getNAME());
		test3.sort();
		System.out.println(test3.getUnSortedData());
		System.out.println(test3.getSortedData());
		System.out.println("Time " + test3.getRunTime());
		System.out.println("Num of swaps" + test3.getNumSwaps());
		System.out.println("Num of comparisons" + test3.getNumComparisons());
		System.out.println("Num of elements" + test3.getNumElements());

		System.out.println();
		System.out.println();

		SelectionSort<Integer> test4 = new SelectionSort<>(test1BS);
		System.out.println(test4.getNAME());
		test4.sort();
		System.out.println(test4.getUnSortedData());
		System.out.println(test4.getSortedData());
		System.out.println("Time " + test4.getRunTime());
		System.out.println("Num of swaps" + test4.getNumSwaps());
		System.out.println("Num of comparisons" + test4.getNumComparisons());
		System.out.println("Num of elements" + test4.getNumElements());

		System.out.println();
		System.out.println();

		InsertionSort<Integer> test5 = new InsertionSort<>(test1BS);
		System.out.println(test5.getNAME());
		test5.sort();
		System.out.println(test5.getUnSortedData());
		System.out.println(test5.getSortedData());
		System.out.println("Time " + test5.getRunTime());
		System.out.println("Num of swaps" + test5.getNumSwaps());
		System.out.println("Num of comparisons" + test5.getNumComparisons());
		System.out.println("Num of elements" + test5.getNumElements());

		System.out.println();
		System.out.println();

		MergeSort<Integer> test6 = new MergeSort<>(test1BS);
		System.out.println(test6.getNAME());
		test6.sort();
		System.out.println(test6.getUnSortedData());
		System.out.println(test6.getSortedData());
		System.out.println("Time " + test6.getRunTime());
		System.out.println("Num of swaps" + test6.getNumSwaps());
		System.out.println("Num of comparisons" + test6.getNumComparisons());
		System.out.println("Num of elements" + test6.getNumElements());

		System.out.println();
		System.out.println();

		QuickSort<Integer> test7 = new QuickSort<>(test1BS);
		System.out.println(test7.getNAME());
		test7.sort();
		System.out.println(test7.getUnSortedData());
		System.out.println(test7.getSortedData());
		System.out.println("Time " + test7.getRunTime());
		System.out.println("Num of swaps" + test7.getNumSwaps());
		System.out.println("Num of comparisons" + test7.getNumComparisons());
		System.out.println("Num of elements" + test7.getNumElements());

		System.out.println();
		System.out.println();

		CountingSort test8 = new CountingSort(test1BS);
		System.out.println(test8.getNAME());
		test8.sort();
		System.out.println(Arrays.toString(test8.getUnSortedData()));
		System.out.println(Arrays.toString(test8.getSortedData()));
		System.out.println("Time " + test8.getRunTime());
		System.out.println("Num of elements" + test8.getNumElements());

		System.out.println();
		System.out.println();

		RadixSort test9 = new RadixSort(test1BS);
		System.out.println(test9.getNAME());
		test9.sort();
		System.out.println(test9.getUnSortedData());
		System.out.println(test9.getSortedData());
		System.out.println("Time " + test9.getRunTime());
		System.out.println("Num of elements" + test9.getNumElements());

		System.out.println();
		System.out.println();

		OddEvenSort<Integer> test10 = new OddEvenSort<>(test1BS);
		System.out.println(test10.getNAME());
		test10.sort();
		System.out.println(test10.getUnSortedData());
		System.out.println(test10.getSortedData());
		System.out.println("Num of swaps" + test10.getNumSwaps());
		System.out.println("Num of comparisons" + test10.getNumComparisons());
		System.out.println("Time " + test10.getRunTime());
		System.out.println("Num of elements" + test10.getNumElements());

		System.out.println();
		System.out.println();

		GnomeSort<Integer> test11 = new GnomeSort<>(test1BS);
		System.out.println(test11.getNAME());
		test11.sort();
		System.out.println(test11.getUnSortedData());
		System.out.println(test11.getSortedData());
		System.out.println("Num of swaps" + test11.getNumSwaps());
		System.out.println("Num of comparisons" + test11.getNumComparisons());
		System.out.println("Time " + test11.getRunTime());
		System.out.println("Num of elements" + test11.getNumElements());

	}

}
