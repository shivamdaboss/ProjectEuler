import java.math.BigInteger;
import java.util.HashSet;

public class LargestPrimeFactor {
	
	/* 
	 * Returns the largest prime factor of a number. Looks for pairs of factors of the number, and checks
	 * if they are prime using Fermatt's Little Theorem. Then, returns the maximum of the list. 
	 */

	public static BigInteger largestPrimeFac(BigInteger num) {
		BigInteger sqrt = num.sqrt();
		BigInteger j = BigInteger.ZERO;
		BigInteger ferI = BigInteger.ZERO, ferJ = BigInteger.ZERO;
		BigInteger rem = BigInteger.ZERO;
		HashSet<BigInteger> primes = new HashSet<BigInteger>();
		for(BigInteger i = sqrt.subtract(BigInteger.ONE); i.compareTo(BigInteger.ONE) != -1; i = i.subtract(BigInteger.ONE)) {
			j = num.divide(i);
			rem = num.remainder(i);
			if(rem.equals(BigInteger.ZERO)) { 
				
				ferI = BigInteger.valueOf(2).modPow(i.subtract(BigInteger.ONE), i);
				if(ferI.equals(BigInteger.ONE)) {
					primes.add(i);
				}
				ferJ = BigInteger.valueOf(2).modPow(j.subtract(BigInteger.ONE), j);
				if(ferJ.equals(BigInteger.ONE)) {
					primes.add(j);
				}
			}
		}
		BigInteger max = BigInteger.valueOf(-1);
		for(BigInteger i : primes) {
			if(i.compareTo(max) == 1) {
				max = i;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println(largestPrimeFac(BigInteger.valueOf(13195)));
		System.out.println(largestPrimeFac(new BigInteger("600851475143")));
	}
}
