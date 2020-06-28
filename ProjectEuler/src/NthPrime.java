public class NthPrime {

	public static int nthPrime(int n) {
		int i = 1, j = 0;
		while(j < n) {
			i++;
			if(i > 10) {
				if(i % 2 != 0 && i%3 != 0 && i%5 != 0 && i%7 != 0) {
					if(isPrime(i)) {
						j++;
					}
				}
			}
			else {
				if(isPrime(i)) {
					j++;
				}
			}
			
		}
		return i;
	}
	
	public static void main(String[] args) {
		System.out.println(nthPrime(10001));
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

