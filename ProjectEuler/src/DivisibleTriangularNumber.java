
public class DivisibleTriangularNumber {
	
	public static int method(int x) {
		int tri = 0;
		int i = 1;
		while(true) {
			tri += i;
			if(factorCount(tri) >= x) {
				return tri;
			}
			i++;
		}
	}

	
	public static int factorCount(int x) {
		int count = 0; 
		for(int i = 1; i < Math.sqrt(x) + 1; i++) {
			if(x % i == 0) {
				count += 2;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		System.out.println(method(500));
	}
}
