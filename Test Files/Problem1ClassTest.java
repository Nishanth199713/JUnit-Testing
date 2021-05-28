package Homework3;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class Problem1ClassTest {

	private Problem1Class prb1;
	
	@Before
	public void setUp() throws Exception {
		prb1 = new Problem1Class();
	}

	@SuppressWarnings("unused")
	private static final Object[] parametersProblem1ClassTest () {
		return $(
//					
//				Test case 1
				$(	  0.00, -50.00, false, false),
//				Test case 2
				$(	 1_499.99, 1_514.99, false, false),
//				Test case 3
				$(   5_000.00, 5_055.00, false, false),
//				Test case 4
				$(  9_999.99, 10_124.99, false, false),
//				Test case 5
				$(  25_000.00, 25_375.00, false, false),
//				Test case 6 
				$(  49_999.99, 50_999.99, false, false),
//				Test case 7 
				$(  50_000.00, 51_250.00, true, true),
//				Test case 8 
				$(	 -20_000.00, -20_050.00, false, false),
//				Test case 9 
				$(   0.01, 0.01, false, false),
//				Test case 10 
				$(  1_500.00, 1_516.50, false, false),
//				Test case 11 
				$(5_000.01, 5_062.51, false, false),
//				Test case 12
				$(10_000.00, 10_150.00, false, false),
//				Test case 13
				$(25_000.01, 25_500.01, false, false),
//				Test case 14
				$(100_000.00, 102_500.00, true, true)
		);
	}

	@Test
	@Parameters(method="parametersProblem1ClassTest")
	public void test(double Balance, double expBalance, boolean giftCard, boolean honoredStatus ) {
		prb1.calculateBalance(Balance);

	assertEquals(giftCard,prb1.isGiftCard());
	assertEquals(honoredStatus,prb1.isHonoredStatus());
	assertEquals(expBalance,prb1.getBalance(),0.01);

	
	}
}