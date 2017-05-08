import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class TestingTester {
	private ArrayList<Integer> sortedArray = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	private final String SORTEDARRAYSTR = "1 2 3 4 5 6 7 8 9 10 ";
	private ArrayList<Integer> unsortedArray = new ArrayList<>(Arrays.asList(5, 1, 10, 2, 9, 3, 7, 6, 4, 8));
	private final String UNSORTEDARRAYSTR = "5 1 10 2 9 3 7 6 4 8 ";

	/*
	 * Testing Sorting Methods
	 */
	@Test
	public void bubbleUpSortTest() {
		// Making a Sorting Type and sorting it
		BubbleSortUP<Integer> tempTest1 = new BubbleSortUP<>(unsortedArray);
		tempTest1.sort();// tempTest1 should be sorted and ready to compare
		// Making String to compare the string
		StringBuilder finalBUPArray = new StringBuilder();
		for (int i = 0; i < tempTest1.getSortedData().size(); i++) {
			finalBUPArray.append(tempTest1.getSortedData().get(i) + " ");
		}
		// Checking Equality
		assertEquals("ArrayList Not Equal", SORTEDARRAYSTR, finalBUPArray.toString());
	}

	@Test
	public void bubbleOpSortTest() {
		// Making a Sorting Type and sorting it
		BubbleSortOP<Integer> tempTest2 = new BubbleSortOP<>(unsortedArray);
		tempTest2.sort();// tempTest1 should be sorted and ready to compare
		// Making String to compare the string
		StringBuilder finalBOPArray = new StringBuilder();
		for (int i = 0; i < tempTest2.getSortedData().size(); i++) {
			finalBOPArray.append(tempTest2.getSortedData().get(i) + " ");
		}
		// Checking Equality
		assertEquals("ArrayList Not Equal", SORTEDARRAYSTR, finalBOPArray.toString());
	}

	@Test
	public void selectionSortTest() {
		// Making a Sorting Type and sorting it
		SelectionSort<Integer> tempTest3 = new SelectionSort<>(unsortedArray);
		tempTest3.sort();// tempTest1 should be sorted and ready to compare
		// Making String to compare the string
		StringBuilder finalSelArray = new StringBuilder();
		for (int i = 0; i < tempTest3.getSortedData().size(); i++) {
			finalSelArray.append(tempTest3.getSortedData().get(i) + " ");
		}
		// Checking Equality
		assertEquals("ArrayList Not Equal", SORTEDARRAYSTR, finalSelArray.toString());
	}

	@Test
	public void insertionSortUpSortTest() {
		// Making a Sorting Type and sorting it
		InsertionSort<Integer> tempTest4 = new InsertionSort<>(unsortedArray);
		tempTest4.sort();// tempTest1 should be sorted and ready to compare
		// Making String to compare the string
		StringBuilder finalInsArray = new StringBuilder();
		for (int i = 0; i < tempTest4.getSortedData().size(); i++) {
			finalInsArray.append(tempTest4.getSortedData().get(i) + " ");
		}
		// Checking Equality
		assertEquals("ArrayList Not Equal", SORTEDARRAYSTR, finalInsArray.toString());
	}

	@Test
	public void mergeSortUpSortTest() {
		// Making a Sorting Type and sorting it
		MergeSort<Integer> tempTest5 = new MergeSort<>(unsortedArray);
		tempTest5.sort();// tempTest1 should be sorted and ready to compare
		// Making String to compare the string
		StringBuilder finalMerArray = new StringBuilder();
		for (int i = 0; i < tempTest5.getSortedData().size(); i++) {
			finalMerArray.append(tempTest5.getSortedData().get(i) + " ");
		}
		// Checking Equality
		assertEquals("ArrayList Not Equal", SORTEDARRAYSTR, finalMerArray.toString());
	}

	@Test
	public void quickSortTest() {
		// Making a Sorting Type and sorting it
		QuickSort<Integer> tempTest6 = new QuickSort<>(unsortedArray);
		tempTest6.sort();// tempTest1 should be sorted and ready to compare
		// Making String to compare the string
		StringBuilder finalQuiArray = new StringBuilder();
		for (int i = 0; i < tempTest6.getSortedData().size(); i++) {
			finalQuiArray.append(tempTest6.getSortedData().get(i) + " ");
		}
		// Checking Equality
		assertEquals("ArrayList Not Equal", SORTEDARRAYSTR, finalQuiArray.toString());
	}

	@Test
	public void countingSortTest() {
		// Making a Sorting Type and sorting it
		CountingSort tempTest7 = new CountingSort(unsortedArray);
		tempTest7.sort();// tempTest1 should be sorted and ready to compare
		// Making String to compare the string
		StringBuilder finalCouArray = new StringBuilder();
		for (int i = 0; i < tempTest7.getSortedData().length; i++) {
			finalCouArray.append(tempTest7.getSortedData()[i] + " ");
		}
		// Checking Equality
		assertEquals("ArrayList Not Equal", SORTEDARRAYSTR, finalCouArray.toString());
	}

	@Test
	public void radixUpSortTest() {
		// Making a Sorting Type and sorting it
		RadixSort tempTest8 = new RadixSort(unsortedArray);
		tempTest8.sort();// tempTest1 should be sorted and ready to compare
		// Making String to compare the string
		StringBuilder finalRadArray = new StringBuilder();
		for (int i = 0; i < tempTest8.getSortedData().size(); i++) {
			finalRadArray.append(tempTest8.getSortedData().get(i) + " ");
		}
		// Checking Equality
		assertEquals("ArrayList Not Equal", SORTEDARRAYSTR, finalRadArray.toString());
	}

	@Test
	public void oddEvenSortTest() {
		// Making a Sorting Type and sorting it
		OddEvenSort<Integer> tempTest9 = new OddEvenSort<>(unsortedArray);
		tempTest9.sort();// tempTest1 should be sorted and ready to compare
		// Making String to compare the string
		StringBuilder finalODEArray = new StringBuilder();
		for (int i = 0; i < tempTest9.getSortedData().size(); i++) {
			finalODEArray.append(tempTest9.getSortedData().get(i) + " ");
		}
		// Checking Equality
		assertEquals("ArrayList Not Equal", SORTEDARRAYSTR, finalODEArray.toString());
	}

	@Test
	public void gnomeSortTest() {
		// Making a Sorting Type and sorting it
		GnomeSort<Integer> tempTest10 = new GnomeSort<>(unsortedArray);
		tempTest10.sort();// tempTest1 should be sorted and ready to compare
		// Making String to compare the string
		StringBuilder finalGnoArray = new StringBuilder();
		for (int i = 0; i < tempTest10.getSortedData().size(); i++) {
			finalGnoArray.append(tempTest10.getSortedData().get(i) + " ");
		}
		// Checking Equality
		assertEquals("ArrayList Not Equal", SORTEDARRAYSTR, finalGnoArray.toString());
	}

	/*
	 * Test Unsorted Data
	 */
	@Test
	public void bubbleUpUnSortTest() {
		// Making a Sorting Type and sorting it
		BubbleSortUP<Integer> tempTest1 = new BubbleSortUP<>(unsortedArray);
		tempTest1.sort();// tempTest1 should be sorted and ready to compare
		// Making String to compare the string
		StringBuilder finalBUPArray = new StringBuilder();
		for (int i = 0; i < tempTest1.getSortedData().size(); i++) {
			finalBUPArray.append(tempTest1.getUnSortedData().get(i) + " ");
		}
		// Checking Equality
		assertEquals("ArrayList Not Equal", UNSORTEDARRAYSTR, finalBUPArray.toString());
	}

	@Test
	public void bubbleOpUnSortTest() {
		// Making a Sorting Type and sorting it
		BubbleSortOP<Integer> tempTest2 = new BubbleSortOP<>(unsortedArray);
		tempTest2.sort();// tempTest1 should be sorted and ready to compare
		// Making String to compare the string
		StringBuilder finalBOPArray = new StringBuilder();
		for (int i = 0; i < tempTest2.getSortedData().size(); i++) {
			finalBOPArray.append(tempTest2.getUnSortedData().get(i) + " ");
		}
		// Checking Equality
		assertEquals("ArrayList Not Equal", UNSORTEDARRAYSTR, finalBOPArray.toString());
	}

	@Test
	public void selectionUnSortTest() {
		// Making a Sorting Type and sorting it
		SelectionSort<Integer> tempTest3 = new SelectionSort<>(unsortedArray);
		tempTest3.sort();// tempTest1 should be sorted and ready to compare
		// Making String to compare the string
		StringBuilder finalSelArray = new StringBuilder();
		for (int i = 0; i < tempTest3.getSortedData().size(); i++) {
			finalSelArray.append(tempTest3.getUnSortedData().get(i) + " ");
		}
		// Checking Equality
		assertEquals("ArrayList Not Equal", UNSORTEDARRAYSTR, finalSelArray.toString());
	}

	@Test
	public void insertionUnSortTest() {
		// Making a Sorting Type and sorting it
		InsertionSort<Integer> tempTest4 = new InsertionSort<>(unsortedArray);
		tempTest4.sort();// tempTest1 should be sorted and ready to compare
		// Making String to compare the string
		StringBuilder finalInsArray = new StringBuilder();
		for (int i = 0; i < tempTest4.getSortedData().size(); i++) {
			finalInsArray.append(tempTest4.getUnSortedData().get(i) + " ");
		}
		// Checking Equality
		assertEquals("ArrayList Not Equal", UNSORTEDARRAYSTR, finalInsArray.toString());
	}

	@Test
	public void mergeUnSortTest() {
		// Making a Sorting Type and sorting it
		MergeSort<Integer> tempTest5 = new MergeSort<>(unsortedArray);
		tempTest5.sort();// tempTest1 should be sorted and ready to compare
		// Making String to compare the string
		StringBuilder finalMerArray = new StringBuilder();
		for (int i = 0; i < tempTest5.getSortedData().size(); i++) {
			finalMerArray.append(tempTest5.getUnSortedData().get(i) + " ");
		}
		// Checking Equality
		assertEquals("ArrayList Not Equal", UNSORTEDARRAYSTR, finalMerArray.toString());
	}

	@Test
	public void quickUnSortTest() {
		// Making a Sorting Type and sorting it
		QuickSort<Integer> tempTest6 = new QuickSort<>(unsortedArray);
		tempTest6.sort();// tempTest1 should be sorted and ready to compare
		// Making String to compare the string
		StringBuilder finalQuiArray = new StringBuilder();
		for (int i = 0; i < tempTest6.getSortedData().size(); i++) {
			finalQuiArray.append(tempTest6.getUnSortedData().get(i) + " ");
		}
		// Checking Equality
		assertEquals("ArrayList Not Equal", UNSORTEDARRAYSTR, finalQuiArray.toString());
	}

	@Test
	public void countingUnSortTest() {
		// Making a Sorting Type and sorting it
		CountingSort tempTest7 = new CountingSort(unsortedArray);
		tempTest7.sort();// tempTest1 should be sorted and ready to compare
		// Making String to compare the string
		StringBuilder finalCouArray = new StringBuilder();
		for (int i = 0; i < tempTest7.getSortedData().length; i++) {
			finalCouArray.append(tempTest7.getUnSortedData()[i] + " ");
		}
		// Checking Equality
		assertEquals("ArrayList Not Equal", UNSORTEDARRAYSTR, finalCouArray.toString());
	}

	@Test
	public void radixUnSortTest() {
		// Making a Sorting Type and sorting it
		RadixSort tempTest8 = new RadixSort(unsortedArray);
		tempTest8.sort();// tempTest1 should be sorted and ready to compare
		// Making String to compare the string
		StringBuilder finalRadArray = new StringBuilder();
		for (int i = 0; i < tempTest8.getSortedData().size(); i++) {
			finalRadArray.append(tempTest8.getUnSortedData().get(i) + " ");
		}
		// Checking Equality
		assertEquals("ArrayList Not Equal", UNSORTEDARRAYSTR, finalRadArray.toString());
	}

	@Test
	public void oddEvenUnSortTest() {
		// Making a Sorting Type and sorting it
		OddEvenSort<Integer> tempTest9 = new OddEvenSort<>(unsortedArray);
		tempTest9.sort();// tempTest1 should be sorted and ready to compare
		// Making String to compare the string
		StringBuilder finalODEArray = new StringBuilder();
		for (int i = 0; i < tempTest9.getSortedData().size(); i++) {
			finalODEArray.append(tempTest9.getUnSortedData().get(i) + " ");
		}
		// Checking Equality
		assertEquals("ArrayList Not Equal", UNSORTEDARRAYSTR, finalODEArray.toString());
	}

	@Test
	public void gnomeUnSortTest() {
		// Making a Sorting Type and sorting it
		GnomeSort<Integer> tempTest10 = new GnomeSort<>(unsortedArray);
		tempTest10.sort();// tempTest1 should be sorted and ready to compare
		// Making String to compare the string
		StringBuilder finalGnoArray = new StringBuilder();
		for (int i = 0; i < tempTest10.getSortedData().size(); i++) {
			finalGnoArray.append(tempTest10.getUnSortedData().get(i) + " ");
		}
		// Checking Equality
		assertEquals("ArrayList Not Equal", UNSORTEDARRAYSTR, finalGnoArray.toString());
	}

	/*
	 * Testing All Sorted Arrays
	 */
	@Test
	public void allSortedArrayTester() {
		BubbleSortUP<Integer> bubUp = new BubbleSortUP<>(unsortedArray);
		BubbleSortOP<Integer> bubOp = new BubbleSortOP<>(unsortedArray);
		SelectionSort<Integer> selec = new SelectionSort<>(unsortedArray);
		InsertionSort<Integer> inser = new InsertionSort<>(unsortedArray);
		MergeSort<Integer> merge = new MergeSort<>(unsortedArray);
		QuickSort<Integer> quick = new QuickSort<>(unsortedArray);
		CountingSort<Integer> count = new CountingSort<>(unsortedArray);
		RadixSort radix = new RadixSort(unsortedArray);
		OddEvenSort<Integer> oddevn = new OddEvenSort<>(unsortedArray);
		GnomeSort<Integer> gnome = new GnomeSort<>(unsortedArray);
		String s1 = bubUp.getSortedData().toString();
		String s2 = bubOp.getSortedData().toString();
		String s3 = selec.getSortedData().toString();
		String s4 = inser.getSortedData().toString();
		String s5 = merge.getSortedData().toString();
		String s6 = quick.getSortedData().toString();
		String s8 = radix.getSortedData().toString();
		String s9 = oddevn.getSortedData().toString();
		String s10 = gnome.getSortedData().toString();
		boolean test1 = s1.equals(s2);
		boolean test2 = s1.equals(s3);
		boolean test3 = s1.equals(s4);
		boolean test4 = s1.equals(s5);
		boolean test5 = s1.equals(s6);
		boolean test6 = s1.equals(s6);
		boolean test7 = s1.equals(s8);
		boolean test8 = s1.equals(s9);
		boolean test9 = s1.equals(s9);
		boolean test10 = s1.equals(s10);
		// if one is not true then all them might not have the same Sorted Array
		boolean mainTest = (test1 && test2 && test3 && test4 && test5 && test6 && test7 && test8 && test9
				&& test10) == true;

		assertTrue("All Sorts are equal", mainTest);

	}

	/*
	 * Testing Swapping
	 */
	@Test
	public void bubbleUpSwapTest() {
		// Making a Sorting Type and sorting it
		BubbleSortUP<Integer> tempTest1 = new BubbleSortUP<>(unsortedArray);
		tempTest1.sort();// tempTest1 should be sorted and ready to compare
		String finalSwaps = "" + tempTest1.getNumSwaps();

		// Checking Equality
		assertEquals("Swaps Are Equal", "19", finalSwaps);
	}

	@Test
	public void bubbleOpSwapTest() {
		// Making a Sorting Type and sorting it
		BubbleSortOP<Integer> tempTest2 = new BubbleSortOP<>(unsortedArray);
		tempTest2.sort();// tempTest1 should be sorted and ready to compare
		String finalSwaps = "" + tempTest2.getNumSwaps();

		// Checking Equality
		assertEquals("Swaps are Equal", "19", finalSwaps);
	}

	@Test
	public void selectionSwapTest() {
		// Making a Sorting Type and sorting it
		SelectionSort<Integer> tempTest3 = new SelectionSort<>(unsortedArray);
		tempTest3.sort();// tempTest1 should be sorted and ready to compare
		String finalSwaps = "" + tempTest3.getNumSwaps();

		// Checking Equality
		assertEquals("Swaps are equal", "10", finalSwaps);
	}

	@Test
	public void insertionSwapTest() {
		// Making a Sorting Type and sorting it
		InsertionSort<Integer> tempTest4 = new InsertionSort<>(unsortedArray);
		tempTest4.sort();// tempTest1 should be sorted and ready to compare
		String finalSwaps = "" + tempTest4.getNumSwaps();

		// Checking Equality
		assertEquals("Swaps are equal", "10", finalSwaps);
	}

	@Test
	public void mergeSwapTest() {
		// Making a Sorting Type and sorting it
		MergeSort<Integer> tempTest5 = new MergeSort<>(unsortedArray);
		tempTest5.sort();// tempTest1 should be sorted and ready to compare
		String finalSwaps = "" + tempTest5.getNumSwaps();

		// Checking Equality
		assertEquals("Swaps are equal", "0", finalSwaps);
	}

	@Test
	public void quickSwapTest() {
		// Making a Sorting Type and sorting it
		QuickSort<Integer> tempTest6 = new QuickSort<>(unsortedArray);
		tempTest6.sort();// tempTest1 should be sorted and ready to compare
		String finalSwaps = "" + tempTest6.getNumSwaps();

		// Checking Equality
		assertEquals("Swaps are equal", "76", finalSwaps);
	}

	@Test
	public void countingSwapTest() {
		// Making a Sorting Type and sorting it
		CountingSort tempTest7 = new CountingSort(unsortedArray);
		tempTest7.sort();// tempTest1 should be sorted and ready to compare
		String finalSwaps = "" + tempTest7.getNumSwaps();

		// Checking Equality
		assertEquals("Swaps Are Equal", "0", finalSwaps);
	}

	@Test
	public void radixSwapTest() {
		// Making a Sorting Type and sorting it
		RadixSort tempTest8 = new RadixSort(unsortedArray);
		tempTest8.sort();// tempTest1 should be sorted and ready to compare
		String finalSwaps = "" + tempTest8.getNumSwaps();

		// Checking Equality
		assertEquals("Swaps are Equal", "0", finalSwaps);
	}

	@Test
	public void oddEvenSwapTest() {
		// Making a Sorting Type and sorting it
		OddEvenSort<Integer> tempTest9 = new OddEvenSort<>(unsortedArray);
		tempTest9.sort();// tempTest1 should be sorted and ready to compare
		String finalSwaps = "" + tempTest9.getNumSwaps();

		// Checking Equality
		assertEquals("Swaps are Equal", "19", finalSwaps);
	}

	@Test
	public void gnomeSwapTest() {
		// Making a Sorting Type and sorting it
		GnomeSort<Integer> tempTest10 = new GnomeSort<>(unsortedArray);
		tempTest10.sort();// tempTest1 should be sorted and ready to compare
		String finalSwaps = "" + tempTest10.getNumSwaps();

		// Checking Equality
		assertEquals("Swaps are Equal", "19", finalSwaps);
	}

	/*
	 * Testing Comparison
	 */
	@Test
	public void bubbleUpCompTest() {
		// Making a Sorting Type and sorting it
		BubbleSortUP<Integer> tempTest1 = new BubbleSortUP<>(unsortedArray);
		tempTest1.sort();// tempTest1 should be sorted and ready to compare
		String finalCompa = "" + tempTest1.getNumComparisons();

		// Checking Equality
		assertEquals("Comp Are Equal", "162", finalCompa);
	}

	@Test
	public void bubbleOpCompTest() {
		// Making a Sorting Type and sorting it
		BubbleSortOP<Integer> tempTest2 = new BubbleSortOP<>(unsortedArray);
		tempTest2.sort();// tempTest1 should be sorted and ready to compare
		String finalCompa = "" + tempTest2.getNumComparisons();

		// Checking Equality
		assertEquals("Comp Are Equal", "63", finalCompa);
	}

	@Test
	public void selectionCompTest() {
		// Making a Sorting Type and sorting it
		SelectionSort<Integer> tempTest3 = new SelectionSort<>(unsortedArray);
		tempTest3.sort();// tempTest1 should be sorted and ready to compare
		String finalCompa = "" + tempTest3.getNumComparisons();

		// Checking Equality
		assertEquals("Comp Are Equal", "45", finalCompa);
	}

	@Test
	public void insertionCompTest() {
		// Making a Sorting Type and sorting it
		InsertionSort<Integer> tempTest4 = new InsertionSort<>(unsortedArray);
		tempTest4.sort();// tempTest1 should be sorted and ready to compare
		String finalCompa = "" + tempTest4.getNumComparisons();

		// Checking Equality
		assertEquals("Comp Are Equal", "0", finalCompa);
	}

	@Test
	public void mergeCompTest() {
		// Making a Sorting Type and sorting it
		MergeSort<Integer> tempTest5 = new MergeSort<>(unsortedArray);
		tempTest5.sort();// tempTest1 should be sorted and ready to compare
		String finalCompa = "" + tempTest5.getNumComparisons();

		// Checking Equality
		assertEquals("Comp Are Equal", "43", finalCompa);
	}

	@Test
	public void quickCompTest() {
		// Making a Sorting Type and sorting it
		QuickSort<Integer> tempTest6 = new QuickSort<>(unsortedArray);
		tempTest6.sort();// tempTest1 should be sorted and ready to compare
		String finalCompa = "" + tempTest6.getNumComparisons();

		// Checking Equality
		assertEquals("Comp Are Equal", "67", finalCompa);
	}

	@Test
	public void countingCompTest() {
		// Making a Sorting Type and sorting it
		CountingSort tempTest7 = new CountingSort(unsortedArray);
		tempTest7.sort();// tempTest1 should be sorted and ready to compare
		String finalCompa = "" + tempTest7.getNumComparisons();

		// Checking Equality
		assertEquals("Comp Are Equal", "0", finalCompa);
	}

	@Test
	public void radixCompTest() {
		// Making a Sorting Type and sorting it
		RadixSort tempTest8 = new RadixSort(unsortedArray);
		tempTest8.sort();// tempTest1 should be sorted and ready to compare
		String finalCompa = "" + tempTest8.getNumComparisons();

		// Checking Equality
		assertEquals("Comp Are Equal", "0", finalCompa);
	}

	@Test
	public void oddEvenCompTest() {
		// Making a Sorting Type and sorting it
		OddEvenSort<Integer> tempTest9 = new OddEvenSort<>(unsortedArray);
		tempTest9.sort();// tempTest1 should be sorted and ready to compare
		String finalCompa = "" + tempTest9.getNumComparisons();

		// Checking Equality
		assertEquals("Comp Are Equal", "90", finalCompa);
	}

	@Test
	public void gnomeCompTest() {
		// Making a Sorting Type and sorting it
		GnomeSort<Integer> tempTest10 = new GnomeSort<>(unsortedArray);
		tempTest10.sort();// tempTest1 should be sorted and ready to compare
		String finalCompa = "" + tempTest10.getNumComparisons();

		// Checking Equality
		assertEquals("Comp Are Equal", "55", finalCompa);
	}
}
