import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class HashTableTest {
	/*
	 * Main method that test everything out
	 */
	public static void main(String[] args) throws FileNotFoundException {
		//generateSimpleList();
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
	 * Public Static method tests out the SimpleList
	 */
	public static void generateSimpleList() throws FileNotFoundException {
		Scanner sc = getFile();
		SimpleList tempSimpleList = new SimpleList();
		while (sc.hasNextLine()) {
			String word = sc.next().toLowerCase();
			int indexFound = tempSimpleList.find(word);
			Entry entryTemp = new Entry(word);
			if (indexFound > 0) {
				tempSimpleList.getEntry(indexFound).incrementCount();
			} else {
				tempSimpleList.add(entryTemp);
			}
			
		}
		tempSimpleList.toString();
		
	}
	/*
	 * Public Static Method that Tests out The HashTable
	 */
	public static void generateHashTable() throws FileNotFoundException {
		Scanner sc = getFile();
		HashTable tempHashTable = new HashTable();
		while (sc.hasNextLine()) {
			String word = sc.next().toLowerCase();
			Entry entryWord = new Entry(word);
			tempHashTable.add(entryWord);
			
		}
		System.out.println("Final Array -----------\n"+tempHashTable);
		
		
	}
}
