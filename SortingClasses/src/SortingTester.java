
import java.math.BigInteger;

public class SortingTester {
	public static void main(String[] args) {
		BigInteger x = new BigInteger("0");
		for (int i = 0; i < 7; i++) {
			x = x.add(BigInteger.ONE);
		}
		System.out.println(x);
	}

}
