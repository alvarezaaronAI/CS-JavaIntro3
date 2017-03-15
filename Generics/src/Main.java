/*Aaron Alvarez
Feb 15 2017
Tester to run all my methods for previous classes*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		
		Scanner in = new Scanner(System.in);
//-------------------------------------------------------------------------------------------
		//Create File Readers
		File conesFile = new File("C:\\Users\\alvar\\Desktop\\cones.dat");
		File ellipsoidsFile = new File("C:\\Users\\alvar\\Desktop\\ellipsoids.dat");
		File shperesFile = new File("C:\\Users\\alvar\\Desktop\\spheres.dat");
//-------------------------------------------------------------------------------------------
		//Create 3 ArrayList with Given Files
		System.out.println("Reading Cone.dat File...");
		ObjectSaver<Shape> conesObjects = new ObjectSaver<>(conesFile);
			System.out.println("--------------------------");
			System.out.println("   " + conesObjects.readAllObjects());
			System.out.println("--------------------------");
		System.out.println("Reading Ellipsoid File...");
		ObjectSaver<Shape> ellipsoidObjects = new ObjectSaver<>(ellipsoidsFile);
			System.out.println("--------------------------");
			System.out.println("   " + ellipsoidObjects.readAllObjects());
			System.out.println("--------------------------");
		System.out.println("Reading Shperes Object...");
		ObjectSaver<Shape> sphereObjects = new ObjectSaver<>(shperesFile);
			System.out.println("--------------------------");
			System.out.println("   " + sphereObjects.readAllObjects());
			System.out.println("--------------------------");
//-------------------------------------------------------------------------------------------
		//Sorting out the files.
			System.out.println("Sorting Cone.dat File...");
				System.out.println("--------------------------");
				System.out.println("   " + ShapeUtilities.recursiveSort(conesObjects));
				System.out.println("--------------------------");
			System.out.println("Sorting Ellipsoid File...");
				System.out.println("--------------------------");
				System.out.println("   " + ellipsoidObjects.readAllObjects());
				System.out.println("--------------------------");
			System.out.println("Sorting Shperes Object...");
				System.out.println("--------------------------");
				System.out.println("   " + sphereObjects.readAllObjects());
				System.out.println("--------------------------");
		
	}

}