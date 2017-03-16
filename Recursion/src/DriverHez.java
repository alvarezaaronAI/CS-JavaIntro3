/*Aaron ALvarez
Feb 8th, 2017
Driver class that runs the solver method all by just calling one method.*/

import java.util.Scanner;
public class DriverHez {
	public static void main(String[] args) {
		
		HexagonPattern puzzle1 = new HexagonPattern();
		Scanner in = new Scanner(System.in);
		System.out.println(
		"EX: Format that only support by my program "
		+ "\n Number(Space)Color,Color,Color,Color,Color,Color"
		+ "\n1 PPBGOY \n2 GGGGGG\n3 PPPPPP\n4 ROYGBP\n5 PROYGB\n6 GOGYGB\n7 BGPPOR");
		System.out.println("Please Enter the file that contains the Hexagon information.");
		try {
			puzzle1.createHexaArrayList("HexagonExample1.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}