
public class TesterMethod {

	public static void main(String[] args) {
		RBNode<Integer, Character> rootTemp = new RBNode<Integer, Character>(9, 'r', 'r');
		RBNode<Integer, Character> leftChildTemp = new RBNode<Integer, Character>(2, 'r', 'r');
		RBNode<Integer, Character> rightChildTemp = new RBNode<Integer, Character>(14, 'r', 'r');
		rootTemp.leftChild = leftChildTemp;
		rootTemp.rightChild = rightChildTemp;
		RBNode<Integer, Character> temp ;
		RBNode<Integer, String> temp1;

	}

}
