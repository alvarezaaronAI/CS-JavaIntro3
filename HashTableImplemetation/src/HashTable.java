import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class HashTable {
	/*
	 * Member Variables
	 */
	private final double LOAD_FACTOR = 0.75;
	private static final int INITIAL_CAPACITY = 20;
	private int sizeN = 1;
	private Entry[] entries = null;
	private int sizeElem = 0;

	/**
	 * Constructor that creates a new HashTable
	 */

	public HashTable() {
		this.entries = new Entry[INITIAL_CAPACITY];
		this.sizeElem = 0;
		this.sizeN = INITIAL_CAPACITY;
	}

	/**
	 * Private method that returns a load factor caculates
	 */
	private double loadFactor() {
		double numberOfElements = this.sizeElem;
		double hashTableSize = this.sizeN;
		double loadFactor = numberOfElements / hashTableSize;
		return loadFactor;
	}

	/**
	 * Public method that gets the HashCode of an Entry and returns an index
	 * where to put the Entry in the Value.
	 */
	public int indexHashed(Entry entryInput) {

		int indexHashed = entryInput.hashCode() % this.sizeN;
		return indexHashed;
	}

	/**
	 * Public Method that gets a word from a specific Entry.
	 */
	public String getWord(Entry entryInput) {
		String entryStringWord = entryInput.getWord();
		return entryStringWord;
	}

	/**
	 * Public method that finds a Entry in the HashTable returns the index where
	 * is located or -1 if is not found
	 */
	public int find(Entry entryInput) {
		int indexLocated = indexHashed(entryInput);
		if (entries[indexLocated] != null) {
			// if there is something, we found it... Maybe add a if statement
			// that checks if they are equal
			return indexLocated;
		} else {
			return -1;
		}
	}

	/**
	 * Methods adds an Entry and resizes when needed
	 */
	public void add(Entry entryInput) {
		double loadFactor = loadFactor();
		Double defaultLF = new Double(LOAD_FACTOR);
		Double currentLF = new Double(loadFactor);
		System.out.println("Default Load Factor " +defaultLF  + " current LoadFactor " + currentLF + " Compute " + (defaultLF.compareTo(currentLF)< 0));
		if ((defaultLF.compareTo(currentLF) < 0)) {
			this.resize();
		}
		int indexHashed = indexHashed(entryInput);
		boolean checker = entries[indexHashed] != null;
		System.out.println("Word '" + entryInput.getWord() + "' " + checker + " IndexHashed " + indexHashed + " inside entry " + entries[indexHashed] );
		if (entries[indexHashed] == null) {
			System.out.println("Word '" + entryInput.getWord()+"' " + " went through here.");
			this.entries[indexHashed] = entryInput;
			this.sizeElem++;
			System.out.println("\n Array" + Arrays.toString(this.entries));
		} else {
			// theres a collision do DoubleHash Method
			int newIndexHashed = doubleHash(entryInput, indexHashed);
			System.out.println("Word '" + entryInput.getWord() + "'  New Hashed " + newIndexHashed);
			if (newIndexHashed > 0) {
				this.entries[newIndexHashed] = entryInput;
				this.sizeElem++;
			}
			System.out.println("\n Array" + Arrays.toString(this.entries));
		}
	}

	/**
	 * Private method double hash that returns the index after collision
	 */
	private int doubleHash(Entry entryInput, int indexOfEntry) {
		// Formula Given h'(key) = 7 -((h(key)) % 7);
		// Use h(key) = k % N, (k+j*(h'(key))% N)
		int buckets = (7 - (indexOfEntry) % 7);
		System.out.println("Buckets " + buckets);
		long k = entryInput.hashCode();
		int j = 1;
		int newIndex = (int) ((k + j * (buckets)) % this.sizeN);
		System.out.println("Word Hashed" + entryInput.hashCode());
		System.out.println("New index =  == " + newIndex);
		while (this.entries[newIndex] != null) {
			System.out.println(" Word '" + entryInput.getWord() +"' "+ "NumberOfCollisons=  " +  j);
			j++;
			newIndex = (int) ((k + j * (buckets)) % this.sizeN);
		}
		return newIndex;
	}

	/**
	 * Private void method that returns a new Entry Array with a new size array.
	 */
	private void resize() {
		Entry[] newList = new Entry[this.sizeElem * 2];
		this.sizeN = newList.length;
		newList = rehasing(this.entries, newList);
		this.entries = newList;
	}

	/**
	 * Private method that returns a Entry Array with a new hashed Array
	 */
	private Entry[] rehasing(Entry[] entryInput, Entry[] newEntryInput) {
		// Go through every index of entryInput and add the new HashValues
		// At this point N is now different
		for (int i = 0; i < entryInput.length; i++) {
			if (entryInput[i] != null) {
				int tempIndexHash = indexHashed(entryInput[i]);
				newEntryInput[tempIndexHash] = entryInput[i];
			}
		}
		// return the the entryInput with the the previous values again.
		return newEntryInput;
	}

	/**
	 * Public method that allows me to print out the entries array into a file
	 */
	public void fileOutPut() {
		try {
			File fileIn = new File("GilbertIsABitchAss.bitchAss");
			FileWriter data = new FileWriter(fileIn);
			for (int i = 0; i < entries.length; i++) {
				if (entries != null) {
					data.write(entries[i] + "\r\n");
				}
			}
			data.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * to String that Prints out the HashTable
	 */
	@Override
	public String toString() {
		StringBuilder sB = new StringBuilder();
		for (int i = 0; i < entries.length; i++) {
			if (entries[i] != null) {
				sB.append(entries[i].toString());
			}
		}
		String finalString = sB.toString();
		return finalString;
	}
}

