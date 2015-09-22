package MainPackage;

import static org.junit.Assert.*;
import org.junit.Test;

public class Quiz2Test {

	@Test
	public void test1() {
		Quiz2 Test1 = new Quiz2();
		assertEquals("The FV for 12520 dollars(initial) should be 52379.01(with 3% increase for tuition, 4% APR, and 4 years)", 52379.01, Quiz2.FV(12520,3,4,0),0.01);
	}
	
	@Test
	public void test2() {
		Quiz2 Test2 = new Quiz2();
		assertEquals("The PMT for 12520 dollars(initial) should be 2471.28(with 3% increase for tuition, 4% APR, and 4 years)", 2471.28, Quiz2.MP(12520,0,4,4),0.01);
	}

}
