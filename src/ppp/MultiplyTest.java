package ppp;
import org.junit.Test;



import static org.junit.Assert.*;



public class MultiplyTest {

	@Test
	public void test() {
		
		Calculator obj=new Calculator();
		int op4=obj.multiply(3, 3);
		assertEquals(9,op4);
	}

}
