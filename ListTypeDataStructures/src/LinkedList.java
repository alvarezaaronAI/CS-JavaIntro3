/*Aaron Alvarez
Linked List Java that adds delets and modifies the Link List
3/9/17*/
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class LinkedList<E extends Comparable<E>, E1 extends Comparable<E1>, E2 extends Comparable<E2>> {
	private Node<E, E1, E2> head = null;
	private int size = 0;
	private String category1Label;
	private String category2Label;
	private String category3Label;
	private int groupingCategory = 0;

	public LinkedList() {
		
	} 

	public LinkedList(int numOfCurrCategoryIn) {
		
	}

	public LinkedList(File fileIn, int currGroupingPropIn) throws FileNotFoundException {
		Scanner in = new Scanner(fileIn);
		this.groupingCategory = currGroupingPropIn;
		this.category1Label = (String) " " + in.nextLine();
		this.category2Label = (String) " " + in.nextLine();
		this.category3Label = (String) " " + in.nextLine();
		in.nextLine();
		while (in.hasNext()) {
			String usersNodes = in.nextLine();
			String[] usersInfo = usersNodes.split(", ");
			System.out.println(Arrays.toString(usersInfo));
			E t = (E) usersInfo[0];
			E temp1 = t;
			E1 t1 = (E1) usersInfo[1];
			E1 temp2 = t1;
			E2 t2 = (E2) usersInfo[2];
			E2 temp3 = t2;
			add(temp1, temp2, temp3);
			// System.out.println(size);
		}

	}

	private void add(E value1, E1 value2, E2 value3) {
		Node<E, E1, E2> newNode = new Node<E, E1, E2>(value1, value2, value3);
		if (size == 0) {
			this.head = newNode;
			this.size++;
			System.out.println("headsize" + size);
			
		} else {
			Node<E, E1, E2> currNode = this.head;
			int sizeOfCurrNode = 0;
			
			//this boolean for some reason doesnt will not work. 34 != 34 is false, that should be true. 
			//somehow this is true. Run Main to see the tracing
			boolean checker = currNode.category1.compareTo(newNode.category1) != 0;
			System.out.println(currNode.getCatergory1().compareTo((newNode.getCatergory1())));
			// while its NOT a sublist
			
			while (checker) {
				System.out.println();
				System.out.println("Does " + currNode.category1 +" NOT equal "+ newNode.category1 +" ?  " + checker);
				if (currNode.right == null) {
					
					currNode.right = newNode;
					newNode.left = currNode;
					System.out.println("-set right");
					this.size++;
					sizeOfCurrNode++;
					checker = false;
				} else {
					currNode = currNode.right;
					System.out.print("-moved right");
				}
			}
			// while its a sublist
			
			if (sizeOfCurrNode < 1) {
				while (!checker) {
					if (currNode.down == null) {
						currNode.down = newNode;
						System.out.println("-set down");
						this.size++;
						checker = true;
					} else {
						currNode = currNode.down;
						System.out.print("move down ");
					}
				}
			}
		}
	}

	public void clear() {
		if (this.size == 0) {
			System.out.println("Your Linked List is Empty!");
		} else {
			this.head = null;
			this.size = 0;
		}
	}

	public void deleteFirst() {
		if (this.size == 0) {
			System.out.println("Your Linked List is Empty!");
		} else if (this.size == 1) {
			clear();
		} else {
			Node<E, E1, E2> headRightTemp = this.head.right;
			Node<E, E1, E2> headDownTemp = this.head.down;
			headDownTemp.right = headRightTemp;
			headRightTemp.left = headDownTemp;
			this.head = null;
			this.size--;
		}
	}

	public void deleteLast() {
		Node<E, E1, E2> currentHead = this.head;
		Node<E, E1, E2> leftHead = currentHead.left;
		Node<E, E1, E2> rightHead = currentHead.right;
		Node<E, E1, E2> downHead = currentHead.down;
		if (this.size == 0) {
			System.out.println("Your Linked List is Empty!");
		} else if (this.size == 1) {
			clear();
		} else if (rightHead == null) {
			deleteFirst();
		} else {
			// Looking for the right place
			System.out.println("+++" + currentHead + "+++");
			while (rightHead != null) {
				System.out.println("**********1");
				currentHead = rightHead;
				System.out.println("**********2");
			}
			leftHead.right = downHead;
			downHead.left = leftHead;
			currentHead = null;
			this.size--;
		}
	}

	public void delete(int mainIndex, int subIndex) {
		// Main Tracker
		Node<E, E1, E2> currentHead = this.head;
		Node<E, E1, E2> rightHead = currentHead.right;
		// Sub Tracker (previous node after deleting)
		Node<E, E1, E2> subCurrentHead = currentHead;
		Node<E, E1, E2> subDownHead = subCurrentHead.down;
		int sizeTempA = 0;
		int sizeTempB = 0;
		boolean sizeTempAchecker = sizeTempA != mainIndex;
		boolean sizeTempBchecker = sizeTempB + 1 != subIndex;
		if (this.size == 0) {
			System.out.println("Your Linked List is Empty!");
		} else if (this.size == 1) {
			clear();
		} else {
			while (sizeTempAchecker) {
				currentHead = rightHead;
				sizeTempA++;
			}
			while (sizeTempBchecker) {
				subCurrentHead = subDownHead;
				sizeTempB++;
			}
			subDownHead = subDownHead.down;
			size--;
		}
	}

	public String get(int mainIndex, int category) {
		// Main Tracker
		Node<E, E1, E2> currentHead = this.head;
		Node<E, E1, E2> rightHead = currentHead.right;
		int sizeTempA = 0;
		int sizeTempB = 0;
		boolean sizeTempAchecker = sizeTempA != mainIndex;
		if (this.size == 0) {
			System.out.println("Your Linked List is Empty!");
		} else if (this.size == 1) {
			// return the category ---
		} else {
			while (sizeTempAchecker) {
				currentHead = rightHead;
				sizeTempA++;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "LinkedList [head=" + head + ", \n size=" + size + ", category1Label=" + category1Label
				+ ", category2Label=" + category2Label + ", category3Label=" + category3Label + ", groupingCategory="
				+ groupingCategory + "]";
	}
}