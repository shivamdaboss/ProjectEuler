import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

public class LongestCollatzSequence {

	public static HashMap<BigInteger, Integer> memory = new HashMap<BigInteger, Integer>(); 
	
	public static void main (String[] args) {
		int max = 0, cur = 0, maxIndex = 0;
		for(int i = 2; i < 1000000; i++) {
			cur = CollatzLength(BigInteger.valueOf(i));
			if(max < cur) {
				max = cur;
				maxIndex = i;
			}
		}
		System.out.println(maxIndex);
	}

	public static int CollatzLength(BigInteger n) {
		int count = 0;
		BigInteger original = n;
		while(n.compareTo(BigInteger.ONE) == 1) {
			if(memory.keySet().contains(n)) {
				memory.put(original, count + memory.get(n));
				return memory.get(original) + 1;
			}
			
			else if(n.mod(BigInteger.valueOf(2)).equals(BigInteger.ONE)) {
				n = (n.multiply(BigInteger.valueOf(3))).add(BigInteger.ONE);
			}
			else {
				n = n.divide(BigInteger.valueOf(2));
			}
			count++;
		}
		memory.put(original, count);
		return count + 1;
	}
}
