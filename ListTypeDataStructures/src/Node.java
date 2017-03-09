/*Aaron Alvarez
Node Class that creates the Nodes
3/9/17*/
public class Node<E extends Comparable<E>,E1 extends Comparable<E1>, E2 extends Comparable<E2>> {
	protected E  category1;
	protected E1 category2;
	protected E2 category3;
	protected Node<E, E1, E2> right = null;
	protected Node<E, E1, E2> left = null;
	protected Node<E, E1, E2> down = null;
	
	public Node(E data1, E1 data2, E2 data3) {
		super();
		this.category1 = data1;
		this.category2 = data2;
		this.category3 = data3;
	}
	public E getCatergory1() {
		return category1;
	}
	public void setCatergory1(E catergory1) {
		this.category1 = catergory1;
	}
	public E1 getCatergory2() {
		return category2;
	}
	public void setCatergory2(E1 catergory2) {
		this.category2 = catergory2;
	}
	public E2 getCatergory3() {
		return category3;
	}
	public void setCatergory3(E2 catergory3) {
		this.category3 = catergory3;
	}
	@Override
	public String toString() {
		return "\n Node cat=" + category1 + ", cat2=" + category2 + ", cat3=" + category3
				+" RN=" + right + "  LN=" + left + ", DN=" + down  +" \n";
	}
	
	
}
