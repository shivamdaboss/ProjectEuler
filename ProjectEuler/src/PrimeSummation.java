
public class PrimeSummation {

	public static int primeSum(int n) {
		int sum = 0;
		for(int i = 2; i <= n; i++) {
			if(i > 10) {
				if(i % 2 != 0 && i%3 != 0 && i%5 != 0 && i%7 != 0) {
					if(isPrime(i)) {
						sum+= i;
					}
				}
			}
			else {
				if(isPrime(i)) {
					sum+= i;
				}
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(primeSum(2000000));
	}

	public static boolean isPrime(int x) {
		if(x == 1 || x == 0) {return false; }
		for(int i = 2; i < Math.sqrt(x + 1); i++) {
			if(x % i == 0) {
				return false;
			}
		}
		return true;
	}
}

