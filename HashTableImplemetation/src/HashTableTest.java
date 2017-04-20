import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
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
		fileOutSimpleList(Duration.between(start, end), tempSimpleList, "SimpleListWordCount");

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
		fileOutHashTable(Duration.between(start, end), tempHashTable, "HashTableListWordCount");
	}
	public static void fileOutSimpleList(Duration durIn, SimpleList simpleList, String fileNameInput) {
		try {
			File fileIn = new File(fileNameInput + ".txt");
			FileWriter data = new FileWriter(fileIn);
			data.write("Amount of time to get a non-sorted Entries into the SimpleList : " + durIn + "\r\n");
			int i = 0;
			while (simpleList.getEntry(i) != null) {
				data.write(simpleList.getEntry(i) + "\r\n");
			}
			data.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void fileOutHashTable(Duration durIn, HashTable hashTable, String fileNameInput) {
		try {
			File fileIn = new File(fileNameInput + ".txt");
			FileWriter data = new FileWriter(fileIn);
			data.write("Amount of time to get a non-sorted Entries into the HashTable : " + durIn + "\r\n");
			for (int j = 0; j < hashTable.getEntries().length; j++) {
				if (hashTable.getEntries()[j] != null) {
					data.write(hashTable.getEntries()[j]+ "\r\n");
				} 
			}
			data.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
