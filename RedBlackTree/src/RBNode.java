
public class RBNode<K extends Comparable<K>, V> {
	protected K uniqueKey;
	protected V data;
	protected char color;
	protected RBNode<K, V> parent = null;
	protected RBNode<K, V> leftChild = null;
	protected RBNode<K, V> rightChild = null;

	public RBNode(K key, V data, char color) {
		this.uniqueKey = key;
		this.data = data;
		this.color = color;
	}

	public K getUniqueKey() {
		return uniqueKey;
	}

	public void setUniqueKey(K uniqueKey) {
		this.uniqueKey = uniqueKey;
	}

	public V getData() {
		return data;
	}

	public void setData(V data) {
		this.data = data;
	}

	public char getColor() {
		return color;
	}

	public void setColor(char color) {
		this.color = color;
	}

	public RBNode<K, V> getParent() {
		return parent;
	}

	public void setParent(RBNode<K, V> parent) {
		this.parent = parent;
	}

	public RBNode<K, V> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(RBNode<K, V> leftChild) {
		this.leftChild = leftChild;
	}

	public RBNode<K, V> getRightChild() {
		return rightChild;
	}

	public void setRightChild(RBNode<K, V> rightChild) {
		this.rightChild = rightChild;
	}
	private String colorCharToString(char charColor){
		if(this.color == 'r'){
			return "Red";
		}
		else{
			return "Black";
		}
	}
	@Override
	public String toString() {
		return "RBNode Key= " + uniqueKey + ", DaTa=" + data + ", Color=" + colorCharToString(color) + ", \n P=" + parent
				+ ", LC=" + leftChild + ", RC=" + rightChild ;
	}
	
}
