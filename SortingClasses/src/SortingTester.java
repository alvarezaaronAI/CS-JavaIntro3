import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class SortingTester {
	public static void main(String[] args) {
		BigInteger x = new BigInteger("0");
		for (int i = 0; i < 7; i++) {
			x = x.add(BigInteger.ONE);
		}
		System.out.println(x);
	}

}
