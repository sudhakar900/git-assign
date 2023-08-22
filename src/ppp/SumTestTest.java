package ppp;
// importing unit test library 
import org.junit.Test;

import static org.junit.Assert.*;


public class SumTestTest {

	@Test
	public void sum() {
		Calculator obj=new Calculator();
		int op1=obj.sum(3, 3);
		assertEquals(6,op1);
	}
}
