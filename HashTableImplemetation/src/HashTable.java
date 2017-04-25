
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

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
	 * Methods adds an Entry and resizes when needed
	 */
	public void add(Entry entryInput) {
		// Comparing for load Factor using compare To
		double loadFactor = loadFactor();
		Double defaultLF = new Double(LOAD_FACTOR);
		Double currentLF = new Double(loadFactor);

		// checking for resizing
		if ((defaultLF.compareTo(currentLF) < 0)) {
			this.resize();
		
		}
		// checking where to put the new index
		int indexLocation = indexHashed(entryInput);
		if (entries[indexLocation] == null) {
		
			this.entries[indexLocation] = entryInput;
			this.sizeElem++;
		}
		// else if there's a collision do DoubleHash Method
		else {
			if (entryInput.getWord().equals(this.entries[indexLocation].getWord())) {
				this.entries[indexLocation].incrementCount();
			} else {
				int newIndexHashed = linearHashing(entryInput, indexLocation);
				if (newIndexHashed > 0) {
					this.entries[newIndexHashed] = entryInput;
					this.sizeElem++;
				}
			}
			// else new Index is -1 which means theres already a value there.
		}

	}

	/**
	 * Private method that linear hashed returns the index after collision or
	 * else returns -1 if its a duplicate
	 */
	private int linearHashing(Entry entryInput, int indexOfEntry) {
		// Use h(key) = k % N
		// Use h(key) = (k + j)% N
		int j = 0;
		int newIndex = indexOfEntry;
		while (entries[Math.abs(newIndex)] != null) {
			if (entryInput.getWord().equals(entries[Math.abs(newIndex)].getWord())) {
				// System.out.println("Word '" + entryInput +"' duplicate" );
				this.entries[Math.abs(newIndex)].incrementCount();
				return -1;
			} else {
				j++;
				newIndex = (entries[Math.abs(newIndex)].hashCode() + j) % this.sizeN;
			}
		}
		// System.out.println("New Index for Entry '" + entryInput.getWord()+ "'
		// " + newIndex);
		return newIndex;
	}

	/**
	 * Private method double hash that returns the index after collision or else
	 * returns -1 if its a duplicate
	 */
	private int doubleHash(Entry entryInput, int indexOfEntry) {
		// Formula Given h'(key) = 7 -((h(key)) % 7);
		// Use h(key) = k % N, (k+j*(h'(key))% N)
		int buckets = (7 - (indexOfEntry) % 7);
		long k = entryInput.hashCode();
		int j = 1;
		int newIndex = (int) ((k + j * (buckets)) % this.sizeN);
		while (this.entries[newIndex] != null) {
			if (entryInput.getWord().equals(this.entries[newIndex].getWord())) {
				// increase the at that object new Index
				this.entries[newIndex].incrementCount();
				return -1;
			} else {
				j++;
				newIndex = (int) ((k + j * (buckets)) % this.sizeN);
			}
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
	public void fileOutPut(Duration durationTimeIn) {
		try {
			File fileIn = new File("HashTableWordCount.txt");
			FileWriter data = new FileWriter(fileIn);
			data.write("Amount of time to get a non-sorted Entries into the HashTableList : " + durationTimeIn + "\r\n\n -------------------");
			for (int i = 0; i < entries.length; i++) {
				if (entries[i] != null) {
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

	public int getSizeN() {
		return sizeN;
	}

	public void setSizeN(int sizeN) {
		this.sizeN = sizeN;
	}

	public int getSizeElem() {
		return sizeElem;
	}

	public void setSizeElem(int sizeElem) {
		this.sizeElem = sizeElem;
	}

	public Entry[] getEntries() {
		return entries;
	}

	public void setEntries(Entry[] entries) {
		this.entries = entries;
	}
}
