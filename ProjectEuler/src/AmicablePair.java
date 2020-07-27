import java.util.ArrayList;
import java.util.HashSet;

public class AmicablePair {

	
	public static void main(String[] args) {
		ArrayList<Integer> set = new ArrayList<Integer>();
		int temp = 0;
		for(int i = 2; i < 10000; i++) {
			if(!set.contains(i)) {
				temp = sumFactors(i);
				if(i == sumFactors(temp) && temp != i) {
					set.add(i);
					set.add(temp);
				}
			}
		}
		temp = 0;
		for(int i = 0; i < set.size(); i++) {
			temp += set.get(i);
		}
		System.out.println(temp);
	}
	
	public static int sumFactors(int n) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for(int i = 1; i < Math.sqrt(n) + 1; i++) {
			if(n % i == 0 && !factors.contains(i)) {
				factors.add(i);
				if(n/i != i && n/i != n) {
					factors.add(n/i);
				}
			}
		}
		//System.out.println(factors);
		int sum = 0;
		for(int i = 0; i < factors.size(); i++) {
			sum+= factors.get(i);
		}
		return sum;
	}
}
