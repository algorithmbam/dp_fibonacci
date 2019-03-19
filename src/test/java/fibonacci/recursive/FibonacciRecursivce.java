package fibonacci.recursive;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FibonacciRecursivce {

	private FibonacciRecursive fibonacci;
	
	@Before
	public void setUp() {
		fibonacci= new FibonacciRecursive(); 
	}
	
	@Test
	public void �Է°���_1�ϋ���_1����() {

		// act
		int answer= fibonacci.solve(1);
		
		// assert
		assertThat(answer, is(1));
	}
	
	@Test
	public void �Է°���_2�ϋ���_1����() {

		// act
		int answer= fibonacci.solve(2);
		
		// assert
		assertThat(answer, is(1));
	}
	
	@Test
	public void �Է°���_3�ϋ���_2����() {

		// act
		int answer= fibonacci.solve(3);
		
		// assert
		assertThat(answer, is(2));
	}
	
	@Test
	public void �Է°���_4�ϋ���_3����() {

		// act
		int answer= fibonacci.solve(4);
		
		// assert
		assertThat(answer, is(3));
	}
	
	@Test
	public void �Է°���_5�ϋ���_5����() {

		// act
		int answer= fibonacci.solve(5);
		
		// assert
		assertThat(answer, is(5));
	}
	
	@Test
	public void �Է°���_6�ϋ���_8����() {

		// act
		int answer= fibonacci.solve(6);
		
		// assert
		assertThat(answer, is(8));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void �Է°���_0�ϋ���_illegalArgumentExcecptionó��() {

		// act
		int answer= fibonacci.solve(0);
	}
}