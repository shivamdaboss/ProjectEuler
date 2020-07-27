import java.math.BigInteger;

public class FactorialDigitSum {
	
	public static void main(String[] args) {
		BigInteger x = BigInteger.valueOf(1);
		for(BigInteger i = BigInteger.ONE; i.compareTo(BigInteger.valueOf(100)) != 1; i = i.add(BigInteger.valueOf(1))) {
			x = x.multiply(i);
		}
		BigInteger sum = BigInteger.ZERO;
		String[] nums = x.toString().split("");
		for(int i = 0; i < nums.length; i++) {
			sum = sum.add(BigInteger.valueOf(Integer.parseInt(nums[i])));
		}
		System.out.println(sum);
	}

}
