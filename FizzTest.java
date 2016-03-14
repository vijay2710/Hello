import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzTest {
	@Test
	public void zeroIsZero(){
	    FizzBuzz f = new FizzBuzz(3,5);
		String result = f.respond(0);
		assertEquals("0", result);
	}
	@Test
	public void oneIsOne(){
	    FizzBuzz f = new FizzBuzz(3,5);
		String result = f.respond(1);
		assertEquals("1", result);
	}