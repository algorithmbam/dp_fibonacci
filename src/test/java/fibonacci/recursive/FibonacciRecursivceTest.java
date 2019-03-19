package fibonacci.recursive;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FibonacciRecursivceTest {

	private FibonacciRecursive fibonacci;
	long startTime;
	long endTime;
	
	@Before
	public void setUp() {
		fibonacci= new FibonacciRecursive(); 
	}
	
	@Test
	public void 입력값이_1일떄는_1리턴() {
		// act
		checkStartTime();
		
		int answer= fibonacci.solve(1);
		
		checkEndTime();
		printElapsedTime();
		
		// assert
		assertThat(answer, is(1));
	}
	
	@Test
	public void 입력값이_2일떄는_1리턴() {

		// act
		checkStartTime();
		
		int answer= fibonacci.solve(2);
		
		checkEndTime();
		printElapsedTime();
		
		// assert
		assertThat(answer, is(1));
	}
	
	@Test
	public void 입력값이_3일떄는_2리턴() {

		// act
		checkStartTime();
		
		int answer= fibonacci.solve(3);
		
		checkEndTime();
		printElapsedTime();
		
		// assert
		assertThat(answer, is(2));
	}
	
	@Test
	public void 입력값이_4일떄는_3리턴() {

		// act
		checkStartTime();
		
		int answer= fibonacci.solve(4);
		
		checkEndTime();
		printElapsedTime();
		
		// assert
		assertThat(answer, is(3));
	}
	
	@Test
	public void 입력값이_5일떄는_5리턴() {

		// act
		checkStartTime();
		
		int answer= fibonacci.solve(5);
		
		checkEndTime();
		printElapsedTime();
		
		// assert
		assertThat(answer, is(5));
	}
	
	@Test
	public void 입력값이_6일떄는_8리턴() {

		// act
		checkStartTime();
		
		int answer= fibonacci.solve(6);
		
		checkEndTime();
		printElapsedTime();
		
		// assert
		assertThat(answer, is(8));
	}
	
	@Test
	public void 입력값이_10일떄는_55리턴() {

		// act
		checkStartTime();
		
		int answer= fibonacci.solve(10);
		
		checkEndTime();
		printElapsedTime();
		
		// assert
		assertThat(answer, is(55));
	}
	
	@Test
	public void 입력값이_13일떄는_233리턴() {

		// act
		checkStartTime();
		
		int answer= fibonacci.solve(13);
		
		checkEndTime();
		printElapsedTime();
		
		// assert
		assertThat(answer, is(233));
	}
	
	@Test
	public void 입력값이_15일떄는_610리턴() {

		// act
		checkStartTime();
		
		int answer= fibonacci.solve(15);
		
		checkEndTime();
		printElapsedTime();
		
		// assert
		assertThat(answer, is(610));
	}
	
	@Test
	public void 입력값이_20일떄는_6765리턴() {

		// act
		checkStartTime();
		
		int answer= fibonacci.solve(20);
		
		checkEndTime();
		printElapsedTime();
		
		// assert
		assertThat(answer, is(6765));
	}
	
	@Test
	public void 입력값이_30일떄는_832040리턴() {

		// act
		checkStartTime();
		
		int answer= fibonacci.solve(30);
		
		checkEndTime();
		printElapsedTime();
		
		// assert
		assertThat(answer, is(832040));
	}
	
	@Test
	public void 입력값이_55일떄는_2144908973리턴() {

		// act
		checkStartTime();
		
		int answer= fibonacci.solve(55);
		
		checkEndTime();
		printElapsedTime();
		
		// assert
		assertThat(answer, is(2144908973));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void 입력값이_0일떄는_illegalArgumentExcecption처리() {

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