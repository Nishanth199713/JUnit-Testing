package Homework3;

//import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem5ClassTest {

	Problem5Class prb5;
	
	@Before
	public void setUp() throws Exception {
		prb5 = new Problem5Class();
	}

	@Test
	@FileParameters("src/Homework3/Problem5TestCaseTable.csv")
	public void test(int testCaseNo,  double x,double y ,String bpNumber) {
		prb5.calcY(x);
	}
}