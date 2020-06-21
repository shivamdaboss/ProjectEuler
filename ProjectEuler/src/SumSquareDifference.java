import java.math.BigInteger;

public class SumSquareDifference {
	
	public static BigInteger method(int n) {
		BigInteger SumOfSquares = BigInteger.valueOf(0); 
		for(int i = 0; i <= n; i++) {
			SumOfSquares = SumOfSquares.add(BigInteger.valueOf((long)Math.pow(i, 2)));
		}
		BigInteger SquareOfSum = BigInteger.ZERO;
		for(int i = 0; i <= n; i++) {
			SquareOfSum = SquareOfSum.add(BigInteger.valueOf(i));
		}
		SquareOfSum = SquareOfSum.pow(2);
		return SquareOfSum.subtract(SumOfSquares);
	}
	
	public static void main(String[] args) {
		System.out.println(method(100));
	}

}
