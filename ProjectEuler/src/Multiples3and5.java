import java.util.HashSet;

public class Multiples3and5 {
	
	/* returns the sum of the multiples of 3 and 5 under the limit provided */
	
	public static int multiples3and5(int lim) {
		
		int i = 0, j = 0, x = 3*i, y = 5*j;
		HashSet<Integer> set = new HashSet<Integer>();
		while(x <= lim || y <= lim ) {
			if(x < lim) {
				set.add(x);
			}
			if(y < lim) {
				set.add(y);
			}
			i++;
			j++;
			x = 3*i; 
			y = 5*j;
		}
		int count = 0; 
		for(Integer num : set) {
			count+= num;
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(multiples3and5(10));
		System.out.println(multiples3and5(100));
	}

}
