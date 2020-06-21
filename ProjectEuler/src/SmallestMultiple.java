import java.util.ArrayList;
import java.util.HashMap;

public class SmallestMultiple {
	
	public static HashMap<Integer, Integer> getPrimeFactors(int num){
		HashMap<Integer, Integer> factorsMap = new HashMap<Integer, Integer>();
		int i = 2;
		while(num != 1) {
			while(!isPrime(i)) {
				i++;
			}
			if(num % i == 0) {
				num = num /i;
				if(factorsMap.get(i) == null) {
					factorsMap.put(i, 1);
				}
				else {
					factorsMap.put(i, factorsMap.get(i) + 1);
				}
			}
			else {
				i++;
			}
		}
		return factorsMap;
	}
	
	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if(num % i == 0)
					return false;
		}
		return true;
	}
	
	public static int lcm(ArrayList<Integer> nums) {
		HashMap<Integer, HashMap<Integer, Integer>> factorsArr = new HashMap<Integer, HashMap<Integer, Integer>>();
		int max = -1;
		for(int i = 0; i < nums.size(); i++) {
			factorsArr.put(nums.get(i), getPrimeFactors(nums.get(i)));
			if(max < factorsArr.get(nums.get(i)).size())
				max = factorsArr.get(nums.get(i)).size();
		}
		HashMap<Integer, Integer> LCMfac = new HashMap<Integer, Integer>();
		for(int i : factorsArr.keySet()) {
			for(int j : factorsArr.get(i).keySet()) {
				if(LCMfac.get(j) == null) {
					LCMfac.put(j, factorsArr.get(i).get(j));
				}
				else {
					if(LCMfac.get(j) < factorsArr.get(i).get(j)) {
						LCMfac.put(j, factorsArr.get(i).get(j));
					}
				}
				
			}
		}
		int lcm = 1;
		for(int i : LCMfac.keySet()) {
			lcm *= Math.pow(i, LCMfac.get(i));
		}
		return lcm;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		nums.add(10);
		nums.add(11);
		nums.add(12);
		nums.add(13);
		nums.add(14);
		nums.add(15);
		nums.add(16);
		nums.add(17);
		nums.add(18);
		nums.add(19);
		nums.add(20);
		long begin = System.currentTimeMillis();
		System.out.println(lcm(nums));
		long end = System.currentTimeMillis();
		long elapsed = end - begin;
		System.out.println("Elapsed Time: " +  Long.toString(elapsed));
		
	}
	
	

}
