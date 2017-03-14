/*Aaron Alvare
Feb 15 2017
Driver for Shapes*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		Scanner in = new Scanner(System.in);
		Cone obj1 = new Cone(2, 4);
		Ellipsoid obj2 = new Ellipsoid(1, 2, 3);
		
		Sphere obj3 = new Sphere(4);
		Cone obj4 = new Cone(3, 5);
		Ellipsoid obj5 = new Ellipsoid(2, 3, 4);
		
		Sphere obj6 = new Sphere(5);
		Cone obj7 = new Cone(4, 6);
		Ellipsoid obj8 = new Ellipsoid(3, 4, 6);
		
		Sphere obj9 = new Sphere(6);
		
		ArrayList<Shape> testArray = new ArrayList<Shape>();
		testArray.add(obj1);
		testArray.add(obj2);
		testArray.add(obj3);
		testArray.add(obj4);
		testArray.add(obj5);
		testArray.add(obj6);
		testArray.add(obj7);
		testArray.add(obj8);
		testArray.add(obj9);
		System.out.println("The Array non sorted");
		System.out.println(testArray);
		System.out.println("Recursing the ArrayList sorted out.");
		System.out.println(ShapeUtilities.recursiveSort(testArray));
		System.out.println("This is the Min");
		System.out.println(ShapeUtilities.min(testArray));
		System.out.println("This is the Max");
		System.out.println(ShapeUtilities.max(testArray));
		System.out.println("What is the file");
		String fileName = in.next();
		File fileIn = new File("cones.dat");
		ObjectSaver<Shape> test = new ObjectSaver<Shape>(fileIn);
		System.out.println(test.readAllObjects());

	}

}