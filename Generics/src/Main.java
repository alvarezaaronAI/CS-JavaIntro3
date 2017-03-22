
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
		// -------------------------------------------------------------------------------------------
		// Create File Readers
		File conesFile = new File("C:\\Users\\alvar\\Desktop\\cones.dat");
		File ellipsoidsFile = new File("C:\\Users\\alvar\\Desktop\\ellipsoids.dat");
		File shperesFile = new File("C:\\Users\\alvar\\Desktop\\spheres.dat");
		// -------------------------------------------------------------------------------------------
		// Create 3 ArrayList with Given Files
		System.out.println("Reading Cone.dat File...");
		ObjectSaver<Shape> conesObjects = new ObjectSaver<>(conesFile);
		System.out.println("--------------------------");
		System.out.println("   " + conesObjects.readAllObjects());
		System.out.println("--------------------------");
		System.out.println("Reading Ellipsoid.dat File...");
		ObjectSaver<Shape> ellipsoidObjects = new ObjectSaver<>(ellipsoidsFile);
		System.out.println("--------------------------");
		System.out.println("   " + ellipsoidObjects.readAllObjects());
		System.out.println("--------------------------");
		System.out.println("Reading Shperes.dat File...");
		ObjectSaver<Shape> sphereObjects = new ObjectSaver<>(shperesFile);
		System.out.println("--------------------------");
		System.out.println("   " + sphereObjects.readAllObjects());
		System.out.println("--------------------------");
		System.out.println();
		// -------------------------------------------------------------------------------------------
		// Reading One Object
		System.out.println();
		System.out.println("Reading 1st Object From Cone.dat File...");
		System.out.println("--------------------------");
		System.out.println("   " + conesObjects.readOneObject(1));
		System.out.println("--------------------------");
		System.out.println("Reading 1st Object From Ellipsoid File...");
		System.out.println("--------------------------");
		System.out.println("   " + ellipsoidObjects.readOneObject(1));
		System.out.println("--------------------------");
		System.out.println("Reading 1st Object From Shperes File...");
		System.out.println("--------------------------");
		System.out.println("   " + sphereObjects.readOneObject(1));
		System.out.println("--------------------------");
		System.out.println();
		// -------------------------------------------------------------------------------------------
		//Display the min and max
		System.out.println();
		// Sorting out the files.
		System.out.println("Reading Cone.dat File...");
		System.out.println("--------------------------");
		 System.out.println("Min: " + ShapeUtilities.min(ShapeUtilities.recursiveSort(conesObjects.readAllObjects())) );
		 System.out.println("Max: " + ShapeUtilities.max(ShapeUtilities.recursiveSort(conesObjects.readAllObjects())) );
		System.out.println("--------------------------");
		System.out.println("Reading Ellipsoid File...");
		System.out.println("--------------------------");
		 System.out.println("Min: " + ShapeUtilities.min(ShapeUtilities.recursiveSort(ellipsoidObjects.readAllObjects())) );
		 System.out.println("Max: " + ShapeUtilities.max(ShapeUtilities.recursiveSort(ellipsoidObjects.readAllObjects())) );
		System.out.println("--------------------------");
		System.out.println("Reading Shperes File...");
		System.out.println("--------------------------");
		 System.out.println("Min: " + ShapeUtilities.min(ShapeUtilities.recursiveSort(sphereObjects.readAllObjects())) );
		 System.out.println("Max: " + ShapeUtilities.max(ShapeUtilities.recursiveSort(sphereObjects.readAllObjects())) );
		System.out.println("--------------------------");
		System.out.println();
		// -------------------------------------------------------------------------------------------
		// Sorting out the files.
		System.out.println();
		System.out.println("Sorting Cone.dat File...");
		System.out.println("--------------------------");
		 System.out.println(" " + ShapeUtilities.recursiveSort(conesObjects.readAllObjects()) );
		System.out.println("--------------------------");
		System.out.println("Sorting Ellipsoid File...");
		System.out.println("--------------------------");
		 System.out.println(" " + ShapeUtilities.recursiveSort(ellipsoidObjects.readAllObjects()) );
		System.out.println("--------------------------");
		System.out.println("Sorting Shperes File...");
		System.out.println("--------------------------");
		 System.out.println(" " + ShapeUtilities.recursiveSort(sphereObjects.readAllObjects()) );
		System.out.println("--------------------------");
		System.out.println();
		//writing the recursive Sort to A File
		System.out.println("Writing All Sorted Objects to a File Please Wait...");
		conesObjects.writeAllObjects(ShapeUtilities.recursiveSort(conesObjects.readAllObjects()), false);
		System.out.println("Done");
		System.out.println("Writing All Sorted Objects to a File Please Wait...");
		ellipsoidObjects.writeAllObjects(ShapeUtilities.recursiveSort(ellipsoidObjects.readAllObjects()), false);
		System.out.println("Done");
		System.out.println("Writing All Sorted Objects to a File Please Wait...");
		sphereObjects.writeAllObjects(ShapeUtilities.recursiveSort(sphereObjects.readAllObjects()), false);
		System.out.println("Done");
		//Reading The File Before OverWritting
		System.out.println();
		System.out.println("Before Overwritting We are going to read this File");
		System.out.println("Reading back The Sorted Cones File...");
		System.out.println("--------------------------");
		System.out.println("   " + conesObjects.readAllObjects());
		System.out.println("--------------------------");
		System.out.println("Reading back The Sorted Ellipsoid File...");
		System.out.println("--------------------------");
		System.out.println("   " + ellipsoidObjects.readAllObjects());
		System.out.println("--------------------------");
		System.out.println("Reading back The Sorted Shperes File...");
		System.out.println("--------------------------");
		System.out.println("   " + sphereObjects.readAllObjects());
		System.out.println("--------------------------");
		System.out.println();
		
		// -------------------------------------------------------------------------------------------
		// Writing A Single To File
		
		Cone coneObjectTest = new Cone(1, 2);
		Ellipsoid ellipsoidObjectTest = new Ellipsoid(1, 2, 3);
		Sphere sphereObjectTest = new Sphere(1);
		
		System.out.println("Testing Writting one Object To A File, by replacing the contents given one Object");
		System.out.println("Writing one Cone Object To A File Please Wait...");
		conesObjects.writeOneObject(coneObjectTest, false);
		System.out.println("Done");
		System.out.println("Writing one Ellipsoid Object To A File Please Wait...");
		ellipsoidObjects.writeOneObject(ellipsoidObjectTest, false);
		System.out.println("Done");
		System.out.println("Writing one Sphere Object To A File Please Wait...");
		sphereObjects.writeOneObject(sphereObjectTest, false);
		System.out.println("Done");
		//Reading The File Before OverWritting
		System.out.println();
		System.out.println("Before Overwritting We are going to read this File");
		System.out.println("Reading Cones File...");
		System.out.println("--------------------------");
		System.out.println("   " + conesObjects.readAllObjects());
		System.out.println("--------------------------");
		System.out.println("Reading Ellipsoid File...");
		System.out.println("--------------------------");
		System.out.println("   " + ellipsoidObjects.readAllObjects());
		System.out.println("--------------------------");
		System.out.println("Reading Shperes File...");
		System.out.println("--------------------------");
		System.out.println("   " + sphereObjects.readAllObjects());
		System.out.println("--------------------------");
		System.out.println();
		// -------------------------------------------------------------------------------------------
		// Writing All Objects To File
		System.out.println();
		Cone coneObjectTest1 = new Cone(1, 2);
		Cone coneObjectTest2 = new Cone(2, 3);
		Cone coneObjectTest3 = new Cone(3, 4);
		ArrayList<Shape> conesTester = new ArrayList<>();
		conesTester.add(coneObjectTest1);
		conesTester.add(coneObjectTest2);
		conesTester.add(coneObjectTest3);
		
		Ellipsoid ellipsoidObjectTest1 = new Ellipsoid(1, 2, 3);
		Ellipsoid ellipsoidObjectTest2 = new Ellipsoid(2, 3, 4);
		Ellipsoid ellipsoidObjectTest3 = new Ellipsoid(3, 4, 5);
		ArrayList<Shape> ellipsoidTester = new ArrayList<>();
		ellipsoidTester.add(ellipsoidObjectTest1);
		ellipsoidTester.add(ellipsoidObjectTest2);
		ellipsoidTester.add(ellipsoidObjectTest3);
		
		Sphere sphereObjectTest1 = new Sphere(1);
		Sphere sphereObjectTest2 = new Sphere(2);
		Sphere sphereObjectTest3 = new Sphere(3);
		ArrayList<Shape> sphereTester = new ArrayList<>();
		sphereTester.add(sphereObjectTest1);
		sphereTester.add(sphereObjectTest2);
		sphereTester.add(sphereObjectTest3);
		
		System.out.println();
		System.out.println("Writing All Objects to a File Please Wait...");
		conesObjects.writeAllObjects(conesTester, false);
		System.out.println("Done");
		System.out.println("Writing All Objects to a File Please Wait...");
		ellipsoidObjects.writeAllObjects(ellipsoidTester, false);
		System.out.println("Done");
		System.out.println("Writing All Objects to a File Please Wait...");
		sphereObjects.writeAllObjects(sphereTester, false);
		System.out.println("Done");
		//Reading The File Before OverWritting
		System.out.println();
		System.out.println("Before Overwritting We are going to read this File");
		System.out.println("Reading Cones File...");
		System.out.println("--------------------------");
		System.out.println("   " + conesObjects.readAllObjects());
		System.out.println("--------------------------");
		System.out.println("Reading Ellipsoid File...");
		System.out.println("--------------------------");
		System.out.println("   " + ellipsoidObjects.readAllObjects());
		System.out.println("--------------------------");
		System.out.println("Reading Shperes File...");
		System.out.println("--------------------------");
		System.out.println("   " + sphereObjects.readAllObjects());
		System.out.println("--------------------------");
		System.out.println();
	}
}