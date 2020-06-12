
public class EvenFib {
	
	/* returns the sum of the even fibonacci numbers from 1 to the lim */
	
	public static int evenFib(int x, int y, int lim) {
		int num = x + y;
		if(x > lim) 
			return 0;
		else 
			if(x % 2 == 0)
				return x + evenFib(y, num, lim);
			else
				return evenFib(y, num, lim);
		
	}
	
	public static void main(String[] args) {
		System.out.println(evenFib(1, 2, 4000000));
	}
}	
