package fibonacci.dynamic;

public class FibonacciDynamic {

	private int[] dp= new int[100];
	
	public int solve(int index) {
		
		if(index == 0) {
			throw new IllegalArgumentException();
		}
		
		if(index == 1 || index == 2) {
			return 1;
		} else {
			if(dp[index] != 0) {
				return dp[index];
			} else {
				dp[index]= solve(index-1) + solve(index-2);
				return dp[index];
			}
		}
	}
}