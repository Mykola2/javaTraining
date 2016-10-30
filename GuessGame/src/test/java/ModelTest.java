import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class ModelTest {

	private static final int MIN = 0;
	private static final int MAX = 100;

	private static Model model;

	@Before
	public void beforeClass() {
		model = new Model();
		model.setLowerLimit(MIN);
		model.setUpperLimit(MAX);
	}
	
	@Test
	public void testChecker(){
		final int CORRECT_VALUE= 42;
		model.setCorrectValue(CORRECT_VALUE);
		
		//if the value is lower
		assertEquals(model.checkValue(30),-1);
		assertEquals(model.getLowerLimit(),30);
		
		//if the value is greater
		assertEquals(model.checkValue(50),0);
		assertEquals(model.getUpperLimit(),50);

		//if the value is correct
		assertEquals(model.checkValue(42),1);
		
	}

}
