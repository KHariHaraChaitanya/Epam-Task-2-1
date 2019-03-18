/*
 * JUnit test for class Arithmetics 
 * author-K.HariHaraChaitanya project-Calculator
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmeticsTest {

	@Test
	public void addtest() {
	    Arithmetics calculate = new Arithmetics();
	    assertEquals(7, calculate.add(3, 4), 0.01);
	}
	public void addOverloaded_test() {
	    Arithmetics calculate = new Arithmetics();
	    assertEquals(10, calculate.add(3,4,3), 0.01);
	}
	public void multiplytest() {
	    Arithmetics calculate = new Arithmetics();
	    assertEquals(12, calculate.multiply(3, 4), 0.01);
	}
	public void multiplyOverloaded_test() {
		Arithmetics calculate = new Arithmetics();
		assertEquals(24, calculate.multiply(3,4,2), 0.01);
	}
	public void dividetest() {
		Arithmetics calculate = new Arithmetics();
		assertEquals(24, calculate.divide(4,2), 0.01);
	}
	
}
