import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		File fileIn = new File("C:\\Users\\alvar\\Desktop\\TestFile.txt");
//		fileIn.exists();
//		System.out.println(fileIn.getAbsolutePath());
//		Scanner in = new Scanner(fileIn);
//		String stringCat1 = " " + in.nextLine();
//		String stringCat2 = " " + in.nextLine();
//		String stringCat3 = " " + in.nextLine();
//		System.out.println(stringCat1 + stringCat2 + stringCat3);
//		in.nextLine();
//		while (in.hasNext()) {
//			String usersNodes = in.nextLine();
//			System.out.println(usersNodes);
//			String[] split = usersNodes.split(", ");
//
//			System.out.println(Arrays.toString(split));
//			
//		}
		LinkedList<Integer, String, String> test1Pre = new LinkedList<>(fileIn, 5);
	}
}