import static org.junit.Assert.*;

import org.junit.Test;

public class example {

	@Test
	public void test() {
		Exercises e = new Exercises();

		int result = e.addTog(4, 4);
		assertEquals(8, result);
		fail("Not yet implemented");
	}

}
