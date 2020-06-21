
public class PalindromeProduct {
	
	public static boolean isPal(int num) {
		
		String str = Integer.toString(num);
		for(int i = 0; i < str.length() - 1 - i; i++) {
			if(str.charAt(i) != str.charAt(str.length() - 1 - i) ) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int max = -1;
		for(int i = 999; i >= 100; i--) {
			for(int j = 999; j >= 100; j--) {
				if(isPal(i*j)) {
					if(max < i*j) {
						max = i*j;
					}
				}
			}
		}
		System.out.println(max);
	}

}
