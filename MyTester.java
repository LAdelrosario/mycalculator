package mycalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTester {

	@Test
	//test for add function
	public void testAdd() {
		MyCalculator mc = new MyCalculator();
		float actual = mc.add(2,10);
		assertEquals("2+10=12", 12, actual, 0.0);
		//fail("Not yet implemented");
	}

	@Test
	//test for sub function
	public void testSubtract() {
		MyCalculator mc = new MyCalculator();
		float actual = mc.subtract(2,10);
		assertEquals("2-10=-8", -8, actual, 0.0);
		//fail("Not yet implemented");
	}

	@Test
	//test for multiply function
	public void testMultiply() {
		MyCalculator mc = new MyCalculator();
		float actual = mc.multiply(2,10);
		assertEquals("2*10=20", 20, actual, 0.0);
		//fail("Not yet implemented");
	}

	@Test
	//test for divide function
	public void testDivide() {
		MyCalculator mc = new MyCalculator();
		float actual = mc.divide(10,2);
		assertEquals("10/2=5", 5, actual, 0.0);
		//fail("Not yet implemented");
	}

	@Test
	//test for square function
	public void testSquare() {
		MyCalculator mc = new MyCalculator();
		float actual = mc.square(2);
		assertEquals("2^2=4", 4, actual, 0.0);
		//fail("Not yet implemented");
	}

	@Test
	//test for cube function
	public void testCube() {
		MyCalculator mc = new MyCalculator();
		float actual = mc.square(2);
		assertEquals("2^3=8", 4, actual, 0.0);
		//fail("Not yet implemented");
	}

	@Test
	//test for nfactorial function
	public void testNfactorial() {
		MyCalculator mc = new MyCalculator();
		float actual = mc.nfactorial(2);
		assertEquals("2!=2", 2, actual, 0.0);
		//fail("Not yet implemented");
	}

	@Test
	//test for binarySearch function
	public void testBinarySearch() {
		int a[] = {0,1,2,3}; 
		MyCalculator mc = new MyCalculator();
		float actual = mc.binarySearch(a,5);
		assertEquals("0,1,2,3=0", -1, actual, 0.0);
		//fail("Not yet implemented");
	}

}
