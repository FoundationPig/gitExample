package gitExample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class jUnitTest{
	
	@Test
	public void testExer1() {
		String x = "onetwodefault";
		assertEquals(x,exerTester.Excer1());

	}
	
	@Test
	public void testExcer2() {
		int x = 8;
		assertEquals(x,exerTester.Excer2());
	}
	
	@Test
	public void testExcer3() {
		int x = 26;
		assertEquals(x,exerTester.Excer3());
	}
	
	@Test
	public void testExcer4() {
		int x = 4;
		assertEquals(x,exerTester.Excer4());
	}
	
	@Test
	public void testExcer6() {
		long[] x = {0.5,0.75,1.0,1.25,0.75,1.0,1.25,1.5,1.0,1.25,1.5,1.75,1.25,1.5,1.75,2.0};
		assertArrayEquals(x,exerTester.Excer6(4));
	}
	
	

}
