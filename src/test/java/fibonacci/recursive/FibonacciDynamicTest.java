package fibonacci.recursive;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class FibonacciDynamicTest {

	private FibonacciDynamic fibonacci;
	long startTime;
	long endTime;
	
	@Before
	public void setUp() {
		fibonacci= new FibonacciDynamic(); 
	}
	
	@Test
	public void �Է°���_1�ϋ���_1����() {
		// act
		checkStartTime();
		
		int answer= fibonacci.solve(1);
		
		checkEndTime();
		printElapsedTime();
		
		// assert
		assertThat(answer, is(1));
	}
	
	@Test
	public void �Է°���_2�ϋ���_1����() {

		// act
		checkStartTime();
		
		int answer= fibonacci.solve(2);
		
		checkEndTime();
		printElapsedTime();
		
		// assert
		assertThat(answer, is(1));
	}
	
	@Test
	public void �Է°���_3�ϋ���_2����() {

		// act
		checkStartTime();
		
		int answer= fibonacci.solve(3);
		
		checkEndTime();
		printElapsedTime();
		
		// assert
		assertThat(answer, is(2));
	}
	
	@Test
	public void �Է°���_4�ϋ���_3����() {

		// act
		checkStartTime();
		
		int answer= fibonacci.solve(4);
		
		checkEndTime();
		printElapsedTime();
		
		// assert
		assertThat(answer, is(3));
	}
	
	@Test
	public void �Է°���_5�ϋ���_5����() {

		// act
		checkStartTime();
		
		int answer= fibonacci.solve(5);
		
		checkEndTime();
		printElapsedTime();
		
		// assert
		assertThat(answer, is(5));
	}
	
	@Test
	public void �Է°���_6�ϋ���_8����() {

		// act
		checkStartTime();
		
		int answer= fibonacci.solve(6);
		
		checkEndTime();
		printElapsedTime();
		
		// assert
		assertThat(answer, is(8));
	}
	
	@Test
	public void �Է°���_10�ϋ���_55����() {

		// act
		checkStartTime();
		
		int answer= fibonacci.solve(10);
		
		checkEndTime();
		printElapsedTime();
		
		// assert
		assertThat(answer, is(55));
	}
	
	@Test
	public void �Է°���_55�ϋ���_2144908973����() {

		// act
		checkStartTime();
		
		int answer= fibonacci.solve(55);
		
		checkEndTime();
		printElapsedTime();
		
		// assert
		assertThat(answer, is(2144908973));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void �Է°���_0�ϋ���_illegalArgumentExcecptionó��() {

		// act
		checkStartTime();
		
		int answer= fibonacci.solve(0);
		
		checkEndTime();
		printElapsedTime();
	}

	private void checkStartTime() {
		startTime= System.currentTimeMillis();
	}
	
	private void checkEndTime() {
		endTime= System.currentTimeMillis();
	}
	
	private void printElapsedTime() {
		System.out.println(endTime - startTime + " millisecond. ");
	}
}