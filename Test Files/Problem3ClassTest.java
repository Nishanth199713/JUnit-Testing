package Homework3;

//import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem3ClassTest {

	Problem3Class prb3;
	
	@Before
	public void setUp() throws Exception {
		prb3 = new Problem3Class();
	}

	@Test
	@FileParameters("src/Homework3/Problem3TestCaseTable.csv")
	public void test(int testCaseNo,boolean member, int creditRating, double cart,boolean expapproved ,String bpNumber,String MCDC) {
		prb3.approvePurchase(member, creditRating, cart);
	}
}