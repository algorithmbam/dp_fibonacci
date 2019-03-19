package fibonacci.recursive;

public class FibonacciRecursive {

	public int solve(int index) {
		
		if(index == 0) {
			throw new IllegalArgumentException();
		}
		
		if(index == 1 || index == 2) {
			return 1;
		} else {
			return solve(index-1) + solve(index-2);
		}
	}
}
