import java.util.HashMap;

public class NumberLetterCount {

	
	public static HashMap<Integer, Integer> memory = new HashMap<Integer, Integer>();
	
	public static void main(String[] args) {
		memoryInit();
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			sum += getCount(i);
		}
		System.out.println(sum);
	}
	
	
	public static void memoryInit() {
		memory.put(1, ("one").length());
		memory.put(2, ("two").length());
		memory.put(3, ("three").length());
		memory.put(4, ("four").length());
		memory.put(5, ("five").length());
		memory.put(6, ("six").length());
		memory.put(7, ("seven").length());
		memory.put(8, ("eight").length());
		memory.put(9, ("nine").length());
		memory.put(10, ("ten").length());
		memory.put(11, ("eleven").length());
		memory.put(12, ("twelve").length());
		memory.put(13, ("thirteen").length());
		memory.put(14, ("fourteen").length());
		memory.put(15, ("fifteen").length());
		memory.put(16, ("sixteen").length());
		memory.put(17, ("seventeen").length());
		memory.put(18, ("eighteen").length());
		memory.put(19, ("nineteen").length());
		memory.put(20, ("twenty").length());
		memory.put(30, ("thirty").length());
		memory.put(40, ("fourty").length());
		memory.put(50, ("fifty").length());
		memory.put(60, ("sixty").length());
		memory.put(70, ("seventy").length());
		memory.put(80, ("eighty").length());
		memory.put(90, ("ninety").length());
	}
	
	public static int getCount(int num) {
		
		if(memory.get(num) != null) {
			  
			return memory.get(num);
		}
		
		else if(num == 1000) {
			return memory.get(1) + ("thousand").length();
		}
		
		else if(num >= 100) {
			if(num % 100 == 0) {
				memory.put(num, memory.get(Integer.parseInt(Integer.toString(num).substring(0, 1))) + ("hundred").length());
			}
			else {
				int hundreds = memory.get(num - (num % 100)) + 3; // 3 is for the and
				memory.put(num, hundreds + memory.get(num%100));
			}
		}
		
		else {
			int ones = (num%10);
			int tens = num - ones;
			memory.put(num, memory.get(tens) + memory.get(ones));
		}
		
		return memory.get(num);
		
	}
	
}
