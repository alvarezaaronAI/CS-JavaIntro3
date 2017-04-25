import java.io.File;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
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
	 * Public Static method tests out the SimpleList
	 */
	public static void generateSimpleList() throws FileNotFoundException {
		Scanner sc = getFile();
		SimpleList tempSimpleList = new SimpleList();
		Instant start = Instant.now();
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
		Instant end = Instant.now();
		System.out.println("Done Sim");
		tempSimpleList.fileOutPut(Duration.between(start, end));
		System.out.println("Done Sim File");
	}

	/*
	 * Public Static Method that Tests out The HashTable
	 */
	public static void generateHashTable() throws FileNotFoundException {
		Scanner sc = getFile();
		HashTable tempHashTable = new HashTable();
		Instant start = Instant.now();
		while (sc.hasNextLine()) {
			String word = sc.next().toLowerCase();
			Entry entryWord = new Entry(word);
			tempHashTable.add(entryWord);

		}
		Instant end = Instant.now();
		System.out.println("Done Hash");
		tempHashTable.fileOutPut(Duration.between(start, end));
		System.out.println("Done HashFile");
	}

	private static Entry[] sortingBubbleBut(HashTable hashTableInput, SimpleList simpleListInput) {
		// Will only return one.
		HashTable tempHashTable = hashTableInput;
		SimpleList tempSimpleList = simpleListInput;
		Entry[] hashTableArray = hashTableInput.getEntries();
		Entry[] simpleListArray = simpleListInput.getEntries();
		if (tempHashTable != null) {
			// Get the Array of Char first word only, return the array of
			// sortedOutEntries
			
			char[] firstLetterArray = new char[hashTableInput.getSizeElem()];
			for (int i = 0; i < firstLetterArray.length; i++) {
				if (hashTableInput.getEntries()[i] != null) {
					char tempLetter = hashTableArray[i].getWord().charAt(0);
					firstLetterArray[i] = tempLetter;
				}
			}
			// Once we get every letter sort out based on letters, and when
			// swapping swap the entries as well
		} else if (tempSimpleList != null) {
			char[] firstLetterArray = new char[simpleListInput.getSize()];
			for (int i = 0; i < firstLetterArray.length; i++) {
				char tempLetter = simpleListArray[i].getWord().charAt(0);
				firstLetterArray[i] = tempLetter;
			}
			
		} else {
			System.out.println("You cannot sort out two, just one at a time. Call the method twice.");
		}
		
		return null;

	}

}
