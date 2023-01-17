package GowtthamiGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {

	@Test
	public void testCalculateInterest() {
//		fail("Not yet implemented");
		Calculate c = new Calculate();
		float ex = c.calculateInterest(2000, 10, 10);
		float act = 2000;
		assertEquals(ex, act,0.0);
	}

}
