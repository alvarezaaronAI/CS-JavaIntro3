
public class TesterMethod {

	public static void main(String[] args) {
		RBNode<Integer, Character> rootTemp = new RBNode<Integer, Character>(4, 'r', 'r');
		RBNode<Integer, Character> leftChildTemp = new RBNode<Integer, Character>(3, 'r', 'r');
		RBNode<Integer, Character> rightChildTemp = new RBNode<Integer, Character>(5, 'r', 'r');
		rootTemp.leftChild = leftChildTemp;
		rootTemp.rightChild = rightChildTemp;
		
		System.out.println(rootTemp.uniqueKey.compareTo(leftChildTemp.uniqueKey));
		System.out.println(rootTemp.uniqueKey.compareTo(rightChildTemp.uniqueKey));
	}

}
