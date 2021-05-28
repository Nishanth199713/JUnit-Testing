package Homework3;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem2ClassTest {

	Problem2Class prb2;
	
	@Before
	public void setUp() throws Exception {
		prb2 = new Problem2Class();
	}

	@FileParameters("src/Homework3/Problem2TestCaseTable.csv")
	@Test
		public void testDetermine(int testCaseNo, boolean cruiseEngaged,double distance,int timer, boolean expRed, 
				boolean expYellow, boolean expGreen,int exptimer, String bpNumber)
		{
	
	prb2.setGreenLight(expGreen);
	prb2.setRedLight(expRed);

	prb2.setYellowLight(expYellow);
	prb2.setTimer(timer);
	prb2.setWarnings(cruiseEngaged, distance);
	assertEquals(expRed,prb2.isRedLight());
	assertEquals(expYellow,prb2.isYellowLight());
	assertEquals(expGreen,prb2.isGreenLight());
	assertEquals(exptimer,prb2.getTimer());


	}
}