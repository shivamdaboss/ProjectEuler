
public class SpecialPythagoreanTriplet {
	
	public static int function(int lim) {
		int a = 0;
		int b = 0;
		int c = 0;
		double n = 0;
		for(double m = 1; m < lim/2; m++) {
			n = (lim / (2 * m)) - m;
			if(m > n && n % 1 == 0 && n > 0) {
				a = (int)Math.pow(m, 2) - (int)Math.pow(n, 2);
				b = (int) (2*m*n);
				c = (int)Math.pow(n, 2) + (int)Math.pow(m, 2);
				return a * b * c;
			}
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		System.out.println(function(1000));
	}
}
