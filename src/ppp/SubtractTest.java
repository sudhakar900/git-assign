package ppp;
import org.junit.Test;
import static org.junit.Assert.*;


public class SubtractTest {

	@Test
	public void test() {
		Calculator obj=new Calculator();
		int op=obj.subtract(3, 2);
		assertEquals(1,op);

	}

}
