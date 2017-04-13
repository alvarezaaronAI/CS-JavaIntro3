import java.io.File;
import java.util.Hashtable;

public class HashTable {
	/*
	 * Member Variables
	 */
	private File file = null;

	private final double LOAD_FACTOR = 0.75;
	private static final int INITIAL_CAPACITY = 20;
	private Entry[] entries;
	private int sizeElem;

	/**
	 * Constructor that creates a new HashTable
	 */

	public HashTable() {
		this.entries = new Entry[INITIAL_CAPACITY];
		this.sizeElem = 0;
	}
	/**
	 * Private method that returns a load factor caculates
	 */
	private double loadFactor() {
		double numberOfElements = this.sizeElem;
		double hashTableSize = this.entries.length;
		double loadFactor = numberOfElements/hashTableSize;
		return loadFactor;
	}
	/**
	 * Methods adds an Entry and resizes when needed
	 */
	public void add(Entry e) {
		double loadFactor = loadFactor();
		if (loadFactor < this.LOAD_FACTOR) {
			this.resize();
		}
		this.entries[this.sizeElem] = e;
		this.sizeElem++;
	}
	/**
	 * Private void method that returns a new Entry Array with a new size array.
	 */
	private void resize() {
		Entry[] newList = new Entry[this.sizeElem * 2];
		newList = rehasing(newList);
		this.entries = newList;
	}

	/**
	 * Private method that returns a Entry Array with a new hashed Array
	 */
	private Entry[] rehasing(Entry[] entryInput) {
		//Get the Original HashTable and use the formula to find its values to hash those
		//values to reuse the formula again to hash the value into the new entryinput
		
		//return the the entryInput with the the previous values again.
		return entryInput;
	}
	/**
	 * to String that Prints out the HashTable
	 */
	@Override
	public String toString() {
		return null;
	}
}
