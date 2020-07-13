import java.math.BigInteger;

public class LatticePaths {
	
	public static BigInteger[][] grid;
	
	public static void main(String[] args) {
		
		int size = 20;
		grid = new BigInteger[size + 1][size + 1];
		for(int i = 0; i < size + 1; i++) {
			for(int j = 0; j < size + 1; j++) {
				grid[i][j] = BigInteger.valueOf(-1);
			}
		}
		grid[0][0] = BigInteger.ONE;
		for(int i = 0; i < size + 1; i++) {
			calcIncoming(i, i);
		}

		System.out.println(grid[size][size]);
		
		
	}
    
	public static BigInteger calcIncoming(int i, int j) {
		if(grid[i][j].equals(BigInteger.valueOf(-1))) {
			if(i == 0) {
				grid[i][j] = calcIncoming(i, j - 1);;
			}
			else if(j == 0){
				grid[i][j] = calcIncoming(i - 1, j);
			}
			else{
				grid[i][j] = calcIncoming(i - 1, j).add(calcIncoming(i, j - 1));
			}
		}
		return grid[i][j];
	}
}
