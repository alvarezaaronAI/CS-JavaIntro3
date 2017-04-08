import java.util.ArrayList;

public class SortingTester {
	public static void main(String[] args) {
		ArrayList<Double> test1BS = new ArrayList<>();
		for (int i = 0; i < 40; i++) {
			int randomVal = 0 + (int) (Math.random() * (40 + 0 + 1));
			test1BS.add((double) randomVal);
		}
		BubbleSortUP<Integer> test1 = new BubbleSortUP<>(1000);
		
		System.out.println(test1.getSavedData());
	}
}
