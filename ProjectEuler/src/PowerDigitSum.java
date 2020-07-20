import java.math.BigInteger;

public class PowerDigitSum {
	
	
	public static void main(String[] args) {
		BigInteger a = BigInteger.valueOf(2).pow(1000);
		String[] vals = a.toString().split("");
		int sum = 0;
		for(int i = 0; i < vals.length; i++) {
			sum += Integer.parseInt(vals[i]);
		}
		System.out.println(sum);
	}
}
