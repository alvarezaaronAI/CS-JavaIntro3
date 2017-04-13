import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class HashTableTest {
	/*
	 * Main method that test everything out
	 */
	public static void main(String[] args) throws FileNotFoundException {
		generateSimpleList();
		generateHashTable();
	}

	/*
	 * Private Static Method that gets the new file.
	 */
	private static Scanner getFile() throws FileNotFoundException {
		String file = null;
		JFileChooser fc = new JFileChooser();
		int retVal = fc.showOpenDialog(null);
		if (retVal == JFileChooser.APPROVE_OPTION) {
			File selectedFile = fc.getSelectedFile();
			file = selectedFile.getAbsolutePath();
		}
		Scanner sc = new Scanner(new File(file));
		return sc;
	}

	/*
	 * Private Static Method that prints out the output.
	 */
	private static void consoleOutPut(SimpleList tempSimpleList) {
		System.out.println(tempSimpleList.toString());
	}

	/*
	 * Public Static method tests out the SimpleList
	 */
	public static void generateSimpleList() throws FileNotFoundException {
		Scanner sc = getFile();
		SimpleList tempSimpleList = new SimpleList();
		while (sc.hasNextLine()) {
			String word = sc.next();
			int indexFound = tempSimpleList.find(word);
			Entry entryTemp = new Entry(word);
			if (indexFound > 0) {
				tempSimpleList.getEntry(indexFound).incrementCount();
			} else {
				tempSimpleList.add(entryTemp);
			}
			
		}
		
	}
	public static void generateHashTable() {
		
	}
}
