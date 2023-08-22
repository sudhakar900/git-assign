package ppp;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivideTest {

	
	@Test
	public void test() {
		Calculator obj=new Calculator();
		int op3= (int) obj.divide(3, 3);
		assertEquals(1,op3);
	}

}
