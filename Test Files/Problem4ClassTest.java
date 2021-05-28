package Homework3;

//import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTest {

	Problem4Class prb4;
	
	@Before
	public void setUp() throws Exception {
		prb4 = new Problem4Class();
	}

	@Test
	@FileParameters("src/Homework3/Problem4TestCaseTable.csv")
	public void test(int testCaseNo,boolean goldStatus,  double cart,int creditRating ,int yearsMember,boolean expapproved ,String bpNumber) {
		prb4.checkOut(cart, creditRating, yearsMember,goldStatus);
	}
}