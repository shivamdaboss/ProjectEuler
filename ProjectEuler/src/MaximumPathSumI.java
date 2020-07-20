
public class MaximumPathSumI {
	
	public static int[] bestSums;
	
	public static void main(String[] args) {
		int[] list = {
				75, 
				95, 64,
				17, 47, 82,
				18, 35, 87, 10,
				20, 04, 82, 47, 65,
				19, 01, 23, 75, 03, 34,
				88, 02, 77, 73, 07, 63, 67,
				99, 65, 04, 28, 06, 16, 70, 92,
				41, 41, 26, 56, 83, 40, 80, 70, 33,
				41, 48, 72, 33, 47, 32, 37, 16, 94, 29,
				53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14,
				70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57,
				91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48,
				63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31,
				04, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 04, 23
				};
		
		System.out.println(method(list));
	}
	
	public static int method(int[] list) {
		bestSums = new int[list.length];
		bestSums[0] = list[0];
		int level = 2;
		int count = 0;
		int index = 1;
		int prevLevelIndex = 0;
		int totalLevels = getLevels(list);
		while(level <= totalLevels) {
			while(count < level) {
				if(count == 0) {
					bestSums[index] = list[index] + bestSums[prevLevelIndex];
				}
				else if(count == level - 1) {
					bestSums[index] = list[index] + bestSums[prevLevelIndex - 1];
				}
				else {
					bestSums[index] = list[index] + Math.max(bestSums[prevLevelIndex], bestSums[prevLevelIndex - 1]);
				}
				count++;
				index++;
				prevLevelIndex++;
			}
			prevLevelIndex = index - level;

			level++;
			count = 0;
		}
		
		int max = -1;
		for(int i = index - level + 1; i < bestSums.length; i++) {
			if(max < bestSums[i]) {
				max = bestSums[i];
			}
		}
		
		return max;
		
		
	}
	
	
	public static int getLevels(int[] list) {
		int count = 0;
		int level = 1;
		for(int i = 0; i < list.length; i++) {
			count++;
			if(count >= level) {
				count = 0;
				level++;
			}
		}
		return level - 1;
	}
}
