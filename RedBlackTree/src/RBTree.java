
public class RBTree<T extends Comparable<T>, E> {
	protected RBNode<T, E> root = null;
	protected RBNode<T, E> nillLeaf = null;
	protected int size = 0;

	/*
	 * Public Constructor that will allow me to create a Red Black Tree.
	 */
	public RBTree() {
		// well its supposed just create a new Red Black Tree
		// Maybe create a new one that does a array of Objects
	}

	/*
	 * Makes a new Node with the given Key and Value. Nodes always start of Red.
	 */
	public RBNode<T, E> createRBNode(T key, E value) {
		RBNode<T, E> tempRBNode = new RBNode<T, E>(key, value, 'r');
		return tempRBNode;
	}

	/*
	 * Check for Size if its empty. Returns Boolean
	 */
	public boolean checkSize(int size) {
		boolean sizeEmpty = size == 0;
		return sizeEmpty;
	}

	/*
	 * Method that find the root given a specific Node of that root.
	 */
	public RBNode<T, E> searchRoot(RBNode<T, E> node) {
		RBNode<T, E> c = node;
		RBNode<T, E> p = node.parent;
		// While the parent of the current node is not null move up.
		while (p != nillLeaf) {
			c = c.parent;
		}
		// c must be the root of the node being entered
		// return c which is the root.
		return c;
	}

	/*
	 * This method takes in a node, returns -1 or 1. Number Line If went left
	 * from root, return -1, else 1 if it went right.
	 */
	public int checkLR(RBNode<T, E> node) {

		if (node.uniqueKey.compareTo(this.root.uniqueKey) < 0) {
			// Must be Left
			return -1;
		} else if (node.uniqueKey.compareTo(this.root.uniqueKey) > 0) {
			// Must be Right
			return 1;
		} else {
			// Must be Equal
			return 0;
		}
	}

	/*
	 * Method that will search through the Red Black Tree. Returns True of the
	 * node inserted exist.
	 */
	public boolean search(RBNode<T, E> node) {
		// We Will start Looking from the root.
		RBNode<T, E> c = root;
		while (c != nillLeaf) {
			// If Node is less than the current Node then go left.
			if (node.uniqueKey.compareTo(c.uniqueKey) < 0) {
				// we go left
				c = c.leftChild;
			}
			// If Node is bigger than the current Node then go right.
			else if (node.uniqueKey.compareTo(c.uniqueKey) > 0) {
				// we go right
				c = c.rightChild;
			}
			// Else they are equal
			else {
				return true;
			}
		}
		// OtherWise return false, it doesnt exist.
		return false;
	}

	/*
	 * Returns the given the key of the node you want to search.
	 */
	public RBNode<T, E> searchAndRetrieve(T key) {
		RBNode<T, E> c = root;
		RBNode<T, E> p = nillLeaf;
		while (c != nillLeaf) {
			// if when comparing if it hasnt found the key go to the left
			if (key.compareTo(c.uniqueKey) < 0) {
				p = c;
				c = c.leftChild;
			}
			// if when comparing if it hasnt found the key go to the right
			else if (key.compareTo(c.uniqueKey) > 0) {
				p = c;
				c = c.rightChild;
			}
			// they are equal
			else {
				p = c;
				c = c.leftChild;
			}
		}
		return p;
	}

	/*
	 * Method that returns the Grand Parent of a given node. Returns the
	 * GrandParent, other wise null, if it does'nt exist.
	 */
	private RBNode<T, E> grandPNode(RBNode<T, E> node) {
		RBNode<T, E> p = node.parent;
		// check if the node exist first
		if (search(node)) {
			// Checking if Parent of the node exist
			if (p != nillLeaf) {
				// checking if the grandparent of the node exist
				if (p.parent != nillLeaf) {
					return p.parent;
				}
				// else there's no grandparent
				else {
					return nillLeaf;
				}
			}
			// Else if no parent no Grand Parent
			else {
				return nillLeaf;
			}
		}
		// Else don't even bother searching for the node Grand Parent
		else {
			return nillLeaf;
		}
	}

	public RBNode<T, E> grandPNode(T key) {
		RBNode<T, E> givenNode = searchAndRetrieve(key);
		RBNode<T, E> tempGrandParent = grandPNode(givenNode);
		return tempGrandParent;
	}

	/*
	 * Method that searches for the Uncle. Returns the Uncle or null if not
	 * found.
	 */
	private RBNode<T, E> uncleNode(RBNode<T, E> node) {
		// Check if the Node has a Grand Parent else, uncle dont exist
		if (grandPNode(node) != nillLeaf) {
			// Now there's a chance of an Uncle existing
			RBNode<T, E> g = grandPNode(node);
			// check if uncle is left or right
			if (checkLR(node) == -1) {
				// Must return right uncle
				return g.rightChild;
			} else if (checkLR(node) == 1) {
				// must return left uncle
				return g.leftChild;
			} else {
				// else it must be equal, it should never land here either way.
				return nillLeaf;
			}
		}
		// returns null if has node has no Grand Parent, then has no uncle.
		return nillLeaf;
	}

	public RBNode<T, E> uncleNode(T key) {
		RBNode<T, E> givenNode = searchAndRetrieve(key);
		RBNode<T, E> tempUncle = uncleNode(givenNode);
		return tempUncle;
	}

	/*
	 * Method that left rotates from the given node. Modifies the Red Black Tree
	 * Node member variable;
	 */
	public void leftRotate(RBNode<T, E> node) {
		// Keep Track of the root and the pivot and roots parent
		RBNode<T, E> root = node;
		RBNode<T, E> pivot = node.rightChild;
		RBNode<T, E> rParent = root.parent;
		// If pivot is not null, then proceed to rotate
		if (pivot != nillLeaf) {
			// do this if root has a parent
			if (rParent != nillLeaf) {
				// if root is going left to the root's parent, then set pivot to
				// left of the root.
				if (root.uniqueKey.compareTo(rParent.uniqueKey) < 0) {
					// root must be on the left of parent
					root.rightChild = pivot.leftChild;
					pivot.leftChild.parent = root;
					pivot.leftChild = root;
					rParent.leftChild = pivot;
					root.parent = pivot;
					pivot.parent = rParent;
					this.root = searchRoot(rParent);

				}
				// if root is going right of root's parent, then set pivot to
				// right of the root.
				else if (root.uniqueKey.compareTo(rParent.uniqueKey) > 0) {
					// root must be on the right of the parent.
					root.rightChild = pivot.leftChild;
					pivot.leftChild.parent = root;
					pivot.leftChild = root;
					rParent.rightChild = pivot;
					root.parent = pivot;
					pivot.parent = rParent;
					this.root = searchRoot(rParent);
				}
			}
			// else if root has no parent, then rotate with no parent.
			else {
				root.rightChild = pivot.leftChild;
				pivot.leftChild.parent = root;
				pivot.leftChild = root;
				root.parent = pivot;
				this.root = pivot;
			}
		}
	}

	/*
	 * Method that right rotates from a given node. Modifies the Red Black Tree
	 * root Node member variable.
	 */
	public void rightRotate(RBNode<T, E> node) {
		// Keep Track of the root and the pivot and roots parent
		RBNode<T, E> root = node;
		RBNode<T, E> pivot = node.leftChild;
		RBNode<T, E> rParent = root.parent;
		// if the pivot is not null, then proceed to rotate
		if (pivot != nillLeaf) {
			if (rParent != nillLeaf) {
				if (root.uniqueKey.compareTo(rParent.uniqueKey) < 0) {
					// root must be to the left of the root's parent
					root.leftChild = pivot.rightChild;
					pivot.rightChild.parent = root;
					pivot.rightChild = root;
					rParent.leftChild = pivot;
					root.parent = pivot;
					pivot.parent = rParent;
					this.root = searchRoot(rParent);

				} else if (root.uniqueKey.compareTo(rParent.uniqueKey) > 0) {
					// root must be to the right of the root's parent
					root.leftChild = pivot.rightChild;
					pivot.rightChild.parent = root;
					pivot.rightChild = root;
					rParent.rightChild = pivot;
					root.parent = pivot;
					pivot.parent = rParent;
					this.root = searchRoot(rParent);
				}
			}
			// else if root has no parent, then rotate with no parent
			else {
				root.leftChild = pivot.rightChild;
				pivot.rightChild.parent = root;
				pivot.leftChild = root;
				root.parent = pivot;
				this.root = pivot;
			}
		}
	}

	/*
	 * Insert a node to the Red Black Tree First is the root any after that will
	 * be inside the root. Returns whether false if the key is the same,
	 * otherwise true.
	 */
	public boolean insert(T key, E value) {
		// Creating a Node
		RBNode<T, E> insertedNode = createRBNode(key, value);
		// First Node will be the Root
		if (checkSize(this.size)) {
			this.root = insertedNode;
			insertedNode.leftChild = nillLeaf;
			insertedNode.rightChild = nillLeaf;
		} else {
			RBNode<T, E> parent = nillLeaf;
			RBNode<T, E> current = root;
			while (current != nillLeaf) {
				// add to left
				if (key.compareTo(current.getUniqueKey()) < 0) {
					parent = current;
					current = current.leftChild;
				}
				// add to right
				else if (key.compareTo(current.getUniqueKey()) > 0) {
					parent = current;
					current = current.rightChild;
				} else
					// return if the key is a duplicate
					return false;
			}
			// Add a node to the root.
			if (key.compareTo(current.getUniqueKey()) < 0) {
				parent.leftChild = insertedNode;
				insertedNode.parent = parent;
				insertedNode.leftChild = nillLeaf;
				insertedNode.rightChild = nillLeaf;
			} else {
				parent.rightChild = insertedNode;
				insertedNode.parent = parent;
				insertedNode.leftChild = nillLeaf;
				insertedNode.rightChild = nillLeaf;
			}
		}
		this.size++;
		return true;
	}

	/*
	 * Red Black Tress rules checker.
	 */
	public boolean checkCases(RBNode<T, E> node) {
		// case 1
		if (node.uniqueKey.compareTo(this.root.uniqueKey) == 0) {
			node.color = 'b';
			return true;
		}
		// case 2
		if (grandPNode(node).color == 'b') {
			return true;
		}
		// case 3
		if ((node.parent.color == 'r') && (uncleNode(node).color == 'r')) {
			node.parent.color = 'b';
			uncleNode(node).color = 'b';
			grandPNode(node).color = 'r';
			checkCases(grandPNode(node));
			return true;
		}
		// case 4
		if ((node.parent.color == 'r') && (uncleNode(node).color == 'b')) {
			if ((node.uniqueKey.compareTo(node.parent.uniqueKey) > 0)
					&& (node.parent.uniqueKey.compareTo(grandPNode(node).uniqueKey) < 0)) {
				// must be to the right of parent
				leftRotate(node.parent);
				node = node.parent;
			}
			if ((node.uniqueKey.compareTo(node.parent.uniqueKey) < 0)
					&& (node.parent.uniqueKey.compareTo(grandPNode(node).uniqueKey) > 0)) {
				rightRotate(node.parent);
				node = node.parent;
			}
			// check case 5
			if ((node.parent.color == 'r') && (uncleNode(node).color == 'b')) {
				if ((node.uniqueKey.compareTo(node.parent.uniqueKey) < 0)
						&& (node.parent.uniqueKey.compareTo(grandPNode(node).uniqueKey) < 0)) {
					node.parent.color = 'r';
					rightRotate(grandPNode(node));
				}
				if ((node.uniqueKey.compareTo(node.parent.uniqueKey) > 0)
						&& (node.parent.uniqueKey.compareTo(grandPNode(node).uniqueKey) > 0)) {
					node.parent.color = 'b';
					leftRotate(grandPNode(node));
				}
			}
		}
		return false;
	}
}
