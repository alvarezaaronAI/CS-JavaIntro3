import java.util.ArrayList;

public class SortingTester {
	public static void main(String[] args) {
		ArrayList<Double> test1BS = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			int randomVal = 0 + (int) (Math.random() * (20 + 0 + 1));
			test1BS.add((double) randomVal);
		}
		//Problems printing out half way
		//BubbleSortUP<Integer> test1 = new BubbleSortUP<>(20);
		System.out.println();
		BubbleSortUP<Double> test2 = new BubbleSortUP<>(test1BS);
		System.out.println(test2.sort());
		System.out.println(test2.getNAME());
		System.out.println(test2.getSavedData());
		System.out.println(test2.getSortedData());
		System.out.println(test2.getRunTime());
		System.out.println(test2.getNumElements());
	}
}
