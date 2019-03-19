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
	public void 입력값이_1일떄는_1리턴() {

		// act
		int answer= fibonacci.solve(1);
		
		// assert
		assertThat(answer, is(1));
	}
	
	@Test
	public void 입력값이_2일떄는_1리턴() {

		// act
		int answer= fibonacci.solve(2);
		
		// assert
		assertThat(answer, is(1));
	}
	
	@Test
	public void 입력값이_3일떄는_2리턴() {

		// act
		int answer= fibonacci.solve(3);
		
		// assert
		assertThat(answer, is(2));
	}
	
	@Test
	public void 입력값이_4일떄는_3리턴() {

		// act
		int answer= fibonacci.solve(4);
		
		// assert
		assertThat(answer, is(3));
	}
	
	@Test
	public void 입력값이_5일떄는_5리턴() {

		// act
		int answer= fibonacci.solve(5);
		
		// assert
		assertThat(answer, is(5));
	}
	
	@Test
	public void 입력값이_6일떄는_8리턴() {

		// act
		int answer= fibonacci.solve(6);
		
		// assert
		assertThat(answer, is(8));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void 입력값이_0일떄는_illegalArgumentExcecption처리() {

		// act
		int answer= fibonacci.solve(0);
	}
}