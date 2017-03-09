/*Aaron Alvarez
Main Test Somewhat the Link
3/9/17*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("What is the path to your file? ");
		Scanner in = new Scanner(System.in);
		String fileInput = in.nextLine();
		File fileIn = new File(fileInput);
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